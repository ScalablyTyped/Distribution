package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkeyItemlistid
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var item_list_id: js.UndefOr[String] = js.undefined
  
  var item_list_name: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
}
object DictkeyItemlistid {
  
  inline def apply(): DictkeyItemlistid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictkeyItemlistid]
  }
  
  extension [Self <: DictkeyItemlistid](x: Self) {
    
    inline def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
    
    inline def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
    
    inline def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
    
    inline def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
