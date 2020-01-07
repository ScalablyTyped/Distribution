package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Externalvpngateways")
@js.native
class Resource$Externalvpngateways protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.externalVpnGateways.delete
    * @desc Deletes the specified externalVpnGateway.
    * @alias compute.externalVpnGateways.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.externalVpnGateway Name of the externalVpnGateways to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarExternalvpngatewaysDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarExternalvpngatewaysDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.externalVpnGateways.get
    * @desc Returns the specified externalVpnGateway. Get a list of available
    * externalVpnGateways by making a list() request.
    * @alias compute.externalVpnGateways.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.externalVpnGateway Name of the externalVpnGateway to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ExternalVpnGateway] = js.native
  def get(callback: BodyResponseCallback[Schema$ExternalVpnGateway]): Unit = js.native
  def get(params: ParamsDollarResourceDollarExternalvpngatewaysDollarGet): GaxiosPromise[Schema$ExternalVpnGateway] = js.native
  def get(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarGet,
    callback: BodyResponseCallback[Schema$ExternalVpnGateway]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarGet,
    options: BodyResponseCallback[Schema$ExternalVpnGateway],
    callback: BodyResponseCallback[Schema$ExternalVpnGateway]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarExternalvpngatewaysDollarGet, options: MethodOptions): GaxiosPromise[Schema$ExternalVpnGateway] = js.native
  def get(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExternalVpnGateway]
  ): Unit = js.native
  /**
    * compute.externalVpnGateways.insert
    * @desc Creates a ExternalVpnGateway in the specified project using the
    * data included in the request.
    * @alias compute.externalVpnGateways.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ExternalVpnGateway} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarExternalvpngatewaysDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarExternalvpngatewaysDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.externalVpnGateways.list
    * @desc Retrieves the list of ExternalVpnGateway available to the specified
    * project.
    * @alias compute.externalVpnGateways.list
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
  def list(): GaxiosPromise[Schema$ExternalVpnGatewayList] = js.native
  def list(callback: BodyResponseCallback[Schema$ExternalVpnGatewayList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarExternalvpngatewaysDollarList): GaxiosPromise[Schema$ExternalVpnGatewayList] = js.native
  def list(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarList,
    callback: BodyResponseCallback[Schema$ExternalVpnGatewayList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarList,
    options: BodyResponseCallback[Schema$ExternalVpnGatewayList],
    callback: BodyResponseCallback[Schema$ExternalVpnGatewayList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarExternalvpngatewaysDollarList, options: MethodOptions): GaxiosPromise[Schema$ExternalVpnGatewayList] = js.native
  def list(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExternalVpnGatewayList]
  ): Unit = js.native
  /**
    * compute.externalVpnGateways.setLabels
    * @desc Sets the labels on an ExternalVpnGateway. To learn more about
    * labels, read the Labeling Resources documentation.
    * @alias compute.externalVpnGateways.setLabels
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
  def setLabels(params: ParamsDollarResourceDollarExternalvpngatewaysDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarExternalvpngatewaysDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.externalVpnGateways.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.externalVpnGateways.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarExternalvpngatewaysDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarExternalvpngatewaysDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

