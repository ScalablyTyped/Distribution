package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterPermission extends js.Object {
  /** The account id, as provided by <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>. */
  var accountId: js.UndefOr[String] = js.undefined
  /** The user's role in this matter. */
  var role: js.UndefOr[String] = js.undefined
}

object MatterPermission {
  @scala.inline
  def apply(accountId: String = null, role: String = null): MatterPermission = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterPermission]
  }
}

