package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Minutes extends js.Object {
  var method: String
  var minutes: integer
}

object Minutes {
  @scala.inline
  def apply(method: String, minutes: integer): Minutes = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minutes]
  }
}

