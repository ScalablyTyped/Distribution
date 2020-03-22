package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclInsertParameters extends js.Object {
  var calendarId: String
  // Acl resource
  var role: AccessRole
  var scope: AnonValue
}

object AclInsertParameters {
  @scala.inline
  def apply(calendarId: String, role: AccessRole, scope: AnonValue): AclInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AclInsertParameters]
  }
}

