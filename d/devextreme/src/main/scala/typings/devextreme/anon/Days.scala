package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.viz._VizTimeInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Days extends _VizTimeInterval {
  var days: js.UndefOr[Double] = js.native
  var hours: js.UndefOr[Double] = js.native
  var milliseconds: js.UndefOr[Double] = js.native
  var minutes: js.UndefOr[Double] = js.native
  var months: js.UndefOr[Double] = js.native
  var quarters: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double] = js.native
  var weeks: js.UndefOr[Double] = js.native
  var years: js.UndefOr[Double] = js.native
}

object Days {
  @scala.inline
  def apply(): Days = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Days]
  }
  @scala.inline
  implicit class DaysOps[Self <: Days] (val x: Self) extends AnyVal {
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilliseconds: Self = this.set("milliseconds", js.undefined)
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    @scala.inline
    def setMonths(value: Double): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setQuarters(value: Double): Self = this.set("quarters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuarters: Self = this.set("quarters", js.undefined)
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    @scala.inline
    def setWeeks(value: Double): Self = this.set("weeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
  
}

