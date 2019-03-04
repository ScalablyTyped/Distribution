package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationAction extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/notification-action
  /**
    * The label for the given action.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of action, can be button.
    */
  var `type`: electronLib.electronLibStrings.button
}

object NotificationAction {
  @scala.inline
  def apply(`type`: electronLib.electronLibStrings.button, text: java.lang.String = null): NotificationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[NotificationAction]
  }
}

