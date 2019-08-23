package typings.expo.buildNotificationsNotificationsDotTypesMod

import typings.expo.expoStrings.received
import typings.expo.expoStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var data: js.Any
  var isMultiple: Boolean
  var origin: selected | received
  var remote: Boolean
}

object Notification {
  @scala.inline
  def apply(data: js.Any, isMultiple: Boolean, origin: selected | received, remote: Boolean): Notification = {
    val __obj = js.Dynamic.literal(data = data, isMultiple = isMultiple, origin = origin.asInstanceOf[js.Any], remote = remote)
  
    __obj.asInstanceOf[Notification]
  }
}

