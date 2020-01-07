package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VpnTunnelsScopedList extends js.Object {
  /**
    * A list of VPN tunnels contained in this scope.
    */
  var vpnTunnels: js.UndefOr[js.Array[Schema$VpnTunnel]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$VpnTunnelsScopedList {
  @scala.inline
  def apply(vpnTunnels: js.Array[Schema$VpnTunnel] = null, warning: Anon_Code = null): Schema$VpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    if (vpnTunnels != null) __obj.updateDynamic("vpnTunnels")(vpnTunnels.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnTunnelsScopedList]
  }
}

