package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VPN connection contains all VPN tunnels connected from this VpnGateway to
  * the same peer gateway. The peer gateway could either be a external VPN
  * gateway or GCP VPN gateway.
  */
@js.native
trait SchemaVpnGatewayStatusVpnConnection extends StObject {
  
  /**
    * URL reference to the peer external VPN gateways to which the VPN tunnels
    * in this VPN connection are connected. This field is mutually exclusive
    * with peer_gcp_gateway.
    */
  var peerExternalGateway: js.UndefOr[String] = js.native
  
  /**
    * URL reference to the peer side VPN gateways to which the VPN tunnels in
    * this VPN connection are connected. This field is mutually exclusive with
    * peer_gcp_gateway.
    */
  var peerGcpGateway: js.UndefOr[String] = js.native
  
  /**
    * HighAvailabilityRequirementState for the VPN connection.
    */
  var state: js.UndefOr[SchemaVpnGatewayStatusHighAvailabilityRequirementState] = js.native
  
  /**
    * List of VPN tunnels that are in this VPN connection.
    */
  var tunnels: js.UndefOr[js.Array[SchemaVpnGatewayStatusTunnel]] = js.native
}
object SchemaVpnGatewayStatusVpnConnection {
  
  @scala.inline
  def apply(): SchemaVpnGatewayStatusVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewayStatusVpnConnection]
  }
  
  @scala.inline
  implicit class SchemaVpnGatewayStatusVpnConnectionMutableBuilder[Self <: SchemaVpnGatewayStatusVpnConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeerExternalGateway(value: String): Self = StObject.set(x, "peerExternalGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerExternalGatewayUndefined: Self = StObject.set(x, "peerExternalGateway", js.undefined)
    
    @scala.inline
    def setPeerGcpGateway(value: String): Self = StObject.set(x, "peerGcpGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerGcpGatewayUndefined: Self = StObject.set(x, "peerGcpGateway", js.undefined)
    
    @scala.inline
    def setState(value: SchemaVpnGatewayStatusHighAvailabilityRequirementState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTunnels(value: js.Array[SchemaVpnGatewayStatusTunnel]): Self = StObject.set(x, "tunnels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelsUndefined: Self = StObject.set(x, "tunnels", js.undefined)
    
    @scala.inline
    def setTunnelsVarargs(value: SchemaVpnGatewayStatusTunnel*): Self = StObject.set(x, "tunnels", js.Array(value :_*))
  }
}
