package typings.evernote.anon

import typings.evernote.mod.Types.NoteSortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var order: js.UndefOr[NoteSortOrder] = js.undefined
  
  var publicDescription: js.UndefOr[String] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
}
object Order {
  
  inline def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setOrder(value: NoteSortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPublicDescription(value: String): Self = StObject.set(x, "publicDescription", value.asInstanceOf[js.Any])
    
    inline def setPublicDescriptionUndefined: Self = StObject.set(x, "publicDescription", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
