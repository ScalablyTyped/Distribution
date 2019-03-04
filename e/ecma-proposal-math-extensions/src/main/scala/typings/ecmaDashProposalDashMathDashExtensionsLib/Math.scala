package typings
package ecmaDashProposalDashMathDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Math extends js.Object {
  /** This is the number of how many degrees are one radian. */
  val DEG_PER_RAD: scala.Double
  /** This is the number of how many radians are one degree. */
  val RAD_PER_DEG: scala.Double
  /**
    * Clamps an incoming value `x` to a range between `lower` and `upper`.
    * @param x The value to clamp.
    * @param lower The lower bound of the range to clamp `x` to.
    * @param upper The upper bound of the range to clamp `x` to.
    * @return The input value clamped to the given range.
    */
  def clamp(x: scala.Double, lower: scala.Double, upper: scala.Double): scala.Double
  /**
    * Converts an angle given in radians to an angle given in degrees.
    * @param radians The input angle in radians.
    * @return The output angle in degrees.
    */
  def degrees(radians: scala.Double): scala.Double
  /**
    * Scales a floating point value between `inLow` and `inHigh` to the range of `outLow` to `outHigh`.
    * @param x The numeric value in the input range to scale.
    * @param inLow The lower bound of the input range.
    * @param inHigh The upper bound of the input range.
    * @param outLow The lower bound of the output range.
    * @param outHigh The upper bound of the output range.
    * @return The input value scaled to the output range.
    */
  def fscale(
    x: scala.Double,
    inLow: scala.Double,
    inHigh: scala.Double,
    outLow: scala.Double,
    outHigh: scala.Double
  ): scala.Double
  /**
    * Converts an angle given in degrees to an angle given in radians.
    * @param degrees The input angle in degrees.
    * @return The output angle in radians.
    */
  def radians(degrees: scala.Double): scala.Double
  /**
    * Scales a value between `inLow` and `inHigh` to the range of `outLow` to `outHigh`.
    * @param x The numeric value in the input range to scale.
    * @param inLow The lower bound of the input range.
    * @param inHigh The upper bound of the input range.
    * @param outLow The lower bound of the output range.
    * @param outHigh The upper bound of the output range.
    * @return The input value scaled to the output range.
    */
  def scale(
    x: scala.Double,
    inLow: scala.Double,
    inHigh: scala.Double,
    outLow: scala.Double,
    outHigh: scala.Double
  ): scala.Double
}

object Math {
  @scala.inline
  def apply(
    DEG_PER_RAD: scala.Double,
    RAD_PER_DEG: scala.Double,
    clamp: js.Function3[scala.Double, scala.Double, scala.Double, scala.Double],
    degrees: js.Function1[scala.Double, scala.Double],
    fscale: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double],
    radians: js.Function1[scala.Double, scala.Double],
    scale: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double]
  ): Math = {
    val __obj = js.Dynamic.literal(DEG_PER_RAD = DEG_PER_RAD, RAD_PER_DEG = RAD_PER_DEG, clamp = clamp, degrees = degrees, fscale = fscale, radians = radians, scale = scale)
  
    __obj.asInstanceOf[Math]
  }
}

