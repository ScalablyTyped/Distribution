package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetServiceAccountsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var namespace: js.UndefOr[Namespace] = js.undefined
  
  var service: js.UndefOr[Service] = js.undefined
}
object SecurityGetServiceAccountsRequest {
  
  inline def apply(): SecurityGetServiceAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGetServiceAccountsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetServiceAccountsRequest] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
