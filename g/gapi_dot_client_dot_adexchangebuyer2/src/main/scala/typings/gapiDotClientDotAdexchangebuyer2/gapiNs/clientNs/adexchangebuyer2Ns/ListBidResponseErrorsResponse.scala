package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBidResponseErrorsResponse extends js.Object {
  /** List of rows, with counts of bid responses aggregated by callout status. */
  var calloutStatusRows: js.UndefOr[js.Array[CalloutStatusRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListBidResponseErrorsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.bidResponseErrors.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListBidResponseErrorsResponse {
  @scala.inline
  def apply(calloutStatusRows: js.Array[CalloutStatusRow] = null, nextPageToken: String = null): ListBidResponseErrorsResponse = {
    val __obj = js.Dynamic.literal()
    if (calloutStatusRows != null) __obj.updateDynamic("calloutStatusRows")(calloutStatusRows)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListBidResponseErrorsResponse]
  }
}

