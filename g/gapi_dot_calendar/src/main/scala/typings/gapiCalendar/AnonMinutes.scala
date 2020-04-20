package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinutes extends js.Object {
  var method: String
  var minutes: integer
}

object AnonMinutes {
  @scala.inline
  def apply(method: String, minutes: integer): AnonMinutes = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinutes]
  }
}

