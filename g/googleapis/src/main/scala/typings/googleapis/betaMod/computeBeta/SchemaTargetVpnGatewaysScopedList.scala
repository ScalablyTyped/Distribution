package typings.googleapis.betaMod.computeBeta

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetVpnGatewaysScopedList extends js.Object {
  /**
    * [Output Only] A list of target VPN gateways contained in this scope.
    */
  var targetVpnGateways: js.UndefOr[js.Array[SchemaTargetVpnGateway]] = js.native
  /**
    * [Output Only] Informational warning which replaces the list of addresses
    * when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaTargetVpnGatewaysScopedList {
  @scala.inline
  def apply(targetVpnGateways: js.Array[SchemaTargetVpnGateway] = null, warning: AnonCode = null): SchemaTargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    if (targetVpnGateways != null) __obj.updateDynamic("targetVpnGateways")(targetVpnGateways.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetVpnGatewaysScopedList]
  }
}

