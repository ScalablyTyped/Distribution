package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusyGroup extends js.Object {
  var calendars: js.UndefOr[js.Array[String]] = js.native
  var errors: js.UndefOr[js.Array[Error]] = js.native
}

object FreeBusyGroup {
  @scala.inline
  def apply(): FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyGroup]
  }
  @scala.inline
  implicit class FreeBusyGroupOps[Self <: FreeBusyGroup] (val x: Self) extends AnyVal {
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
    def setCalendarsVarargs(value: String*): Self = this.set("calendars", js.Array(value :_*))
    @scala.inline
    def setCalendars(value: js.Array[String]): Self = this.set("calendars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendars: Self = this.set("calendars", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

