package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
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
  var warning: js.UndefOr[Code] = js.native
}

object SchemaVpnGatewaysScopedList {
  @scala.inline
  def apply(): SchemaVpnGatewaysScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpnGatewaysScopedList]
  }
  @scala.inline
  implicit class SchemaVpnGatewaysScopedListOps[Self <: SchemaVpnGatewaysScopedList] (val x: Self) extends AnyVal {
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
    def setVpnGatewaysVarargs(value: SchemaVpnGateway*): Self = this.set("vpnGateways", js.Array(value :_*))
    @scala.inline
    def setVpnGateways(value: js.Array[SchemaVpnGateway]): Self = this.set("vpnGateways", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpnGateways: Self = this.set("vpnGateways", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

