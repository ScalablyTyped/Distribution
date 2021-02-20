package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlanPreview extends StObject {
  
  /**
    * Specifies the ISO currency code for the account.
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  var invoice: js.UndefOr[BillingInvoice] = js.native
  
  /**
    * When set to **true**, the billing plan is prorated.
    */
  var isProrated: js.UndefOr[String] = js.native
  
  var subtotalAmount: js.UndefOr[String] = js.native
  
  var taxAmount: js.UndefOr[String] = js.native
  
  var totalAmount: js.UndefOr[String] = js.native
}
object BillingPlanPreview {
  
  @scala.inline
  def apply(): BillingPlanPreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanPreview]
  }
  
  @scala.inline
  implicit class BillingPlanPreviewMutableBuilder[Self <: BillingPlanPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setInvoice(value: BillingInvoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
    
    @scala.inline
    def setIsProrated(value: String): Self = StObject.set(x, "isProrated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProratedUndefined: Self = StObject.set(x, "isProrated", js.undefined)
    
    @scala.inline
    def setSubtotalAmount(value: String): Self = StObject.set(x, "subtotalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtotalAmountUndefined: Self = StObject.set(x, "subtotalAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: String): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
    
    @scala.inline
    def setTotalAmount(value: String): Self = StObject.set(x, "totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAmountUndefined: Self = StObject.set(x, "totalAmount", js.undefined)
  }
}
