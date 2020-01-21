package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A VPN gateway interface.
  */
@js.native
trait SchemaVpnGatewayVpnGatewayInterface extends js.Object {
  /**
    * The numeric ID of this VPN gateway interface.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * The external IP address for this VPN gateway interface.
    */
  var ipAddress: js.UndefOr[String] = js.native
}

object SchemaVpnGatewayVpnGatewayInterface {
  @scala.inline
  def apply(id: Int | Double = null, ipAddress: String = null): SchemaVpnGatewayVpnGatewayInterface = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewayVpnGatewayInterface]
  }
}

