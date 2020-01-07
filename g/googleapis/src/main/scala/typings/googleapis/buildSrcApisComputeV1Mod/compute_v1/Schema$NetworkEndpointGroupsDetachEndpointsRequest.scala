package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworkEndpointGroupsDetachEndpointsRequest extends js.Object {
  /**
    * The list of network endpoints to be detached.
    */
  var networkEndpoints: js.UndefOr[js.Array[Schema$NetworkEndpoint]] = js.native
}

object Schema$NetworkEndpointGroupsDetachEndpointsRequest {
  @scala.inline
  def apply(networkEndpoints: js.Array[Schema$NetworkEndpoint] = null): Schema$NetworkEndpointGroupsDetachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (networkEndpoints != null) __obj.updateDynamic("networkEndpoints")(networkEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointGroupsDetachEndpointsRequest]
  }
}

