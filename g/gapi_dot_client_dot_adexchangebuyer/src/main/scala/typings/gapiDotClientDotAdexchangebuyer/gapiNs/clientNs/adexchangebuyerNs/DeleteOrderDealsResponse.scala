package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOrderDealsResponse extends js.Object {
  /** List of deals deleted (in the same proposal as passed in the request) */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The updated revision number for the proposal. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
}

object DeleteOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[MarketplaceDeal] = null, proposalRevisionNumber: String = null): DeleteOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals)
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber)
    __obj.asInstanceOf[DeleteOrderDealsResponse]
  }
}

