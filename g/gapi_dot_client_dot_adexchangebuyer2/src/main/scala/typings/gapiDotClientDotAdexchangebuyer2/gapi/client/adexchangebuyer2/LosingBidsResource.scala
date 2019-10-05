package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LosingBidsResource extends js.Object {
  /**
    * List all reasons for which bids lost in the auction, with the number of
    * bids that lost for each reason.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId): Request[ListLosingBidsResponse]
}

object LosingBidsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId => Request[ListLosingBidsResponse]
  ): LosingBidsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LosingBidsResource]
  }
}

