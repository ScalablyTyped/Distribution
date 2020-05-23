package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsButton extends js.Object {
  var counterLabel: String
  var notificationsButton: String
}

object NotificationsButton {
  @scala.inline
  def apply(counterLabel: String, notificationsButton: String): NotificationsButton = {
    val __obj = js.Dynamic.literal(counterLabel = counterLabel.asInstanceOf[js.Any], notificationsButton = notificationsButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsButton]
  }
}

