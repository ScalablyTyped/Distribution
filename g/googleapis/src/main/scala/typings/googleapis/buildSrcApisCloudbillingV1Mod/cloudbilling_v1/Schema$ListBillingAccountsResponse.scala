package typings.googleapis.buildSrcApisCloudbillingV1Mod.cloudbilling_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListBillingAccounts`.
  */
@js.native
trait Schema$ListBillingAccountsResponse extends js.Object {
  /**
    * A list of billing accounts.
    */
  var billingAccounts: js.UndefOr[js.Array[Schema$BillingAccount]] = js.native
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListBillingAccounts` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListBillingAccountsResponse {
  @scala.inline
  def apply(billingAccounts: js.Array[Schema$BillingAccount] = null, nextPageToken: String = null): Schema$ListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (billingAccounts != null) __obj.updateDynamic("billingAccounts")(billingAccounts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListBillingAccountsResponse]
  }
}

