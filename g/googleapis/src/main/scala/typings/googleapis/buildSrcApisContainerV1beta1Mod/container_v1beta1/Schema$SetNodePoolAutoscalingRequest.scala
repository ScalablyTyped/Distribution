package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SetNodePoolAutoscalingRequest sets the autoscaler settings of a node pool.
  */
@js.native
trait Schema$SetNodePoolAutoscalingRequest extends js.Object {
  /**
    * Autoscaling configuration for the node pool.
    */
  var autoscaling: js.UndefOr[Schema$NodePoolAutoscaling] = js.native
  /**
    * Deprecated. The name of the cluster to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var clusterId: js.UndefOr[String] = js.native
  /**
    * The name (project, location, cluster, node pool) of the node pool to set
    * autoscaler settings. Specified in the format
    * &#39;projects/x/locations/x/clusters/x/nodePools/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the node pool to upgrade. This field has been
    * deprecated and replaced by the name field.
    */
  var nodePoolId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster resides. This
    * field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$SetNodePoolAutoscalingRequest {
  @scala.inline
  def apply(
    autoscaling: Schema$NodePoolAutoscaling = null,
    clusterId: String = null,
    name: String = null,
    nodePoolId: String = null,
    projectId: String = null,
    zone: String = null
  ): Schema$SetNodePoolAutoscalingRequest = {
    val __obj = js.Dynamic.literal()
    if (autoscaling != null) __obj.updateDynamic("autoscaling")(autoscaling.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodePoolId != null) __obj.updateDynamic("nodePoolId")(nodePoolId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SetNodePoolAutoscalingRequest]
  }
}

