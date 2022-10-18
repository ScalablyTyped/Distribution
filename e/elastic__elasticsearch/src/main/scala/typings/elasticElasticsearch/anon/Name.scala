package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var id: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id] = js.undefined
  
  var ids: js.UndefOr[js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id]] = js.undefined
  
  var name: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name] = js.undefined
  
  var owner: js.UndefOr[Boolean] = js.undefined
  
  var realm_name: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[Username] = js.undefined
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setId(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIds(value: js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setName(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRealm_name(value: String): Self = StObject.set(x, "realm_name", value.asInstanceOf[js.Any])
    
    inline def setRealm_nameUndefined: Self = StObject.set(x, "realm_name", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
