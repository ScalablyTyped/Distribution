package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclUpdateParameters extends AclInsertParameters {
  var ruleId: java.lang.String
}

object AclUpdateParameters {
  @scala.inline
  def apply(
    calendarId: java.lang.String,
    role: AccessRole,
    ruleId: java.lang.String,
    scope: gapiDotCalendarLib.Anon_TypeValue
  ): AclUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, role = role, ruleId = ruleId, scope = scope)
  
    __obj.asInstanceOf[AclUpdateParameters]
  }
}

