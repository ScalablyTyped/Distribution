package typings.excelDashStyleDashDataformatter.excelDashStyleDashDataformatterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalesOptions extends js.Object {
  var days: js.Array[String]
  var daysShort: js.Array[String]
  var decimalSeparator: String
  var formats: StringDictionary[String]
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var name: String
  var thousandSeparator: String
}

object LocalesOptions {
  @scala.inline
  def apply(
    days: js.Array[String],
    daysShort: js.Array[String],
    decimalSeparator: String,
    formats: StringDictionary[String],
    months: js.Array[String],
    monthsShort: js.Array[String],
    name: String,
    thousandSeparator: String
  ): LocalesOptions = {
    val __obj = js.Dynamic.literal(days = days, daysShort = daysShort, decimalSeparator = decimalSeparator, formats = formats, months = months, monthsShort = monthsShort, name = name, thousandSeparator = thousandSeparator)
  
    __obj.asInstanceOf[LocalesOptions]
  }
}

