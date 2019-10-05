package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_TypeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclUpdateParameters extends AclInsertParameters {
  var ruleId: String
}

object AclUpdateParameters {
  @scala.inline
  def apply(calendarId: String, role: AccessRole, ruleId: String, scope: Anon_TypeValue): AclUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, role = role, ruleId = ruleId, scope = scope)
  
    __obj.asInstanceOf[AclUpdateParameters]
  }
}

