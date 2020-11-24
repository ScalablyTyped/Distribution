package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInvoice extends js.Object {
  
  /**
    * The total amount of the purchase.
    */
  var amount: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var balance: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var dueDate: js.UndefOr[String] = js.native
  
  var invoiceId: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var invoiceItems: js.UndefOr[
    js.Array[
      /* Contains information about an item on a billing invoice. */ BillingInvoiceItem
    ]
  ] = js.native
  
  /**
    * Reserved: TBD
    */
  var invoiceNumber: js.UndefOr[String] = js.native
  
  /**
    * Contains a URI for an endpoint that you can use to retrieve invoice information.
    */
  var invoiceUri: js.UndefOr[String] = js.native
  
  var nonTaxableAmount: js.UndefOr[String] = js.native
  
  var pdfAvailable: js.UndefOr[String] = js.native
  
  var taxableAmount: js.UndefOr[String] = js.native
}
object BillingInvoice {
  
  @scala.inline
  def apply(): BillingInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoice]
  }
  
  @scala.inline
  implicit class BillingInvoiceOps[Self <: BillingInvoice] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setBalance(value: String): Self = this.set("balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBalance: Self = this.set("balance", js.undefined)
    
    @scala.inline
    def setDueDate(value: String): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: String): Self = this.set("invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceId: Self = this.set("invoiceId", js.undefined)
    
    @scala.inline
    def setInvoiceItemsVarargs(value: (/* Contains information about an item on a billing invoice. */ BillingInvoiceItem)*): Self = this.set("invoiceItems", js.Array(value :_*))
    
    @scala.inline
    def setInvoiceItems(
      value: js.Array[
          /* Contains information about an item on a billing invoice. */ BillingInvoiceItem
        ]
    ): Self = this.set("invoiceItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceItems: Self = this.set("invoiceItems", js.undefined)
    
    @scala.inline
    def setInvoiceNumber(value: String): Self = this.set("invoiceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceNumber: Self = this.set("invoiceNumber", js.undefined)
    
    @scala.inline
    def setInvoiceUri(value: String): Self = this.set("invoiceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceUri: Self = this.set("invoiceUri", js.undefined)
    
    @scala.inline
    def setNonTaxableAmount(value: String): Self = this.set("nonTaxableAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonTaxableAmount: Self = this.set("nonTaxableAmount", js.undefined)
    
    @scala.inline
    def setPdfAvailable(value: String): Self = this.set("pdfAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfAvailable: Self = this.set("pdfAvailable", js.undefined)
    
    @scala.inline
    def setTaxableAmount(value: String): Self = this.set("taxableAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxableAmount: Self = this.set("taxableAmount", js.undefined)
  }
}
