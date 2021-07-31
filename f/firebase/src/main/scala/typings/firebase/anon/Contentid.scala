package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.analytics.Item
import typings.firebase.mod.firebase.analytics.Promotion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentid
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var content_id: js.UndefOr[String] = js.undefined
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
}
object Contentid {
  
  @scala.inline
  def apply(): Contentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contentid]
  }
  
  @scala.inline
  implicit class ContentidMutableBuilder[Self <: Contentid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_idUndefined: Self = StObject.set(x, "content_id", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
  }
}
