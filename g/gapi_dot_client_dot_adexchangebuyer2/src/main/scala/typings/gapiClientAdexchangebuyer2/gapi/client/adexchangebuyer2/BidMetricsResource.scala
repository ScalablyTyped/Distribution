package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidMetricsResource extends js.Object {
  /** Lists all metrics that are measured in terms of number of bids. */
  def list(request: FilterSetId): Request[ListBidMetricsResponse]
}

object BidMetricsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListBidMetricsResponse]): BidMetricsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BidMetricsResource]
  }
}

