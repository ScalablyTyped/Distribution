package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreateApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var expiration: js.UndefOr[Duration] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var role_descriptors: js.UndefOr[Record[String, SecurityRoleDescriptor]] = js.undefined
}
object SecurityCreateApiKeyRequest {
  
  inline def apply(): SecurityCreateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityCreateApiKeyRequest]
  }
  
  extension [Self <: SecurityCreateApiKeyRequest](x: Self) {
    
    inline def setExpiration(value: Duration): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setRole_descriptors(value: Record[String, SecurityRoleDescriptor]): Self = StObject.set(x, "role_descriptors", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptorsUndefined: Self = StObject.set(x, "role_descriptors", js.undefined)
  }
}
