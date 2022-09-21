package typings.googleapis.anon

import typings.googleapis.bloggerV3Mod.bloggerV3.SchemaComment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelfLinkTotalItems extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaComment]] = js.undefined
  
  var selfLink: js.UndefOr[String] = js.undefined
  
  var totalItems: js.UndefOr[String] = js.undefined
}
object SelfLinkTotalItems {
  
  inline def apply(): SelfLinkTotalItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelfLinkTotalItems]
  }
  
  extension [Self <: SelfLinkTotalItems](x: Self) {
    
    inline def setItems(value: js.Array[SchemaComment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaComment*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTotalItems(value: String): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
