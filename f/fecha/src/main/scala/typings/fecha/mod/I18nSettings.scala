package typings.fecha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nSettings extends js.Object {
  var amPm: js.Tuple2[String, String]
  var dayNames: Days
  var dayNamesShort: Days
  var monthNames: Months
  var monthNamesShort: Months
  def DoFn(dayOfMonth: Double): String
}

object I18nSettings {
  @scala.inline
  def apply(
    DoFn: Double => String,
    amPm: js.Tuple2[String, String],
    dayNames: Days,
    dayNamesShort: Days,
    monthNames: Months,
    monthNamesShort: Months
  ): I18nSettings = {
    val __obj = js.Dynamic.literal(DoFn = js.Any.fromFunction1(DoFn), amPm = amPm.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], dayNamesShort = dayNamesShort.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], monthNamesShort = monthNamesShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nSettings]
  }
}

