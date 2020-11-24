package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitInvoice extends js.Object {
  
  var additionalCharges: js.UndefOr[js.Array[UnitInvoiceAdditionalCharge]] = js.native
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  
  var unitPricePretax: js.UndefOr[Price] = js.native
  
  var unitPriceTaxes: js.UndefOr[js.Array[UnitInvoiceTaxLine]] = js.native
}
object UnitInvoice {
  
  @scala.inline
  def apply(): UnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoice]
  }
  
  @scala.inline
  implicit class UnitInvoiceOps[Self <: UnitInvoice] (val x: Self) extends AnyVal {
    
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
    def setAdditionalChargesVarargs(value: UnitInvoiceAdditionalCharge*): Self = this.set("additionalCharges", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCharges(value: js.Array[UnitInvoiceAdditionalCharge]): Self = this.set("additionalCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalCharges: Self = this.set("additionalCharges", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setUnitPricePretax(value: Price): Self = this.set("unitPricePretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPricePretax: Self = this.set("unitPricePretax", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxesVarargs(value: UnitInvoiceTaxLine*): Self = this.set("unitPriceTaxes", js.Array(value :_*))
    
    @scala.inline
    def setUnitPriceTaxes(value: js.Array[UnitInvoiceTaxLine]): Self = this.set("unitPriceTaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPriceTaxes: Self = this.set("unitPriceTaxes", js.undefined)
  }
}
