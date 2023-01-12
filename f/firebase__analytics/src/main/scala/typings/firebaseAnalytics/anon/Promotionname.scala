package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distAnalyticsMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promotionname
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var promotion_id: js.UndefOr[String] = js.undefined
  
  var promotion_name: js.UndefOr[String] = js.undefined
}
object Promotionname {
  
  inline def apply(): Promotionname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotionname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Promotionname] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
    
    inline def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
    
    inline def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
    
    inline def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
  }
}
