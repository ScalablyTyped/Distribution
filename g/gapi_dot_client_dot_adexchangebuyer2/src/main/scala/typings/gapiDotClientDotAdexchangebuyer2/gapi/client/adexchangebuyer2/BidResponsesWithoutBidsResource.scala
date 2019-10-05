package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponsesWithoutBidsResource extends js.Object {
  /**
    * List all reasons for which bid responses were considered to have no
    * applicable bids, with the number of bid responses affected for each reason.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request[ListBidResponsesWithoutBidsResponse]
}

object BidResponsesWithoutBidsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request[ListBidResponsesWithoutBidsResponse]
  ): BidResponsesWithoutBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BidResponsesWithoutBidsResource]
  }
}

