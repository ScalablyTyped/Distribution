package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworkEndpointGroupsListEndpointsRequest extends js.Object {
  /**
    * Optional query parameter for showing the health status of each network
    * endpoint. Valid options are SKIP or SHOW. If you don&#39;t specifiy this
    * parameter, the health status of network endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String] = js.native
}

object Schema$NetworkEndpointGroupsListEndpointsRequest {
  @scala.inline
  def apply(healthStatus: String = null): Schema$NetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointGroupsListEndpointsRequest]
  }
}

