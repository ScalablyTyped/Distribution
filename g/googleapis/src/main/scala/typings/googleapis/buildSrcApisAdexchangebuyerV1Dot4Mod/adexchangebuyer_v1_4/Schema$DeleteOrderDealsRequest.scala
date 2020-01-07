package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DeleteOrderDealsRequest extends js.Object {
  /**
    * List of deals to delete for a given proposal
    */
  var dealIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String] = js.native
}

object Schema$DeleteOrderDealsRequest {
  @scala.inline
  def apply(
    dealIds: js.Array[String] = null,
    proposalRevisionNumber: String = null,
    updateAction: String = null
  ): Schema$DeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    if (dealIds != null) __obj.updateDynamic("dealIds")(dealIds.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteOrderDealsRequest]
  }
}

