package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFilteredBidRequestsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bid requests aggregated by callout
    * status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[CalloutStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilteredBidRequestsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBidRequests.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListFilteredBidRequestsResponse {
  @scala.inline
  def apply(): ListFilteredBidRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilteredBidRequestsResponse]
  }
  @scala.inline
  implicit class ListFilteredBidRequestsResponseOps[Self <: ListFilteredBidRequestsResponse] (val x: Self) extends AnyVal {
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
    def setCalloutStatusRowsVarargs(value: CalloutStatusRow*): Self = this.set("calloutStatusRows", js.Array(value :_*))
    @scala.inline
    def setCalloutStatusRows(value: js.Array[CalloutStatusRow]): Self = this.set("calloutStatusRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutStatusRows: Self = this.set("calloutStatusRows", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

