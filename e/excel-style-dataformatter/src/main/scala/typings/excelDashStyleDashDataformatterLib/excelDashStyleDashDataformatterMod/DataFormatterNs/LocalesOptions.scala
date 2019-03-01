package typings
package excelDashStyleDashDataformatterLib.excelDashStyleDashDataformatterMod.DataFormatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalesOptions extends js.Object {
  var days: js.Array[java.lang.String]
  var daysShort: js.Array[java.lang.String]
  var decimalSeparator: java.lang.String
  var formats: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var months: js.Array[java.lang.String]
  var monthsShort: js.Array[java.lang.String]
  var name: java.lang.String
  var thousandSeparator: java.lang.String
}

object LocalesOptions {
  @scala.inline
  def apply(
    days: js.Array[java.lang.String],
    daysShort: js.Array[java.lang.String],
    decimalSeparator: java.lang.String,
    formats: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    months: js.Array[java.lang.String],
    monthsShort: js.Array[java.lang.String],
    name: java.lang.String,
    thousandSeparator: java.lang.String
  ): LocalesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("daysShort")(daysShort)
    __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    __obj.updateDynamic("formats")(formats)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("monthsShort")(monthsShort)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("thousandSeparator")(thousandSeparator)
    __obj.asInstanceOf[LocalesOptions]
  }
}

