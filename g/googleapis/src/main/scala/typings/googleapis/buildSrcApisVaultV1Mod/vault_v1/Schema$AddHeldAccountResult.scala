package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A status detailing the status of each account creation, and the
  * HeldAccount, if successful.
  */
@js.native
trait Schema$AddHeldAccountResult extends js.Object {
  /**
    * If present, this account was successfully created.
    */
  var account: js.UndefOr[Schema$HeldAccount] = js.native
  /**
    * This represents the success status. If failed, check message.
    */
  var status: js.UndefOr[Schema$Status] = js.native
}

object Schema$AddHeldAccountResult {
  @scala.inline
  def apply(account: Schema$HeldAccount = null, status: Schema$Status = null): Schema$AddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddHeldAccountResult]
  }
}

