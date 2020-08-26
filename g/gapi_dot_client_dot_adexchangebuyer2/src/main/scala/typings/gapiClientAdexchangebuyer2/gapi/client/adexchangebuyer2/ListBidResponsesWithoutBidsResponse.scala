package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBidResponsesWithoutBidsResponse extends js.Object {
  /**
    * List of rows, with counts of bid responses without bids aggregated by
    * status.
    */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[BidResponseWithoutBidsStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListBidResponsesWithoutBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.bidResponsesWithoutBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListBidResponsesWithoutBidsResponse {
  @scala.inline
  def apply(): ListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBidResponsesWithoutBidsResponse]
  }
  @scala.inline
  implicit class ListBidResponsesWithoutBidsResponseOps[Self <: ListBidResponsesWithoutBidsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBidResponseWithoutBidsStatusRowsVarargs(value: BidResponseWithoutBidsStatusRow*): Self = this.set("bidResponseWithoutBidsStatusRows", js.Array(value :_*))
    @scala.inline
    def setBidResponseWithoutBidsStatusRows(value: js.Array[BidResponseWithoutBidsStatusRow]): Self = this.set("bidResponseWithoutBidsStatusRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidResponseWithoutBidsStatusRows: Self = this.set("bidResponseWithoutBidsStatusRows", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

