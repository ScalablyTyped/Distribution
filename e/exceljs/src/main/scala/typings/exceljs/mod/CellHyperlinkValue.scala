package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellHyperlinkValue extends _CellValue {
  var hyperlink: String = js.native
  var text: String = js.native
}

object CellHyperlinkValue {
  @scala.inline
  def apply(hyperlink: String, text: String): CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellHyperlinkValue]
  }
  @scala.inline
  implicit class CellHyperlinkValueOps[Self <: CellHyperlinkValue] (val x: Self) extends AnyVal {
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
    def setHyperlink(value: String): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

