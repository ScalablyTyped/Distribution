package typings.excelDashStyleDashDataformatter.excelDashStyleDashDataformatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatResult extends js.Object {
  var align: String
  var color: String
  var pattern: String
  var value: String
}

object FormatResult {
  @scala.inline
  def apply(align: String, color: String, pattern: String, value: String): FormatResult = {
    val __obj = js.Dynamic.literal(align = align, color = color, pattern = pattern, value = value)
  
    __obj.asInstanceOf[FormatResult]
  }
}

