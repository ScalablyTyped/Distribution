package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodMinutes extends js.Object {
  var method: String
  var minutes: integer
}

object AnonMethodMinutes {
  @scala.inline
  def apply(method: String, minutes: integer): AnonMethodMinutes = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMethodMinutes]
  }
}

