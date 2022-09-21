package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewayStatusTunnel extends StObject {
  
  /**
    * The VPN gateway interface this VPN tunnel is associated with.
    */
  var localGatewayInterface: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The peer gateway interface this VPN tunnel is connected to, the peer gateway could either be an external VPN gateway or GCP VPN gateway.
    */
  var peerGatewayInterface: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * URL reference to the VPN tunnel.
    */
  var tunnelUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaVpnGatewayStatusTunnel {
  
  inline def apply(): SchemaVpnGatewayStatusTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusTunnel]
  }
  
  extension [Self <: SchemaVpnGatewayStatusTunnel](x: Self) {
    
    inline def setLocalGatewayInterface(value: Double): Self = StObject.set(x, "localGatewayInterface", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayInterfaceNull: Self = StObject.set(x, "localGatewayInterface", null)
    
    inline def setLocalGatewayInterfaceUndefined: Self = StObject.set(x, "localGatewayInterface", js.undefined)
    
    inline def setPeerGatewayInterface(value: Double): Self = StObject.set(x, "peerGatewayInterface", value.asInstanceOf[js.Any])
    
    inline def setPeerGatewayInterfaceNull: Self = StObject.set(x, "peerGatewayInterface", null)
    
    inline def setPeerGatewayInterfaceUndefined: Self = StObject.set(x, "peerGatewayInterface", js.undefined)
    
    inline def setTunnelUrl(value: String): Self = StObject.set(x, "tunnelUrl", value.asInstanceOf[js.Any])
    
    inline def setTunnelUrlNull: Self = StObject.set(x, "tunnelUrl", null)
    
    inline def setTunnelUrlUndefined: Self = StObject.set(x, "tunnelUrl", js.undefined)
  }
}
