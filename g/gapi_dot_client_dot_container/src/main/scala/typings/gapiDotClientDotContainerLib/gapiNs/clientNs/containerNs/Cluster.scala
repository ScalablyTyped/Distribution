package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /** Configurations for the various addons available to run in the cluster. */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.undefined
  /**
    * The IP address range of the container pods in this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`). Leave blank to have
    * one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The time the cluster was created, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] The current software version of the master endpoint. */
  var currentMasterVersion: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] The number of nodes currently in the cluster. */
  var currentNodeCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * [Output only] The current version of the node software components.
    * If they are currently at multiple versions because they're in the process
    * of being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this cluster. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes alpha
    * API groups (e.g. v1alpha1) and features that may not be production ready in
    * the kubernetes version of the master and nodes.
    * The cluster has no SLA for uptime and master/node upgrades are disabled.
    * Alpha enabled clusters are automatically deleted thirty days after
    * creation.
    */
  var enableKubernetesAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [Output only] The IP address of this cluster's master endpoint.
    * The endpoint can be accessed from the internet at
    * `https://username:password@endpoint/`.
    *
    * See the `masterAuth` property of this resource for username and
    * password information.
    */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The time the cluster will be automatically
    * deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var expireTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial Kubernetes version for this cluster.  Valid versions are those
    * found in validMasterVersions returned by getServerConfig.  The version can
    * be upgraded over time; such upgrades are reflected in
    * currentMasterVersion and currentNodeVersion.
    */
  var initialClusterVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of nodes to create in this cluster. You must ensure that your
    * Compute Engine <a href="/compute/docs/resource-quotas">resource quota</a>
    * is sufficient for this number of instances. You must also have available
    * firewall and routes quota.
    * For requests, this field should only be used in lieu of a
    * "node_pool" object, since this configuration (along with the
    * "node_config") will be used to create a "NodePool" object with an
    * auto-generated name. Do not use this and a node_pool at the same time.
    */
  var initialNodeCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * [Output only] The resource URLs of [instance
    * groups](/compute/docs/instance-groups/) associated with this
    * cluster.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Configuration for cluster IP allocation. */
  var ipAllocationPolicy: js.UndefOr[IPAllocationPolicy] = js.undefined
  /** The fingerprint of the set of labels for this cluster. */
  var labelFingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration for the legacy ABAC authorization mode. */
  var legacyAbac: js.UndefOr[LegacyAbac] = js.undefined
  /**
    * The list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located.
    */
  var locations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The logging service the cluster should use to write logs.
    * Currently available options:
    *
    * &#42; `logging.googleapis.com` - the Google Cloud Logging service.
    * &#42; `none` - no logs will be exported from the cluster.
    * &#42; if left as an empty string,`logging.googleapis.com` will be used.
    */
  var loggingService: js.UndefOr[java.lang.String] = js.undefined
  /** Configure the maintenance policy for this cluster. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.undefined
  /** The authentication information for accessing the master endpoint. */
  var masterAuth: js.UndefOr[MasterAuth] = js.undefined
  /**
    * Master authorized networks is a Beta feature.
    * The configuration options for master authorized networks feature.
    */
  var masterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.undefined
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; `monitoring.googleapis.com` - the Google Cloud Monitoring service.
    * &#42; `none` - no metrics will be exported from the cluster.
    * &#42; if left as an empty string, `monitoring.googleapis.com` will be used.
    */
  var monitoringService: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of this cluster. The name must be unique within this project
    * and zone, and can be up to 40 characters with the following restrictions:
    *
    * &#42; Lowercase letters, numbers, and hyphens only.
    * &#42; Must start with a letter.
    * &#42; Must end with a number or a letter.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. If left unspecified, the `default` network
    * will be used.
    */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.undefined
  /**
    * Parameters used in creating the cluster's nodes.
    * See `nodeConfig` for the description of its properties.
    * For requests, this field should only be used in lieu of a
    * "node_pool" object, since this configuration (along with the
    * "initial_node_count") will be used to create a "NodePool" object with an
    * auto-generated name. Do not use this and a node_pool at the same time.
    * For responses, this field will be populated with the node configuration of
    * the first node pool.
    *
    * If unspecified, the defaults are used.
    */
  var nodeConfig: js.UndefOr[NodeConfig] = js.undefined
  /**
    * [Output only] The size of the address space on each node for hosting
    * containers. This is provisioned from within the `container_ipv4_cidr`
    * range.
    */
  var nodeIpv4CidrSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The node pools associated with this cluster.
    * This field should not be set if "node_config" or "initial_node_count" are
    * specified.
    */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.undefined
  /**
    * The resource labels for the cluster to use to annotate any related
    * Google Compute Engine resources.
    */
  var resourceLabels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The IP address range of the Kubernetes services in
    * this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `1.2.3.4/29`). Service addresses are
    * typically put in the last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] The current status of this cluster. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] Additional information about the current status of this
    * cluster, if available.
    */
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the Google Compute Engine
    * [subnetwork](/compute/docs/subnetworks) to which the
    * cluster is connected.
    */
  var subnetwork: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster
    * resides.
    */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object Cluster {
  @scala.inline
  def apply(
    addonsConfig: AddonsConfig = null,
    clusterIpv4Cidr: java.lang.String = null,
    createTime: java.lang.String = null,
    currentMasterVersion: java.lang.String = null,
    currentNodeCount: scala.Int | scala.Double = null,
    currentNodeVersion: java.lang.String = null,
    description: java.lang.String = null,
    enableKubernetesAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: java.lang.String = null,
    expireTime: java.lang.String = null,
    initialClusterVersion: java.lang.String = null,
    initialNodeCount: scala.Int | scala.Double = null,
    instanceGroupUrls: js.Array[java.lang.String] = null,
    ipAllocationPolicy: IPAllocationPolicy = null,
    labelFingerprint: java.lang.String = null,
    legacyAbac: LegacyAbac = null,
    locations: js.Array[java.lang.String] = null,
    loggingService: java.lang.String = null,
    maintenancePolicy: MaintenancePolicy = null,
    masterAuth: MasterAuth = null,
    masterAuthorizedNetworksConfig: MasterAuthorizedNetworksConfig = null,
    monitoringService: java.lang.String = null,
    name: java.lang.String = null,
    network: java.lang.String = null,
    networkPolicy: NetworkPolicy = null,
    nodeConfig: NodeConfig = null,
    nodeIpv4CidrSize: scala.Int | scala.Double = null,
    nodePools: js.Array[NodePool] = null,
    resourceLabels: stdLib.Record[java.lang.String, java.lang.String] = null,
    selfLink: java.lang.String = null,
    servicesIpv4Cidr: java.lang.String = null,
    status: java.lang.String = null,
    statusMessage: java.lang.String = null,
    subnetwork: java.lang.String = null,
    zone: java.lang.String = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (addonsConfig != null) __obj.updateDynamic("addonsConfig")(addonsConfig)
    if (clusterIpv4Cidr != null) __obj.updateDynamic("clusterIpv4Cidr")(clusterIpv4Cidr)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (currentMasterVersion != null) __obj.updateDynamic("currentMasterVersion")(currentMasterVersion)
    if (currentNodeCount != null) __obj.updateDynamic("currentNodeCount")(currentNodeCount.asInstanceOf[js.Any])
    if (currentNodeVersion != null) __obj.updateDynamic("currentNodeVersion")(currentNodeVersion)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enableKubernetesAlpha)) __obj.updateDynamic("enableKubernetesAlpha")(enableKubernetesAlpha)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime)
    if (initialClusterVersion != null) __obj.updateDynamic("initialClusterVersion")(initialClusterVersion)
    if (initialNodeCount != null) __obj.updateDynamic("initialNodeCount")(initialNodeCount.asInstanceOf[js.Any])
    if (instanceGroupUrls != null) __obj.updateDynamic("instanceGroupUrls")(instanceGroupUrls)
    if (ipAllocationPolicy != null) __obj.updateDynamic("ipAllocationPolicy")(ipAllocationPolicy)
    if (labelFingerprint != null) __obj.updateDynamic("labelFingerprint")(labelFingerprint)
    if (legacyAbac != null) __obj.updateDynamic("legacyAbac")(legacyAbac)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (loggingService != null) __obj.updateDynamic("loggingService")(loggingService)
    if (maintenancePolicy != null) __obj.updateDynamic("maintenancePolicy")(maintenancePolicy)
    if (masterAuth != null) __obj.updateDynamic("masterAuth")(masterAuth)
    if (masterAuthorizedNetworksConfig != null) __obj.updateDynamic("masterAuthorizedNetworksConfig")(masterAuthorizedNetworksConfig)
    if (monitoringService != null) __obj.updateDynamic("monitoringService")(monitoringService)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (networkPolicy != null) __obj.updateDynamic("networkPolicy")(networkPolicy)
    if (nodeConfig != null) __obj.updateDynamic("nodeConfig")(nodeConfig)
    if (nodeIpv4CidrSize != null) __obj.updateDynamic("nodeIpv4CidrSize")(nodeIpv4CidrSize.asInstanceOf[js.Any])
    if (nodePools != null) __obj.updateDynamic("nodePools")(nodePools)
    if (resourceLabels != null) __obj.updateDynamic("resourceLabels")(resourceLabels)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (servicesIpv4Cidr != null) __obj.updateDynamic("servicesIpv4Cidr")(servicesIpv4Cidr)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Cluster]
  }
}

