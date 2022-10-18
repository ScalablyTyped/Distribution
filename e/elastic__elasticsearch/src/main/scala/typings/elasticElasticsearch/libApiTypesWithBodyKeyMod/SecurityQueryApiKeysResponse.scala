package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityQueryApiKeysResponse extends StObject {
  
  var api_keys: js.Array[SecurityApiKey]
  
  var count: integer
  
  var total: integer
}
object SecurityQueryApiKeysResponse {
  
  inline def apply(api_keys: js.Array[SecurityApiKey], count: integer, total: integer): SecurityQueryApiKeysResponse = {
    val __obj = js.Dynamic.literal(api_keys = api_keys.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityQueryApiKeysResponse]
  }
  
  extension [Self <: SecurityQueryApiKeysResponse](x: Self) {
    
    inline def setApi_keys(value: js.Array[SecurityApiKey]): Self = StObject.set(x, "api_keys", value.asInstanceOf[js.Any])
    
    inline def setApi_keysVarargs(value: SecurityApiKey*): Self = StObject.set(x, "api_keys", js.Array(value*))
    
    inline def setCount(value: integer): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: integer): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
