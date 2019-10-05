package typings.gapiDotClientDotStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  /** The ID of the notification. */
  var email_address: js.UndefOr[String] = js.undefined
  /** The kind of item this is. For notifications, this is always storage#notification. */
  var kind: js.UndefOr[String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(email_address: String = null, kind: String = null): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (email_address != null) __obj.updateDynamic("email_address")(email_address)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ServiceAccount]
  }
}

