package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterPermission extends js.Object {
  /** The account id, as provided by <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The user's role in this matter. */
  var role: js.UndefOr[java.lang.String] = js.undefined
}

object MatterPermission {
  @scala.inline
  def apply(accountId: java.lang.String = null, role: java.lang.String = null): MatterPermission = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[MatterPermission]
  }
}

