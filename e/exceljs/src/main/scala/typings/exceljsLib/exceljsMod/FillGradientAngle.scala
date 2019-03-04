package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillGradientAngle extends Fill {
  /**
  	 * For 'angle' gradient, specifies the direction of the gradient. 0 is from the left to the right.
  	 * Values from 1 - 359 rotates the direction clockwise
  	 */
  var degree: scala.Double
  var gradient: exceljsLib.exceljsLibStrings.angle
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop]
  var `type`: exceljsLib.exceljsLibStrings.gradient
}

object FillGradientAngle {
  @scala.inline
  def apply(
    degree: scala.Double,
    gradient: exceljsLib.exceljsLibStrings.angle,
    stops: js.Array[GradientStop],
    `type`: exceljsLib.exceljsLibStrings.gradient
  ): FillGradientAngle = {
    val __obj = js.Dynamic.literal(degree = degree, gradient = gradient, stops = stops)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FillGradientAngle]
  }
}

