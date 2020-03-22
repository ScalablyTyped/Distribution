package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotificationsButton extends js.Object {
  /* Aria-label for <span> element within the <button> element. */
  var counterLabel: String
  /* Aria-label for <button> element. */
  var notificationsButton: String
}

object AnonNotificationsButton {
  @scala.inline
  def apply(counterLabel: String, notificationsButton: String): AnonNotificationsButton = {
    val __obj = js.Dynamic.literal(counterLabel = counterLabel.asInstanceOf[js.Any], notificationsButton = notificationsButton.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotificationsButton]
  }
}

