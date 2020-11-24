package typings.ecmaProposalMathExtensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Math extends js.Object {
  
  /** This is the number of how many degrees are one radian. */
  val DEG_PER_RAD: Double = js.native
  
  /** This is the number of how many radians are one degree. */
  val RAD_PER_DEG: Double = js.native
  
  /**
    * Clamps an incoming value `x` to a range between `lower` and `upper`.
    * @param x The value to clamp.
    * @param lower The lower bound of the range to clamp `x` to.
    * @param upper The upper bound of the range to clamp `x` to.
    * @return The input value clamped to the given range.
    */
  def clamp(x: Double, lower: Double, upper: Double): Double = js.native
  
  /**
    * Converts an angle given in radians to an angle given in degrees.
    * @param radians The input angle in radians.
    * @return The output angle in degrees.
    */
  def degrees(radians: Double): Double = js.native
  
  /**
    * Scales a floating point value between `inLow` and `inHigh` to the range of `outLow` to `outHigh`.
    * @param x The numeric value in the input range to scale.
    * @param inLow The lower bound of the input range.
    * @param inHigh The upper bound of the input range.
    * @param outLow The lower bound of the output range.
    * @param outHigh The upper bound of the output range.
    * @return The input value scaled to the output range.
    */
  def fscale(x: Double, inLow: Double, inHigh: Double, outLow: Double, outHigh: Double): Double = js.native
  
  /**
    * Converts an angle given in degrees to an angle given in radians.
    * @param degrees The input angle in degrees.
    * @return The output angle in radians.
    */
  def radians(degrees: Double): Double = js.native
  
  /**
    * Scales a value between `inLow` and `inHigh` to the range of `outLow` to `outHigh`.
    * @param x The numeric value in the input range to scale.
    * @param inLow The lower bound of the input range.
    * @param inHigh The upper bound of the input range.
    * @param outLow The lower bound of the output range.
    * @param outHigh The upper bound of the output range.
    * @return The input value scaled to the output range.
    */
  def scale(x: Double, inLow: Double, inHigh: Double, outLow: Double, outHigh: Double): Double = js.native
}
object Math {
  
  @scala.inline
  def apply(
    DEG_PER_RAD: Double,
    RAD_PER_DEG: Double,
    clamp: (Double, Double, Double) => Double,
    degrees: Double => Double,
    fscale: (Double, Double, Double, Double, Double) => Double,
    radians: Double => Double,
    scale: (Double, Double, Double, Double, Double) => Double
  ): Math = {
    val __obj = js.Dynamic.literal(DEG_PER_RAD = DEG_PER_RAD.asInstanceOf[js.Any], RAD_PER_DEG = RAD_PER_DEG.asInstanceOf[js.Any], clamp = js.Any.fromFunction3(clamp), degrees = js.Any.fromFunction1(degrees), fscale = js.Any.fromFunction5(fscale), radians = js.Any.fromFunction1(radians), scale = js.Any.fromFunction5(scale))
    __obj.asInstanceOf[Math]
  }
  
  @scala.inline
  implicit class MathOps[Self <: Math] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDEG_PER_RAD(value: Double): Self = this.set("DEG_PER_RAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRAD_PER_DEG(value: Double): Self = this.set("RAD_PER_DEG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClamp(value: (Double, Double, Double) => Double): Self = this.set("clamp", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDegrees(value: Double => Double): Self = this.set("degrees", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFscale(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("fscale", js.Any.fromFunction5(value))
    
    @scala.inline
    def setRadians(value: Double => Double): Self = this.set("radians", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScale(value: (Double, Double, Double, Double, Double) => Double): Self = this.set("scale", js.Any.fromFunction5(value))
  }
}
