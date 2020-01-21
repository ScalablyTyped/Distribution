package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVpnGatewaysGetStatusResponse extends js.Object {
  var result: js.UndefOr[SchemaVpnGatewayStatus] = js.native
}

object SchemaVpnGatewaysGetStatusResponse {
  @scala.inline
  def apply(result: SchemaVpnGatewayStatus = null): SchemaVpnGatewaysGetStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpnGatewaysGetStatusResponse]
  }
}

