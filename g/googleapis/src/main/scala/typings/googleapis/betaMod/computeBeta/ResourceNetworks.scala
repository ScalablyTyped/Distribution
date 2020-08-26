package typings.googleapis.betaMod.computeBeta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Networks")
@js.native
class ResourceNetworks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.networks.addPeering
    * @desc Adds a peering to the specified network.
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
    *     // Name of the network resource to add peering to.
    *     network: 'my-network',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.addPeering(request, function(err, response) {
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
    * @alias compute.networks.addPeering
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network resource to add peering to.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().NetworksAddPeeringRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addPeering(): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addPeering(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(params: ParamsResourceNetworksAddpeering): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(params: ParamsResourceNetworksAddpeering, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addPeering(
    params: ParamsResourceNetworksAddpeering,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addPeering(params: ParamsResourceNetworksAddpeering, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addPeering(
    params: ParamsResourceNetworksAddpeering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.networks.delete
    * @desc Deletes the specified network.
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
    *     // Name of the network to delete.
    *     network: 'my-network',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.delete(request, function(err, response) {
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
    * @alias compute.networks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNetworksDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNetworksDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceNetworksDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceNetworksDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceNetworksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.networks.get
    * @desc Returns the specified network. Gets a list of available networks by
    * making a list() request.
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
    *     // Name of the network to return.
    *     network: 'my-network',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.get(request, function(err, response) {
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
    * @alias compute.networks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNetwork] = js.native
  def get(callback: BodyResponseCallback[SchemaNetwork]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNetwork] = js.native
  def get(params: ParamsResourceNetworksGet): GaxiosPromise[SchemaNetwork] = js.native
  def get(params: ParamsResourceNetworksGet, callback: BodyResponseCallback[SchemaNetwork]): Unit = js.native
  def get(
    params: ParamsResourceNetworksGet,
    options: BodyResponseCallback[SchemaNetwork],
    callback: BodyResponseCallback[SchemaNetwork]
  ): Unit = js.native
  def get(params: ParamsResourceNetworksGet, options: MethodOptions): GaxiosPromise[SchemaNetwork] = js.native
  def get(
    params: ParamsResourceNetworksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetwork]
  ): Unit = js.native
  /**
    * compute.networks.insert
    * @desc Creates a network in the specified project using the data included
    * in the request.
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.insert(request, function(err, response) {
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
    * @alias compute.networks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Network} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNetworksInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNetworksInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceNetworksInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceNetworksInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceNetworksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.networks.list
    * @desc Retrieves the list of networks available to the specified project.
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
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       compute.networks.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.networks.list(request, handlePage);
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
    * @alias compute.networks.list
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
  def list(): GaxiosPromise[SchemaNetworkList] = js.native
  def list(callback: BodyResponseCallback[SchemaNetworkList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaNetworkList] = js.native
  def list(params: ParamsResourceNetworksList): GaxiosPromise[SchemaNetworkList] = js.native
  def list(params: ParamsResourceNetworksList, callback: BodyResponseCallback[SchemaNetworkList]): Unit = js.native
  def list(
    params: ParamsResourceNetworksList,
    options: BodyResponseCallback[SchemaNetworkList],
    callback: BodyResponseCallback[SchemaNetworkList]
  ): Unit = js.native
  def list(params: ParamsResourceNetworksList, options: MethodOptions): GaxiosPromise[SchemaNetworkList] = js.native
  def list(
    params: ParamsResourceNetworksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworkList]
  ): Unit = js.native
  /**
    * compute.networks.listPeeringRoutes
    * @desc Lists the peering routes exchanged over peering connection.
    * @alias compute.networks.listPeeringRoutes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.direction The direction of the exchanged routes.
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string} params.network Name of the network for this request.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string=} params.peeringName The response will show routes exchanged over the given peering connection.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.region The region of the request. The response will include all subnet routes, static routes and dynamic routes in the region.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listPeeringRoutes(): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]): Unit = js.native
  def listPeeringRoutes(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(params: ParamsResourceNetworksListpeeringroutes): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]
  ): Unit = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    options: BodyResponseCallback[SchemaExchangedPeeringRoutesList],
    callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]
  ): Unit = js.native
  def listPeeringRoutes(params: ParamsResourceNetworksListpeeringroutes, options: MethodOptions): GaxiosPromise[SchemaExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(
    params: ParamsResourceNetworksListpeeringroutes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExchangedPeeringRoutesList]
  ): Unit = js.native
  /**
    * compute.networks.patch
    * @desc Patches the specified network with the data included in the
    * request. Only the following fields can be modified:
    * routingConfig.routingMode.
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
    *     // Name of the network to update.
    *     network: 'my-network',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.patch(request, function(err, response) {
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
    * @alias compute.networks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Network} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceNetworksPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceNetworksPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceNetworksPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceNetworksPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceNetworksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.networks.removePeering
    * @desc Removes a peering from the specified network.
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
    *     // Name of the network resource to remove peering from.
    *     network: 'my-network',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.removePeering(request, function(err, response) {
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
    * @alias compute.networks.removePeering
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network resource to remove peering from.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().NetworksRemovePeeringRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removePeering(): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removePeering(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(params: ParamsResourceNetworksRemovepeering): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(params: ParamsResourceNetworksRemovepeering, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removePeering(
    params: ParamsResourceNetworksRemovepeering,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removePeering(params: ParamsResourceNetworksRemovepeering, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removePeering(
    params: ParamsResourceNetworksRemovepeering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.networks.switchToCustomMode
    * @desc Switches the network mode from auto subnet mode to custom subnet
    * mode.
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
    *     // Name of the network to be updated.
    *     network: 'my-network',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.networks.switchToCustomMode(request, function(err, response) {
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
    * @alias compute.networks.switchToCustomMode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to be updated.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def switchToCustomMode(): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def switchToCustomMode(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def switchToCustomMode(
    params: ParamsResourceNetworksSwitchtocustommode,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def switchToCustomMode(params: ParamsResourceNetworksSwitchtocustommode, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def switchToCustomMode(
    params: ParamsResourceNetworksSwitchtocustommode,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.networks.testIamPermissions
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
    *   compute.networks.testIamPermissions(request, function(err, response) {
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
    * @alias compute.networks.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceNetworksTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceNetworksTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworksTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.networks.updatePeering
    * @desc Updates the specified network peering with the data included in the
    * request Only the following fields can be modified:
    * NetworkPeering.export_custom_routes, and
    * NetworkPeering.import_custom_routes
    * @alias compute.networks.updatePeering
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network resource which the updated peering is belonging to.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().NetworksUpdatePeeringRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePeering(): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updatePeering(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(params: ParamsResourceNetworksUpdatepeering): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(params: ParamsResourceNetworksUpdatepeering, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updatePeering(
    params: ParamsResourceNetworksUpdatepeering,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updatePeering(params: ParamsResourceNetworksUpdatepeering, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updatePeering(
    params: ParamsResourceNetworksUpdatepeering,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

