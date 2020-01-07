package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  /**
    * [required] The ID of the invoice.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * [required] The ID of the operation, unique across all operations for a
    * given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Option to create a refund-only invoice. Exactly one of refundOnlyOption
    * or returnOption must be provided.
    */
  var refundOnlyOption: js.UndefOr[Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.native
  /**
    * Option to create an invoice for a refund and mark all items within the
    * invoice as returned. Exactly one of refundOnlyOption or returnOption must
    * be provided.
    */
  var returnOption: js.UndefOr[Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.native
  /**
    * Invoice details for different shipment groups.
    */
  var shipmentInvoices: js.UndefOr[js.Array[Schema$ShipmentInvoice]] = js.native
}

object Schema$OrderinvoicesCreateRefundInvoiceRequest {
  @scala.inline
  def apply(
    invoiceId: String = null,
    operationId: String = null,
    refundOnlyOption: Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = null,
    returnOption: Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = null,
    shipmentInvoices: js.Array[Schema$ShipmentInvoice] = null
  ): Schema$OrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (refundOnlyOption != null) __obj.updateDynamic("refundOnlyOption")(refundOnlyOption.asInstanceOf[js.Any])
    if (returnOption != null) __obj.updateDynamic("returnOption")(returnOption.asInstanceOf[js.Any])
    if (shipmentInvoices != null) __obj.updateDynamic("shipmentInvoices")(shipmentInvoices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderinvoicesCreateRefundInvoiceRequest]
  }
}

