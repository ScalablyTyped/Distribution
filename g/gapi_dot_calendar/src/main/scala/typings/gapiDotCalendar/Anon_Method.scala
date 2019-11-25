package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiDotCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: ReminderMethod
  var minutes: integer
}

object Anon_Method {
  @scala.inline
  def apply(method: ReminderMethod, minutes: integer): Anon_Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Method]
  }
}

