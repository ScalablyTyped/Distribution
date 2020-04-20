package typings.excelStyleDataformatter.mod

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
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], daysShort = daysShort.asInstanceOf[js.Any], decimalSeparator = decimalSeparator.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thousandSeparator = thousandSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalesOptions]
  }
}

