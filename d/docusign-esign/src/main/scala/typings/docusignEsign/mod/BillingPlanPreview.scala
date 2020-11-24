package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlanPreview extends js.Object {
  
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
  implicit class BillingPlanPreviewOps[Self <: BillingPlanPreview] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setInvoice(value: BillingInvoice): Self = this.set("invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoice: Self = this.set("invoice", js.undefined)
    
    @scala.inline
    def setIsProrated(value: String): Self = this.set("isProrated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsProrated: Self = this.set("isProrated", js.undefined)
    
    @scala.inline
    def setSubtotalAmount(value: String): Self = this.set("subtotalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtotalAmount: Self = this.set("subtotalAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: String): Self = this.set("taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxAmount: Self = this.set("taxAmount", js.undefined)
    
    @scala.inline
    def setTotalAmount(value: String): Self = this.set("totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalAmount: Self = this.set("totalAmount", js.undefined)
  }
}
