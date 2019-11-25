package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellHyperlinkValue extends _CellValue {
  var hyperlink: String
  var text: String
}

object CellHyperlinkValue {
  @scala.inline
  def apply(hyperlink: String, text: String): CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellHyperlinkValue]
  }
}

