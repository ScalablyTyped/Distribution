package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateItem extends StObject {
  
  var data: js.UndefOr[CreateItemData] = js.undefined
  
  var included: js.Array[CreateItemIncluded]
  
  var jsonapi: js.UndefOr[JsonApiVersionJsonapi] = js.undefined
}
object CreateItem {
  
  inline def apply(included: js.Array[CreateItemIncluded]): CreateItem = {
    val __obj = js.Dynamic.literal(included = included.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItem]
  }
  
  extension [Self <: CreateItem](x: Self) {
    
    inline def setData(value: CreateItemData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIncluded(value: js.Array[CreateItemIncluded]): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
    
    inline def setIncludedVarargs(value: CreateItemIncluded*): Self = StObject.set(x, "included", js.Array(value*))
    
    inline def setJsonapi(value: JsonApiVersionJsonapi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setJsonapiUndefined: Self = StObject.set(x, "jsonapi", js.undefined)
  }
}
