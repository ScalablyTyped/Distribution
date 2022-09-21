package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetSslProxiesSetBackendServiceRequest extends StObject {
  
  /**
    * The URL of the new BackendService resource for the targetSslProxy.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetSslProxiesSetBackendServiceRequest {
  
  inline def apply(): SchemaTargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetBackendServiceRequest]
  }
  
  extension [Self <: SchemaTargetSslProxiesSetBackendServiceRequest](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
