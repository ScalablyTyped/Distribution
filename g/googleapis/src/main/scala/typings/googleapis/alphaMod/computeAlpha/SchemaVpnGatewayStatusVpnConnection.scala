package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VPN connection contains all VPN tunnels connected from this VpnGateway to
  * the same peer gateway. The peer gateway could either be a external VPN
  * gateway or GCP VPN gateway.
  */
@js.native
trait SchemaVpnGatewayStatusVpnConnection extends js.Object {
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
  implicit class SchemaVpnGatewayStatusVpnConnectionOps[Self <: SchemaVpnGatewayStatusVpnConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPeerExternalGateway(value: String): Self = this.set("peerExternalGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerExternalGateway: Self = this.set("peerExternalGateway", js.undefined)
    @scala.inline
    def setPeerGcpGateway(value: String): Self = this.set("peerGcpGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerGcpGateway: Self = this.set("peerGcpGateway", js.undefined)
    @scala.inline
    def setState(value: SchemaVpnGatewayStatusHighAvailabilityRequirementState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTunnelsVarargs(value: SchemaVpnGatewayStatusTunnel*): Self = this.set("tunnels", js.Array(value :_*))
    @scala.inline
    def setTunnels(value: js.Array[SchemaVpnGatewayStatusTunnel]): Self = this.set("tunnels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnels: Self = this.set("tunnels", js.undefined)
  }
  
}

