package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderinvoicesCreateChargeInvoiceRequest extends js.Object {
  
  var invoiceId: js.UndefOr[String] = js.native
  
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.native
  
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.native
  
  var operationId: js.UndefOr[String] = js.native
  
  var shipmentGroupId: js.UndefOr[String] = js.native
}
object OrderinvoicesCreateChargeInvoiceRequest {
  
  @scala.inline
  def apply(): OrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderinvoicesCreateChargeInvoiceRequest]
  }
  
  @scala.inline
  implicit class OrderinvoicesCreateChargeInvoiceRequestOps[Self <: OrderinvoicesCreateChargeInvoiceRequest] (val x: Self) extends AnyVal {
    
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
    def setInvoiceSummary(value: InvoiceSummary): Self = this.set("invoiceSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceSummary: Self = this.set("invoiceSummary", js.undefined)
    
    @scala.inline
    def setLineItemInvoicesVarargs(value: ShipmentInvoiceLineItemInvoice*): Self = this.set("lineItemInvoices", js.Array(value :_*))
    
    @scala.inline
    def setLineItemInvoices(value: js.Array[ShipmentInvoiceLineItemInvoice]): Self = this.set("lineItemInvoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemInvoices: Self = this.set("lineItemInvoices", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = this.set("shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentGroupId: Self = this.set("shipmentGroupId", js.undefined)
  }
}
