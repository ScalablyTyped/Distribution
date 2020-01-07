package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VPN gateway interface.
  */
@js.native
trait Schema$VpnGatewayVpnGatewayInterface extends js.Object {
  /**
    * The numeric ID of this VPN gateway interface.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * The external IP address for this VPN gateway interface.
    */
  var ipAddress: js.UndefOr[String] = js.native
}

object Schema$VpnGatewayVpnGatewayInterface {
  @scala.inline
  def apply(id: Int | Double = null, ipAddress: String = null): Schema$VpnGatewayVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnGatewayVpnGatewayInterface]
  }
}

