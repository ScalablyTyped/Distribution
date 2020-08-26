package typings.fecha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nSettings extends js.Object {
  var amPm: js.Tuple2[String, String] = js.native
  var dayNames: Days = js.native
  var dayNamesShort: Days = js.native
  var monthNames: Months = js.native
  var monthNamesShort: Months = js.native
  def DoFn(dayOfMonth: Double): String = js.native
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
  @scala.inline
  implicit class I18nSettingsOps[Self <: I18nSettings] (val x: Self) extends AnyVal {
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
    def setDoFn(value: Double => String): Self = this.set("DoFn", js.Any.fromFunction1(value))
    @scala.inline
    def setAmPm(value: js.Tuple2[String, String]): Self = this.set("amPm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayNames(value: Days): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayNamesShort(value: Days): Self = this.set("dayNamesShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthNames(value: Months): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthNamesShort(value: Months): Self = this.set("monthNamesShort", value.asInstanceOf[js.Any])
  }
  
}

