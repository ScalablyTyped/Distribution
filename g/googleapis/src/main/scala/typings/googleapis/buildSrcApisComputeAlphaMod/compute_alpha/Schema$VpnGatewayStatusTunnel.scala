package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains some information about a VPN tunnel.
  */
@js.native
trait Schema$VpnGatewayStatusTunnel extends js.Object {
  /**
    * The VPN gateway interface this VPN tunnel is associated with.
    */
  var localGatewayInterface: js.UndefOr[Double] = js.native
  /**
    * The peer gateway interface this VPN tunnel is connected to, the peer
    * gateway could either be an external VPN gateway or GCP VPN gateway.
    */
  var peerGatewayInterface: js.UndefOr[Double] = js.native
  /**
    * URL reference to the VPN tunnel.
    */
  var tunnelUrl: js.UndefOr[String] = js.native
}

object Schema$VpnGatewayStatusTunnel {
  @scala.inline
  def apply(
    localGatewayInterface: Int | Double = null,
    peerGatewayInterface: Int | Double = null,
    tunnelUrl: String = null
  ): Schema$VpnGatewayStatusTunnel = {
    val __obj = js.Dynamic.literal()
    if (localGatewayInterface != null) __obj.updateDynamic("localGatewayInterface")(localGatewayInterface.asInstanceOf[js.Any])
    if (peerGatewayInterface != null) __obj.updateDynamic("peerGatewayInterface")(peerGatewayInterface.asInstanceOf[js.Any])
    if (tunnelUrl != null) __obj.updateDynamic("tunnelUrl")(tunnelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnGatewayStatusTunnel]
  }
}

