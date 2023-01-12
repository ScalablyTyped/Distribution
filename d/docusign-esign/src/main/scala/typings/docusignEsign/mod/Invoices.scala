package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Invoices extends StObject {
  
  /**
    * Reserved: TBD
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var balance: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var dueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var invoiceId: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var invoiceItems: js.UndefOr[
    js.Array[
      /* Contains information about an item on a billing invoice. */ BillingInvoiceItem
    ]
  ] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var invoiceNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a URI for an endpoint that you can use to retrieve invoice information.
    */
  var invoiceUri: js.UndefOr[String] = js.undefined
  
  var nonTaxableAmount: js.UndefOr[String] = js.undefined
  
  var pdfAvailable: js.UndefOr[String] = js.undefined
  
  var taxableAmount: js.UndefOr[String] = js.undefined
}
object Invoices {
  
  inline def apply(): Invoices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invoices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Invoices] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setInvoiceItems(
      value: js.Array[
          /* Contains information about an item on a billing invoice. */ BillingInvoiceItem
        ]
    ): Self = StObject.set(x, "invoiceItems", value.asInstanceOf[js.Any])
    
    inline def setInvoiceItemsUndefined: Self = StObject.set(x, "invoiceItems", js.undefined)
    
    inline def setInvoiceItemsVarargs(value: (/* Contains information about an item on a billing invoice. */ BillingInvoiceItem)*): Self = StObject.set(x, "invoiceItems", js.Array(value*))
    
    inline def setInvoiceNumber(value: String): Self = StObject.set(x, "invoiceNumber", value.asInstanceOf[js.Any])
    
    inline def setInvoiceNumberUndefined: Self = StObject.set(x, "invoiceNumber", js.undefined)
    
    inline def setInvoiceUri(value: String): Self = StObject.set(x, "invoiceUri", value.asInstanceOf[js.Any])
    
    inline def setInvoiceUriUndefined: Self = StObject.set(x, "invoiceUri", js.undefined)
    
    inline def setNonTaxableAmount(value: String): Self = StObject.set(x, "nonTaxableAmount", value.asInstanceOf[js.Any])
    
    inline def setNonTaxableAmountUndefined: Self = StObject.set(x, "nonTaxableAmount", js.undefined)
    
    inline def setPdfAvailable(value: String): Self = StObject.set(x, "pdfAvailable", value.asInstanceOf[js.Any])
    
    inline def setPdfAvailableUndefined: Self = StObject.set(x, "pdfAvailable", js.undefined)
    
    inline def setTaxableAmount(value: String): Self = StObject.set(x, "taxableAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxableAmountUndefined: Self = StObject.set(x, "taxableAmount", js.undefined)
  }
}
