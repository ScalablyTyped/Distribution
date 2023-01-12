package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateApiKeyRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  var role_descriptors: js.UndefOr[Record[String, SecurityRoleDescriptor]] = js.undefined
}
object SecurityUpdateApiKeyRequest {
  
  inline def apply(id: Id): SecurityUpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityUpdateApiKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityUpdateApiKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRole_descriptors(value: Record[String, SecurityRoleDescriptor]): Self = StObject.set(x, "role_descriptors", value.asInstanceOf[js.Any])
    
    inline def setRole_descriptorsUndefined: Self = StObject.set(x, "role_descriptors", js.undefined)
  }
}
