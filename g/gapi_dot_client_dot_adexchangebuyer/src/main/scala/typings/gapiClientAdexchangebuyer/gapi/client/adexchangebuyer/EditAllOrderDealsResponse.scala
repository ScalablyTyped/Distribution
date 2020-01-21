package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditAllOrderDealsResponse extends js.Object {
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[String] = js.undefined
}

object EditAllOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[MarketplaceDeal] = null, orderRevisionNumber: String = null): EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (orderRevisionNumber != null) __obj.updateDynamic("orderRevisionNumber")(orderRevisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditAllOrderDealsResponse]
  }
}

