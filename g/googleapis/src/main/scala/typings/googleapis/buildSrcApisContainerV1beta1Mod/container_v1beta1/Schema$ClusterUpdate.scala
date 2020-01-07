package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterUpdate describes an update to the cluster. Exactly one update can be
  * applied to a cluster with each request, so at most one field can be
  * provided.
  */
@js.native
trait Schema$ClusterUpdate extends js.Object {
  /**
    * Configurations for the various addons available to run in the cluster.
    */
  var desiredAddonsConfig: js.UndefOr[Schema$AddonsConfig] = js.native
  /**
    * The desired configuration options for the Binary Authorization feature.
    */
  var desiredBinaryAuthorization: js.UndefOr[Schema$BinaryAuthorization] = js.native
  /**
    * Cluster-level autoscaling configuration.
    */
  var desiredClusterAutoscaling: js.UndefOr[Schema$ClusterAutoscaling] = js.native
  /**
    * Configuration of etcd encryption.
    */
  var desiredDatabaseEncryption: js.UndefOr[Schema$DatabaseEncryption] = js.native
  /**
    * The desired image type for the node pool. NOTE: Set the
    * &quot;desired_node_pool&quot; field as well.
    */
  var desiredImageType: js.UndefOr[String] = js.native
  /**
    * The desired config of Intra-node visibility.
    */
  var desiredIntraNodeVisibilityConfig: js.UndefOr[Schema$IntraNodeVisibilityConfig] = js.native
  /**
    * The desired list of Google Compute Engine
    * [zones](/compute/docs/zones#available) in which the cluster&#39;s nodes
    * should be located. Changing the locations a cluster is in will result in
    * nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.  This list must always
    * include the cluster&#39;s primary zone.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The logging service the cluster should use to write metrics. Currently
    * available options:  * &quot;logging.googleapis.com/kubernetes&quot; - the
    * Google Cloud Logging service with Kubernetes-native resource model in
    * Stackdriver * &quot;logging.googleapis.com&quot; - the Google Cloud
    * Logging service * &quot;none&quot; - no logs will be exported from the
    * cluster
    */
  var desiredLoggingService: js.UndefOr[String] = js.native
  /**
    * The desired configuration options for master authorized networks feature.
    */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[Schema$MasterAuthorizedNetworksConfig] = js.native
  /**
    * The Kubernetes version to change the master to. The only valid value is
    * the latest supported version.  Users may specify either explicit versions
    * offered by Kubernetes Engine or version aliases, which have the following
    * behavior:  - &quot;latest&quot;: picks the highest valid Kubernetes
    * version - &quot;1.X&quot;: picks the highest valid patch+gke.N patch in
    * the 1.X version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch
    * in the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit
    * Kubernetes version - &quot;-&quot;: picks the default Kubernetes version
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  /**
    * The monitoring service the cluster should use to write metrics. Currently
    * available options:  * &quot;monitoring.googleapis.com/kubernetes&quot; -
    * the Google Cloud Monitoring service with Kubernetes-native resource model
    * in Stackdriver * &quot;monitoring.googleapis.com&quot; - the Google Cloud
    * Monitoring service * &quot;none&quot; - no metrics will be exported from
    * the cluster
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  /**
    * Autoscaler configuration for the node pool specified in
    * desired_node_pool_id. If there is only one pool in the cluster and
    * desired_node_pool_id is not provided then the change applies to that
    * single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[Schema$NodePoolAutoscaling] = js.native
  /**
    * The node pool to be upgraded. This field is mandatory if
    * &quot;desired_node_version&quot;, &quot;desired_image_family&quot; or
    * &quot;desired_node_pool_autoscaling&quot; is specified and there is more
    * than one node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade).
    * Users may specify either explicit versions offered by Kubernetes Engine
    * or version aliases, which have the following behavior:  -
    * &quot;latest&quot;: picks the highest valid Kubernetes version -
    * &quot;1.X&quot;: picks the highest valid patch+gke.N patch in the 1.X
    * version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch in
    * the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit Kubernetes
    * version - &quot;-&quot;: picks the Kubernetes master version
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
  /**
    * The desired configuration options for the PodSecurityPolicy feature.
    */
  var desiredPodSecurityPolicyConfig: js.UndefOr[Schema$PodSecurityPolicyConfig] = js.native
  /**
    * The desired configuration for exporting resource usage.
    */
  var desiredResourceUsageExportConfig: js.UndefOr[Schema$ResourceUsageExportConfig] = js.native
  /**
    * Cluster-level Vertical Pod Autoscaling configuration.
    */
  var desiredVerticalPodAutoscaling: js.UndefOr[Schema$VerticalPodAutoscaling] = js.native
}

