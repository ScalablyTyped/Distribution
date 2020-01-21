package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsDetachEndpointsRequest extends js.Object {
  /**
    * The list of network endpoints to be detached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
}

object SchemaNetworkEndpointGroupsDetachEndpointsRequest {
  @scala.inline
  def apply(networkEndpoints: js.Array[SchemaNetworkEndpoint] = null): SchemaNetworkEndpointGroupsDetachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (networkEndpoints != null) __obj.updateDynamic("networkEndpoints")(networkEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsDetachEndpointsRequest]
  }
}

