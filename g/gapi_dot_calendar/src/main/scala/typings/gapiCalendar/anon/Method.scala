package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: ReminderMethod
  var minutes: integer
}

object Method {
  @scala.inline
  def apply(method: ReminderMethod, minutes: integer): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

