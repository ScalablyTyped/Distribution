package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPlanPreview extends StObject {
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  var invoice: js.UndefOr[BillingInvoice] = js.undefined
  
  /**
    * When set to **true**, the billing plan is prorated.
    */
  var isProrated: js.UndefOr[String] = js.undefined
  
  var subtotalAmount: js.UndefOr[String] = js.undefined
  
  var taxAmount: js.UndefOr[String] = js.undefined
  
  var totalAmount: js.UndefOr[String] = js.undefined
}
object BillingPlanPreview {
  
  inline def apply(): BillingPlanPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanPreview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPlanPreview] (val x: Self) extends AnyVal {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setInvoice(value: BillingInvoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
    
    inline def setIsProrated(value: String): Self = StObject.set(x, "isProrated", value.asInstanceOf[js.Any])
    
    inline def setIsProratedUndefined: Self = StObject.set(x, "isProrated", js.undefined)
    
    inline def setSubtotalAmount(value: String): Self = StObject.set(x, "subtotalAmount", value.asInstanceOf[js.Any])
    
    inline def setSubtotalAmountUndefined: Self = StObject.set(x, "subtotalAmount", js.undefined)
    
    inline def setTaxAmount(value: String): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
    
    inline def setTotalAmount(value: String): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
  }
}
