package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MethodType extends js.Object {
  var method: String
  var `type`: NotificationType
}

object Anon_MethodType {
  @scala.inline
  def apply(method: String, `type`: NotificationType): Anon_MethodType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MethodType]
  }
}

