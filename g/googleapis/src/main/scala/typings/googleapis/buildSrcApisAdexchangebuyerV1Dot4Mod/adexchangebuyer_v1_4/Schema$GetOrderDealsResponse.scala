package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GetOrderDealsResponse extends js.Object {
  /**
    * List of deals for the proposal
    */
  var deals: js.UndefOr[js.Array[Schema$MarketplaceDeal]] = js.native
}

object Schema$GetOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[Schema$MarketplaceDeal] = null): Schema$GetOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetOrderDealsResponse]
  }
}

