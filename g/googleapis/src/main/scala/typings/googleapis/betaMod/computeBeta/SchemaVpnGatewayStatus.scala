package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnGatewayStatus extends js.Object {
  /**
    * List of VPN connection for this VpnGateway.
    */
  var vpnConnections: js.UndefOr[js.Array[SchemaVpnGatewayStatusVpnConnection]] = js.native
}

object SchemaVpnGatewayStatus {
  @scala.inline
  def apply(vpnConnections: js.Array[SchemaVpnGatewayStatusVpnConnection] = null): SchemaVpnGatewayStatus = {
    val __obj = js.Dynamic.literal()
    if (vpnConnections != null) __obj.updateDynamic("vpnConnections")(vpnConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewayStatus]
  }
}

