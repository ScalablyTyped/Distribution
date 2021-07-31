package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.analytics.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promotionid
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var promotion_id: js.UndefOr[String] = js.undefined
  
  var promotion_name: js.UndefOr[String] = js.undefined
}
object Promotionid {
  
  @scala.inline
  def apply(): Promotionid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotionid]
  }
  
  @scala.inline
  implicit class PromotionidMutableBuilder[Self <: Promotionid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
    
    @scala.inline
    def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
  }
}
