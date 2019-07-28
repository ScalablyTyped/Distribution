package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBidResponsesWithoutBidsResponse extends js.Object {
  /**
    * List of rows, with counts of bid responses without bids aggregated by
    * status.
    */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[BidResponseWithoutBidsStatusRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListBidResponsesWithoutBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.bidResponsesWithoutBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListBidResponsesWithoutBidsResponse {
  @scala.inline
  def apply(
    bidResponseWithoutBidsStatusRows: js.Array[BidResponseWithoutBidsStatusRow] = null,
    nextPageToken: String = null
  ): ListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (bidResponseWithoutBidsStatusRows != null) __obj.updateDynamic("bidResponseWithoutBidsStatusRows")(bidResponseWithoutBidsStatusRows)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListBidResponsesWithoutBidsResponse]
  }
}

