package typings.exceljs.mod

import typings.exceljs.anon.PartialAlignment
import typings.exceljs.anon.PartialBorders
import typings.exceljs.anon.PartialFont
import typings.exceljs.anon.PartialProtection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var alignment: PartialAlignment = js.native
  var border: PartialBorders = js.native
  var fill: Fill = js.native
  var font: PartialFont = js.native
  var numFmt: String = js.native
  var protection: PartialProtection = js.native
}

object Style {
  @scala.inline
  def apply(
    alignment: PartialAlignment,
    border: PartialBorders,
    fill: Fill,
    font: PartialFont,
    numFmt: String,
    protection: PartialProtection
  ): Style = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], numFmt = numFmt.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def setAlignment(value: PartialAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorder(value: PartialBorders): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: PartialFont): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumFmt(value: String): Self = this.set("numFmt", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtection(value: PartialProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
  }
  
}

