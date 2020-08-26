package typings.flatpickr.localeMod

import typings.flatpickr.anon.Longhand
import typings.flatpickr.anon.Shorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLocale extends js.Object {
  var amPM: js.UndefOr[js.Tuple2[String, String]] = js.native
  var daysInMonth: js.UndefOr[
    js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
  ] = js.native
  var firstDayOfWeek: js.UndefOr[Double] = js.native
  var hourAriaLabel: js.UndefOr[String] = js.native
  var minuteAriaLabel: js.UndefOr[String] = js.native
  var months: Shorthand = js.native
  var ordinal: js.UndefOr[js.Function1[/* nth */ Double, String]] = js.native
  var rangeSeparator: js.UndefOr[String] = js.native
  var scrollTitle: js.UndefOr[String] = js.native
  var time_24hr: js.UndefOr[Boolean] = js.native
  var toggleTitle: js.UndefOr[String] = js.native
  var weekAbbreviation: js.UndefOr[String] = js.native
  var weekdays: Longhand = js.native
  var yearAriaLabel: js.UndefOr[String] = js.native
}

object CustomLocale {
  @scala.inline
  def apply(months: Shorthand, weekdays: Longhand): CustomLocale = {
    val __obj = js.Dynamic.literal(months = months.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLocale]
  }
  @scala.inline
  implicit class CustomLocaleOps[Self <: CustomLocale] (val x: Self) extends AnyVal {
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
    def setMonths(value: Shorthand): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdays(value: Longhand): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmPM(value: js.Tuple2[String, String]): Self = this.set("amPM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmPM: Self = this.set("amPM", js.undefined)
    @scala.inline
    def setDaysInMonth(
      value: js.Tuple12[Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double]
    ): Self = this.set("daysInMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaysInMonth: Self = this.set("daysInMonth", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setHourAriaLabel(value: String): Self = this.set("hourAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourAriaLabel: Self = this.set("hourAriaLabel", js.undefined)
    @scala.inline
    def setMinuteAriaLabel(value: String): Self = this.set("minuteAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteAriaLabel: Self = this.set("minuteAriaLabel", js.undefined)
    @scala.inline
    def setOrdinal(value: /* nth */ Double => String): Self = this.set("ordinal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOrdinal: Self = this.set("ordinal", js.undefined)
    @scala.inline
    def setRangeSeparator(value: String): Self = this.set("rangeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSeparator: Self = this.set("rangeSeparator", js.undefined)
    @scala.inline
    def setScrollTitle(value: String): Self = this.set("scrollTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollTitle: Self = this.set("scrollTitle", js.undefined)
    @scala.inline
    def setTime_24hr(value: Boolean): Self = this.set("time_24hr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime_24hr: Self = this.set("time_24hr", js.undefined)
    @scala.inline
    def setToggleTitle(value: String): Self = this.set("toggleTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleTitle: Self = this.set("toggleTitle", js.undefined)
    @scala.inline
    def setWeekAbbreviation(value: String): Self = this.set("weekAbbreviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekAbbreviation: Self = this.set("weekAbbreviation", js.undefined)
    @scala.inline
    def setYearAriaLabel(value: String): Self = this.set("yearAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearAriaLabel: Self = this.set("yearAriaLabel", js.undefined)
  }
  
}

