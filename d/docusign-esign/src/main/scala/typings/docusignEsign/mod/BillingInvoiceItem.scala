package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingInvoiceItem extends StObject {
  
  /**
    * Reserved: TBD
    */
  var chargeAmount: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var chargeName: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var invoiceItemId: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of envelopes to add to the account.
    */
  var quantity: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.undefined
}
object BillingInvoiceItem {
  
  inline def apply(): BillingInvoiceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoiceItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingInvoiceItem] (val x: Self) extends AnyVal {
    
    inline def setChargeAmount(value: String): Self = StObject.set(x, "chargeAmount", value.asInstanceOf[js.Any])
    
    inline def setChargeAmountUndefined: Self = StObject.set(x, "chargeAmount", js.undefined)
    
    inline def setChargeName(value: String): Self = StObject.set(x, "chargeName", value.asInstanceOf[js.Any])
    
    inline def setChargeNameUndefined: Self = StObject.set(x, "chargeName", js.undefined)
    
    inline def setInvoiceItemId(value: String): Self = StObject.set(x, "invoiceItemId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceItemIdUndefined: Self = StObject.set(x, "invoiceItemId", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setUnitPrice(value: String): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
