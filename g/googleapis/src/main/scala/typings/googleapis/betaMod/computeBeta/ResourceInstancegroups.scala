package typings.googleapis.betaMod.computeBeta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Instancegroups")
@js.native
class ResourceInstancegroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.instanceGroups.addInstances
    * @desc Adds a list of instances to the specified instance group. All of
    * the instances in the instance group must be in the same
    * network/subnetwork. Read  Adding instances for more information.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group where you are adding instances.
    *     instanceGroup: 'my-instance-group',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.addInstances(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
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
    * @alias compute.instanceGroups.addInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup The name of the instance group where you are adding instances.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {().InstanceGroupsAddInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addInstances(): GaxiosPromise[SchemaOperation] = js.native
  def addInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addInstances(params: ParamsResourceInstancegroupsAddinstances): GaxiosPromise[SchemaOperation] = js.native
  def addInstances(params: ParamsResourceInstancegroupsAddinstances, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addInstances(
    params: ParamsResourceInstancegroupsAddinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addInstances(params: ParamsResourceInstancegroupsAddinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addInstances(
    params: ParamsResourceInstancegroupsAddinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.instanceGroups.aggregatedList
    * @desc Retrieves the list of instance groups and sorts them by zone.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     Object.keys(itemsPage).forEach(function(name) {
    *       // TODO: Change code below to process each `name` property:
    *       console.log(name + ': ' + JSON.stringify(itemsPage[name], null,
    * 2));
    *     });
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.instanceGroups.aggregatedList(request, handlePage);
    *     }
    *   };
    *
    *   compute.instanceGroups.aggregatedList(request, handlePage);
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
    * @alias compute.instanceGroups.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaInstanceGroupAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaInstanceGroupAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceInstancegroupsAggregatedlist): GaxiosPromise[SchemaInstanceGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceInstancegroupsAggregatedlist,
    callback: BodyResponseCallback[SchemaInstanceGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceInstancegroupsAggregatedlist,
    options: BodyResponseCallback[SchemaInstanceGroupAggregatedList],
    callback: BodyResponseCallback[SchemaInstanceGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceInstancegroupsAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceInstancegroupsAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupAggregatedList]
  ): Unit = js.native
  /**
    * compute.instanceGroups.delete
    * @desc Deletes the specified instance group. The instances in the group
    * are not deleted. Note that instance group must not belong to a backend
    * service. Read  Deleting an instance group for more information.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group to delete.
    *     instanceGroup: 'my-instance-group',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.delete(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
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
    * @alias compute.instanceGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup The name of the instance group to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancegroupsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceInstancegroupsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceInstancegroupsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceInstancegroupsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceInstancegroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.instanceGroups.get
    * @desc Returns the specified instance group. Gets a list of available
    * instance groups by making a list() request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group.
    *     instanceGroup: 'my-instance-group',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
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
    * @alias compute.instanceGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup The name of the instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceGroup]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(params: ParamsResourceInstancegroupsGet): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(params: ParamsResourceInstancegroupsGet, callback: BodyResponseCallback[SchemaInstanceGroup]): Unit = js.native
  def get(
    params: ParamsResourceInstancegroupsGet,
    options: BodyResponseCallback[SchemaInstanceGroup],
    callback: BodyResponseCallback[SchemaInstanceGroup]
  ): Unit = js.native
  def get(params: ParamsResourceInstancegroupsGet, options: MethodOptions): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(
    params: ParamsResourceInstancegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroup]
  ): Unit = js.native
  /**
    * compute.instanceGroups.insert
    * @desc Creates an instance group in the specified project using the
    * parameters that are included in the request.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where you want to create the instance group.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.insert(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
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
    * @alias compute.instanceGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where you want to create the instance group.
    * @param {().InstanceGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancegroupsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceInstancegroupsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceInstancegroupsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceInstancegroupsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceInstancegroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.instanceGroups.list
    * @desc Retrieves the list of instance groups that are located in the
    * specified project and zone.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.instanceGroups.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.instanceGroups.list(request, handlePage);
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
    * @alias compute.instanceGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaInstanceGroupList] = js.native
  def list(callback: BodyResponseCallback[SchemaInstanceGroupList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupList] = js.native
  def list(params: ParamsResourceInstancegroupsList): GaxiosPromise[SchemaInstanceGroupList] = js.native
  def list(params: ParamsResourceInstancegroupsList, callback: BodyResponseCallback[SchemaInstanceGroupList]): Unit = js.native
  def list(
    params: ParamsResourceInstancegroupsList,
    options: BodyResponseCallback[SchemaInstanceGroupList],
    callback: BodyResponseCallback[SchemaInstanceGroupList]
  ): Unit = js.native
  def list(params: ParamsResourceInstancegroupsList, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupList] = js.native
  def list(
    params: ParamsResourceInstancegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupList]
  ): Unit = js.native
  /**
    * compute.instanceGroups.listInstances
    * @desc Lists the instances in the specified instance group.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group from which you want to generate a
    * list of included instances. instanceGroup: 'my-instance-group',  // TODO:
    * Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.instanceGroups.listInstances(request, handlePage);
    *     }
    *   };
    *
    *   compute.instanceGroups.listInstances(request, handlePage);
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
    * @alias compute.instanceGroups.listInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instanceGroup The name of the instance group from which you want to generate a list of included instances.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {().InstanceGroupsListInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listInstances(): GaxiosPromise[SchemaInstanceGroupsListInstances] = js.native
  def listInstances(callback: BodyResponseCallback[SchemaInstanceGroupsListInstances]): Unit = js.native
  def listInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaInstanceGroupsListInstances] = js.native
  def listInstances(params: ParamsResourceInstancegroupsListinstances): GaxiosPromise[SchemaInstanceGroupsListInstances] = js.native
  def listInstances(
    params: ParamsResourceInstancegroupsListinstances,
    callback: BodyResponseCallback[SchemaInstanceGroupsListInstances]
  ): Unit = js.native
  def listInstances(
    params: ParamsResourceInstancegroupsListinstances,
    options: BodyResponseCallback[SchemaInstanceGroupsListInstances],
    callback: BodyResponseCallback[SchemaInstanceGroupsListInstances]
  ): Unit = js.native
  def listInstances(params: ParamsResourceInstancegroupsListinstances, options: MethodOptions): GaxiosPromise[SchemaInstanceGroupsListInstances] = js.native
  def listInstances(
    params: ParamsResourceInstancegroupsListinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroupsListInstances]
  ): Unit = js.native
  /**
    * compute.instanceGroups.removeInstances
    * @desc Removes one or more instances from the specified instance group,
    * but does not delete those instances.  If the group is part of a backend
    * service that has enabled connection draining, it can take up to 60
    * seconds after the connection draining duration before the VM instance is
    * removed or deleted.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group where the specified instances will
    * be removed. instanceGroup: 'my-instance-group',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.removeInstances(request, function(err, response)
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
    * @alias compute.instanceGroups.removeInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup The name of the instance group where the specified instances will be removed.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {().InstanceGroupsRemoveInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeInstances(): GaxiosPromise[SchemaOperation] = js.native
  def removeInstances(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeInstances(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeInstances(params: ParamsResourceInstancegroupsRemoveinstances): GaxiosPromise[SchemaOperation] = js.native
  def removeInstances(
    params: ParamsResourceInstancegroupsRemoveinstances,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeInstances(
    params: ParamsResourceInstancegroupsRemoveinstances,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeInstances(params: ParamsResourceInstancegroupsRemoveinstances, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeInstances(
    params: ParamsResourceInstancegroupsRemoveinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.instanceGroups.setNamedPorts
    * @desc Sets the named ports for the specified instance group.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone where the instance group is located.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // The name of the instance group where the named ports are updated.
    *     instanceGroup: 'my-instance-group',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.setNamedPorts(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
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
    * @alias compute.instanceGroups.setNamedPorts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup The name of the instance group where the named ports are updated.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the instance group is located.
    * @param {().InstanceGroupsSetNamedPortsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNamedPorts(): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNamedPorts(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(params: ParamsResourceInstancegroupsSetnamedports): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(params: ParamsResourceInstancegroupsSetnamedports, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNamedPorts(
    params: ParamsResourceInstancegroupsSetnamedports,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNamedPorts(params: ParamsResourceInstancegroupsSetnamedports, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(
    params: ParamsResourceInstancegroupsSetnamedports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.instanceGroups.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Compute Engine API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/compute
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
    * var compute = google.compute('beta');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // The name of the zone for this request.
    *     zone: 'my-zone',  // TODO: Update placeholder value.
    *
    *     // Name of the resource for this request.
    *     resource_: 'my-resource',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.instanceGroups.testIamPermissions(request, function(err,
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
    * @alias compute.instanceGroups.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceInstancegroupsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceInstancegroupsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceInstancegroupsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceInstancegroupsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceInstancegroupsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

