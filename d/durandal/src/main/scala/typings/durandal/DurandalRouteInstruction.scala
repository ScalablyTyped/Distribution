package typings.durandal

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalRouteInstruction extends StObject {
  
  var config: DurandalRouteConfiguration
  
  var fragment: String
  
  var params: js.Array[Any]
  
  var queryParams: StringDictionary[Any]
  
  var queryString: String
}
object DurandalRouteInstruction {
  
  inline def apply(
    config: DurandalRouteConfiguration,
    fragment: String,
    params: js.Array[Any],
    queryParams: StringDictionary[Any],
    queryString: String
  ): DurandalRouteInstruction = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalRouteInstruction]
  }
  
  extension [Self <: DurandalRouteInstruction](x: Self) {
    
    inline def setConfig(value: DurandalRouteConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setQueryParams(value: StringDictionary[Any]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
