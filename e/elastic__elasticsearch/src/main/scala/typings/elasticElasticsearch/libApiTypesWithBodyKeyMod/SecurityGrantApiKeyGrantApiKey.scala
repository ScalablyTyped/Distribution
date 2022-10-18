package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGrantApiKeyGrantApiKey extends StObject {
  
  var expiration: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var role_descriptors: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
}
object SecurityGrantApiKeyGrantApiKey {
  
  inline def apply(name: Name): SecurityGrantApiKeyGrantApiKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGrantApiKeyGrantApiKey]
  }
  
  extension [Self <: SecurityGrantApiKeyGrantApiKey](x: Self) {
    
    inline def setExpiration(value: Duration): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptors(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "role_descriptors", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptorsUndefined: Self = StObject.set(x, "role_descriptors", js.undefined)
    
    inline def setRole_descriptorsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "role_descriptors", js.Array(value*))
  }
}
