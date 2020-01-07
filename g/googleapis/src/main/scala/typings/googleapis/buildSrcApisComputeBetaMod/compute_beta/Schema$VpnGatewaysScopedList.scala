package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VpnGatewaysScopedList extends js.Object {
  /**
    * [Output Only] A list of VPN gateways contained in this scope.
    */
  var vpnGateways: js.UndefOr[js.Array[Schema$VpnGateway]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$VpnGatewaysScopedList {
  @scala.inline
  def apply(vpnGateways: js.Array[Schema$VpnGateway] = null, warning: Anon_Code = null): Schema$VpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (vpnGateways != null) __obj.updateDynamic("vpnGateways")(vpnGateways.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnGatewaysScopedList]
  }
}

