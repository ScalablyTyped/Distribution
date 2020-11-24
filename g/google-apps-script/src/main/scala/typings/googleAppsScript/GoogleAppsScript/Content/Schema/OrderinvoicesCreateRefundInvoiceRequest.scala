package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderinvoicesCreateRefundInvoiceRequest extends js.Object {
  
  var invoiceId: js.UndefOr[String] = js.native
  
  var operationId: js.UndefOr[String] = js.native
  
  var refundOnlyOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption] = js.native
  
  var returnOption: js.UndefOr[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption] = js.native
  
  var shipmentInvoices: js.UndefOr[js.Array[ShipmentInvoice]] = js.native
}
object OrderinvoicesCreateRefundInvoiceRequest {
  
  @scala.inline
  def apply(): OrderinvoicesCreateRefundInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCreateRefundInvoiceRequest]
  }
  
  @scala.inline
  implicit class OrderinvoicesCreateRefundInvoiceRequestOps[Self <: OrderinvoicesCreateRefundInvoiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInvoiceId(value: String): Self = this.set("invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceId: Self = this.set("invoiceId", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setRefundOnlyOption(value: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption): Self = this.set("refundOnlyOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefundOnlyOption: Self = this.set("refundOnlyOption", js.undefined)
    
    @scala.inline
    def setReturnOption(value: OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption): Self = this.set("returnOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnOption: Self = this.set("returnOption", js.undefined)
    
    @scala.inline
    def setShipmentInvoicesVarargs(value: ShipmentInvoice*): Self = this.set("shipmentInvoices", js.Array(value :_*))
    
    @scala.inline
    def setShipmentInvoices(value: js.Array[ShipmentInvoice]): Self = this.set("shipmentInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentInvoices: Self = this.set("shipmentInvoices", js.undefined)
  }
}
