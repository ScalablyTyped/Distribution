package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailsResource extends js.Object {
  /**
    * List all details associated with a specific reason for which bids were
    * filtered, with the number of bids filtered for each detail.
    */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListCreativeStatusBreakdownByDetailResponse]
}

object DetailsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId => gapiDotClientLib.gapiNs.clientNs.Request[ListCreativeStatusBreakdownByDetailResponse]
  ): DetailsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DetailsResource]
  }
}

