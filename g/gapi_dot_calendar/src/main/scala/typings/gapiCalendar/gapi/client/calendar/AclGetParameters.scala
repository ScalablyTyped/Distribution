package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclGetParameters extends js.Object {
  var calendarId: String = js.native
  var ruleId: String = js.native
}

object AclGetParameters {
  @scala.inline
  def apply(calendarId: String, ruleId: String): AclGetParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclGetParameters]
  }
  @scala.inline
  implicit class AclGetParametersOps[Self <: AclGetParameters] (val x: Self) extends AnyVal {
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
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
  }
  
}

