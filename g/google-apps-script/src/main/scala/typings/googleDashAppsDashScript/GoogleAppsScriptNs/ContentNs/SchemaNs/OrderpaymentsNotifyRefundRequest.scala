package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderpaymentsNotifyRefundRequest extends js.Object {
  var invoiceId: js.UndefOr[String] = js.undefined
  var invoiceIds: js.UndefOr[js.Array[String]] = js.undefined
  var refundState: js.UndefOr[String] = js.undefined
}

object OrderpaymentsNotifyRefundRequest {
  @scala.inline
  def apply(invoiceId: String = null, invoiceIds: js.Array[String] = null, refundState: String = null): OrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId)
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds)
    if (refundState != null) __obj.updateDynamic("refundState")(refundState)
    __obj.asInstanceOf[OrderpaymentsNotifyRefundRequest]
  }
}

