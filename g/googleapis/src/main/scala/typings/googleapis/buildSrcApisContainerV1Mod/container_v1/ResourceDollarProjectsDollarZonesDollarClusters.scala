package typings.googleapis.buildSrcApisContainerV1Mod.container_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/container/v1", "container_v1.Resource$Projects$Zones$Clusters")
@js.native
class ResourceDollarProjectsDollarZonesDollarClusters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var nodePools: ResourceDollarProjectsDollarZonesDollarClustersDollarNodepools = js.native
  /**
    * container.projects.zones.clusters.addons
    * @desc Sets the addons for a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.addons(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.addons
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetAddonsConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addons(): GaxiosPromise[Schema$Operation] = js.native
  def addons(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addons(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarAddons): GaxiosPromise[Schema$Operation] = js.native
  def addons(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarAddons,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addons(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarAddons,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addons(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarAddons,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def addons(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarAddons,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.completeIpRotation
    * @desc Completes master IP rotation.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     //
    * number](https://developers.google.com/console/help/new/#projectnumber).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.completeIpRotation(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.completeIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().CompleteIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def completeIpRotation(): GaxiosPromise[Schema$Operation] = js.native
  def completeIpRotation(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def completeIpRotation(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCompleteiprotation): GaxiosPromise[Schema$Operation] = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCompleteiprotation,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCompleteiprotation,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCompleteiprotation,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def completeIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCompleteiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.create
    * @desc Creates a cluster, consisting of the specified number and type of
    * Google Compute Engine instances.  By default, the cluster is created in
    * the project's [default
    * network](/compute/docs/networks-and-firewalls#networks).  One firewall is
    * added for the cluster. After cluster creation, the cluster creates routes
    * for each node to allow the containers on that node to communicate with
    * all other instances in the cluster.  Finally, an entry is added to the
    * project's global metadata indicating which CIDR range is being used by
    * the cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.create(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the parent field.
    * @param {().CreateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.delete
    * @desc Deletes the cluster, including the Kubernetes endpoint and all
    * worker nodes.  Firewalls and routes that were configured during cluster
    * creation are also deleted.  Other Google Compute Engine resources that
    * might be in use by the cluster (e.g. load balancer resources) will not be
    * deleted if they weren't present at the initial create time.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to delete.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.delete(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to delete. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster) of the cluster to delete. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.get
    * @desc Gets the details of a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to retrieve.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.get(request, function(err, response)
    * { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to retrieve. This field has been deprecated and replaced by the name field.
    * @param {string=} params.name The name (project, location, cluster) of the cluster to retrieve. Specified in the format 'projects/x/locations/x/clusters/x'.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Cluster] = js.native
  def get(callback: BodyResponseCallback[Schema$Cluster]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarGet): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarGet,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarGet,
    options: BodyResponseCallback[Schema$Cluster],
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Cluster] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Cluster]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.legacyAbac
    * @desc Enables or disables the ABAC authorization mechanism on a cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to update.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.legacyAbac(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.legacyAbac
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to update. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLegacyAbacRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def legacyAbac(): GaxiosPromise[Schema$Operation] = js.native
  def legacyAbac(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def legacyAbac(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLegacyabac): GaxiosPromise[Schema$Operation] = js.native
  def legacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLegacyabac,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def legacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLegacyabac,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def legacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLegacyabac,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def legacyAbac(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLegacyabac,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.list
    * @desc Lists all clusters owned by a project in either the specified zone
    * or all zones.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides, or "-" for all zones.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.list(request, function(err, response)
    * { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.parent The parent (project and location) where the clusters will be listed. Specified in the format 'projects/x/locations/x'. Location "-" matches all zones and all regions.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the parent field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides, or "-" for all zones. This field has been deprecated and replaced by the parent field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListClustersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarList): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarList,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarList,
    options: BodyResponseCallback[Schema$ListClustersResponse],
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListClustersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListClustersResponse]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.locations
    * @desc Sets the locations for a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.locations(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.locations
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLocationsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def locations(): GaxiosPromise[Schema$Operation] = js.native
  def locations(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def locations(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLocations): GaxiosPromise[Schema$Operation] = js.native
  def locations(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLocations,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def locations(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLocations,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def locations(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLocations,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def locations(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLocations,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.logging
    * @desc Sets the logging service for a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.logging(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.logging
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLoggingServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def logging(): GaxiosPromise[Schema$Operation] = js.native
  def logging(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def logging(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLogging): GaxiosPromise[Schema$Operation] = js.native
  def logging(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLogging,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def logging(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLogging,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def logging(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLogging,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def logging(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarLogging,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.master
    * @desc Updates the master for a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.master(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.master
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().UpdateMasterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def master(): GaxiosPromise[Schema$Operation] = js.native
  def master(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def master(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMaster): GaxiosPromise[Schema$Operation] = js.native
  def master(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMaster,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def master(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMaster,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def master(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMaster,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def master(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMaster,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.monitoring
    * @desc Sets the monitoring service for a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.monitoring(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.monitoring
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetMonitoringServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def monitoring(): GaxiosPromise[Schema$Operation] = js.native
  def monitoring(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def monitoring(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMonitoring): GaxiosPromise[Schema$Operation] = js.native
  def monitoring(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMonitoring,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def monitoring(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMonitoring,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def monitoring(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMonitoring,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def monitoring(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarMonitoring,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.resourceLabels
    * @desc Sets labels on a cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     //
    * number](https://developers.google.com/console/help/new/#projectnumber).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.resourceLabels(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.resourceLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resourceLabels(): GaxiosPromise[Schema$Operation] = js.native
  def resourceLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def resourceLabels(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarResourcelabels): GaxiosPromise[Schema$Operation] = js.native
  def resourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarResourcelabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarResourcelabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarResourcelabels,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def resourceLabels(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarResourcelabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.setMaintenancePolicy
    * @desc Sets the maintenance policy for a cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to update.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.setMaintenancePolicy(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.setMaintenancePolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId The name of the cluster to update.
    * @param {string} params.projectId The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840).
    * @param {string} params.zone The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides.
    * @param {().SetMaintenancePolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMaintenancePolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setMaintenancePolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMaintenancePolicy(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmaintenancepolicy): GaxiosPromise[Schema$Operation] = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmaintenancepolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmaintenancepolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmaintenancepolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setMaintenancePolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmaintenancepolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.setMasterAuth
    * @desc Used to set master auth materials. Currently supports :- Changing
    * the admin password for a specific cluster. This can be either via
    * password generation or explicitly set the password.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.setMasterAuth(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.setMasterAuth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetMasterAuthRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setMasterAuth(): GaxiosPromise[Schema$Operation] = js.native
  def setMasterAuth(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setMasterAuth(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmasterauth): GaxiosPromise[Schema$Operation] = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmasterauth,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmasterauth,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmasterauth,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setMasterAuth(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetmasterauth,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.setNetworkPolicy
    * @desc Enables/Disables Network Policy for a cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     //
    * number](https://developers.google.com/console/help/new/#projectnumber).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.setNetworkPolicy(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.setNetworkPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().SetNetworkPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNetworkPolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setNetworkPolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setNetworkPolicy(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetnetworkpolicy): GaxiosPromise[Schema$Operation] = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetnetworkpolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetnetworkpolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetnetworkpolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setNetworkPolicy(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarSetnetworkpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.startIpRotation
    * @desc Start master IP rotation.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     //
    * number](https://developers.google.com/console/help/new/#projectnumber).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.startIpRotation(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.startIpRotation
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://developers.google.com/console/help/new/#projectnumber). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().StartIPRotationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startIpRotation(): GaxiosPromise[Schema$Operation] = js.native
  def startIpRotation(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def startIpRotation(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarStartiprotation): GaxiosPromise[Schema$Operation] = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarStartiprotation,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarStartiprotation,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarStartiprotation,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def startIpRotation(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarStartiprotation,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * container.projects.zones.clusters.update
    * @desc Updates the settings of a specific cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Container Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/container
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var container = google.container('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The Google Developers Console [project ID or project
    *     // number](https://support.google.com/cloud/answer/6158840).
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // The name of the Google Compute Engine
    *     // [zone](/compute/docs/zones#available) in which the cluster
    *     // resides.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the cluster to upgrade.
    *     clusterId: 'my-cluster-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   container.projects.zones.clusters.update(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias container.projects.zones.clusters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clusterId Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by the name field.
    * @param {string} params.projectId Deprecated. The Google Developers Console [project ID or project number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and replaced by the name field.
    * @param {string} params.zone Deprecated. The name of the Google Compute Engine [zone](/compute/docs/zones#available) in which the cluster resides. This field has been deprecated and replaced by the name field.
    * @param {().UpdateClusterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarZonesDollarClustersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

