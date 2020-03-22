package typings.electron.Electron

import typings.electron.electronStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationAction extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/notification-action
  /**
    * The label for the given action.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The type of action, can be `button`.
    */
  var `type`: button
}

object NotificationAction {
  @scala.inline
  def apply(`type`: button, text: String = null): NotificationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationAction]
  }
}

