package typings
package fechaLib.fechaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nSettings extends js.Object {
  var amPm: js.Tuple2[java.lang.String, java.lang.String]
  var dayNames: Days
  var dayNamesShort: Days
  var monthNames: Months
  var monthNamesShort: Months
  def DoFn(D: scala.Double): java.lang.String
}

object i18nSettings {
  @scala.inline
  def apply(
    DoFn: scala.Double => java.lang.String,
    amPm: js.Tuple2[java.lang.String, java.lang.String],
    dayNames: Days,
    dayNamesShort: Days,
    monthNames: Months,
    monthNamesShort: Months
  ): i18nSettings = {
    val __obj = js.Dynamic.literal(DoFn = js.Any.fromFunction1(DoFn), amPm = amPm, dayNames = dayNames, dayNamesShort = dayNamesShort, monthNames = monthNames, monthNamesShort = monthNamesShort)
  
    __obj.asInstanceOf[i18nSettings]
  }
}

