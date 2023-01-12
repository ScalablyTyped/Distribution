package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGrantApiKeyResponse extends StObject {
  
  var api_key: String
  
  var encoded: String
  
  var expiration: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var id: Id
  
  var name: Name
}
object SecurityGrantApiKeyResponse {
  
  inline def apply(api_key: String, encoded: String, id: Id, name: Name): SecurityGrantApiKeyResponse = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], encoded = encoded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGrantApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGrantApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: EpochTime[UnitMillis]): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
