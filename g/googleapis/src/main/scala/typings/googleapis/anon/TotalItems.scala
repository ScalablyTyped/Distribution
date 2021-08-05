package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TotalItems extends StObject {
  
  var selfLink: js.UndefOr[String] = js.undefined
  
  var totalItems: js.UndefOr[String] = js.undefined
}
object TotalItems {
  
  inline def apply(): TotalItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotalItems]
  }
  
  extension [Self <: TotalItems](x: Self) {
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTotalItems(value: String): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
  }
}
