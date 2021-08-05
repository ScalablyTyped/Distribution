package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VPN gateway interface.
  */
trait SchemaVpnGatewayVpnGatewayInterface extends StObject {
  
  /**
    * The numeric ID of this VPN gateway interface.
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * The external IP address for this VPN gateway interface.
    */
  var ipAddress: js.UndefOr[String] = js.undefined
}
object SchemaVpnGatewayVpnGatewayInterface {
  
  inline def apply(): SchemaVpnGatewayVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayVpnGatewayInterface]
  }
  
  extension [Self <: SchemaVpnGatewayVpnGatewayInterface](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
  }
}
