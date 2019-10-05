package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclGetParameters extends js.Object {
  var calendarId: String
  var ruleId: String
}

object AclGetParameters {
  @scala.inline
  def apply(calendarId: String, ruleId: String): AclGetParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, ruleId = ruleId)
  
    __obj.asInstanceOf[AclGetParameters]
  }
}

