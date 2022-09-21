package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectDiagnosticsARPEntry extends StObject {
  
  /**
    * The IP address of this ARP neighbor.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The MAC address of this ARP neighbor.
    */
  var macAddress: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectDiagnosticsARPEntry {
  
  inline def apply(): SchemaInterconnectDiagnosticsARPEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectDiagnosticsARPEntry]
  }
  
  extension [Self <: SchemaInterconnectDiagnosticsARPEntry](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressNull: Self = StObject.set(x, "macAddress", null)
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
