package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionScheduleInput extends js.Object {
  var dayOfWeek: js.UndefOr[DayOfWeekString] = js.native
  var endHour: js.UndefOr[Double] = js.native
  var endMinute: js.UndefOr[Double] = js.native
  var startHour: js.UndefOr[Double] = js.native
  var startMinute: js.UndefOr[Double] = js.native
}

object ExtensionScheduleInput {
  @scala.inline
  def apply(): ExtensionScheduleInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionScheduleInput]
  }
  @scala.inline
  implicit class ExtensionScheduleInputOps[Self <: ExtensionScheduleInput] (val x: Self) extends AnyVal {
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
    def setDayOfWeek(value: DayOfWeekString): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setEndHour(value: Double): Self = this.set("endHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndHour: Self = this.set("endHour", js.undefined)
    @scala.inline
    def setEndMinute(value: Double): Self = this.set("endMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndMinute: Self = this.set("endMinute", js.undefined)
    @scala.inline
    def setStartHour(value: Double): Self = this.set("startHour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartHour: Self = this.set("startHour", js.undefined)
    @scala.inline
    def setStartMinute(value: Double): Self = this.set("startMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartMinute: Self = this.set("startMinute", js.undefined)
  }
  
}

