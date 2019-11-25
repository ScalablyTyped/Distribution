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
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AclUpdateParameters]
  }
}

