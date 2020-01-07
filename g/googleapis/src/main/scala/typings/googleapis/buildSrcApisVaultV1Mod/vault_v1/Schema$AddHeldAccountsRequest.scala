package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Add a list of accounts to a hold.
  */
@js.native
trait Schema$AddHeldAccountsRequest extends js.Object {
  /**
    * Account ids to identify which accounts to add. Only account_ids or only
    * emails should be specified, but not both.
    */
  var accountIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Emails to identify which accounts to add. Only emails or only account_ids
    * should be specified, but not both.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
}

object Schema$AddHeldAccountsRequest {
  @scala.inline
  def apply(accountIds: js.Array[String] = null, emails: js.Array[String] = null): Schema$AddHeldAccountsRequest = {
    val __obj = js.Dynamic.literal()
    if (accountIds != null) __obj.updateDynamic("accountIds")(accountIds.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddHeldAccountsRequest]
  }
}

