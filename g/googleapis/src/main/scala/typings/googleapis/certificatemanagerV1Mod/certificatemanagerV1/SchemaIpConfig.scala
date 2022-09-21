package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIpConfig extends StObject {
  
  /**
    * Output only. An external IP address.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Ports.
    */
  var ports: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaIpConfig {
  
  inline def apply(): SchemaIpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIpConfig]
  }
  
  extension [Self <: SchemaIpConfig](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsNull: Self = StObject.set(x, "ports", null)
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
