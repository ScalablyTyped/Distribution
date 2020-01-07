package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AddOrderDealsRequest extends js.Object {
  /**
    * The list of deals to add
    */
  var deals: js.UndefOr[js.Array[Schema$MarketplaceDeal]] = js.native
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String] = js.native
}

object Schema$AddOrderDealsRequest {
  @scala.inline
  def apply(
    deals: js.Array[Schema$MarketplaceDeal] = null,
    proposalRevisionNumber: String = null,
    updateAction: String = null
  ): Schema$AddOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    if (deals != null) __obj.updateDynamic("deals")(deals.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AddOrderDealsRequest]
  }
}

