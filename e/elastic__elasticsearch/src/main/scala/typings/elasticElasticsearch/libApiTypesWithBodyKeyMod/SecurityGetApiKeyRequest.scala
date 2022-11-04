package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: js.UndefOr[Id] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var owner: js.UndefOr[Boolean] = js.undefined
  
  var realm_name: js.UndefOr[Name] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
  
  var with_limited_by: js.UndefOr[Boolean] = js.undefined
}
object SecurityGetApiKeyRequest {
  
  inline def apply(): SecurityGetApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetApiKeyRequest]
  }
  
  extension [Self <: SecurityGetApiKeyRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRealm_name(value: Name): Self = StObject.set(x, "realm_name", value.asInstanceOf[js.Any])
    
    inline def setRealm_nameUndefined: Self = StObject.set(x, "realm_name", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    inline def setWith_limited_by(value: Boolean): Self = StObject.set(x, "with_limited_by", value.asInstanceOf[js.Any])
    
    inline def setWith_limited_byUndefined: Self = StObject.set(x, "with_limited_by", js.undefined)
  }
}
