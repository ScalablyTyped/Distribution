package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingApiEndpointsChangedForOriginEvent extends StObject {
  
  var endpoints: js.Array[ReportingApiEndpoint]
  
  /**
    * Origin of the document(s) which configured the endpoints.
    */
  var origin: String
}
object ReportingApiEndpointsChangedForOriginEvent {
  
  inline def apply(endpoints: js.Array[ReportingApiEndpoint], origin: String): ReportingApiEndpointsChangedForOriginEvent = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingApiEndpointsChangedForOriginEvent]
  }
  
  extension [Self <: ReportingApiEndpointsChangedForOriginEvent](x: Self) {
    
    inline def setEndpoints(value: js.Array[ReportingApiEndpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsVarargs(value: ReportingApiEndpoint*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
