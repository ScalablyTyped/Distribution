package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Logical network location for application activity
  */
trait AuditEventAgentNetwork
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Identifier for the network access point of the user device
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The type of network access point
    */
  var `type`: js.UndefOr[code] = js.undefined
}
object AuditEventAgentNetwork {
  
  inline def apply(): AuditEventAgentNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventAgentNetwork]
  }
  
  extension [Self <: AuditEventAgentNetwork](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_address(value: Element): Self = StObject.set(x, "_address", value.asInstanceOf[js.Any])
    
    inline def set_addressUndefined: Self = StObject.set(x, "_address", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
