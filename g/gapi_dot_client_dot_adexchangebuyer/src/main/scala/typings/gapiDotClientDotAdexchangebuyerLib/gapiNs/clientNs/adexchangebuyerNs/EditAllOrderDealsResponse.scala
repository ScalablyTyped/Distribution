package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditAllOrderDealsResponse extends js.Object {
  /** List of all deals in the proposal after edit. */
  var deals: js.UndefOr[js.Array[MarketplaceDeal]] = js.undefined
  /** The latest revision number after the update has been applied. */
  var orderRevisionNumber: js.UndefOr[java.lang.String] = js.undefined
}

object EditAllOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[MarketplaceDeal] = null, orderRevisionNumber: java.lang.String = null): EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals)
    if (orderRevisionNumber != null) __obj.updateDynamic("orderRevisionNumber")(orderRevisionNumber)
    __obj.asInstanceOf[EditAllOrderDealsResponse]
  }
}

