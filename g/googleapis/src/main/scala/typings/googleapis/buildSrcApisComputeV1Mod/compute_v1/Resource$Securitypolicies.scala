package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Securitypolicies")
@js.native
class Resource$Securitypolicies protected () extends js.Object {
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
    * @param {().SecurityPolicyRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addRule(): GaxiosPromise[Schema$Operation] = js.native
  def addRule(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarAddrule): GaxiosPromise[Schema$Operation] = js.native
  def addRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarAddrule,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarAddrule,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarAddrule, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarAddrule,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.delete
    * @desc Deletes the specified policy.
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
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSecuritypoliciesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSecuritypoliciesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.get
    * @desc List all of the ordered rules present in a single specified policy.
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
  def get(): GaxiosPromise[Schema$SecurityPolicy] = js.native
  def get(callback: BodyResponseCallback[Schema$SecurityPolicy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSecuritypoliciesDollarGet): GaxiosPromise[Schema$SecurityPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarGet,
    callback: BodyResponseCallback[Schema$SecurityPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarGet,
    options: BodyResponseCallback[Schema$SecurityPolicy],
    callback: BodyResponseCallback[Schema$SecurityPolicy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSecuritypoliciesDollarGet, options: MethodOptions): GaxiosPromise[Schema$SecurityPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SecurityPolicy]
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
  def getRule(): GaxiosPromise[Schema$SecurityPolicyRule] = js.native
  def getRule(callback: BodyResponseCallback[Schema$SecurityPolicyRule]): Unit = js.native
  def getRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarGetrule): GaxiosPromise[Schema$SecurityPolicyRule] = js.native
  def getRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarGetrule,
    callback: BodyResponseCallback[Schema$SecurityPolicyRule]
  ): Unit = js.native
  def getRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarGetrule,
    options: BodyResponseCallback[Schema$SecurityPolicyRule],
    callback: BodyResponseCallback[Schema$SecurityPolicyRule]
  ): Unit = js.native
  def getRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarGetrule, options: MethodOptions): GaxiosPromise[Schema$SecurityPolicyRule] = js.native
  def getRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarGetrule,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SecurityPolicyRule]
  ): Unit = js.native
  /**
    * compute.securityPolicies.insert
    * @desc Creates a new policy in the specified project using the data
    * included in the request.
    * @alias compute.securityPolicies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SecurityPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSecuritypoliciesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarSecuritypoliciesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.securityPolicies.list
    * @desc List all the policies that have been configured for the specified
    * project.
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
  def list(): GaxiosPromise[Schema$SecurityPolicyList] = js.native
  def list(callback: BodyResponseCallback[Schema$SecurityPolicyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSecuritypoliciesDollarList): GaxiosPromise[Schema$SecurityPolicyList] = js.native
  def list(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarList,
    callback: BodyResponseCallback[Schema$SecurityPolicyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarList,
    options: BodyResponseCallback[Schema$SecurityPolicyList],
    callback: BodyResponseCallback[Schema$SecurityPolicyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSecuritypoliciesDollarList, options: MethodOptions): GaxiosPromise[Schema$SecurityPolicyList] = js.native
  def list(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SecurityPolicyList]
  ): Unit = js.native
  /**
    * compute.securityPolicies.patch
    * @desc Patches the specified policy with the data included in the request.
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
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSecuritypoliciesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarSecuritypoliciesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
    * @param {().SecurityPolicyRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patchRule(): GaxiosPromise[Schema$Operation] = js.native
  def patchRule(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patchRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarPatchrule): GaxiosPromise[Schema$Operation] = js.native
  def patchRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarPatchrule,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patchRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarPatchrule,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patchRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarPatchrule, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patchRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarPatchrule,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def removeRule(): GaxiosPromise[Schema$Operation] = js.native
  def removeRule(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def removeRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarRemoverule): GaxiosPromise[Schema$Operation] = js.native
  def removeRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarRemoverule,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarRemoverule,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeRule(params: ParamsDollarResourceDollarSecuritypoliciesDollarRemoverule, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def removeRule(
    params: ParamsDollarResourceDollarSecuritypoliciesDollarRemoverule,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

