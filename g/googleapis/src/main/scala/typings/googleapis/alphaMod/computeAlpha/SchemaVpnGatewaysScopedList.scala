package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnGatewaysScopedList extends js.Object {
  /**
    * [Output Only] A list of VPN gateways contained in this scope.
    */
  var vpnGateways: js.UndefOr[js.Array[SchemaVpnGateway]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaVpnGatewaysScopedList {
  @scala.inline
  def apply(vpnGateways: js.Array[SchemaVpnGateway] = null, warning: AnonCode = null): SchemaVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (vpnGateways != null) __obj.updateDynamic("vpnGateways")(vpnGateways.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewaysScopedList]
  }
}

