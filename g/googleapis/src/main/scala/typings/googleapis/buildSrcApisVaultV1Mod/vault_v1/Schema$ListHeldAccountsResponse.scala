package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns a list of held accounts for a hold.
  */
@js.native
trait Schema$ListHeldAccountsResponse extends js.Object {
  /**
    * The held accounts on a hold.
    */
  var accounts: js.UndefOr[js.Array[Schema$HeldAccount]] = js.native
}

object Schema$ListHeldAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[Schema$HeldAccount] = null): Schema$ListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListHeldAccountsResponse]
  }
}

