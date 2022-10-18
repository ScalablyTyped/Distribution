package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetFiltersResponse extends StObject {
  
  var count: long
  
  var filters: js.Array[MlFilter]
}
object MlGetFiltersResponse {
  
  inline def apply(count: long, filters: js.Array[MlFilter]): MlGetFiltersResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetFiltersResponse]
  }
  
  extension [Self <: MlGetFiltersResponse](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: js.Array[MlFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: MlFilter*): Self = StObject.set(x, "filters", js.Array(value*))
  }
}
