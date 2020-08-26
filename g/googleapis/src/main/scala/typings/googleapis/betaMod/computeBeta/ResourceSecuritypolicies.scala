package typings.googleapis.betaMod.computeBeta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Securitypolicies")
@js.native
class ResourceSecuritypolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.securityPolicies.addRule
    * @desc Inserts a rule into a security policy.
    * @alias compute.securityPolicies.addRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {boolean=} params.validateOnly If true, the request will not be committed.
    * @param {().SecurityPolicyRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addRule(): GaxiosPromise[SchemaOperation] = js.native
  def addRule(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addRule(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addRule(params: ParamsResourceSecuritypoliciesAddrule): GaxiosPromise[SchemaOperation] = js.native
  def addRule(params: ParamsResourceSecuritypoliciesAddrule, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addRule(
    params: ParamsResourceSecuritypoliciesAddrule,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addRule(params: ParamsResourceSecuritypoliciesAddrule, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addRule(
    params: ParamsResourceSecuritypoliciesAddrule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.delete
    * @desc Deletes the specified policy.
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
    *     // Name of the security policy to delete.
    *     securityPolicy: 'my-security-policy',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.securityPolicies.delete(request, function(err, response) {
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
    * @alias compute.securityPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSecuritypoliciesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSecuritypoliciesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceSecuritypoliciesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSecuritypoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSecuritypoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.get
    * @desc List all of the ordered rules present in a single specified policy.
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
    *     // Name of the security policy to get.
    *     securityPolicy: 'my-security-policy',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   compute.securityPolicies.get(request, function(err, response) {
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
    * @alias compute.securityPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.securityPolicy Name of the security policy to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaSecurityPolicy]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(params: ParamsResourceSecuritypoliciesGet): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(params: ParamsResourceSecuritypoliciesGet, callback: BodyResponseCallback[SchemaSecurityPolicy]): Unit = js.native
  def get(
    params: ParamsResourceSecuritypoliciesGet,
    options: BodyResponseCallback[SchemaSecurityPolicy],
    callback: BodyResponseCallback[SchemaSecurityPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceSecuritypoliciesGet, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicy] = js.native
  def get(
    params: ParamsResourceSecuritypoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicy]
  ): Unit = js.native
  /**
    * compute.securityPolicies.getRule
    * @desc Gets a rule at the specified priority.
    * @alias compute.securityPolicies.getRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.priority The priority of the rule to get from the security policy.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.securityPolicy Name of the security policy to which the queried rule belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getRule(): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(callback: BodyResponseCallback[SchemaSecurityPolicyRule]): Unit = js.native
  def getRule(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(params: ParamsResourceSecuritypoliciesGetrule): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(
    params: ParamsResourceSecuritypoliciesGetrule,
    callback: BodyResponseCallback[SchemaSecurityPolicyRule]
  ): Unit = js.native
  def getRule(
    params: ParamsResourceSecuritypoliciesGetrule,
    options: BodyResponseCallback[SchemaSecurityPolicyRule],
    callback: BodyResponseCallback[SchemaSecurityPolicyRule]
  ): Unit = js.native
  def getRule(params: ParamsResourceSecuritypoliciesGetrule, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyRule] = js.native
  def getRule(
    params: ParamsResourceSecuritypoliciesGetrule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicyRule]
  ): Unit = js.native
  /**
    * compute.securityPolicies.insert
    * @desc Creates a new policy in the specified project using the data
    * included in the request.
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
    *   compute.securityPolicies.insert(request, function(err, response) {
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
    * @alias compute.securityPolicies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {boolean=} params.validateOnly If true, the request will not be committed.
    * @param {().SecurityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceSecuritypoliciesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceSecuritypoliciesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceSecuritypoliciesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceSecuritypoliciesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceSecuritypoliciesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.list
    * @desc List all the policies that have been configured for the specified
    * project.
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
    *       compute.securityPolicies.list(request, handlePage);
    *     }
    *   };
    *
    *   compute.securityPolicies.list(request, handlePage);
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
    * @alias compute.securityPolicies.list
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
  def list(): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(callback: BodyResponseCallback[SchemaSecurityPolicyList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(params: ParamsResourceSecuritypoliciesList): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(
    params: ParamsResourceSecuritypoliciesList,
    callback: BodyResponseCallback[SchemaSecurityPolicyList]
  ): Unit = js.native
  def list(
    params: ParamsResourceSecuritypoliciesList,
    options: BodyResponseCallback[SchemaSecurityPolicyList],
    callback: BodyResponseCallback[SchemaSecurityPolicyList]
  ): Unit = js.native
  def list(params: ParamsResourceSecuritypoliciesList, options: MethodOptions): GaxiosPromise[SchemaSecurityPolicyList] = js.native
  def list(
    params: ParamsResourceSecuritypoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPolicyList]
  ): Unit = js.native
  /**
    * compute.securityPolicies.listPreconfiguredExpressionSets
    * @desc Gets the current list of preconfigured Web Application Firewall
    * (WAF) expressions.
    * @alias compute.securityPolicies.listPreconfiguredExpressionSets
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
  def listPreconfiguredExpressionSets(): GaxiosPromise[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  def listPreconfiguredExpressionSets(callback: BodyResponseCallback[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]): Unit = js.native
  def listPreconfiguredExpressionSets(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  def listPreconfiguredExpressionSets(params: ParamsResourceSecuritypoliciesListpreconfiguredexpressionsets): GaxiosPromise[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  def listPreconfiguredExpressionSets(
    params: ParamsResourceSecuritypoliciesListpreconfiguredexpressionsets,
    callback: BodyResponseCallback[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]
  ): Unit = js.native
  def listPreconfiguredExpressionSets(
    params: ParamsResourceSecuritypoliciesListpreconfiguredexpressionsets,
    options: BodyResponseCallback[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse],
    callback: BodyResponseCallback[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]
  ): Unit = js.native
  def listPreconfiguredExpressionSets(params: ParamsResourceSecuritypoliciesListpreconfiguredexpressionsets, options: MethodOptions): GaxiosPromise[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse] = js.native
  def listPreconfiguredExpressionSets(
    params: ParamsResourceSecuritypoliciesListpreconfiguredexpressionsets,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSecurityPoliciesListPreconfiguredExpressionSetsResponse]
  ): Unit = js.native
  /**
    * compute.securityPolicies.patch
    * @desc Patches the specified policy with the data included in the request.
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
    *     // Name of the security policy to update.
    *     securityPolicy: 'my-security-policy',  // TODO: Update placeholder
    * value.
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
    *   compute.securityPolicies.patch(request, function(err, response) {
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
    * @alias compute.securityPolicies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {().SecurityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceSecuritypoliciesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceSecuritypoliciesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceSecuritypoliciesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceSecuritypoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceSecuritypoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.patchRule
    * @desc Patches a rule at the specified priority.
    * @alias compute.securityPolicies.patchRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.priority The priority of the rule to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {boolean=} params.validateOnly If true, the request will not be committed.
    * @param {().SecurityPolicyRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patchRule(): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patchRule(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(params: ParamsResourceSecuritypoliciesPatchrule): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(params: ParamsResourceSecuritypoliciesPatchrule, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patchRule(
    params: ParamsResourceSecuritypoliciesPatchrule,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patchRule(params: ParamsResourceSecuritypoliciesPatchrule, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patchRule(
    params: ParamsResourceSecuritypoliciesPatchrule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.removeRule
    * @desc Deletes a rule at the specified priority.
    * @alias compute.securityPolicies.removeRule
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.priority The priority of the rule to remove from the security policy.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.securityPolicy Name of the security policy to update.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeRule(): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeRule(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(params: ParamsResourceSecuritypoliciesRemoverule): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(params: ParamsResourceSecuritypoliciesRemoverule, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeRule(
    params: ParamsResourceSecuritypoliciesRemoverule,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeRule(params: ParamsResourceSecuritypoliciesRemoverule, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeRule(
    params: ParamsResourceSecuritypoliciesRemoverule,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.setLabels
    * @desc Sets the labels on a security policy. To learn more about labels,
    * read the Labeling Resources documentation.
    * @alias compute.securityPolicies.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().GlobalSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceSecuritypoliciesSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceSecuritypoliciesSetlabels, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(
    params: ParamsResourceSecuritypoliciesSetlabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceSecuritypoliciesSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceSecuritypoliciesSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.testIamPermissions
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
    *   compute.securityPolicies.testIamPermissions(request, function(err,
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
    * @alias compute.securityPolicies.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceSecuritypoliciesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceSecuritypoliciesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceSecuritypoliciesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceSecuritypoliciesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceSecuritypoliciesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

