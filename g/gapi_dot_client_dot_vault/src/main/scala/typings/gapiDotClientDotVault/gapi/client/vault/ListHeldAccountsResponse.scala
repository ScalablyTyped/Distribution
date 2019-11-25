package typings.gapiDotClientDotVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHeldAccountsResponse extends js.Object {
  /** The held accounts on a hold. */
  var accounts: js.UndefOr[js.Array[HeldAccount]] = js.undefined
}

object ListHeldAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[HeldAccount] = null): ListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHeldAccountsResponse]
  }
}

