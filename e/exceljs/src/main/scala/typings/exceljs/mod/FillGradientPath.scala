package typings.exceljs.mod

import typings.exceljs.anon.Left
import typings.exceljs.exceljsStrings.gradient
import typings.exceljs.exceljsStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillGradientPath extends Fill {
  /**
  	 * For 'path' gradient. Specifies the relative coordinates for the start of the path.
  	 * 'left' and 'top' values range from 0 to 1
  	 */
  var center: Left = js.native
  var gradient: path = js.native
  /**
  	 * Specifies the gradient colour sequence. Is an array of objects containing position and
  	 * color starting with position 0 and ending with position 1.
  	 * Intermediary positions may be used to specify other colours on the path.
  	 */
  var stops: js.Array[GradientStop] = js.native
  var `type`: gradient = js.native
}

object FillGradientPath {
  @scala.inline
  def apply(center: Left, gradient: path, stops: js.Array[GradientStop], `type`: gradient): FillGradientPath = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillGradientPath]
  }
  @scala.inline
  implicit class FillGradientPathOps[Self <: FillGradientPath] (val x: Self) extends AnyVal {
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
    def setCenter(value: Left): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setGradient(value: path): Self = this.set("gradient", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopsVarargs(value: GradientStop*): Self = this.set("stops", js.Array(value :_*))
    @scala.inline
    def setStops(value: js.Array[GradientStop]): Self = this.set("stops", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: gradient): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

