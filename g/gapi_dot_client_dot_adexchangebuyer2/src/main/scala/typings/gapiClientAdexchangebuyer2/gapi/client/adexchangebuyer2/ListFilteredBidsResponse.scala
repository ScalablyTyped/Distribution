package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFilteredBidsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bids aggregated by filtering reason
    * (i.e. creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListFilteredBidsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.filteredBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListFilteredBidsResponse {
  @scala.inline
  def apply(): ListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilteredBidsResponse]
  }
  @scala.inline
  implicit class ListFilteredBidsResponseOps[Self <: ListFilteredBidsResponse] (val x: Self) extends AnyVal {
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
    def setCreativeStatusRowsVarargs(value: CreativeStatusRow*): Self = this.set("creativeStatusRows", js.Array(value :_*))
    @scala.inline
    def setCreativeStatusRows(value: js.Array[CreativeStatusRow]): Self = this.set("creativeStatusRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeStatusRows: Self = this.set("creativeStatusRows", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

