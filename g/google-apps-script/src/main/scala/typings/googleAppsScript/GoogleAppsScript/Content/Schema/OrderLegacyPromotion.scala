package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderLegacyPromotion extends js.Object {
  
  var benefits: js.UndefOr[js.Array[OrderLegacyPromotionBenefit]] = js.native
  
  var effectiveDates: js.UndefOr[String] = js.native
  
  var genericRedemptionCode: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var longTitle: js.UndefOr[String] = js.native
  
  var productApplicability: js.UndefOr[String] = js.native
  
  var redemptionChannel: js.UndefOr[String] = js.native
}
object OrderLegacyPromotion {
  
  @scala.inline
  def apply(): OrderLegacyPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLegacyPromotion]
  }
  
  @scala.inline
  implicit class OrderLegacyPromotionOps[Self <: OrderLegacyPromotion] (val x: Self) extends AnyVal {
    
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
    def setBenefitsVarargs(value: OrderLegacyPromotionBenefit*): Self = this.set("benefits", js.Array(value :_*))
    
    @scala.inline
    def setBenefits(value: js.Array[OrderLegacyPromotionBenefit]): Self = this.set("benefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenefits: Self = this.set("benefits", js.undefined)
    
    @scala.inline
    def setEffectiveDates(value: String): Self = this.set("effectiveDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDates: Self = this.set("effectiveDates", js.undefined)
    
    @scala.inline
    def setGenericRedemptionCode(value: String): Self = this.set("genericRedemptionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenericRedemptionCode: Self = this.set("genericRedemptionCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLongTitle(value: String): Self = this.set("longTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongTitle: Self = this.set("longTitle", js.undefined)
    
    @scala.inline
    def setProductApplicability(value: String): Self = this.set("productApplicability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductApplicability: Self = this.set("productApplicability", js.undefined)
    
    @scala.inline
    def setRedemptionChannel(value: String): Self = this.set("redemptionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedemptionChannel: Self = this.set("redemptionChannel", js.undefined)
  }
}
