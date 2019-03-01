package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOrderDealsResponse extends js.Object {
  /** List of deals added (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
}

object AddOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[MarketplaceDeal] = null, proposalRevisionNumber: java.lang.String = null): AddOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals)
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber)
    __obj.asInstanceOf[AddOrderDealsResponse]
  }
}

