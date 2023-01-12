package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySamlServiceProviderMetadataRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var realm_name: Name
}
object SecuritySamlServiceProviderMetadataRequest {
  
  inline def apply(realm_name: Name): SecuritySamlServiceProviderMetadataRequest = {
    val __obj = js.Dynamic.literal(realm_name = realm_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySamlServiceProviderMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySamlServiceProviderMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setRealm_name(value: Name): Self = StObject.set(x, "realm_name", value.asInstanceOf[js.Any])
  }
}
