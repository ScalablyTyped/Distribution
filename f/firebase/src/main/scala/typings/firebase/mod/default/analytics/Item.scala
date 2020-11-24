package typings.firebase.mod.default.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  var affiliation: js.UndefOr[String] = js.native
  
  /** @deprecated Use item_brand instead. */
  var brand: js.UndefOr[String] = js.native
  
  /** @deprecated Use item_category instead. */
  var category: js.UndefOr[String] = js.native
  
  var coupon: js.UndefOr[String] = js.native
  
  var creative_name: js.UndefOr[String] = js.native
  
  var creative_slot: js.UndefOr[String] = js.native
  
  var discount: js.UndefOr[typings.firebase.mod.firebase.analytics.Currency] = js.native
  
  /** @deprecated Use item_id instead. */
  var id: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var item_brand: js.UndefOr[String] = js.native
  
  var item_category: js.UndefOr[String] = js.native
  
  var item_category2: js.UndefOr[String] = js.native
  
  var item_category3: js.UndefOr[String] = js.native
  
  var item_category4: js.UndefOr[String] = js.native
  
  var item_category5: js.UndefOr[String] = js.native
  
  var item_id: js.UndefOr[String] = js.native
  
  var item_list_id: js.UndefOr[String] = js.native
  
  var item_list_name: js.UndefOr[String] = js.native
  
  var item_name: js.UndefOr[String] = js.native
  
  var item_variant: js.UndefOr[String] = js.native
  
  var location_id: js.UndefOr[String] = js.native
  
  /** @deprecated Use item_name instead. */
  var name: js.UndefOr[String] = js.native
  
  var price: js.UndefOr[typings.firebase.mod.firebase.analytics.Currency] = js.native
  
  var promotion_id: js.UndefOr[String] = js.native
  
  var promotion_name: js.UndefOr[String] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
}
object Item {
  
  @scala.inline
  def apply(): Item = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setAffiliation(value: String): Self = this.set("affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffiliation: Self = this.set("affiliation", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    
    @scala.inline
    def setCreative_name(value: String): Self = this.set("creative_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreative_name: Self = this.set("creative_name", js.undefined)
    
    @scala.inline
    def setCreative_slot(value: String): Self = this.set("creative_slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreative_slot: Self = this.set("creative_slot", js.undefined)
    
    @scala.inline
    def setDiscount(value: typings.firebase.mod.firebase.analytics.Currency): Self = this.set("discount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setItem_brand(value: String): Self = this.set("item_brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_brand: Self = this.set("item_brand", js.undefined)
    
    @scala.inline
    def setItem_category(value: String): Self = this.set("item_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_category: Self = this.set("item_category", js.undefined)
    
    @scala.inline
    def setItem_category2(value: String): Self = this.set("item_category2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_category2: Self = this.set("item_category2", js.undefined)
    
    @scala.inline
    def setItem_category3(value: String): Self = this.set("item_category3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_category3: Self = this.set("item_category3", js.undefined)
    
    @scala.inline
    def setItem_category4(value: String): Self = this.set("item_category4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_category4: Self = this.set("item_category4", js.undefined)
    
    @scala.inline
    def setItem_category5(value: String): Self = this.set("item_category5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_category5: Self = this.set("item_category5", js.undefined)
    
    @scala.inline
    def setItem_id(value: String): Self = this.set("item_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_id: Self = this.set("item_id", js.undefined)
    
    @scala.inline
    def setItem_list_id(value: String): Self = this.set("item_list_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_list_id: Self = this.set("item_list_id", js.undefined)
    
    @scala.inline
    def setItem_list_name(value: String): Self = this.set("item_list_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_list_name: Self = this.set("item_list_name", js.undefined)
    
    @scala.inline
    def setItem_name(value: String): Self = this.set("item_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_name: Self = this.set("item_name", js.undefined)
    
    @scala.inline
    def setItem_variant(value: String): Self = this.set("item_variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem_variant: Self = this.set("item_variant", js.undefined)
    
    @scala.inline
    def setLocation_id(value: String): Self = this.set("location_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation_id: Self = this.set("location_id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrice(value: typings.firebase.mod.firebase.analytics.Currency): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setPromotion_id(value: String): Self = this.set("promotion_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotion_id: Self = this.set("promotion_id", js.undefined)
    
    @scala.inline
    def setPromotion_name(value: String): Self = this.set("promotion_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotion_name: Self = this.set("promotion_name", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}
