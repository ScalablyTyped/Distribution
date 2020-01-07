package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Globalforwardingrules")
@js.native
class Resource$Globalforwardingrules protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.globalForwardingRules.delete
    * @desc Deletes the specified GlobalForwardingRule resource.
    * @alias compute.globalForwardingRules.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.get
    * @desc Returns the specified GlobalForwardingRule resource. Gets a list of
    * available forwarding rules by making a list() request.
    * @alias compute.globalForwardingRules.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ForwardingRule] = js.native
  def get(callback: BodyResponseCallback[Schema$ForwardingRule]): Unit = js.native
  def get(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarGet): GaxiosPromise[Schema$ForwardingRule] = js.native
  def get(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarGet,
    callback: BodyResponseCallback[Schema$ForwardingRule]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarGet,
    options: BodyResponseCallback[Schema$ForwardingRule],
    callback: BodyResponseCallback[Schema$ForwardingRule]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ForwardingRule] = js.native
  def get(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingRule]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.insert
    * @desc Creates a GlobalForwardingRule resource in the specified project
    * using the data included in the request.
    * @alias compute.globalForwardingRules.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ForwardingRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.list
    * @desc Retrieves a list of GlobalForwardingRule resources available to the
    * specified project.
    * @alias compute.globalForwardingRules.list
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
  def list(): GaxiosPromise[Schema$ForwardingRuleList] = js.native
  def list(callback: BodyResponseCallback[Schema$ForwardingRuleList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarList): GaxiosPromise[Schema$ForwardingRuleList] = js.native
  def list(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarList,
    callback: BodyResponseCallback[Schema$ForwardingRuleList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarList,
    options: BodyResponseCallback[Schema$ForwardingRuleList],
    callback: BodyResponseCallback[Schema$ForwardingRuleList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarList, options: MethodOptions): GaxiosPromise[Schema$ForwardingRuleList] = js.native
  def list(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingRuleList]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.patch
    * @desc Updates the specified forwarding rule with the data included in the
    * request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules. Currently, you can only patch the
    * network_tier field.
    * @alias compute.globalForwardingRules.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ForwardingRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.setLabels
    * @desc Sets the labels on the specified resource. To learn more about
    * labels, read the Labeling Resources documentation.
    * @alias compute.globalForwardingRules.setLabels
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
  def setLabels(): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.setTarget
    * @desc Changes target URL for the GlobalForwardingRule resource. The new
    * target should be of the same type as the old target.
    * @alias compute.globalForwardingRules.setTarget
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingRule Name of the ForwardingRule resource in which target is to be set.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTarget(): GaxiosPromise[Schema$Operation] = js.native
  def setTarget(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setTarget(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSettarget): GaxiosPromise[Schema$Operation] = js.native
  def setTarget(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSettarget,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTarget(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSettarget,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTarget(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSettarget, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setTarget(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarSettarget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.globalForwardingRules.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.globalForwardingRules.testIamPermissions
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
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarGlobalforwardingrulesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarGlobalforwardingrulesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

