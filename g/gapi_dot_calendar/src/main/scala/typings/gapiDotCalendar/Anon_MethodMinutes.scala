package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MethodMinutes extends js.Object {
  var method: String
  var minutes: integer
}

object Anon_MethodMinutes {
  @scala.inline
  def apply(method: String, minutes: integer): Anon_MethodMinutes = {
    val __obj = js.Dynamic.literal(method = method, minutes = minutes)
  
    __obj.asInstanceOf[Anon_MethodMinutes]
  }
}

