package typings.exceljs.exceljsMod

import typings.exceljs.Anon_Left
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
  var center: Anon_Left
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
  def apply(center: Anon_Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center, gradient = gradient, stops = stops)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FillGradientPath]
  }
}

