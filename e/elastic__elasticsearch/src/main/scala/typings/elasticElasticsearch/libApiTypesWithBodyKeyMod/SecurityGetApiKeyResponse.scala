package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetApiKeyResponse extends StObject {
  
  var api_keys: js.Array[SecurityApiKey]
}
object SecurityGetApiKeyResponse {
  
  inline def apply(api_keys: js.Array[SecurityApiKey]): SecurityGetApiKeyResponse = {
    val __obj = js.Dynamic.literal(api_keys = api_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetApiKeyResponse]
  }
  
  extension [Self <: SecurityGetApiKeyResponse](x: Self) {
    
    inline def setApi_keys(value: js.Array[SecurityApiKey]): Self = StObject.set(x, "api_keys", value.asInstanceOf[js.Any])
    
    inline def setApi_keysVarargs(value: SecurityApiKey*): Self = StObject.set(x, "api_keys", js.Array(value*))
  }
}
