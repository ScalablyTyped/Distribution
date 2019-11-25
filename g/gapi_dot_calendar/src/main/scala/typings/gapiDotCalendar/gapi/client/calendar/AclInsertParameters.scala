package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_TypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclInsertParameters extends js.Object {
  var calendarId: String
  // Acl resource
  var role: AccessRole
  var scope: Anon_TypeValue
}

object AclInsertParameters {
  @scala.inline
  def apply(calendarId: String, role: AccessRole, scope: Anon_TypeValue): AclInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AclInsertParameters]
  }
}

