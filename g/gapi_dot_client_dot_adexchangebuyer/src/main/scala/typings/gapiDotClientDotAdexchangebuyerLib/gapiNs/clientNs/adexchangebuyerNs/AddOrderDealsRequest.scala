package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOrderDealsRequest extends js.Object {
  /** The list of deals to add */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[java.lang.String] = js.undefined
}

object AddOrderDealsRequest {
  @scala.inline
  def apply(
    deals: js.Array[MarketplaceDeal] = null,
    proposalRevisionNumber: java.lang.String = null,
    updateAction: java.lang.String = null
  ): AddOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals)
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber)
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction)
    __obj.asInstanceOf[AddOrderDealsRequest]
  }
}

