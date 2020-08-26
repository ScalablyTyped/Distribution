package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusyCalendar extends js.Object {
  /** List of time ranges during which this calendar should be regarded as busy. */
  var busy: js.UndefOr[js.Array[TimePeriod]] = js.native
  /** Optional error(s) (if computation for the calendar failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

object FreeBusyCalendar {
  @scala.inline
  def apply(): FreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyCalendar]
  }
  @scala.inline
  implicit class FreeBusyCalendarOps[Self <: FreeBusyCalendar] (val x: Self) extends AnyVal {
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
    def setBusyVarargs(value: TimePeriod*): Self = this.set("busy", js.Array(value :_*))
    @scala.inline
    def setBusy(value: js.Array[TimePeriod]): Self = this.set("busy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusy: Self = this.set("busy", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

