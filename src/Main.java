import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество учеников");
        int n = scanner.nextInt();
        System.out.print("Введите количество яблок");
        int k = scanner.nextInt();
        int a = k%n;
        System.out.print("В корзине останется " +a+ " яблок");
    }
}