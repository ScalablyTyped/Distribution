package typings.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends js.Object {
  
  /**
    * Returns the inverse hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def acosh(x: Double): Double = js.native
  
  /**
    * Returns the inverse hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def asinh(x: Double): Double = js.native
  
  /**
    * Returns the inverse hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def atanh(x: Double): Double = js.native
  
  /**
    * Returns an implementation-dependent approximation to the cube root of number.
    * @param x A numeric expression.
    */
  def cbrt(x: Double): Double = js.native
  
  /**
    * Returns the number of leading zero bits in the 32-bit binary representation of a number.
    * @param x A numeric expression.
    */
  def clz32(x: Double): Double = js.native
  
  /**
    * Returns the hyperbolic cosine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def cosh(x: Double): Double = js.native
  
  /**
    * Returns the result of (e^x - 1) of x (e raised to the power of x, where e is the base of
    * the natural logarithms).
    * @param x A numeric expression.
    */
  def expm1(x: Double): Double = js.native
  
  /**
    * Returns the nearest single precision float representation of a number.
    * @param x A numeric expression.
    */
  def fround(x: Double): Double = js.native
  
  /**
    * Returns the square root of the sum of squares of its arguments.
    * @param values Values to compute the square root for.
    *     If no arguments are passed, the result is +0.
    *     If there is only one argument, the result is the absolute value.
    *     If any argument is +Infinity or -Infinity, the result is +Infinity.
    *     If any argument is NaN, the result is NaN.
    *     If all arguments are either +0 or −0, the result is +0.
    */
  def hypot(values: Double*): Double = js.native
  
  /**
    * Returns the result of 32-bit multiplication of two numbers.
    * @param x First number
    * @param y Second number
    */
  def imul(x: Double, y: Double): Double = js.native
  
  /**
    * Returns the base 10 logarithm of a number.
    * @param x A numeric expression.
    */
  def log10(x: Double): Double = js.native
  
  /**
    * Returns the natural logarithm of 1 + x.
    * @param x A numeric expression.
    */
  def log1p(x: Double): Double = js.native
  
  /**
    * Returns the base 2 logarithm of a number.
    * @param x A numeric expression.
    */
  def log2(x: Double): Double = js.native
  
  /**
    * Returns the sign of the x, indicating whether x is positive, negative or zero.
    * @param x The numeric expression to test
    */
  def sign(x: Double): Double = js.native
  
  /**
    * Returns the hyperbolic sine of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def sinh(x: Double): Double = js.native
  
  /**
    * Returns the hyperbolic tangent of a number.
    * @param x A numeric expression that contains an angle measured in radians.
    */
  def tanh(x: Double): Double = js.native
  
  /**
    * Returns the integral part of the a numeric expression, x, removing any fractional digits.
    * If x is already an integer, the result is x.
    * @param x A numeric expression.
    */
  def trunc(x: Double): Double = js.native
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
  
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcosh(value: Double => Double): Self = this.set("acosh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAsinh(value: Double => Double): Self = this.set("asinh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAtanh(value: Double => Double): Self = this.set("atanh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCbrt(value: Double => Double): Self = this.set("cbrt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClz32(value: Double => Double): Self = this.set("clz32", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCosh(value: Double => Double): Self = this.set("cosh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpm1(value: Double => Double): Self = this.set("expm1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFround(value: Double => Double): Self = this.set("fround", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHypot(value: /* repeated */ Double => Double): Self = this.set("hypot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImul(value: (Double, Double) => Double): Self = this.set("imul", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLog10(value: Double => Double): Self = this.set("log10", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog1p(value: Double => Double): Self = this.set("log1p", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog2(value: Double => Double): Self = this.set("log2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSign(value: Double => Double): Self = this.set("sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSinh(value: Double => Double): Self = this.set("sinh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTanh(value: Double => Double): Self = this.set("tanh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrunc(value: Double => Double): Self = this.set("trunc", js.Any.fromFunction1(value))
  }
}
