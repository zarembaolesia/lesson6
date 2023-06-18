package org.example;

public class Main {
    public static void main(String[] args) {
        int intVal1 = 10;
        int intVal2 = 11;
        int intVal3 = 12;
        int intVal4 = 13;

        int sum1 = intVal1 + intVal2;
        System.out.println("First sum is: " + sum1);
        int sum2 = intVal3 + intVal4;
        System.out.println("Second sum is: " + sum2);
        System.out.println("Is the first sum smaller than second? "+ (sum1 < sum2));

        sum1 ++;
        sum2 -=2;
        System.out.println("First sum is: " + sum1);
        System.out.println("Second sum is: " + sum2);
        System.out.println("Is the first sum bigger than second? "+ (sum1 > sum2));

        boolean compare3 = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Is at least one sum even? "+ compare3);
    }
}