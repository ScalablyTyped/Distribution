package typings.gapiDotClientDotCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBillingAccountsResponse extends js.Object {
  /** A list of billing accounts. */
  var billingAccounts: js.UndefOr[js.Array[BillingAccount]] = js.undefined
  /**
    * A token to retrieve the next page of results. To retrieve the next page,
    * call `ListBillingAccounts` again with the `page_token` field set to this
    * value. This field is empty if there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListBillingAccountsResponse {
  @scala.inline
  def apply(billingAccounts: js.Array[BillingAccount] = null, nextPageToken: String = null): ListBillingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    if (billingAccounts != null) __obj.updateDynamic("billingAccounts")(billingAccounts)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListBillingAccountsResponse]
  }
}

