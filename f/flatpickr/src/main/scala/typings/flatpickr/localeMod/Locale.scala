package typings.flatpickr.localeMod

import typings.flatpickr.anon.Longhand
import typings.flatpickr.anon.Shorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var amPM: js.Tuple2[String, String] = js.native
  var daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double] = js.native
  var firstDayOfWeek: Double = js.native
  var hourAriaLabel: String = js.native
  var minuteAriaLabel: String = js.native
  var months: Shorthand = js.native
  var rangeSeparator: String = js.native
  var scrollTitle: String = js.native
  var time_24hr: Boolean = js.native
  var toggleTitle: String = js.native
  var weekAbbreviation: String = js.native
  var weekdays: Longhand = js.native
  var yearAriaLabel: String = js.native
  def ordinal(nth: Double): String = js.native
}

object Locale {
  @scala.inline
  def apply(
    amPM: js.Tuple2[String, String],
    daysInMonth: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double],
    firstDayOfWeek: Double,
    hourAriaLabel: String,
    minuteAriaLabel: String,
    months: Shorthand,
    ordinal: Double => String,
    rangeSeparator: String,
    scrollTitle: String,
    time_24hr: Boolean,
    toggleTitle: String,
    weekAbbreviation: String,
    weekdays: Longhand,
    yearAriaLabel: String
  ): Locale = {
    val __obj = js.Dynamic.literal(amPM = amPM.asInstanceOf[js.Any], daysInMonth = daysInMonth.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], hourAriaLabel = hourAriaLabel.asInstanceOf[js.Any], minuteAriaLabel = minuteAriaLabel.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], ordinal = js.Any.fromFunction1(ordinal), rangeSeparator = rangeSeparator.asInstanceOf[js.Any], scrollTitle = scrollTitle.asInstanceOf[js.Any], time_24hr = time_24hr.asInstanceOf[js.Any], toggleTitle = toggleTitle.asInstanceOf[js.Any], weekAbbreviation = weekAbbreviation.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], yearAriaLabel = yearAriaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmPM(value: js.Tuple2[String, String]): Self = this.set("amPM", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysInMonth(
      value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
    ): Self = this.set("daysInMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setHourAriaLabel(value: String): Self = this.set("hourAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinuteAriaLabel(value: String): Self = this.set("minuteAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: Shorthand): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrdinal(value: Double => String): Self = this.set("ordinal", js.Any.fromFunction1(value))
    @scala.inline
    def setRangeSeparator(value: String): Self = this.set("rangeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTitle(value: String): Self = this.set("scrollTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime_24hr(value: Boolean): Self = this.set("time_24hr", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleTitle(value: String): Self = this.set("toggleTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekAbbreviation(value: String): Self = this.set("weekAbbreviation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdays(value: Longhand): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearAriaLabel(value: String): Self = this.set("yearAriaLabel", value.asInstanceOf[js.Any])
  }
  
}

