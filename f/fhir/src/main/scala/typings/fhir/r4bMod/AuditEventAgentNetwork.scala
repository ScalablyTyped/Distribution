package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventAgentNetwork
  extends StObject
     with BackboneElement {
  
  var _address: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * This could be a device id, IP address or some other identifier associated with a device.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier for the type of network access point that originated the audit event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AuditEventAgentNetwork {
  
  inline def apply(): AuditEventAgentNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventAgentNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuditEventAgentNetwork] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_address(value: Element): Self = StObject.set(x, "_address", value.asInstanceOf[js.Any])
    
    inline def set_addressUndefined: Self = StObject.set(x, "_address", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
