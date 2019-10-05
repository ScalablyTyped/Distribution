package typings.gapiDotClientDotStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  /** The list of items. */
  var items: js.UndefOr[js.Array[Notification]] = js.undefined
  /** The kind of item this is. For lists of notifications, this is always storage#notifications. */
  var kind: js.UndefOr[String] = js.undefined
}

object Notifications {
  @scala.inline
  def apply(items: js.Array[Notification] = null, kind: String = null): Notifications = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[Notifications]
  }
}

