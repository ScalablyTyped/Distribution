package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClusterUpdate extends js.Object {
  /** Configurations for the various addons available to run in the cluster. */
  var desiredAddonsConfig: js.UndefOr[AddonsConfig] = js.undefined
  /**
               * The desired image type for the node pool.
               * NOTE: Set the "desired_node_pool" field as well.
               */
  var desiredImageType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The desired list of Google Compute Engine
               * [locations](/compute/docs/zones#available) in which the cluster's nodes
               * should be located. Changing the locations a cluster is in will result
               * in nodes being either created or removed from the cluster, depending on
               * whether locations are being added or removed.
               *
               * This list must always include the cluster's primary zone.
               */
  var desiredLocations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Master authorized networks is a Beta feature.
               * The desired configuration options for master authorized networks feature.
               */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.undefined
  /**
               * The Kubernetes version to change the master to. The only valid value is the
               * latest supported version. Use "-" to have the server automatically select
               * the latest version.
               */
  var desiredMasterVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The monitoring service the cluster should use to write metrics.
               * Currently available options:
               *
               * &#42; "monitoring.googleapis.com" - the Google Cloud Monitoring service
               * &#42; "none" - no metrics will be exported from the cluster
               */
  var desiredMonitoringService: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Autoscaler configuration for the node pool specified in
               * desired_node_pool_id. If there is only one pool in the
               * cluster and desired_node_pool_id is not provided then
               * the change applies to that single node pool.
               */
  var desiredNodePoolAutoscaling: js.UndefOr[NodePoolAutoscaling] = js.undefined
  /**
               * The node pool to be upgraded. This field is mandatory if
               * "desired_node_version", "desired_image_family" or
               * "desired_node_pool_autoscaling" is specified and there is more than one
               * node pool on the cluster.
               */
  var desiredNodePoolId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The Kubernetes version to change the nodes to (typically an
               * upgrade). Use `-` to upgrade to the latest version supported by
               * the server.
               */
  var desiredNodeVersion: js.UndefOr[java.lang.String] = js.undefined
}

