package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for exporting cluster resource usages.
  */
@js.native
trait Schema$ResourceUsageExportConfig extends js.Object {
  /**
    * Configuration to use BigQuery as usage export destination.
    */
  var bigqueryDestination: js.UndefOr[Schema$BigQueryDestination] = js.native
  /**
    * Whether to enable network egress metering for this cluster. If enabled, a
    * daemonset will be created in the cluster to meter network egress traffic.
    */
  var enableNetworkEgressMetering: js.UndefOr[Boolean] = js.native
}

object Schema$ResourceUsageExportConfig {
  @scala.inline
  def apply(
    bigqueryDestination: Schema$BigQueryDestination = null,
    enableNetworkEgressMetering: js.UndefOr[Boolean] = js.undefined
  ): Schema$ResourceUsageExportConfig = {
    val __obj = js.Dynamic.literal()
    if (bigqueryDestination != null) __obj.updateDynamic("bigqueryDestination")(bigqueryDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNetworkEgressMetering)) __obj.updateDynamic("enableNetworkEgressMetering")(enableNetworkEgressMetering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceUsageExportConfig]
  }
}

