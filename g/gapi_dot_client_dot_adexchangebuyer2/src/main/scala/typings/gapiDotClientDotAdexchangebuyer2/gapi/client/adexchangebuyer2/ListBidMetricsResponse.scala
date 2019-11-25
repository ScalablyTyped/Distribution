package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBidMetricsResponse extends js.Object {
  /** List of rows, each containing a set of bid metrics. */
  var bidMetricsRows: js.UndefOr[js.Array[BidMetricsRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListBidMetricsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.bidMetrics.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListBidMetricsResponse {
  @scala.inline
  def apply(bidMetricsRows: js.Array[BidMetricsRow] = null, nextPageToken: String = null): ListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (bidMetricsRows != null) __obj.updateDynamic("bidMetricsRows")(bidMetricsRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBidMetricsResponse]
  }
}

