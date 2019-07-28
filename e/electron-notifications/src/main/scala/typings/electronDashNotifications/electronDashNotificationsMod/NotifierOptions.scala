package typings.electronDashNotifications.electronDashNotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifierOptions extends js.Object {
  /** One or two buttons to display on the right of the notification. */
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  /** The absolute URL of a icon displayed to the left of the text. */
  var icon: js.UndefOr[String] = js.undefined
  /** A message to display under the title. */
  var message: js.UndefOr[String] = js.undefined
}

object NotifierOptions {
  @scala.inline
  def apply(buttons: js.Array[String] = null, icon: String = null, message: String = null): NotifierOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[NotifierOptions]
  }
}

