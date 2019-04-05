package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyRefundRequest extends js.Object {
  var invoiceId: js.UndefOr[java.lang.String] = js.undefined
  var invoiceIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var refundState: js.UndefOr[java.lang.String] = js.undefined
}

object OrderpaymentsNotifyRefundRequest {
  @scala.inline
  def apply(
    invoiceId: java.lang.String = null,
    invoiceIds: js.Array[java.lang.String] = null,
    refundState: java.lang.String = null
  ): OrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId)
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds)
    if (refundState != null) __obj.updateDynamic("refundState")(refundState)
    __obj.asInstanceOf[OrderpaymentsNotifyRefundRequest]
  }
}

