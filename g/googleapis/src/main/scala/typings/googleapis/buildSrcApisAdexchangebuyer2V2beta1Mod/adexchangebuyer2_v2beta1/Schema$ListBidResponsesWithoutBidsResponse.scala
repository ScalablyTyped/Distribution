package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bid responses were considered
  * to have no applicable bids.
  */
@js.native
trait Schema$ListBidResponsesWithoutBidsResponse extends js.Object {
  /**
    * List of rows, with counts of bid responses without bids aggregated by
    * status.
    */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[Schema$BidResponseWithoutBidsStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call
    * to the bidResponsesWithoutBids.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListBidResponsesWithoutBidsResponse {
  @scala.inline
  def apply(
    bidResponseWithoutBidsStatusRows: js.Array[Schema$BidResponseWithoutBidsStatusRow] = null,
    nextPageToken: String = null
  ): Schema$ListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (bidResponseWithoutBidsStatusRows != null) __obj.updateDynamic("bidResponseWithoutBidsStatusRows")(bidResponseWithoutBidsStatusRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListBidResponsesWithoutBidsResponse]
  }
}

