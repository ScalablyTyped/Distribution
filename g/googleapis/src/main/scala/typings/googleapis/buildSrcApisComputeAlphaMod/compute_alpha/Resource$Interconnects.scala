package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Interconnects")
@js.native
class Resource$Interconnects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.interconnects.delete
    * @desc Deletes the specified interconnect.
    * @alias compute.interconnects.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.interconnect Name of the interconnect to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInterconnectsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInterconnectsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarInterconnectsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarInterconnectsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarInterconnectsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.interconnects.get
    * @desc Returns the specified interconnect. Get a list of available
    * interconnects by making a list() request.
    * @alias compute.interconnects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.interconnect Name of the interconnect to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Interconnect] = js.native
  def get(callback: BodyResponseCallback[Schema$Interconnect]): Unit = js.native
  def get(params: ParamsDollarResourceDollarInterconnectsDollarGet): GaxiosPromise[Schema$Interconnect] = js.native
  def get(
    params: ParamsDollarResourceDollarInterconnectsDollarGet,
    callback: BodyResponseCallback[Schema$Interconnect]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarInterconnectsDollarGet,
    options: BodyResponseCallback[Schema$Interconnect],
    callback: BodyResponseCallback[Schema$Interconnect]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarInterconnectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Interconnect] = js.native
  def get(
    params: ParamsDollarResourceDollarInterconnectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Interconnect]
  ): Unit = js.native
  /**
    * compute.interconnects.getDiagnostics
    * @desc Returns the interconnectDiagnostics for the specified interconnect.
    * @alias compute.interconnects.getDiagnostics
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.interconnect Name of the interconnect resource to query.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getDiagnostics(): GaxiosPromise[Schema$InterconnectsGetDiagnosticsResponse] = js.native
  def getDiagnostics(callback: BodyResponseCallback[Schema$InterconnectsGetDiagnosticsResponse]): Unit = js.native
  def getDiagnostics(params: ParamsDollarResourceDollarInterconnectsDollarGetdiagnostics): GaxiosPromise[Schema$InterconnectsGetDiagnosticsResponse] = js.native
  def getDiagnostics(
    params: ParamsDollarResourceDollarInterconnectsDollarGetdiagnostics,
    callback: BodyResponseCallback[Schema$InterconnectsGetDiagnosticsResponse]
  ): Unit = js.native
  def getDiagnostics(
    params: ParamsDollarResourceDollarInterconnectsDollarGetdiagnostics,
    options: BodyResponseCallback[Schema$InterconnectsGetDiagnosticsResponse],
    callback: BodyResponseCallback[Schema$InterconnectsGetDiagnosticsResponse]
  ): Unit = js.native
  def getDiagnostics(params: ParamsDollarResourceDollarInterconnectsDollarGetdiagnostics, options: MethodOptions): GaxiosPromise[Schema$InterconnectsGetDiagnosticsResponse] = js.native
  def getDiagnostics(
    params: ParamsDollarResourceDollarInterconnectsDollarGetdiagnostics,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InterconnectsGetDiagnosticsResponse]
  ): Unit = js.native
  /**
    * compute.interconnects.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.interconnects.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarInterconnectsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInterconnectsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInterconnectsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarInterconnectsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarInterconnectsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.interconnects.insert
    * @desc Creates a Interconnect in the specified project using the data
    * included in the request.
    * @alias compute.interconnects.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Interconnect} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInterconnectsDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInterconnectsDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarInterconnectsDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarInterconnectsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarInterconnectsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.interconnects.list
    * @desc Retrieves the list of interconnect available to the specified
    * project.
    * @alias compute.interconnects.list
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
  def list(): GaxiosPromise[Schema$InterconnectList] = js.native
  def list(callback: BodyResponseCallback[Schema$InterconnectList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarInterconnectsDollarList): GaxiosPromise[Schema$InterconnectList] = js.native
  def list(
    params: ParamsDollarResourceDollarInterconnectsDollarList,
    callback: BodyResponseCallback[Schema$InterconnectList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarInterconnectsDollarList,
    options: BodyResponseCallback[Schema$InterconnectList],
    callback: BodyResponseCallback[Schema$InterconnectList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarInterconnectsDollarList, options: MethodOptions): GaxiosPromise[Schema$InterconnectList] = js.native
  def list(
    params: ParamsDollarResourceDollarInterconnectsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InterconnectList]
  ): Unit = js.native
  /**
    * compute.interconnects.patch
    * @desc Updates the specified interconnect with the data included in the
    * request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    * @alias compute.interconnects.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.interconnect Name of the interconnect to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Interconnect} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInterconnectsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarInterconnectsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarInterconnectsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarInterconnectsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarInterconnectsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.interconnects.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.interconnects.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().GlobalSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarInterconnectsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInterconnectsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInterconnectsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarInterconnectsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarInterconnectsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.interconnects.setLabels
    * @desc Sets the labels on an Interconnect. To learn more about labels,
    * read the Labeling Resources documentation.
    * @alias compute.interconnects.setLabels
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
  def setLabels(params: ParamsDollarResourceDollarInterconnectsDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarInterconnectsDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarInterconnectsDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarInterconnectsDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarInterconnectsDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.interconnects.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.interconnects.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarInterconnectsDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInterconnectsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInterconnectsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarInterconnectsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarInterconnectsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

