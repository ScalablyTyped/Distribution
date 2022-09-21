package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVpnGatewayStatusVpnConnection extends StObject {
  
  /**
    * URL reference to the peer external VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
    */
  var peerExternalGateway: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL reference to the peer side VPN gateways to which the VPN tunnels in this VPN connection are connected. This field is mutually exclusive with peer_gcp_gateway.
    */
  var peerGcpGateway: js.UndefOr[String | Null] = js.undefined
  
  /**
    * HighAvailabilityRequirementState for the VPN connection.
    */
  var state: js.UndefOr[SchemaVpnGatewayStatusHighAvailabilityRequirementState] = js.undefined
  
  /**
    * List of VPN tunnels that are in this VPN connection.
    */
  var tunnels: js.UndefOr[js.Array[SchemaVpnGatewayStatusTunnel]] = js.undefined
}
object SchemaVpnGatewayStatusVpnConnection {
  
  inline def apply(): SchemaVpnGatewayStatusVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusVpnConnection]
  }
  
  extension [Self <: SchemaVpnGatewayStatusVpnConnection](x: Self) {
    
    inline def setPeerExternalGateway(value: String): Self = StObject.set(x, "peerExternalGateway", value.asInstanceOf[js.Any])
    
    inline def setPeerExternalGatewayNull: Self = StObject.set(x, "peerExternalGateway", null)
    
    inline def setPeerExternalGatewayUndefined: Self = StObject.set(x, "peerExternalGateway", js.undefined)
    
    inline def setPeerGcpGateway(value: String): Self = StObject.set(x, "peerGcpGateway", value.asInstanceOf[js.Any])
    
    inline def setPeerGcpGatewayNull: Self = StObject.set(x, "peerGcpGateway", null)
    
    inline def setPeerGcpGatewayUndefined: Self = StObject.set(x, "peerGcpGateway", js.undefined)
    
    inline def setState(value: SchemaVpnGatewayStatusHighAvailabilityRequirementState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTunnels(value: js.Array[SchemaVpnGatewayStatusTunnel]): Self = StObject.set(x, "tunnels", value.asInstanceOf[js.Any])
    
    inline def setTunnelsUndefined: Self = StObject.set(x, "tunnels", js.undefined)
    
    inline def setTunnelsVarargs(value: SchemaVpnGatewayStatusTunnel*): Self = StObject.set(x, "tunnels", js.Array(value*))
  }
}
