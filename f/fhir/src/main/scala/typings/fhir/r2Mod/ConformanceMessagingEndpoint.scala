package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceMessagingEndpoint
  extends StObject
     with BackboneElement {
  
  var _address: js.UndefOr[Element] = js.undefined
  
  /**
    * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier.
    */
  var address: String
  
  /**
    * A list of the messaging transport protocol(s) identifiers, supported by this endpoint.
    */
  var protocol: Coding
}
object ConformanceMessagingEndpoint {
  
  inline def apply(address: String, protocol: Coding): ConformanceMessagingEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceMessagingEndpoint]
  }
  
  extension [Self <: ConformanceMessagingEndpoint](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: Coding): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def set_address(value: Element): Self = StObject.set(x, "_address", value.asInstanceOf[js.Any])
    
    inline def set_addressUndefined: Self = StObject.set(x, "_address", js.undefined)
  }
}
