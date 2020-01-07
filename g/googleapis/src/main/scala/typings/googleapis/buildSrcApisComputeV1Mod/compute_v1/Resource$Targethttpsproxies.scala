package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Targethttpsproxies")
@js.native
class Resource$Targethttpsproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.targetHttpsProxies.delete
    * @desc Deletes the specified TargetHttpsProxy resource.
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the TargetHttpsProxy resource to delete.
    *     targetHttpsProxy: 'my-target-https-proxy',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.targetHttpsProxies.delete(request, function(err, response) {
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
    * @alias compute.targetHttpsProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTargethttpsproxiesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTargethttpsproxiesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.get
    * @desc Returns the specified TargetHttpsProxy resource. Gets a list of
    * available target HTTPS proxies by making a list() request.
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the TargetHttpsProxy resource to return.
    *     targetHttpsProxy: 'my-target-https-proxy',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.targetHttpsProxies.get(request, function(err, response) {
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
    * @alias compute.targetHttpsProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TargetHttpsProxy] = js.native
  def get(callback: BodyResponseCallback[Schema$TargetHttpsProxy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTargethttpsproxiesDollarGet): GaxiosPromise[Schema$TargetHttpsProxy] = js.native
  def get(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarGet,
    callback: BodyResponseCallback[Schema$TargetHttpsProxy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarGet,
    options: BodyResponseCallback[Schema$TargetHttpsProxy],
    callback: BodyResponseCallback[Schema$TargetHttpsProxy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTargethttpsproxiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$TargetHttpsProxy] = js.native
  def get(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetHttpsProxy]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.insert
    * @desc Creates a TargetHttpsProxy resource in the specified project using
    * the data included in the request.
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
    * var compute = google.compute('v1');
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
    *   compute.targetHttpsProxies.insert(request, function(err, response) {
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
    * @alias compute.targetHttpsProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetHttpsProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTargethttpsproxiesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTargethttpsproxiesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.list
    * @desc Retrieves the list of TargetHttpsProxy resources available to the
    * specified project.
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
    * var compute = google.compute('v1');
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
    *       compute.targetHttpsProxies.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.targetHttpsProxies.list(request, handlePage);
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
    * @alias compute.targetHttpsProxies.list
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
  def list(): GaxiosPromise[Schema$TargetHttpsProxyList] = js.native
  def list(callback: BodyResponseCallback[Schema$TargetHttpsProxyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTargethttpsproxiesDollarList): GaxiosPromise[Schema$TargetHttpsProxyList] = js.native
  def list(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarList,
    callback: BodyResponseCallback[Schema$TargetHttpsProxyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarList,
    options: BodyResponseCallback[Schema$TargetHttpsProxyList],
    callback: BodyResponseCallback[Schema$TargetHttpsProxyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTargethttpsproxiesDollarList, options: MethodOptions): GaxiosPromise[Schema$TargetHttpsProxyList] = js.native
  def list(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetHttpsProxyList]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setQuicOverride
    * @desc Sets the QUIC override policy for TargetHttpsProxy.
    * @alias compute.targetHttpsProxies.setQuicOverride
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to set the QUIC override policy for. The name should conform to RFC1035.
    * @param {().TargetHttpsProxiesSetQuicOverrideRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setQuicOverride(): GaxiosPromise[Schema$Operation] = js.native
  def setQuicOverride(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setQuicOverride(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetquicoverride): GaxiosPromise[Schema$Operation] = js.native
  def setQuicOverride(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetquicoverride,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setQuicOverride(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetquicoverride,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setQuicOverride(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetquicoverride, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setQuicOverride(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetquicoverride,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setSslCertificates
    * @desc Replaces SslCertificates for TargetHttpsProxy.
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the TargetHttpsProxy resource to set an SslCertificates
    * resource for. targetHttpsProxy: 'my-target-https-proxy',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.targetHttpsProxies.setSslCertificates(request, function(err,
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
    * @alias compute.targetHttpsProxies.setSslCertificates
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates resource for.
    * @param {().TargetHttpsProxiesSetSslCertificatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslCertificates(): GaxiosPromise[Schema$Operation] = js.native
  def setSslCertificates(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setSslCertificates(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslcertificates): GaxiosPromise[Schema$Operation] = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslcertificates,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslcertificates,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslcertificates,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setSslCertificates(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslcertificates,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setSslPolicy
    * @desc Sets the SSL policy for TargetHttpsProxy. The SSL policy specifies
    * the server-side support for SSL features. This affects connections
    * between clients and the HTTPS proxy load balancer. They do not affect the
    * connection between the load balancer and the backends.
    * @alias compute.targetHttpsProxies.setSslPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource whose SSL policy is to be set. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {().SslPolicyReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslPolicy(): GaxiosPromise[Schema$Operation] = js.native
  def setSslPolicy(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setSslPolicy(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslpolicy): GaxiosPromise[Schema$Operation] = js.native
  def setSslPolicy(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslpolicy,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSslPolicy(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslpolicy,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setSslPolicy(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslpolicy, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setSslPolicy(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSetsslpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.targetHttpsProxies.setUrlMap
    * @desc Changes the URL map for TargetHttpsProxy.
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
    * var compute = google.compute('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID for this request.
    *     project: 'my-project',  // TODO: Update placeholder value.
    *
    *     // Name of the TargetHttpsProxy resource whose URL map is to be set.
    *     targetHttpsProxy: 'my-target-https-proxy',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   compute.targetHttpsProxies.setUrlMap(request, function(err, response) {
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
    * @alias compute.targetHttpsProxies.setUrlMap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource whose URL map is to be set.
    * @param {().UrlMapReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUrlMap(): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setUrlMap(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSeturlmap): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSeturlmap,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSeturlmap,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setUrlMap(params: ParamsDollarResourceDollarTargethttpsproxiesDollarSeturlmap, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarTargethttpsproxiesDollarSeturlmap,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

