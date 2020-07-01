package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains some information about a VPN tunnel.
  */
@js.native
trait SchemaVpnGatewayStatusTunnel extends js.Object {
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

object SchemaVpnGatewayStatusTunnel {
  @scala.inline
  def apply(
    localGatewayInterface: js.UndefOr[Double] = js.undefined,
    peerGatewayInterface: js.UndefOr[Double] = js.undefined,
    tunnelUrl: String = null
  ): SchemaVpnGatewayStatusTunnel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(localGatewayInterface)) __obj.updateDynamic("localGatewayInterface")(localGatewayInterface.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peerGatewayInterface)) __obj.updateDynamic("peerGatewayInterface")(peerGatewayInterface.get.asInstanceOf[js.Any])
    if (tunnelUrl != null) __obj.updateDynamic("tunnelUrl")(tunnelUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewayStatusTunnel]
  }
}

