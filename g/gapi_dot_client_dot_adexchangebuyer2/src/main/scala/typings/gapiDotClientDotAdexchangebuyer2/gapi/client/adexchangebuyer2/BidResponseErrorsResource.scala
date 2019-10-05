package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponseErrorsResource extends js.Object {
  /**
    * List all errors that occurred in bid responses, with the number of bid
    * responses affected for each reason.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request[ListBidResponseErrorsResponse]
}

object BidResponseErrorsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request[ListBidResponseErrorsResponse]
  ): BidResponseErrorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BidResponseErrorsResource]
  }
}

