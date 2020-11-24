package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingInvoiceItem extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var chargeAmount: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var chargeName: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var invoiceItemId: js.UndefOr[String] = js.native
  
  /**
    * The quantity of envelopes to add to the account.
    */
  var quantity: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var unitPrice: js.UndefOr[String] = js.native
}
object BillingInvoiceItem {
  
  @scala.inline
  def apply(): BillingInvoiceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingInvoiceItem]
  }
  
  @scala.inline
  implicit class BillingInvoiceItemOps[Self <: BillingInvoiceItem] (val x: Self) extends AnyVal {
    
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
    def setChargeAmount(value: String): Self = this.set("chargeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeAmount: Self = this.set("chargeAmount", js.undefined)
    
    @scala.inline
    def setChargeName(value: String): Self = this.set("chargeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeName: Self = this.set("chargeName", js.undefined)
    
    @scala.inline
    def setInvoiceItemId(value: String): Self = this.set("invoiceItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceItemId: Self = this.set("invoiceItemId", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: String): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
  }
}
