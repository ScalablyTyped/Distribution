package typings.googleapis.betaMod.computeBeta

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
  def apply(
    peerExternalGateway: String = null,
    peerGcpGateway: String = null,
    state: SchemaVpnGatewayStatusHighAvailabilityRequirementState = null,
    tunnels: js.Array[SchemaVpnGatewayStatusTunnel] = null
  ): SchemaVpnGatewayStatusVpnConnection = {
    val __obj = js.Dynamic.literal()
    if (peerExternalGateway != null) __obj.updateDynamic("peerExternalGateway")(peerExternalGateway.asInstanceOf[js.Any])
    if (peerGcpGateway != null) __obj.updateDynamic("peerGcpGateway")(peerGcpGateway.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tunnels != null) __obj.updateDynamic("tunnels")(tunnels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewayStatusVpnConnection]
  }
}

