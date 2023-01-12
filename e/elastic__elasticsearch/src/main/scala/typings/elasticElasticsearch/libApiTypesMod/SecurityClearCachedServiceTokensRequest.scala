package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityClearCachedServiceTokensRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Names
  
  var namespace: Namespace
  
  var service: Service
}
object SecurityClearCachedServiceTokensRequest {
  
  inline def apply(name: Names, namespace: Namespace, service: Service): SecurityClearCachedServiceTokensRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedServiceTokensRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityClearCachedServiceTokensRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
