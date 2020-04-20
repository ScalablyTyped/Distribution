package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: ReminderMethod
  var minutes: integer
}

object AnonMethod {
  @scala.inline
  def apply(method: ReminderMethod, minutes: integer): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

