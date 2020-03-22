package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponseErrorsResource extends js.Object {
  /**
    * List all errors that occurred in bid responses, with the number of bid
    * responses affected for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListBidResponseErrorsResponse]
}

object BidResponseErrorsResource {
  @scala.inline
  def apply(list: AnonFilterSetId => Request_[ListBidResponseErrorsResponse]): BidResponseErrorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BidResponseErrorsResource]
  }
}

