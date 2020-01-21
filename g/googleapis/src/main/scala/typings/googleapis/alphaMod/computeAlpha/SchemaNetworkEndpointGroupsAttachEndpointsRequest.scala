package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointGroupsAttachEndpointsRequest extends js.Object {
  /**
    * The list of network endpoints to be attached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
}

object SchemaNetworkEndpointGroupsAttachEndpointsRequest {
  @scala.inline
  def apply(networkEndpoints: js.Array[SchemaNetworkEndpoint] = null): SchemaNetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (networkEndpoints != null) __obj.updateDynamic("networkEndpoints")(networkEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsAttachEndpointsRequest]
  }
}

