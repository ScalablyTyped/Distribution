package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invoices extends StObject {
  
  /**
    * Reserved: TBD
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
  
  /**
    * Reserved: TBD
    */
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
object Invoices {
  
  @scala.inline
  def apply(): Invoices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invoices]
  }
  
  @scala.inline
  implicit class InvoicesMutableBuilder[Self <: Invoices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    @scala.inline
    def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    @scala.inline
    def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    @scala.inline
    def setInvoiceItems(
      value: js.Array[
          /* Contains information about an item on a billing invoice. */ BillingInvoiceItem
        ]
    ): Self = StObject.set(x, "invoiceItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceItemsUndefined: Self = StObject.set(x, "invoiceItems", js.undefined)
    
    @scala.inline
    def setInvoiceItemsVarargs(value: (/* Contains information about an item on a billing invoice. */ BillingInvoiceItem)*): Self = StObject.set(x, "invoiceItems", js.Array(value :_*))
    
    @scala.inline
    def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    @scala.inline
    def setInvoiceUri(value: String): Self = StObject.set(x, "invoiceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceUriUndefined: Self = StObject.set(x, "invoiceUri", js.undefined)
    
    @scala.inline
    def setNonTaxableAmount(value: String): Self = StObject.set(x, "nonTaxableAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonTaxableAmountUndefined: Self = StObject.set(x, "nonTaxableAmount", js.undefined)
    
    @scala.inline
    def setPdfAvailable(value: String): Self = StObject.set(x, "pdfAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfAvailableUndefined: Self = StObject.set(x, "pdfAvailable", js.undefined)
    
    @scala.inline
    def setTaxableAmount(value: String): Self = StObject.set(x, "taxableAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxableAmountUndefined: Self = StObject.set(x, "taxableAmount", js.undefined)
  }
}
