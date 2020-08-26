package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Border extends js.Object {
  var color: PartialColor = js.native
  var style: BorderStyle = js.native
}

object Border {
  @scala.inline
  def apply(color: PartialColor, style: BorderStyle): Border = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
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
    def setColor(value: PartialColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: BorderStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

