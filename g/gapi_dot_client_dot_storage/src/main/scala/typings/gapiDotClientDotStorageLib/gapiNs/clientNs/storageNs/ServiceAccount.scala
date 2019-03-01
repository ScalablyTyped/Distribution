package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccount extends js.Object {
  /** The ID of the notification. */
  var email_address: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of item this is. For notifications, this is always storage#notification. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(email_address: java.lang.String = null, kind: java.lang.String = null): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (email_address != null) __obj.updateDynamic("email_address")(email_address)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ServiceAccount]
  }
}

