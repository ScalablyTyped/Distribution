package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityApiKey extends StObject {
  
  var creation: js.UndefOr[long] = js.undefined
  
  var expiration: js.UndefOr[long] = js.undefined
  
  var id: Id
  
  var invalidated: js.UndefOr[Boolean] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var name: Name
  
  var realm: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object SecurityApiKey {
  
  inline def apply(id: Id, name: Name): SecurityApiKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityApiKey]
  }
  
  extension [Self <: SecurityApiKey](x: Self) {
    
    inline def setCreation(value: long): Self = StObject.set(x, "creation", value.asInstanceOf[js.Any])
    
    inline def setCreationUndefined: Self = StObject.set(x, "creation", js.undefined)
    
    inline def setExpiration(value: long): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvalidated(value: Boolean): Self = StObject.set(x, "invalidated", value.asInstanceOf[js.Any])
    
    inline def setInvalidatedUndefined: Self = StObject.set(x, "invalidated", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
