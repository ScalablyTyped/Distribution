package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

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
  var account: js.UndefOr[js.Array[Schema$Account]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListAccountsResponse {
  @scala.inline
  def apply(account: js.Array[Schema$Account] = null, nextPageToken: String = null): Schema$ListAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListAccountsResponse]
  }
}

