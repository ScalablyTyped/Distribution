package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetVpnGatewaysScopedList extends js.Object {
  /** [Output Only] List of target vpn gateways contained in this scope. */
  var targetVpnGateways: js.UndefOr[js.Array[TargetVpnGateway]] = js.undefined
  /** [Output Only] Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.undefined
}

object TargetVpnGatewaysScopedList {
  @scala.inline
  def apply(targetVpnGateways: js.Array[TargetVpnGateway] = null, warning: AnonCode = null): TargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetVpnGateways != null) __obj.updateDynamic("targetVpnGateways")(targetVpnGateways.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetVpnGatewaysScopedList]
  }
}

