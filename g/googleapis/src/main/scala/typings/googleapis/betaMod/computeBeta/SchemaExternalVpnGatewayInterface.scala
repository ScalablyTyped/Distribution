package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for the external VPN gateway.
  */
@js.native
trait SchemaExternalVpnGatewayInterface extends js.Object {
  /**
    * The numeric ID of this interface. The allowed input values for this id
    * for different redundancy types of external VPN gateway:
    * SINGLE_IP_INTERNALLY_REDUNDANT - 0 TWO_IPS_REDUNDANCY - 0, 1
    * FOUR_IPS_REDUNDANCY - 0, 1, 2, 3
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * IP address of the interface in the external VPN gateway. Only IPv4 is
    * supported. This IP address can be either from your on-premise gateway or
    * another Cloud provider?s VPN gateway, it cannot be an IP address from
    * Google Compute Engine.
    */
  var ipAddress: js.UndefOr[String] = js.native
}

object SchemaExternalVpnGatewayInterface {
  @scala.inline
  def apply(): SchemaExternalVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExternalVpnGatewayInterface]
  }
  @scala.inline
  implicit class SchemaExternalVpnGatewayInterfaceOps[Self <: SchemaExternalVpnGatewayInterface] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
  }
  
}

