package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.NotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethodType extends js.Object {
  var method: String
  var `type`: NotificationType
}

object AnonMethodType {
  @scala.inline
  def apply(method: String, `type`: NotificationType): AnonMethodType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethodType]
  }
}

