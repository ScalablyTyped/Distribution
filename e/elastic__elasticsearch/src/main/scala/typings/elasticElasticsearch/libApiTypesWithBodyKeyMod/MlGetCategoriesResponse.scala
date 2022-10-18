package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCategoriesResponse extends StObject {
  
  var categories: js.Array[MlCategory]
  
  var count: long
}
object MlGetCategoriesResponse {
  
  inline def apply(categories: js.Array[MlCategory], count: long): MlGetCategoriesResponse = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCategoriesResponse]
  }
  
  extension [Self <: MlGetCategoriesResponse](x: Self) {
    
    inline def setCategories(value: js.Array[MlCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesVarargs(value: MlCategory*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
