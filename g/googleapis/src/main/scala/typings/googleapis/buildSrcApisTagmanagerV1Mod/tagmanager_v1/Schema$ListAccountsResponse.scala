package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Accounts Response.
  */
@js.native
trait Schema$ListAccountsResponse extends js.Object {
  /**
    * List of GTM Accounts that a user has access to.
    */
  var accounts: js.UndefOr[js.Array[Schema$Account]] = js.native
}

object Schema$ListAccountsResponse {
  @scala.inline
  def apply(accounts: js.Array[Schema$Account] = null): Schema$ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAccountsResponse]
  }
}

