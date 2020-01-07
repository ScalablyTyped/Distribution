package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A subscription to receive Google PubSub notifications.
  */
@js.native
trait Schema$ServiceAccount extends js.Object {
  /**
    * The ID of the notification.
    */
  var email_address: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For notifications, this is always
    * storage#notification.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$ServiceAccount {
  @scala.inline
  def apply(email_address: String = null, kind: String = null): Schema$ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (email_address != null) __obj.updateDynamic("email_address")(email_address.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccount]
  }
}

