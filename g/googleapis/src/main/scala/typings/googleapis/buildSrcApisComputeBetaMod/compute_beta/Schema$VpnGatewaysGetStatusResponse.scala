package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$VpnGatewaysGetStatusResponse extends js.Object {
  var result: js.UndefOr[Schema$VpnGatewayStatus] = js.native
}

object Schema$VpnGatewaysGetStatusResponse {
  @scala.inline
  def apply(result: Schema$VpnGatewayStatus = null): Schema$VpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpnGatewaysGetStatusResponse]
  }
}

