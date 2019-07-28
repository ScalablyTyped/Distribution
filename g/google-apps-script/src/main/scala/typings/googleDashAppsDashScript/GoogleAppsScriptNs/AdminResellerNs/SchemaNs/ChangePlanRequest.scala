package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangePlanRequest extends js.Object {
  var dealCode: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var planName: js.UndefOr[String] = js.undefined
  var purchaseOrderId: js.UndefOr[String] = js.undefined
  var seats: js.UndefOr[Seats] = js.undefined
}

object ChangePlanRequest {
  @scala.inline
  def apply(
    dealCode: String = null,
    kind: String = null,
    planName: String = null,
    purchaseOrderId: String = null,
    seats: Seats = null
  ): ChangePlanRequest = {
    val __obj = js.Dynamic.literal()
    if (dealCode != null) __obj.updateDynamic("dealCode")(dealCode)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (planName != null) __obj.updateDynamic("planName")(planName)
    if (purchaseOrderId != null) __obj.updateDynamic("purchaseOrderId")(purchaseOrderId)
    if (seats != null) __obj.updateDynamic("seats")(seats)
    __obj.asInstanceOf[ChangePlanRequest]
  }
}

