package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDeleteServiceTokenRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: Name
  
  var namespace: Namespace
  
  var refresh: js.UndefOr[Refresh] = js.undefined
  
  var service: Service
}
object SecurityDeleteServiceTokenRequest {
  
  inline def apply(name: Name, namespace: Namespace, service: Service): SecurityDeleteServiceTokenRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeleteServiceTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDeleteServiceTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: Refresh): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    inline def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
