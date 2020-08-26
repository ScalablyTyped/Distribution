package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
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
  var warning: js.UndefOr[Code] = js.native
}

object SchemaTargetVpnGatewaysScopedList {
  @scala.inline
  def apply(): SchemaTargetVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetVpnGatewaysScopedList]
  }
  @scala.inline
  implicit class SchemaTargetVpnGatewaysScopedListOps[Self <: SchemaTargetVpnGatewaysScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTargetVpnGatewaysVarargs(value: SchemaTargetVpnGateway*): Self = this.set("targetVpnGateways", js.Array(value :_*))
    @scala.inline
    def setTargetVpnGateways(value: js.Array[SchemaTargetVpnGateway]): Self = this.set("targetVpnGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetVpnGateways: Self = this.set("targetVpnGateways", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

