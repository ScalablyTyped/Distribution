package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveMatterPermissionsRequest extends js.Object {
  /** The account ID. */
  var accountId: js.UndefOr[String] = js.undefined
}

object RemoveMatterPermissionsRequest {
  @scala.inline
  def apply(accountId: String = null): RemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveMatterPermissionsRequest]
  }
}

