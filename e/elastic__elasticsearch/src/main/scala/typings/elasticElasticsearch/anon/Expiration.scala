package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SecurityRoleDescriptor
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expiration extends StObject {
  
  var expiration: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var metadata: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var name: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name] = js.undefined
  
  var role_descriptors: js.UndefOr[Record[String, SecurityRoleDescriptor]] = js.undefined
}
object Expiration {
  
  inline def apply(): Expiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expiration]
  }
  
  extension [Self <: Expiration](x: Self) {
    
    inline def setExpiration(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setMetadata(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole_descriptors(value: Record[String, SecurityRoleDescriptor]): Self = StObject.set(x, "role_descriptors", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptorsUndefined: Self = StObject.set(x, "role_descriptors", js.undefined)
  }
}
