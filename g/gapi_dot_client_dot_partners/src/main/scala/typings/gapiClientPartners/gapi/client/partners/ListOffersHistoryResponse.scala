package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOffersHistoryResponse extends js.Object {
  /** True if the user has the option to show entire company history. */
  var canShowEntireCompany: js.UndefOr[Boolean] = js.native
  /** Supply this token in a ListOffersHistoryRequest to retrieve the next page. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Historical offers meeting request. */
  var offers: js.UndefOr[js.Array[HistoricalOffer]] = js.native
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.native
  /** True if this response is showing entire company history. */
  var showingEntireCompany: js.UndefOr[Boolean] = js.native
  /** Number of results across all pages. */
  var totalResults: js.UndefOr[Double] = js.native
}

object ListOffersHistoryResponse {
  @scala.inline
  def apply(): ListOffersHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOffersHistoryResponse]
  }
  @scala.inline
  implicit class ListOffersHistoryResponseOps[Self <: ListOffersHistoryResponse] (val x: Self) extends AnyVal {
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
    def setCanShowEntireCompany(value: Boolean): Self = this.set("canShowEntireCompany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanShowEntireCompany: Self = this.set("canShowEntireCompany", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOffersVarargs(value: HistoricalOffer*): Self = this.set("offers", js.Array(value :_*))
    @scala.inline
    def setOffers(value: js.Array[HistoricalOffer]): Self = this.set("offers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffers: Self = this.set("offers", js.undefined)
    @scala.inline
    def setResponseMetadata(value: ResponseMetadata): Self = this.set("responseMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMetadata: Self = this.set("responseMetadata", js.undefined)
    @scala.inline
    def setShowingEntireCompany(value: Boolean): Self = this.set("showingEntireCompany", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowingEntireCompany: Self = this.set("showingEntireCompany", js.undefined)
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
  }
  
}

