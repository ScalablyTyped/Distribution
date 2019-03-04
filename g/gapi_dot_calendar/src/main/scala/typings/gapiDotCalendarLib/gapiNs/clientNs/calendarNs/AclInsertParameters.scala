package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclInsertParameters extends js.Object {
  var calendarId: java.lang.String
  // Acl resource
  var role: AccessRole
  var scope: gapiDotCalendarLib.Anon_TypeValue
}

object AclInsertParameters {
  @scala.inline
  def apply(calendarId: java.lang.String, role: AccessRole, scope: gapiDotCalendarLib.Anon_TypeValue): AclInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, role = role, scope = scope)
  
    __obj.asInstanceOf[AclInsertParameters]
  }
}

