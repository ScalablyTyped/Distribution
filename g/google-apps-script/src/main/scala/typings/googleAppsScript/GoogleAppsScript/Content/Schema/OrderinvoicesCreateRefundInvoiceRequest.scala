package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  var invoiceId: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var refundOnlyOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.undefined
  var returnOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.undefined
  var shipmentInvoices: js.UndefOr[js.Array[ShipmentInvoice]] = js.undefined
}

object OrderinvoicesCreateRefundInvoiceRequest {
  @scala.inline
  def apply(
    invoiceId: String = null,
    operationId: String = null,
    refundOnlyOption: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = null,
    returnOption: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = null,
    shipmentInvoices: js.Array[ShipmentInvoice] = null
  ): OrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (refundOnlyOption != null) __obj.updateDynamic("refundOnlyOption")(refundOnlyOption.asInstanceOf[js.Any])
    if (returnOption != null) __obj.updateDynamic("returnOption")(returnOption.asInstanceOf[js.Any])
    if (shipmentInvoices != null) __obj.updateDynamic("shipmentInvoices")(shipmentInvoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderinvoicesCreateRefundInvoiceRequest]
  }
}

