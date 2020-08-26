package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBidMetricsResponse extends js.Object {
  /** List of rows, each containing a set of bid metrics. */
  var bidMetricsRows: js.UndefOr[js.Array[BidMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListBidMetricsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.bidMetrics.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListBidMetricsResponse {
  @scala.inline
  def apply(): ListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBidMetricsResponse]
  }
  @scala.inline
  implicit class ListBidMetricsResponseOps[Self <: ListBidMetricsResponse] (val x: Self) extends AnyVal {
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
    def setBidMetricsRowsVarargs(value: BidMetricsRow*): Self = this.set("bidMetricsRows", js.Array(value :_*))
    @scala.inline
    def setBidMetricsRows(value: js.Array[BidMetricsRow]): Self = this.set("bidMetricsRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBidMetricsRows: Self = this.set("bidMetricsRows", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

