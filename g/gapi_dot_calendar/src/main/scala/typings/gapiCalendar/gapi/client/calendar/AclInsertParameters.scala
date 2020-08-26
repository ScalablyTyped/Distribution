package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclInsertParameters extends js.Object {
  var calendarId: String = js.native
  // Acl resource
  var role: AccessRole = js.native
  var scope: Value = js.native
}

object AclInsertParameters {
  @scala.inline
  def apply(calendarId: String, role: AccessRole, scope: Value): AclInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclInsertParameters]
  }
  @scala.inline
  implicit class AclInsertParametersOps[Self <: AclInsertParameters] (val x: Self) extends AnyVal {
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
    def setRole(value: AccessRole): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: Value): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

