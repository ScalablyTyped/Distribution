package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellHyperlinkValue extends _CellValue {
  var hyperlink: java.lang.String
  var text: java.lang.String
}

object CellHyperlinkValue {
  @scala.inline
  def apply(hyperlink: java.lang.String, text: java.lang.String): CellHyperlinkValue = {
    val __obj = js.Dynamic.literal(hyperlink = hyperlink, text = text)
  
    __obj.asInstanceOf[CellHyperlinkValue]
  }
}

