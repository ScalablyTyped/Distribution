package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysScopedList extends js.Object {
  /** [Output Only] List of target vpn gateways contained in this scope. */
  var targetVpnGateways: js.UndefOr[js.Array[TargetVpnGateway]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[gapiDotClientDotComputeLib.Anon_Code] = js.undefined
}

object TargetVpnGatewaysScopedList {
  @scala.inline
  def apply(
    targetVpnGateways: js.Array[TargetVpnGateway] = null,
    warning: gapiDotClientDotComputeLib.Anon_Code = null
  ): TargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetVpnGateways != null) __obj.updateDynamic("targetVpnGateways")(targetVpnGateways)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[TargetVpnGatewaysScopedList]
  }
}

