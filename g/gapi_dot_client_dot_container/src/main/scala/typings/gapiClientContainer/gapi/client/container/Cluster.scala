package typings.gapiClientContainer.gapi.client.container

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /** Configurations for the various addons available to run in the cluster. */
  var addonsConfig: js.UndefOr[AddonsConfig] = js.native
  /**
    * The IP address range of the container pods in this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `10.96.0.0/14`). Leave blank to have
    * one automatically chosen or specify a `/14` block in `10.0.0.0/8`.
    */
  var clusterIpv4Cidr: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the cluster was created, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var createTime: js.UndefOr[String] = js.native
  /** [Output only] The current software version of the master endpoint. */
  var currentMasterVersion: js.UndefOr[String] = js.native
  /** [Output only] The number of nodes currently in the cluster. */
  var currentNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The current version of the node software components.
    * If they are currently at multiple versions because they're in the process
    * of being upgraded, this reflects the minimum version of all nodes.
    */
  var currentNodeVersion: js.UndefOr[String] = js.native
  /** An optional description of this cluster. */
  var description: js.UndefOr[String] = js.native
  /**
    * Kubernetes alpha features are enabled on this cluster. This includes alpha
    * API groups (e.g. v1alpha1) and features that may not be production ready in
    * the kubernetes version of the master and nodes.
    * The cluster has no SLA for uptime and master/node upgrades are disabled.
    * Alpha enabled clusters are automatically deleted thirty days after
    * creation.
    */
  var enableKubernetesAlpha: js.UndefOr[Boolean] = js.native
  /**
    * [Output only] The IP address of this cluster's master endpoint.
    * The endpoint can be accessed from the internet at
    * `https://username:password@endpoint/`.
    *
    * See the `masterAuth` property of this resource for username and
    * password information.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * [Output only] The time the cluster will be automatically
    * deleted in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * The initial Kubernetes version for this cluster.  Valid versions are those
    * found in validMasterVersions returned by getServerConfig.  The version can
    * be upgraded over time; such upgrades are reflected in
    * currentMasterVersion and currentNodeVersion.
    */
  var initialClusterVersion: js.UndefOr[String] = js.native
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
  var initialNodeCount: js.UndefOr[Double] = js.native
  /**
    * [Output only] The resource URLs of [instance
    * groups](/compute/docs/instance-groups/) associated with this
    * cluster.
    */
  var instanceGroupUrls: js.UndefOr[js.Array[String]] = js.native
  /** Configuration for cluster IP allocation. */
  var ipAllocationPolicy: js.UndefOr[IPAllocationPolicy] = js.native
  /** The fingerprint of the set of labels for this cluster. */
  var labelFingerprint: js.UndefOr[String] = js.native
  /** Configuration for the legacy ABAC authorization mode. */
  var legacyAbac: js.UndefOr[LegacyAbac] = js.native
  /**
    * The list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
  /**
    * The logging service the cluster should use to write logs.
    * Currently available options:
    *
    * &#42; `logging.googleapis.com` - the Google Cloud Logging service.
    * &#42; `none` - no logs will be exported from the cluster.
    * &#42; if left as an empty string,`logging.googleapis.com` will be used.
    */
  var loggingService: js.UndefOr[String] = js.native
  /** Configure the maintenance policy for this cluster. */
  var maintenancePolicy: js.UndefOr[MaintenancePolicy] = js.native
  /** The authentication information for accessing the master endpoint. */
  var masterAuth: js.UndefOr[MasterAuth] = js.native
  /**
    * Master authorized networks is a Beta feature.
    * The configuration options for master authorized networks feature.
    */
  var masterAuthorizedNetworksConfig: js.UndefOr[MasterAuthorizedNetworksConfig] = js.native
  /**
    * The monitoring service the cluster should use to write metrics.
    * Currently available options:
    *
    * &#42; `monitoring.googleapis.com` - the Google Cloud Monitoring service.
    * &#42; `none` - no metrics will be exported from the cluster.
    * &#42; if left as an empty string, `monitoring.googleapis.com` will be used.
    */
  var monitoringService: js.UndefOr[String] = js.native
  /**
    * The name of this cluster. The name must be unique within this project
    * and zone, and can be up to 40 characters with the following restrictions:
    *
    * &#42; Lowercase letters, numbers, and hyphens only.
    * &#42; Must start with a letter.
    * &#42; Must end with a number or a letter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [network](/compute/docs/networks-and-firewalls#networks) to which the
    * cluster is connected. If left unspecified, the `default` network
    * will be used.
    */
  var network: js.UndefOr[String] = js.native
  /** Configuration options for the NetworkPolicy feature. */
  var networkPolicy: js.UndefOr[NetworkPolicy] = js.native
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
  var nodeConfig: js.UndefOr[NodeConfig] = js.native
  /**
    * [Output only] The size of the address space on each node for hosting
    * containers. This is provisioned from within the `container_ipv4_cidr`
    * range.
    */
  var nodeIpv4CidrSize: js.UndefOr[Double] = js.native
  /**
    * The node pools associated with this cluster.
    * This field should not be set if "node_config" or "initial_node_count" are
    * specified.
    */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.native
  /**
    * The resource labels for the cluster to use to annotate any related
    * Google Compute Engine resources.
    */
  var resourceLabels: js.UndefOr[Record[String, String]] = js.native
  /** [Output only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output only] The IP address range of the Kubernetes services in
    * this cluster, in
    * [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
    * notation (e.g. `1.2.3.4/29`). Service addresses are
    * typically put in the last `/16` from the container CIDR.
    */
  var servicesIpv4Cidr: js.UndefOr[String] = js.native
  /** [Output only] The current status of this cluster. */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output only] Additional information about the current status of this
    * cluster, if available.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The name of the Google Compute Engine
    * [subnetwork](/compute/docs/subnetworks) to which the
    * cluster is connected.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the cluster
    * resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
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
    def setAddonsConfig(value: AddonsConfig): Self = this.set("addonsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonsConfig: Self = this.set("addonsConfig", js.undefined)
    @scala.inline
    def setClusterIpv4Cidr(value: String): Self = this.set("clusterIpv4Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIpv4Cidr: Self = this.set("clusterIpv4Cidr", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCurrentMasterVersion(value: String): Self = this.set("currentMasterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentMasterVersion: Self = this.set("currentMasterVersion", js.undefined)
    @scala.inline
    def setCurrentNodeCount(value: Double): Self = this.set("currentNodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentNodeCount: Self = this.set("currentNodeCount", js.undefined)
    @scala.inline
    def setCurrentNodeVersion(value: String): Self = this.set("currentNodeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentNodeVersion: Self = this.set("currentNodeVersion", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnableKubernetesAlpha(value: Boolean): Self = this.set("enableKubernetesAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKubernetesAlpha: Self = this.set("enableKubernetesAlpha", js.undefined)
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    @scala.inline
    def setInitialClusterVersion(value: String): Self = this.set("initialClusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialClusterVersion: Self = this.set("initialClusterVersion", js.undefined)
    @scala.inline
    def setInitialNodeCount(value: Double): Self = this.set("initialNodeCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialNodeCount: Self = this.set("initialNodeCount", js.undefined)
    @scala.inline
    def setInstanceGroupUrlsVarargs(value: String*): Self = this.set("instanceGroupUrls", js.Array(value :_*))
    @scala.inline
    def setInstanceGroupUrls(value: js.Array[String]): Self = this.set("instanceGroupUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupUrls: Self = this.set("instanceGroupUrls", js.undefined)
    @scala.inline
    def setIpAllocationPolicy(value: IPAllocationPolicy): Self = this.set("ipAllocationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpAllocationPolicy: Self = this.set("ipAllocationPolicy", js.undefined)
    @scala.inline
    def setLabelFingerprint(value: String): Self = this.set("labelFingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelFingerprint: Self = this.set("labelFingerprint", js.undefined)
    @scala.inline
    def setLegacyAbac(value: LegacyAbac): Self = this.set("legacyAbac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacyAbac: Self = this.set("legacyAbac", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: String*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[String]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setLoggingService(value: String): Self = this.set("loggingService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingService: Self = this.set("loggingService", js.undefined)
    @scala.inline
    def setMaintenancePolicy(value: MaintenancePolicy): Self = this.set("maintenancePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaintenancePolicy: Self = this.set("maintenancePolicy", js.undefined)
    @scala.inline
    def setMasterAuth(value: MasterAuth): Self = this.set("masterAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAuth: Self = this.set("masterAuth", js.undefined)
    @scala.inline
    def setMasterAuthorizedNetworksConfig(value: MasterAuthorizedNetworksConfig): Self = this.set("masterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterAuthorizedNetworksConfig: Self = this.set("masterAuthorizedNetworksConfig", js.undefined)
    @scala.inline
    def setMonitoringService(value: String): Self = this.set("monitoringService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoringService: Self = this.set("monitoringService", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNetworkPolicy(value: NetworkPolicy): Self = this.set("networkPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPolicy: Self = this.set("networkPolicy", js.undefined)
    @scala.inline
    def setNodeConfig(value: NodeConfig): Self = this.set("nodeConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeConfig: Self = this.set("nodeConfig", js.undefined)
    @scala.inline
    def setNodeIpv4CidrSize(value: Double): Self = this.set("nodeIpv4CidrSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeIpv4CidrSize: Self = this.set("nodeIpv4CidrSize", js.undefined)
    @scala.inline
    def setNodePoolsVarargs(value: NodePool*): Self = this.set("nodePools", js.Array(value :_*))
    @scala.inline
    def setNodePools(value: js.Array[NodePool]): Self = this.set("nodePools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePools: Self = this.set("nodePools", js.undefined)
    @scala.inline
    def setResourceLabels(value: Record[String, String]): Self = this.set("resourceLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceLabels: Self = this.set("resourceLabels", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setServicesIpv4Cidr(value: String): Self = this.set("servicesIpv4Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServicesIpv4Cidr: Self = this.set("servicesIpv4Cidr", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setSubnetwork(value: String): Self = this.set("subnetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetwork: Self = this.set("subnetwork", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

