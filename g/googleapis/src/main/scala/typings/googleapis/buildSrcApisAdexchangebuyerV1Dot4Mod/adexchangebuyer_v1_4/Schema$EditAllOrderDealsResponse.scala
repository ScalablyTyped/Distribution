package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$EditAllOrderDealsResponse extends js.Object {
  /**
    * List of all deals in the proposal after edit.
    */
  var deals: js.UndefOr[js.Array[Schema$MarketplaceDeal]] = js.native
  /**
    * The latest revision number after the update has been applied.
    */
  var orderRevisionNumber: js.UndefOr[String] = js.native
}

object Schema$EditAllOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[Schema$MarketplaceDeal] = null, orderRevisionNumber: String = null): Schema$EditAllOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (orderRevisionNumber != null) __obj.updateDynamic("orderRevisionNumber")(orderRevisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EditAllOrderDealsResponse]
  }
}

