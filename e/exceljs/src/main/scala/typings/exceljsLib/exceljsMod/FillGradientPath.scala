package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillGradientPath extends Fill {
  /**
  	 * For 'path' gradient. Specifies the relative coordinates for the start of the path.
  	 * 'left' and 'top' values range from 0 to 1
  	 */
  var center: exceljsLib.Anon_Left
  var gradient: exceljsLib.exceljsLibStrings.path
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop]
  var `type`: exceljsLib.exceljsLibStrings.gradient
}

object FillGradientPath {
  @scala.inline
  def apply(
    center: exceljsLib.Anon_Left,
    gradient: exceljsLib.exceljsLibStrings.path,
    stops: js.Array[GradientStop],
    `type`: exceljsLib.exceljsLibStrings.gradient
  ): FillGradientPath = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("gradient")(gradient)
    __obj.updateDynamic("stops")(stops)
    __obj.asInstanceOf[FillGradientPath]
  }
}

