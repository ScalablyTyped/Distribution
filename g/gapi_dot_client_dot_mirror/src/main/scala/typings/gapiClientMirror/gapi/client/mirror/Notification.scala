package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /** The collection that generated the notification. */
  var collection: js.UndefOr[String] = js.undefined
  /** The ID of the item that generated the notification. */
  var itemId: js.UndefOr[String] = js.undefined
  /** The type of operation that generated the notification. */
  var operation: js.UndefOr[String] = js.undefined
  /** A list of actions taken by the user that triggered the notification. */
  var userActions: js.UndefOr[js.Array[UserAction]] = js.undefined
  /** The user token provided by the service when it subscribed for notifications. */
  var userToken: js.UndefOr[String] = js.undefined
  /** The secret verify token provided by the service when it subscribed for notifications. */
  var verifyToken: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    collection: String = null,
    itemId: String = null,
    operation: String = null,
    userActions: js.Array[UserAction] = null,
    userToken: String = null,
    verifyToken: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (userActions != null) __obj.updateDynamic("userActions")(userActions.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    if (verifyToken != null) __obj.updateDynamic("verifyToken")(verifyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

