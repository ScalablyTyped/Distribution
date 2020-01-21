package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOrderDealsRequest extends js.Object {
  /** List of deals to delete for a given proposal */
  var dealIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The last known proposal revision number. */
  var proposalRevisionNumber: js.UndefOr[String] = js.undefined
  /** Indicates an optional action to take on the proposal */
  var updateAction: js.UndefOr[String] = js.undefined
}

object DeleteOrderDealsRequest {
  @scala.inline
  def apply(
    dealIds: js.Array[String] = null,
    proposalRevisionNumber: String = null,
    updateAction: String = null
  ): DeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    if (dealIds != null) __obj.updateDynamic("dealIds")(dealIds.asInstanceOf[js.Any])
    if (proposalRevisionNumber != null) __obj.updateDynamic("proposalRevisionNumber")(proposalRevisionNumber.asInstanceOf[js.Any])
    if (updateAction != null) __obj.updateDynamic("updateAction")(updateAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrderDealsRequest]
  }
}

