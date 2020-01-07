package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AddOrderDealsResponse extends js.Object {
  /**
    * List of deals added (in the same proposal as passed in the request)
    */
  var deals: js.UndefOr[js.Array[Schema$MarketplaceDeal]] = js.native
  /**
    * The updated revision number for the proposal.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
}

object Schema$AddOrderDealsResponse {
  @scala.inline
  def apply(deals: js.Array[Schema$MarketplaceDeal] = null, proposalRevisionNumber: String = null): Schema$AddOrderDealsResponse = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddOrderDealsResponse]
  }
}

