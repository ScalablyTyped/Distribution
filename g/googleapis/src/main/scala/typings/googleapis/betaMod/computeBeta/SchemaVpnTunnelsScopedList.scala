package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnTunnelsScopedList extends js.Object {
  /**
    * A list of VPN tunnels contained in this scope.
    */
  var vpnTunnels: js.UndefOr[js.Array[SchemaVpnTunnel]] = js.native
  /**
    * Informational warning which replaces the list of addresses when the list
    * is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaVpnTunnelsScopedList {
  @scala.inline
  def apply(vpnTunnels: js.Array[SchemaVpnTunnel] = null, warning: Code = null): SchemaVpnTunnelsScopedList = {
    val __obj = js.Dynamic.literal()
    if (vpnTunnels != null) __obj.updateDynamic("vpnTunnels")(vpnTunnels.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnTunnelsScopedList]
  }
}

