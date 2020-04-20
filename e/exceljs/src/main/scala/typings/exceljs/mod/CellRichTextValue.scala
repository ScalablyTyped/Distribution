package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellRichTextValue extends _CellValue {
  var richText: js.Array[RichText]
}

object CellRichTextValue {
  @scala.inline
  def apply(richText: js.Array[RichText]): CellRichTextValue = {
    val __obj = js.Dynamic.literal(richText = richText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRichTextValue]
  }
}

