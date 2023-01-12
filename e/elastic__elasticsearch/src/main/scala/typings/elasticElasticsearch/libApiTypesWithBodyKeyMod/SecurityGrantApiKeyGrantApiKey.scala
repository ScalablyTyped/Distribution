package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGrantApiKeyGrantApiKey extends StObject {
  
  var expiration: js.UndefOr[DurationLarge] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var name: Name
  
  var role_descriptors: js.UndefOr[
    (Record[String, SecurityRoleDescriptor]) | (js.Array[Record[String, SecurityRoleDescriptor]])
  ] = js.undefined
}
object SecurityGrantApiKeyGrantApiKey {
  
  inline def apply(name: Name): SecurityGrantApiKeyGrantApiKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGrantApiKeyGrantApiKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGrantApiKeyGrantApiKey] (val x: Self) extends AnyVal {
    
    inline def setExpiration(value: DurationLarge): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptors(
      value: (Record[String, SecurityRoleDescriptor]) | (js.Array[Record[String, SecurityRoleDescriptor]])
    ): Self = StObject.set(x, "role_descriptors", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptorsUndefined: Self = StObject.set(x, "role_descriptors", js.undefined)
    
    inline def setRole_descriptorsVarargs(value: (Record[String, SecurityRoleDescriptor])*): Self = StObject.set(x, "role_descriptors", js.Array(value*))
  }
}
