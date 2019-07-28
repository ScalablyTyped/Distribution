package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

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
    val __obj = js.Dynamic.literal(calendarId = calendarId, role = role, scope = scope)
  
    __obj.asInstanceOf[AclInsertParameters]
  }
}

