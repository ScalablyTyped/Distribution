package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyChargeRequest extends js.Object {
  var chargeState: js.UndefOr[java.lang.String] = js.undefined
  var invoiceId: js.UndefOr[java.lang.String] = js.undefined
  var invoiceIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OrderpaymentsNotifyChargeRequest {
  @scala.inline
  def apply(
    chargeState: java.lang.String = null,
    invoiceId: java.lang.String = null,
    invoiceIds: js.Array[java.lang.String] = null
  ): OrderpaymentsNotifyChargeRequest = {
    val __obj = js.Dynamic.literal()
    if (chargeState != null) __obj.updateDynamic("chargeState")(chargeState)
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId)
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds)
    __obj.asInstanceOf[OrderpaymentsNotifyChargeRequest]
  }
}

