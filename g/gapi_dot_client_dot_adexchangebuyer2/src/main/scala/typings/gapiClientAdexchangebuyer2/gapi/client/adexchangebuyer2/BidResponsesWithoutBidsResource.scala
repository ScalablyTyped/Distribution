package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAdexchangebuyer2.anon.FilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponsesWithoutBidsResource extends js.Object {
  /**
    * List all reasons for which bid responses were considered to have no
    * applicable bids, with the number of bid responses affected for each reason.
    */
  def list(request: FilterSetId): Request[ListBidResponsesWithoutBidsResponse]
}

object BidResponsesWithoutBidsResource {
  @scala.inline
  def apply(list: FilterSetId => Request[ListBidResponsesWithoutBidsResponse]): BidResponsesWithoutBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[BidResponsesWithoutBidsResource]
  }
}

