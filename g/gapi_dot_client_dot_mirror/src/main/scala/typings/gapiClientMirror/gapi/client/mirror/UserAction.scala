package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAction extends js.Object {
  /**
    * An optional payload for the action.
    *
    * For actions of type CUSTOM, this is the ID of the custom menu item that was selected.
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * The type of action. The value of this can be:
    * - SHARE - the user shared an item.
    * - REPLY - the user replied to an item.
    * - REPLY_ALL - the user replied to all recipients of an item.
    * - CUSTOM - the user selected a custom menu item on the timeline item.
    * - DELETE - the user deleted the item.
    * - PIN - the user pinned the item.
    * - UNPIN - the user unpinned the item.
    * - LAUNCH - the user initiated a voice command.  In the future, additional types may be added. UserActions with unrecognized types should be ignored.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object UserAction {
  @scala.inline
  def apply(payload: String = null, `type`: String = null): UserAction = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAction]
  }
}

