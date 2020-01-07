package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VpnGatewayStatus extends js.Object {
  /**
    * List of VPN connection for this VpnGateway.
    */
  var vpnConnections: js.UndefOr[js.Array[Schema$VpnGatewayStatusVpnConnection]] = js.native
}

object Schema$VpnGatewayStatus {
  @scala.inline
  def apply(vpnConnections: js.Array[Schema$VpnGatewayStatusVpnConnection] = null): Schema$VpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    if (vpnConnections != null) __obj.updateDynamic("vpnConnections")(vpnConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnGatewayStatus]
  }
}

