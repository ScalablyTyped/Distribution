package typings
package gapiDotClientDotCloudbillingLib.gapiNs.clientNs.cloudbillingNs

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

