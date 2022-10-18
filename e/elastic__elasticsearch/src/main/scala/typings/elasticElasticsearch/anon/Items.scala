package typings.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[String]] = js.undefined
}
object Items {
  
  inline def apply(): Items = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Items]
  }
  
  extension [Self <: Items](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
