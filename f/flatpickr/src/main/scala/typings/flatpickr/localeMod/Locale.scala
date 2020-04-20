package typings.flatpickr.localeMod

import typings.flatpickr.AnonLonghand
import typings.flatpickr.AnonShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var amPM: js.Tuple2[String, String]
  var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
  var firstDayOfWeek: Double
  var hourAriaLabel: String
  var minuteAriaLabel: String
  var months: AnonShorthand
  var rangeSeparator: String
  var scrollTitle: String
  var time_24hr: Boolean
  var toggleTitle: String
  var weekAbbreviation: String
  var weekdays: AnonLonghand
  var yearAriaLabel: String
  def ordinal(nth: Double): String
}

object Locale {
  @scala.inline
  def apply(
    amPM: js.Tuple2[String, String],
    daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double],
    firstDayOfWeek: Double,
    hourAriaLabel: String,
    minuteAriaLabel: String,
    months: AnonShorthand,
    ordinal: Double => String,
    rangeSeparator: String,
    scrollTitle: String,
    time_24hr: Boolean,
    toggleTitle: String,
    weekAbbreviation: String,
    weekdays: AnonLonghand,
    yearAriaLabel: String
  ): Locale = {
    val __obj = js.Dynamic.literal(amPM = amPM.asInstanceOf[js.Any], daysInMonth = daysInMonth.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], hourAriaLabel = hourAriaLabel.asInstanceOf[js.Any], minuteAriaLabel = minuteAriaLabel.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator.asInstanceOf[js.Any], scrollTitle = scrollTitle.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], toggleTitle = toggleTitle.asInstanceOf[js.Any], weekAbbreviation = weekAbbreviation.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], yearAriaLabel = yearAriaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

