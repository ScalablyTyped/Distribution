package typings.exceljs.mod

import typings.exceljs.anon.Left
import typings.exceljs.exceljsStrings.gradient
import typings.exceljs.exceljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillGradientPath extends Fill {
  /**
  	 * For 'path' gradient. Specifies the relative coordinates for the start of the path.
  	 * 'left' and 'top' values range from 0 to 1
  	 */
  var center: Left
  var gradient: path
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop]
  var `type`: gradient
}

object FillGradientPath {
  @scala.inline
  def apply(center: Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillGradientPath]
  }
}

