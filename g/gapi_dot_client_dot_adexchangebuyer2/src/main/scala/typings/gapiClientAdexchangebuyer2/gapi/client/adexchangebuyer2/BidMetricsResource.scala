package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonAccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of bids. */
  def list(request: AnonAccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request_[ListBidMetricsResponse]
}

object BidMetricsResource {
  @scala.inline
  def apply(
    list: AnonAccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request_[ListBidMetricsResponse]
  ): BidMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BidMetricsResource]
  }
}

