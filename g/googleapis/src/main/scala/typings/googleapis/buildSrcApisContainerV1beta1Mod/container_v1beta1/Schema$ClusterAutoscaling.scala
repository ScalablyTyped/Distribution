package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterAutoscaling contains global, per-cluster information required by
  * Cluster Autoscaler to automatically adjust the size of the cluster and
  * create/delete node pools based on the current needs.
  */
@js.native
trait Schema$ClusterAutoscaling extends js.Object {
  /**
    * Enables automatic node pool creation and deletion.
    */
  var enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.native
  /**
    * Contains global constraints regarding minimum and maximum amount of
    * resources in the cluster.
    */
  var resourceLimits: js.UndefOr[js.Array[Schema$ResourceLimit]] = js.native
}

object Schema$ClusterAutoscaling {
  @scala.inline
  def apply(
    enableNodeAutoprovisioning: js.UndefOr[Boolean] = js.undefined,
    resourceLimits: js.Array[Schema$ResourceLimit] = null
  ): Schema$ClusterAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableNodeAutoprovisioning)) __obj.updateDynamic("enableNodeAutoprovisioning")(enableNodeAutoprovisioning.asInstanceOf[js.Any])
    if (resourceLimits != null) __obj.updateDynamic("resourceLimits")(resourceLimits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClusterAutoscaling]
  }
}

