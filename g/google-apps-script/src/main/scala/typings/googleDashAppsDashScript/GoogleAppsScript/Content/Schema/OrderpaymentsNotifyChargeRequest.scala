package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyChargeRequest extends js.Object {
  var chargeState: js.UndefOr[String] = js.undefined
  var invoiceId: js.UndefOr[String] = js.undefined
  var invoiceIds: js.UndefOr[js.Array[String]] = js.undefined
}

object OrderpaymentsNotifyChargeRequest {
  @scala.inline
  def apply(chargeState: String = null, invoiceId: String = null, invoiceIds: js.Array[String] = null): OrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    if (chargeState != null) __obj.updateDynamic("chargeState")(chargeState)
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId)
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds)
    __obj.asInstanceOf[OrderpaymentsNotifyChargeRequest]
  }
}

