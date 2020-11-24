package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderLegacyPromotionBenefit extends js.Object {
  
  var discount: js.UndefOr[Price] = js.native
  
  var offerIds: js.UndefOr[js.Array[String]] = js.native
  
  var subType: js.UndefOr[String] = js.native
  
  var taxImpact: js.UndefOr[Price] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object OrderLegacyPromotionBenefit {
  
  @scala.inline
  def apply(): OrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLegacyPromotionBenefit]
  }
  
  @scala.inline
  implicit class OrderLegacyPromotionBenefitOps[Self <: OrderLegacyPromotionBenefit] (val x: Self) extends AnyVal {
    
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
    def setDiscount(value: Price): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    
    @scala.inline
    def setOfferIdsVarargs(value: String*): Self = this.set("offerIds", js.Array(value :_*))
    
    @scala.inline
    def setOfferIds(value: js.Array[String]): Self = this.set("offerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferIds: Self = this.set("offerIds", js.undefined)
    
    @scala.inline
    def setSubType(value: String): Self = this.set("subType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    
    @scala.inline
    def setTaxImpact(value: Price): Self = this.set("taxImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxImpact: Self = this.set("taxImpact", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
