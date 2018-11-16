package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FillGradientAngle extends js.Object {
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

