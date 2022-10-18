package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditEventParticipantNetwork
  extends StObject
     with BackboneElement {
  
  var _address: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * This datum identifies the user's network access point, which may be distinct from the server that performed the action. It is an optional value that may be used to group events recorded on separate servers for analysis of a specific network access point's data access across all servers.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * This datum identifies the type of network access point identifier of the user device for the audit event. It is an optional value that may be used to group events recorded on separate servers for analysis of access according to a network access point's type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object AuditEventParticipantNetwork {
  
  inline def apply(): AuditEventParticipantNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditEventParticipantNetwork]
  }
  
  extension [Self <: AuditEventParticipantNetwork](x: Self) {
    
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
