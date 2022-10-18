package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetServiceCredentialsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var namespace: Namespace
  
  var service: Name
}
object SecurityGetServiceCredentialsRequest {
  
  inline def apply(namespace: Namespace, service: Name): SecurityGetServiceCredentialsRequest = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetServiceCredentialsRequest]
  }
  
  extension [Self <: SecurityGetServiceCredentialsRequest](x: Self) {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setService(value: Name): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
