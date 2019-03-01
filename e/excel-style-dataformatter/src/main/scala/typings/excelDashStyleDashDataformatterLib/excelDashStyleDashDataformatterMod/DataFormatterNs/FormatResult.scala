package typings
package excelDashStyleDashDataformatterLib.excelDashStyleDashDataformatterMod.DataFormatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatResult extends js.Object {
  var align: java.lang.String
  var color: java.lang.String
  var pattern: java.lang.String
  var value: java.lang.String
}

object FormatResult {
  @scala.inline
  def apply(
    align: java.lang.String,
    color: java.lang.String,
    pattern: java.lang.String,
    value: java.lang.String
  ): FormatResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("align")(align)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[FormatResult]
  }
}

