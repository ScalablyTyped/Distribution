package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonBillableWinningBidsResource extends js.Object {
  /**
    * List all reasons for which winning bids were not billable, with the number
    * of bids not billed for each reason.
    */
  def list(
    request: gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListNonBillableWinningBidsResponse]
}

object NonBillableWinningBidsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangebuyer2Lib.Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsFilterSetId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListNonBillableWinningBidsResponse]
    ]
  ): NonBillableWinningBidsResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[NonBillableWinningBidsResource]
  }
}

