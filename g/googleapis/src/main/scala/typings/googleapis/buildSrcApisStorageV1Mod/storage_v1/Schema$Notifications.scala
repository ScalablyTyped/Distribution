package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of notification subscriptions.
  */
@js.native
trait Schema$Notifications extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[Schema$Notification]] = js.native
  /**
    * The kind of item this is. For lists of notifications, this is always
    * storage#notifications.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$Notifications {
  @scala.inline
  def apply(items: js.Array[Schema$Notification] = null, kind: String = null): Schema$Notifications = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Notifications]
  }
}

