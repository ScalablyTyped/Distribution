package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClientDotCompute.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysScopedList extends js.Object {
  /** [Output Only] List of target vpn gateways contained in this scope. */
  var targetVpnGateways: js.UndefOr[js.Array[TargetVpnGateway]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Anon_Code] = js.undefined
}

object TargetVpnGatewaysScopedList {
  @scala.inline
  def apply(targetVpnGateways: js.Array[TargetVpnGateway] = null, warning: Anon_Code = null): TargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetVpnGateways != null) __obj.updateDynamic("targetVpnGateways")(targetVpnGateways.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetVpnGatewaysScopedList]
  }
}

