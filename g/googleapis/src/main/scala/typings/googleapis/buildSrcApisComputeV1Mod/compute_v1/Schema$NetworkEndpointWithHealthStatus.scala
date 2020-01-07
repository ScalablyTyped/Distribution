package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NetworkEndpointWithHealthStatus extends js.Object {
  /**
    * [Output only] The health status of network endpoint;
    */
  var healths: js.UndefOr[js.Array[Schema$HealthStatusForNetworkEndpoint]] = js.native
  /**
    * [Output only] The network endpoint;
    */
  var networkEndpoint: js.UndefOr[Schema$NetworkEndpoint] = js.native
}

object Schema$NetworkEndpointWithHealthStatus {
  @scala.inline
  def apply(
    healths: js.Array[Schema$HealthStatusForNetworkEndpoint] = null,
    networkEndpoint: Schema$NetworkEndpoint = null
  ): Schema$NetworkEndpointWithHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (healths != null) __obj.updateDynamic("healths")(healths.asInstanceOf[js.Any])
    if (networkEndpoint != null) __obj.updateDynamic("networkEndpoint")(networkEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NetworkEndpointWithHealthStatus]
  }
}

