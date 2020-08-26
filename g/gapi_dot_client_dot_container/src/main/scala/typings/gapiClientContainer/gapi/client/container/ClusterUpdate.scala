package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterUpdate extends js.Object {
  /** Configurations for the various addons available to run in the cluster. */
  var desiredAddonsConfig: js.UndefOr[AddonsConfig] = js.native
  /**
    * The desired image type for the node pool.
    * NOTE: Set the "desired_node_pool" field as well.
    */
  var desiredImageType: js.UndefOr[String] = js.native
  /**
    * The desired list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located. Changing the locations a cluster is in will result
    * in nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.
    *
    * This list must always include the cluster's primary zone.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Master authorized networks is a Beta feature.
    * The desired configuration options for master authorized networks feature.
    */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.native
  /**
    * The Kubernetes version to change the master to. The only valid value is the
    * latest supported version. Use "-" to have the server automatically select
    * the latest version.
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; "monitoring.googleapis.com" - the Google Cloud Monitoring service
    * &#42; "none" - no metrics will be exported from the cluster
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  /**
    * Autoscaler configuration for the node pool specified in
    * desired_node_pool_id. If there is only one pool in the
    * cluster and desired_node_pool_id is not provided then
    * the change applies to that single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[NodePoolAutoscaling] = js.native
  /**
    * The node pool to be upgraded. This field is mandatory if
    * "desired_node_version", "desired_image_family" or
    * "desired_node_pool_autoscaling" is specified and there is more than one
    * node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an
    * upgrade). Use `-` to upgrade to the latest version supported by
    * the server.
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
}

object ClusterUpdate {
  @scala.inline
  def apply(): ClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterUpdate]
  }
  @scala.inline
  implicit class ClusterUpdateOps[Self <: ClusterUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDesiredAddonsConfig(value: AddonsConfig): Self = this.set("desiredAddonsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredAddonsConfig: Self = this.set("desiredAddonsConfig", js.undefined)
    @scala.inline
    def setDesiredImageType(value: String): Self = this.set("desiredImageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredImageType: Self = this.set("desiredImageType", js.undefined)
    @scala.inline
    def setDesiredLocationsVarargs(value: String*): Self = this.set("desiredLocations", js.Array(value :_*))
    @scala.inline
    def setDesiredLocations(value: js.Array[String]): Self = this.set("desiredLocations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredLocations: Self = this.set("desiredLocations", js.undefined)
    @scala.inline
    def setDesiredMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = this.set("desiredMasterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredMasterAuthorizedNetworksConfig: Self = this.set("desiredMasterAuthorizedNetworksConfig", js.undefined)
    @scala.inline
    def setDesiredMasterVersion(value: String): Self = this.set("desiredMasterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredMasterVersion: Self = this.set("desiredMasterVersion", js.undefined)
    @scala.inline
    def setDesiredMonitoringService(value: String): Self = this.set("desiredMonitoringService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredMonitoringService: Self = this.set("desiredMonitoringService", js.undefined)
    @scala.inline
    def setDesiredNodePoolAutoscaling(value: NodePoolAutoscaling): Self = this.set("desiredNodePoolAutoscaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNodePoolAutoscaling: Self = this.set("desiredNodePoolAutoscaling", js.undefined)
    @scala.inline
    def setDesiredNodePoolId(value: String): Self = this.set("desiredNodePoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNodePoolId: Self = this.set("desiredNodePoolId", js.undefined)
    @scala.inline
    def setDesiredNodeVersion(value: String): Self = this.set("desiredNodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredNodeVersion: Self = this.set("desiredNodeVersion", js.undefined)
  }
  
}