object Schema$ClusterUpdate {
  @scala.inline
  def apply(
    desiredAddonsConfig: Schema$AddonsConfig = null,
    desiredBinaryAuthorization: Schema$BinaryAuthorization = null,
    desiredClusterAutoscaling: Schema$ClusterAutoscaling = null,
    desiredDatabaseEncryption: Schema$DatabaseEncryption = null,
    desiredImageType: String = null,
    desiredIntraNodeVisibilityConfig: Schema$IntraNodeVisibilityConfig = null,
    desiredLocations: js.Array[String] = null,
    desiredLoggingService: String = null,
    desiredMasterAuthorizedNetworksConfig: Schema$MasterAuthorizedNetworksConfig = null,
    desiredMasterVersion: String = null,
    desiredMonitoringService: String = null,
    desiredNodePoolAutoscaling: Schema$NodePoolAutoscaling = null,
    desiredNodePoolId: String = null,
    desiredNodeVersion: String = null,
    desiredPodSecurityPolicyConfig: Schema$PodSecurityPolicyConfig = null,
    desiredResourceUsageExportConfig: Schema$ResourceUsageExportConfig = null,
    desiredVerticalPodAutoscaling: Schema$VerticalPodAutoscaling = null
  ): Schema$ClusterUpdate = {
    val __obj = js.Dynamic.literal()
    if (desiredAddonsConfig != null) __obj.updateDynamic("desiredAddonsConfig")(desiredAddonsConfig.asInstanceOf[js.Any])
    if (desiredBinaryAuthorization != null) __obj.updateDynamic("desiredBinaryAuthorization")(desiredBinaryAuthorization.asInstanceOf[js.Any])
    if (desiredClusterAutoscaling != null) __obj.updateDynamic("desiredClusterAutoscaling")(desiredClusterAutoscaling.asInstanceOf[js.Any])
    if (desiredDatabaseEncryption != null) __obj.updateDynamic("desiredDatabaseEncryption")(desiredDatabaseEncryption.asInstanceOf[js.Any])
    if (desiredImageType != null) __obj.updateDynamic("desiredImageType")(desiredImageType.asInstanceOf[js.Any])
    if (desiredIntraNodeVisibilityConfig != null) __obj.updateDynamic("desiredIntraNodeVisibilityConfig")(desiredIntraNodeVisibilityConfig.asInstanceOf[js.Any])
    if (desiredLocations != null) __obj.updateDynamic("desiredLocations")(desiredLocations.asInstanceOf[js.Any])
    if (desiredLoggingService != null) __obj.updateDynamic("desiredLoggingService")(desiredLoggingService.asInstanceOf[js.Any])
    if (desiredMasterAuthorizedNetworksConfig != null) __obj.updateDynamic("desiredMasterAuthorizedNetworksConfig")(desiredMasterAuthorizedNetworksConfig.asInstanceOf[js.Any])
    if (desiredMasterVersion != null) __obj.updateDynamic("desiredMasterVersion")(desiredMasterVersion.asInstanceOf[js.Any])
    if (desiredMonitoringService != null) __obj.updateDynamic("desiredMonitoringService")(desiredMonitoringService.asInstanceOf[js.Any])
    if (desiredNodePoolAutoscaling != null) __obj.updateDynamic("desiredNodePoolAutoscaling")(desiredNodePoolAutoscaling.asInstanceOf[js.Any])
    if (desiredNodePoolId != null) __obj.updateDynamic("desiredNodePoolId")(desiredNodePoolId.asInstanceOf[js.Any])
    if (desiredNodeVersion != null) __obj.updateDynamic("desiredNodeVersion")(desiredNodeVersion.asInstanceOf[js.Any])
    if (desiredPodSecurityPolicyConfig != null) __obj.updateDynamic("desiredPodSecurityPolicyConfig")(desiredPodSecurityPolicyConfig.asInstanceOf[js.Any])
    if (desiredResourceUsageExportConfig != null) __obj.updateDynamic("desiredResourceUsageExportConfig")(desiredResourceUsageExportConfig.asInstanceOf[js.Any])
    if (desiredVerticalPodAutoscaling != null) __obj.updateDynamic("desiredVerticalPodAutoscaling")(desiredVerticalPodAutoscaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClusterUpdate]
  }
}

