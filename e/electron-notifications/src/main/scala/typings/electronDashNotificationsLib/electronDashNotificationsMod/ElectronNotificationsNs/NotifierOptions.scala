package typings
package electronDashNotificationsLib.electronDashNotificationsMod.ElectronNotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifierOptions extends js.Object {
  /** One or two buttons to display on the right of the notification. */
  var buttons: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The absolute URL of a icon displayed to the left of the text. */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** A message to display under the title. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object NotifierOptions {
  @scala.inline
  def apply(
    buttons: js.Array[java.lang.String] = null,
    icon: java.lang.String = null,
    message: java.lang.String = null
  ): NotifierOptions = {
    val __obj = js.Dynamic.literal()
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[NotifierOptions]
  }
}

