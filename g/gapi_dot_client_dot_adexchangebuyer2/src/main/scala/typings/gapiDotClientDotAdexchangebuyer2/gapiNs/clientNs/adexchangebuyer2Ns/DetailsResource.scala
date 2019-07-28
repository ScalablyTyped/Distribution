package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAdexchangebuyer2.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /**
    * List all details associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each detail.
    */
  def list(request: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId): Request[ListCreativeStatusBreakdownByDetailResponse]
}

object DetailsResource {
  @scala.inline
  def apply(
    list: Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId => Request[ListCreativeStatusBreakdownByDetailResponse]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DetailsResource]
  }
}

