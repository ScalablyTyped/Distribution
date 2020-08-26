package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellRichTextValue extends _CellValue {
  var richText: js.Array[RichText] = js.native
}

object CellRichTextValue {
  @scala.inline
  def apply(richText: js.Array[RichText]): CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRichTextValue]
  }
  @scala.inline
  implicit class CellRichTextValueOps[Self <: CellRichTextValue] (val x: Self) extends AnyVal {
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
    def setRichTextVarargs(value: RichText*): Self = this.set("richText", js.Array(value :_*))
    @scala.inline
    def setRichText(value: js.Array[RichText]): Self = this.set("richText", value.asInstanceOf[js.Any])
  }
  
}

