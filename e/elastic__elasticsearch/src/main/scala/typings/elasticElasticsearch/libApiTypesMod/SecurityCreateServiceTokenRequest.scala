package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCreateServiceTokenRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: js.UndefOr[Name] = js.undefined
  
  var namespace: Namespace
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var service: Service
}
object SecurityCreateServiceTokenRequest {
  
  inline def apply(namespace: Namespace, service: Service): SecurityCreateServiceTokenRequest = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityCreateServiceTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityCreateServiceTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
