package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworkEndpointGroupsAttachEndpointsRequest extends js.Object {
  /**
    * The list of network endpoints to be attached.
    */
  var networkEndpoints: js.UndefOr[js.Array[Schema$NetworkEndpoint]] = js.native
}

object Schema$NetworkEndpointGroupsAttachEndpointsRequest {
  @scala.inline
  def apply(networkEndpoints: js.Array[Schema$NetworkEndpoint] = null): Schema$NetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (networkEndpoints != null) __obj.updateDynamic("networkEndpoints")(networkEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointGroupsAttachEndpointsRequest]
  }
}

