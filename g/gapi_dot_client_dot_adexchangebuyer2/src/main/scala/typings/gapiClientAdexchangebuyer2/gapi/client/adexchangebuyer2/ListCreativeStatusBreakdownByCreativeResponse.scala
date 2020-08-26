package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreativeStatusBreakdownByCreativeResponse extends js.Object {
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by creative.
    */
  var filteredBidCreativeRows: js.UndefOr[js.Array[FilteredBidCreativeRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListCreativeStatusBreakdownByCreativeRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.creatives.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListCreativeStatusBreakdownByCreativeResponse {
  @scala.inline
  def apply(): ListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativeStatusBreakdownByCreativeResponse]
  }
  @scala.inline
  implicit class ListCreativeStatusBreakdownByCreativeResponseOps[Self <: ListCreativeStatusBreakdownByCreativeResponse] (val x: Self) extends AnyVal {
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
    def setFilteredBidCreativeRowsVarargs(value: FilteredBidCreativeRow*): Self = this.set("filteredBidCreativeRows", js.Array(value :_*))
    @scala.inline
    def setFilteredBidCreativeRows(value: js.Array[FilteredBidCreativeRow]): Self = this.set("filteredBidCreativeRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredBidCreativeRows: Self = this.set("filteredBidCreativeRows", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

