package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodType extends js.Object {
  var method: String
  var `type`: NotificationType
}

object MethodType {
  @scala.inline
  def apply(method: String, `type`: NotificationType): MethodType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodType]
  }
}

