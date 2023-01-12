package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlServiceProviderMetadataResponse extends StObject {
  
  var metadata: String
}
object SecuritySamlServiceProviderMetadataResponse {
  
  inline def apply(metadata: String): SecuritySamlServiceProviderMetadataResponse = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlServiceProviderMetadataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlServiceProviderMetadataResponse] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
