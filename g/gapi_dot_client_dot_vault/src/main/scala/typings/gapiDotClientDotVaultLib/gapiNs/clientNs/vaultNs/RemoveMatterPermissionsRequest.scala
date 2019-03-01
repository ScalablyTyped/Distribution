package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMatterPermissionsRequest extends js.Object {
  /** The account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
}

object RemoveMatterPermissionsRequest {
  @scala.inline
  def apply(accountId: java.lang.String = null): RemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    __obj.asInstanceOf[RemoveMatterPermissionsRequest]
  }
}

