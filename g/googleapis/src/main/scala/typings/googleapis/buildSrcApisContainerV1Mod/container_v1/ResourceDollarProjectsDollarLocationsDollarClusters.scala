package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Locations$Clusters")
@js.native
class ResourceDollarProjectsDollarLocationsDollarClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var nodePools: ResourceDollarProjectsDollarLocationsDollarClustersDollarNodepools = js.native
  var wellKnown: ResourceDollarProjectsDollarLocationsDollarClustersDollarWellKnown = js.native
  /**
    * container.projects.locations.clusters.completeIpRotation
    * @desc Completes master IP rotation.
    * @alias container.projects.locations.clusters.completeIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to complete IP rotation. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().CompleteIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeIpRotation(): GaxiosPromise[Schema$Operation] = js.native
  def completeIpRotation(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def completeIpRotation(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCompleteiprotation): GaxiosPromise[Schema$Operation] = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCompleteiprotation,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCompleteiprotation,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCompleteiprotation,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCompleteiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.create
    * @desc Creates a cluster, consisting of the specified number and type of
    * Google Compute Engine instances.  By default, the cluster is created in
    * the project's [default
    * network](/compute/docs/networks-and-firewalls#networks).  One firewall is
    * added for the cluster. After cluster creation, the cluster creates routes
    * for each node to allow the containers on that node to communicate with
    * all other instances in the cluster.  Finally, an entry is added to the
    * project's global metadata indicating which CIDR range is being used by
    * the cluster.
    * @alias container.projects.locations.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent (project and location) where the cluster will be created. Specified in the format 'projects/x/locations/x'.
    * @param {().CreateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.delete
    * @desc Deletes the cluster, including the Kubernetes endpoint and all
    * worker nodes.  Firewalls and routes that were configured during cluster
    * creation are also deleted.  Other Google Compute Engine resources that
    * might be in use by the cluster (e.g. load balancer resources) will not be
    * deleted if they weren't present at the initial create time.
    * @alias container.projects.locations.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster) of the cluster to delete. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.get
    * @desc Gets the details of a specific cluster.
    * @alias container.projects.locations.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterId Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field.
    * @param {string} params.name The name (project, location, cluster) of the cluster to retrieve. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Cluster] = js.native
  def get(callback: BodyResponseCallback[Schema$Cluster]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGet): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGet,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGet,
    options: BodyResponseCallback[Schema$Cluster],
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.getJwks
    * @desc GetJSONWebKeys gets the public component of the cluster signing
    * keys in JSON Web Key format. This API is not yet intended for general
    * use, and is not available for all clusters.
    * @alias container.projects.locations.clusters.getJwks
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The cluster (project, location, cluster id) to get keys for. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getJwks(): GaxiosPromise[Schema$GetJSONWebKeysResponse] = js.native
  def getJwks(callback: BodyResponseCallback[Schema$GetJSONWebKeysResponse]): Unit = js.native
  def getJwks(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGetjwks): GaxiosPromise[Schema$GetJSONWebKeysResponse] = js.native
  def getJwks(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGetjwks,
    callback: BodyResponseCallback[Schema$GetJSONWebKeysResponse]
  ): Unit = js.native
  def getJwks(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGetjwks,
    options: BodyResponseCallback[Schema$GetJSONWebKeysResponse],
    callback: BodyResponseCallback[Schema$GetJSONWebKeysResponse]
  ): Unit = js.native
  def getJwks(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGetjwks,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetJSONWebKeysResponse] = js.native
  def getJwks(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarGetjwks,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetJSONWebKeysResponse]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.list
    * @desc Lists all clusters owned by a project in either the specified zone
    * or all zones.
    * @alias container.projects.locations.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The parent (project and location) where the clusters will be listed. Specified in the format 'projects/x/locations/x'. Location "-" matches all zones and all regions.
    * @param {string=} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string=} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides, or "-" for all zones. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListClustersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarList): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarList,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarList,
    options: BodyResponseCallback[Schema$ListClustersResponse],
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setAddons
    * @desc Sets the addons for a specific cluster.
    * @alias container.projects.locations.clusters.setAddons
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set addons. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetAddonsConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAddons(): GaxiosPromise[Schema$Operation] = js.native
  def setAddons(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setAddons(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetaddons): GaxiosPromise[Schema$Operation] = js.native
  def setAddons(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetaddons,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setAddons(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetaddons,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setAddons(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetaddons,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setAddons(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetaddons,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setLegacyAbac
    * @desc Enables or disables the ABAC authorization mechanism on a cluster.
    * @alias container.projects.locations.clusters.setLegacyAbac
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set legacy abac. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLegacyAbacRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLegacyAbac(): GaxiosPromise[Schema$Operation] = js.native
  def setLegacyAbac(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLegacyAbac(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlegacyabac): GaxiosPromise[Schema$Operation] = js.native
  def setLegacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlegacyabac,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLegacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlegacyabac,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLegacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlegacyabac,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setLegacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlegacyabac,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setLocations
    * @desc Sets the locations for a specific cluster.
    * @alias container.projects.locations.clusters.setLocations
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set locations. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLocationsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLocations(): GaxiosPromise[Schema$Operation] = js.native
  def setLocations(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLocations(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlocations): GaxiosPromise[Schema$Operation] = js.native
  def setLocations(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlocations,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLocations(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlocations,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLocations(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlocations,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setLocations(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlocations,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setLogging
    * @desc Sets the logging service for a specific cluster.
    * @alias container.projects.locations.clusters.setLogging
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set logging. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLoggingServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLogging(): GaxiosPromise[Schema$Operation] = js.native
  def setLogging(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLogging(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlogging): GaxiosPromise[Schema$Operation] = js.native
  def setLogging(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlogging,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLogging(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlogging,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLogging(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlogging,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setLogging(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetlogging,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setMaintenancePolicy
    * @desc Sets the maintenance policy for a cluster.
    * @alias container.projects.locations.clusters.setMaintenancePolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set maintenance policy. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetMaintenancePolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMaintenancePolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setMaintenancePolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMaintenancePolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmaintenancepolicy): GaxiosPromise[Schema$Operation] = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmaintenancepolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmaintenancepolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmaintenancepolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmaintenancepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setMasterAuth
    * @desc Used to set master auth materials. Currently supports :- Changing
    * the admin password for a specific cluster. This can be either via
    * password generation or explicitly set the password.
    * @alias container.projects.locations.clusters.setMasterAuth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set auth. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetMasterAuthRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMasterAuth(): GaxiosPromise[Schema$Operation] = js.native
  def setMasterAuth(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMasterAuth(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmasterauth): GaxiosPromise[Schema$Operation] = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmasterauth,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmasterauth,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmasterauth,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmasterauth,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setMonitoring
    * @desc Sets the monitoring service for a specific cluster.
    * @alias container.projects.locations.clusters.setMonitoring
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to set monitoring. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetMonitoringServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMonitoring(): GaxiosPromise[Schema$Operation] = js.native
  def setMonitoring(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMonitoring(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmonitoring): GaxiosPromise[Schema$Operation] = js.native
  def setMonitoring(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmonitoring,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMonitoring(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmonitoring,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMonitoring(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmonitoring,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setMonitoring(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetmonitoring,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setNetworkPolicy
    * @desc Enables/Disables Network Policy for a cluster.
    * @alias container.projects.locations.clusters.setNetworkPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set networking policy. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetNetworkPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNetworkPolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setNetworkPolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setNetworkPolicy(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetnetworkpolicy): GaxiosPromise[Schema$Operation] = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetnetworkpolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetnetworkpolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetnetworkpolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetnetworkpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.setResourceLabels
    * @desc Sets labels on a cluster.
    * @alias container.projects.locations.clusters.setResourceLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to set labels. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().SetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setResourceLabels(): GaxiosPromise[Schema$Operation] = js.native
  def setResourceLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setResourceLabels(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetresourcelabels): GaxiosPromise[Schema$Operation] = js.native
  def setResourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetresourcelabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setResourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetresourcelabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setResourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetresourcelabels,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setResourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarSetresourcelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.startIpRotation
    * @desc Start master IP rotation.
    * @alias container.projects.locations.clusters.startIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster id) of the cluster to start IP rotation. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().StartIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startIpRotation(): GaxiosPromise[Schema$Operation] = js.native
  def startIpRotation(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def startIpRotation(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarStartiprotation): GaxiosPromise[Schema$Operation] = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarStartiprotation,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarStartiprotation,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarStartiprotation,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarStartiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.update
    * @desc Updates the settings of a specific cluster.
    * @alias container.projects.locations.clusters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to update. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().UpdateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.locations.clusters.updateMaster
    * @desc Updates the master for a specific cluster.
    * @alias container.projects.locations.clusters.updateMaster
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name (project, location, cluster) of the cluster to update. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {().UpdateMasterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateMaster(): GaxiosPromise[Schema$Operation] = js.native
  def updateMaster(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateMaster(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdatemaster): GaxiosPromise[Schema$Operation] = js.native
  def updateMaster(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdatemaster,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateMaster(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdatemaster,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateMaster(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdatemaster,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def updateMaster(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarClustersDollarUpdatemaster,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

