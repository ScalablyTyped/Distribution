package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.Fields
import typings.gapiClientAdexchangebuyer2.anon.IsTransient
import typings.gapiClientAdexchangebuyer2.anon.Pp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSetsResource extends js.Object {
  var bidMetrics: BidMetricsResource = js.native
  var bidResponseErrors: BidResponseErrorsResource = js.native
  var bidResponsesWithoutBids: BidResponsesWithoutBidsResource = js.native
  var filteredBidRequests: FilteredBidRequestsResource = js.native
  var filteredBids: FilteredBidsResource = js.native
  var impressionMetrics: ImpressionMetricsResource = js.native
  var losingBids: LosingBidsResource = js.native
  var nonBillableWinningBids: NonBillableWinningBidsResource = js.native
  /** Creates the specified filter set for the account with the given account ID. */
  def create(request: IsTransient): Request[FilterSet] = js.native
  /**
    * Deletes the requested filter set from the account with the given account
    * ID.
    */
  def delete(request: Pp): Request[js.Object] = js.native
  /**
    * Retrieves the requested filter set for the account with the given account
    * ID.
    */
  def get(request: Pp): Request[FilterSet] = js.native
  /** Lists all filter sets for the account with the given account ID. */
  def list(request: Fields): Request[ListFilterSetsResponse] = js.native
}

object FilterSetsResource {
  @scala.inline
  def apply(
    bidMetrics: BidMetricsResource,
    bidResponseErrors: BidResponseErrorsResource,
    bidResponsesWithoutBids: BidResponsesWithoutBidsResource,
    create: IsTransient => Request[FilterSet],
    delete: Pp => Request[js.Object],
    filteredBidRequests: FilteredBidRequestsResource,
    filteredBids: FilteredBidsResource,
    get: Pp => Request[FilterSet],
    impressionMetrics: ImpressionMetricsResource,
    list: Fields => Request[ListFilterSetsResponse],
    losingBids: LosingBidsResource,
    nonBillableWinningBids: NonBillableWinningBidsResource
  ): FilterSetsResource = {
    val __obj = js.Dynamic.literal(bidMetrics = bidMetrics.asInstanceOf[js.Any], bidResponseErrors = bidResponseErrors.asInstanceOf[js.Any], bidResponsesWithoutBids = bidResponsesWithoutBids.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), filteredBidRequests = filteredBidRequests.asInstanceOf[js.Any], filteredBids = filteredBids.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), impressionMetrics = impressionMetrics.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), losingBids = losingBids.asInstanceOf[js.Any], nonBillableWinningBids = nonBillableWinningBids.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterSetsResource]
  }
  @scala.inline
  implicit class FilterSetsResourceOps[Self <: FilterSetsResource] (val x: Self) extends AnyVal {
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
    def setBidMetrics(value: BidMetricsResource): Self = this.set("bidMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setBidResponseErrors(value: BidResponseErrorsResource): Self = this.set("bidResponseErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setBidResponsesWithoutBids(value: BidResponsesWithoutBidsResource): Self = this.set("bidResponsesWithoutBids", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: IsTransient => Request[FilterSet]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Pp => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setFilteredBidRequests(value: FilteredBidRequestsResource): Self = this.set("filteredBidRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilteredBids(value: FilteredBidsResource): Self = this.set("filteredBids", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Pp => Request[FilterSet]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setImpressionMetrics(value: ImpressionMetricsResource): Self = this.set("impressionMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: Fields => Request[ListFilterSetsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setLosingBids(value: LosingBidsResource): Self = this.set("losingBids", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonBillableWinningBids(value: NonBillableWinningBidsResource): Self = this.set("nonBillableWinningBids", value.asInstanceOf[js.Any])
  }
  
}

