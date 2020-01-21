package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for `ListBillingAccounts`.
  */
@js.native
trait SchemaListBillingAccountsResponse extends js.Object {
  /**
    * A list of billing accounts.
    */
  var billingAccounts: js.UndefOr[js.Array[SchemaBillingAccount]] = js.native
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListBillingAccounts` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListBillingAccountsResponse {
  @scala.inline
  def apply(billingAccounts: js.Array[SchemaBillingAccount] = null, nextPageToken: String = null): SchemaListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (billingAccounts != null) __obj.updateDynamic("billingAccounts")(billingAccounts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListBillingAccountsResponse]
  }
}

