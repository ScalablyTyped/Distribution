package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /**
    * Returns the inverse hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def acosh(x: Double): Double
  /**
    * Returns the inverse hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def asinh(x: Double): Double
  /**
    * Returns the inverse hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def atanh(x: Double): Double
  /**
    * Returns an implementation-dependent approximation to the cube root of number.
    * @param x A numeric expression.
    */
  def cbrt(x: Double): Double
  /**
    * Returns the number of leading zero bits in the 32-bit binary representation of a number.
    * @param x A numeric expression.
    */
  def clz32(x: Double): Double
  /**
    * Returns the hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cosh(x: Double): Double
  /**
    * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
    * the natural logarithms).
    * @param x A numeric expression.
    */
  def expm1(x: Double): Double
  /**
    * Returns the nearest single precision float representation of a number.
    * @param x A numeric expression.
    */
  def fround(x: Double): Double
  /**
    * Returns the square root of the sum of squares of its arguments.
    * @param values Values to compute the square root for.
    *     If no arguments are passed, the result is +0.
    *     If there is only one argument, the result is the absolute value.
    *     If any argument is +Infinity or -Infinity, the result is +Infinity.
    *     If any argument is NaN, the result is NaN.
    *     If all arguments are either +0 or −0, the result is +0.
    */
  def hypot(values: Double*): Double
  /**
    * Returns the result of 32-bit multiplication of two numbers.
    * @param x First number
    * @param y Second number
    */
  def imul(x: Double, y: Double): Double
  /**
    * Returns the base 10 logarithm of a number.
    * @param x A numeric expression.
    */
  def log10(x: Double): Double
  /**
    * Returns the natural logarithm of 1 + x.
    * @param x A numeric expression.
    */
  def log1p(x: Double): Double
  /**
    * Returns the base 2 logarithm of a number.
    * @param x A numeric expression.
    */
  def log2(x: Double): Double
  /**
    * Returns the sign of the x, indicating whether x is positive, negative or zero.
    * @param x The numeric expression to test
    */
  def sign(x: Double): Double
  /**
    * Returns the hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sinh(x: Double): Double
  /**
    * Returns the hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tanh(x: Double): Double
  /**
    * Returns the integral part of the a numeric expression, x, removing any fractional digits.
    * If x is already an integer, the result is x.
    * @param x A numeric expression.
    */
  def trunc(x: Double): Double
}

object Math {
  @scala.inline
  def apply(
    acosh: Double => Double,
    asinh: Double => Double,
    atanh: Double => Double,
    cbrt: Double => Double,
    clz32: Double => Double,
    cosh: Double => Double,
    expm1: Double => Double,
    fround: Double => Double,
    hypot: /* repeated */ Double => Double,
    imul: (Double, Double) => Double,
    log10: Double => Double,
    log1p: Double => Double,
    log2: Double => Double,
    sign: Double => Double,
    sinh: Double => Double,
    tanh: Double => Double,
    trunc: Double => Double
  ): Math = {
    val __obj = js.Dynamic.literal(acosh = js.Any.fromFunction1(acosh), asinh = js.Any.fromFunction1(asinh), atanh = js.Any.fromFunction1(atanh), cbrt = js.Any.fromFunction1(cbrt), clz32 = js.Any.fromFunction1(clz32), cosh = js.Any.fromFunction1(cosh), expm1 = js.Any.fromFunction1(expm1), fround = js.Any.fromFunction1(fround), hypot = js.Any.fromFunction1(hypot), imul = js.Any.fromFunction2(imul), log10 = js.Any.fromFunction1(log10), log1p = js.Any.fromFunction1(log1p), log2 = js.Any.fromFunction1(log2), sign = js.Any.fromFunction1(sign), sinh = js.Any.fromFunction1(sinh), tanh = js.Any.fromFunction1(tanh), trunc = js.Any.fromFunction1(trunc))
    __obj.asInstanceOf[Math]
  }
}

