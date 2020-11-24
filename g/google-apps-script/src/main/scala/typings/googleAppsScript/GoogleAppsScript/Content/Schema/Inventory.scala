package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inventory extends js.Object {
  
  var availability: js.UndefOr[String] = js.native
  
  var customLabel0: js.UndefOr[String] = js.native
  
  var customLabel1: js.UndefOr[String] = js.native
  
  var customLabel2: js.UndefOr[String] = js.native
  
  var customLabel3: js.UndefOr[String] = js.native
  
  var customLabel4: js.UndefOr[String] = js.native
  
  var installment: js.UndefOr[Installment] = js.native
  
  var instoreProductLocation: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.native
  
  var pickup: js.UndefOr[InventoryPickup] = js.native
  
  var price: js.UndefOr[Price] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var salePrice: js.UndefOr[Price] = js.native
  
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.native
}
object Inventory {
  
  @scala.inline
  def apply(): Inventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inventory]
  }
  
  @scala.inline
  implicit class InventoryOps[Self <: Inventory] (val x: Self) extends AnyVal {
    
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
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setCustomLabel0(value: String): Self = this.set("customLabel0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel0: Self = this.set("customLabel0", js.undefined)
    
    @scala.inline
    def setCustomLabel1(value: String): Self = this.set("customLabel1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel1: Self = this.set("customLabel1", js.undefined)
    
    @scala.inline
    def setCustomLabel2(value: String): Self = this.set("customLabel2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel2: Self = this.set("customLabel2", js.undefined)
    
    @scala.inline
    def setCustomLabel3(value: String): Self = this.set("customLabel3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel3: Self = this.set("customLabel3", js.undefined)
    
    @scala.inline
    def setCustomLabel4(value: String): Self = this.set("customLabel4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel4: Self = this.set("customLabel4", js.undefined)
    
    @scala.inline
    def setInstallment(value: Installment): Self = this.set("installment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallment: Self = this.set("installment", js.undefined)
    
    @scala.inline
    def setInstoreProductLocation(value: String): Self = this.set("instoreProductLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstoreProductLocation: Self = this.set("instoreProductLocation", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLoyaltyPoints(value: LoyaltyPoints): Self = this.set("loyaltyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoyaltyPoints: Self = this.set("loyaltyPoints", js.undefined)
    
    @scala.inline
    def setPickup(value: InventoryPickup): Self = this.set("pickup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickup: Self = this.set("pickup", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setSalePrice(value: Price): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = this.set("salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePriceEffectiveDate: Self = this.set("salePriceEffectiveDate", js.undefined)
    
    @scala.inline
    def setSellOnGoogleQuantity(value: Double): Self = this.set("sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellOnGoogleQuantity: Self = this.set("sellOnGoogleQuantity", js.undefined)
  }
}
