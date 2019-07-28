package typings.flatpickr.distTypesLocaleMod

import typings.flatpickr.Anon_Longhand
import typings.flatpickr.Anon_LonghandShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var amPM: js.Tuple2[String, String]
  var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
  var firstDayOfWeek: Double
  var hourAriaLabel: String
  var minuteAriaLabel: String
  var months: Anon_LonghandShorthand
  var rangeSeparator: String
  var scrollTitle: String
  var time_24hr: Boolean
  var toggleTitle: String
  var weekAbbreviation: String
  var weekdays: Anon_Longhand
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
    months: Anon_LonghandShorthand,
    ordinal: Double => String,
    rangeSeparator: String,
    scrollTitle: String,
    time_24hr: Boolean,
    toggleTitle: String,
    weekAbbreviation: String,
    weekdays: Anon_Longhand,
    yearAriaLabel: String
  ): Locale = {
    val __obj = js.Dynamic.literal(amPM = amPM, daysInMonth = daysInMonth, firstDayOfWeek = firstDayOfWeek, hourAriaLabel = hourAriaLabel, minuteAriaLabel = minuteAriaLabel, months = months, ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator, scrollTitle = scrollTitle, time_24hr = time_24hr, toggleTitle = toggleTitle, weekAbbreviation = weekAbbreviation, weekdays = weekdays, yearAriaLabel = yearAriaLabel)
  
    __obj.asInstanceOf[Locale]
  }
}

