package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  var invoiceId: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var refundOnlyOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.undefined
  var returnOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.undefined
  var shipmentInvoices: js.UndefOr[js.Array[ShipmentInvoice]] = js.undefined
}

object OrderinvoicesCreateRefundInvoiceRequest {
  @scala.inline
  def apply(
    invoiceId: java.lang.String = null,
    operationId: java.lang.String = null,
    refundOnlyOption: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = null,
    returnOption: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = null,
    shipmentInvoices: js.Array[ShipmentInvoice] = null
  ): OrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (refundOnlyOption != null) __obj.updateDynamic("refundOnlyOption")(refundOnlyOption)
    if (returnOption != null) __obj.updateDynamic("returnOption")(returnOption)
    if (shipmentInvoices != null) __obj.updateDynamic("shipmentInvoices")(shipmentInvoices)
    __obj.asInstanceOf[OrderinvoicesCreateRefundInvoiceRequest]
  }
}

