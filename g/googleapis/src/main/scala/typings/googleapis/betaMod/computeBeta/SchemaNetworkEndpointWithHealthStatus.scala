package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworkEndpointWithHealthStatus extends js.Object {
  /**
    * [Output only] The health status of network endpoint;
    */
  var healths: js.UndefOr[js.Array[SchemaHealthStatusForNetworkEndpoint]] = js.native
  /**
    * [Output only] The network endpoint;
    */
  var networkEndpoint: js.UndefOr[SchemaNetworkEndpoint] = js.native
}

object SchemaNetworkEndpointWithHealthStatus {
  @scala.inline
  def apply(
    healths: js.Array[SchemaHealthStatusForNetworkEndpoint] = null,
    networkEndpoint: SchemaNetworkEndpoint = null
  ): SchemaNetworkEndpointWithHealthStatus = {
    val __obj = js.Dynamic.literal()
    if (healths != null) __obj.updateDynamic("healths")(healths.asInstanceOf[js.Any])
    if (networkEndpoint != null) __obj.updateDynamic("networkEndpoint")(networkEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkEndpointWithHealthStatus]
  }
}

