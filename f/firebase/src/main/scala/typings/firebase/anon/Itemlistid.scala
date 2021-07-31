package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.analytics.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemlistid
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var item_list_id: js.UndefOr[String] = js.undefined
  
  var item_list_name: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
}
object Itemlistid {
  
  @scala.inline
  def apply(): Itemlistid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Itemlistid]
  }
  
  @scala.inline
  implicit class ItemlistidMutableBuilder[Self <: Itemlistid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
    
    @scala.inline
    def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
