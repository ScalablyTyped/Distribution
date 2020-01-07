package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TargetVpnGatewaysScopedList extends js.Object {
  /**
    * [Output Only] A list of target VPN gateways contained in this scope.
    */
  var targetVpnGateways: js.UndefOr[js.Array[Schema$TargetVpnGateway]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$TargetVpnGatewaysScopedList {
  @scala.inline
  def apply(targetVpnGateways: js.Array[Schema$TargetVpnGateway] = null, warning: Anon_Code = null): Schema$TargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetVpnGateways != null) __obj.updateDynamic("targetVpnGateways")(targetVpnGateways.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TargetVpnGatewaysScopedList]
  }
}

