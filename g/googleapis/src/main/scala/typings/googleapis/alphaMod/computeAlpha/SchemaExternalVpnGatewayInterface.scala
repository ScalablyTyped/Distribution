package typings.googleapis.alphaMod.computeAlpha

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
  def apply(id: Int | Double = null, ipAddress: String = null): SchemaExternalVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExternalVpnGatewayInterface]
  }
}

