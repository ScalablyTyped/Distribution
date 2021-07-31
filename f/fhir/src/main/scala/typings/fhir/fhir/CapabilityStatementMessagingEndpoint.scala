package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Where messages should be sent
  */
trait CapabilityStatementMessagingEndpoint
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  
  /**
    * Network address or identifier of the end-point
    */
  var address: uri
  
  /**
    * http | ftp | mllp +
    */
  var protocol: Coding
}
object CapabilityStatementMessagingEndpoint {
  
  @scala.inline
  def apply(address: uri, protocol: Coding): CapabilityStatementMessagingEndpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEndpoint]
  }
  
  @scala.inline
  implicit class CapabilityStatementMessagingEndpointMutableBuilder[Self <: CapabilityStatementMessagingEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: uri): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: Coding): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_address(value: Element): Self = StObject.set(x, "_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_addressUndefined: Self = StObject.set(x, "_address", js.undefined)
  }
}
