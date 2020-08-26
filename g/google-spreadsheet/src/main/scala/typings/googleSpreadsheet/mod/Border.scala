package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  var color: Color = js.native
  var colorStyle: ColorStyle = js.native
  var style: BorderStyle = js.native
  var width: Double = js.native
}

object Border {
  @scala.inline
  def apply(color: Color, colorStyle: ColorStyle, style: BorderStyle, width: Double): Border = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], colorStyle = colorStyle.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
  @scala.inline
  implicit class BorderOps[Self <: Border] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorStyle(value: ColorStyle): Self = this.set("colorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: BorderStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

