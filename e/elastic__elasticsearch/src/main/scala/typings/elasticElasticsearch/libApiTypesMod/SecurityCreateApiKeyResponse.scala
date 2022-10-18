package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreateApiKeyResponse extends StObject {
  
  var api_key: String
  
  var encoded: String
  
  var expiration: js.UndefOr[long] = js.undefined
  
  var id: Id
  
  var name: Name
}
object SecurityCreateApiKeyResponse {
  
  inline def apply(api_key: String, encoded: String, id: Id, name: Name): SecurityCreateApiKeyResponse = {
    val __obj = js.Dynamic.literal(api_key = api_key.asInstanceOf[js.Any], encoded = encoded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityCreateApiKeyResponse]
  }
  
  extension [Self <: SecurityCreateApiKeyResponse](x: Self) {
    
    inline def setApi_key(value: String): Self = StObject.set(x, "api_key", value.asInstanceOf[js.Any])
    
    inline def setEncoded(value: String): Self = StObject.set(x, "encoded", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: long): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
