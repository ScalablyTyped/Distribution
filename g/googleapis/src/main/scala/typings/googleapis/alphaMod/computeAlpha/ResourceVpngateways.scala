package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Vpngateways")
@js.native
class ResourceVpngateways protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.vpnGateways.aggregatedList
    * @desc Retrieves an aggregated list of VPN gateways.
    * @alias compute.vpnGateways.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaVpnGatewayAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaVpnGatewayAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVpnGatewayAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceVpngatewaysAggregatedlist): GaxiosPromise[SchemaVpnGatewayAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceVpngatewaysAggregatedlist,
    callback: BodyResponseCallback[SchemaVpnGatewayAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceVpngatewaysAggregatedlist,
    options: BodyResponseCallback[SchemaVpnGatewayAggregatedList],
    callback: BodyResponseCallback[SchemaVpnGatewayAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceVpngatewaysAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaVpnGatewayAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceVpngatewaysAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVpnGatewayAggregatedList]
  ): Unit = js.native
  /**
    * compute.vpnGateways.delete
    * @desc Deletes the specified VPN gateway.
    * @alias compute.vpnGateways.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.vpnGateway Name of the VPN gateway to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceVpngatewaysDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceVpngatewaysDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceVpngatewaysDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceVpngatewaysDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceVpngatewaysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.vpnGateways.get
    * @desc Returns the specified VPN gateway. Gets a list of available VPN
    * gateways by making a list() request.
    * @alias compute.vpnGateways.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.vpnGateway Name of the VPN gateway to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVpnGateway] = js.native
  def get(callback: BodyResponseCallback[SchemaVpnGateway]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVpnGateway] = js.native
  def get(params: ParamsResourceVpngatewaysGet): GaxiosPromise[SchemaVpnGateway] = js.native
  def get(params: ParamsResourceVpngatewaysGet, callback: BodyResponseCallback[SchemaVpnGateway]): Unit = js.native
  def get(
    params: ParamsResourceVpngatewaysGet,
    options: BodyResponseCallback[SchemaVpnGateway],
    callback: BodyResponseCallback[SchemaVpnGateway]
  ): Unit = js.native
  def get(params: ParamsResourceVpngatewaysGet, options: MethodOptions): GaxiosPromise[SchemaVpnGateway] = js.native
  def get(
    params: ParamsResourceVpngatewaysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVpnGateway]
  ): Unit = js.native
  /**
    * compute.vpnGateways.getStatus
    * @desc Returns the status for the specified VPN gateway.
    * @alias compute.vpnGateways.getStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.vpnGateway Name of the VPN gateway to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getStatus(): GaxiosPromise[SchemaVpnGatewaysGetStatusResponse] = js.native
  def getStatus(callback: BodyResponseCallback[SchemaVpnGatewaysGetStatusResponse]): Unit = js.native
  def getStatus(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVpnGatewaysGetStatusResponse] = js.native
  def getStatus(params: ParamsResourceVpngatewaysGetstatus): GaxiosPromise[SchemaVpnGatewaysGetStatusResponse] = js.native
  def getStatus(
    params: ParamsResourceVpngatewaysGetstatus,
    callback: BodyResponseCallback[SchemaVpnGatewaysGetStatusResponse]
  ): Unit = js.native
  def getStatus(
    params: ParamsResourceVpngatewaysGetstatus,
    options: BodyResponseCallback[SchemaVpnGatewaysGetStatusResponse],
    callback: BodyResponseCallback[SchemaVpnGatewaysGetStatusResponse]
  ): Unit = js.native
  def getStatus(params: ParamsResourceVpngatewaysGetstatus, options: MethodOptions): GaxiosPromise[SchemaVpnGatewaysGetStatusResponse] = js.native
  def getStatus(
    params: ParamsResourceVpngatewaysGetstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVpnGatewaysGetStatusResponse]
  ): Unit = js.native
  /**
    * compute.vpnGateways.insert
    * @desc Creates a VPN gateway in the specified project and region using the
    * data included in the request.
    * @alias compute.vpnGateways.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().VpnGateway} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceVpngatewaysInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceVpngatewaysInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceVpngatewaysInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceVpngatewaysInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceVpngatewaysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.vpnGateways.list
    * @desc Retrieves a list of VPN gateways available to the specified project
    * and region.
    * @alias compute.vpnGateways.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaVpnGatewayList] = js.native
  def list(callback: BodyResponseCallback[SchemaVpnGatewayList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVpnGatewayList] = js.native
  def list(params: ParamsResourceVpngatewaysList): GaxiosPromise[SchemaVpnGatewayList] = js.native
  def list(params: ParamsResourceVpngatewaysList, callback: BodyResponseCallback[SchemaVpnGatewayList]): Unit = js.native
  def list(
    params: ParamsResourceVpngatewaysList,
    options: BodyResponseCallback[SchemaVpnGatewayList],
    callback: BodyResponseCallback[SchemaVpnGatewayList]
  ): Unit = js.native
  def list(params: ParamsResourceVpngatewaysList, options: MethodOptions): GaxiosPromise[SchemaVpnGatewayList] = js.native
  def list(
    params: ParamsResourceVpngatewaysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVpnGatewayList]
  ): Unit = js.native
  /**
    * compute.vpnGateways.setLabels
    * @desc Sets the labels on a VpnGateway. To learn more about labels, read
    * the Labeling Resources documentation.
    * @alias compute.vpnGateways.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().RegionSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceVpngatewaysSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceVpngatewaysSetlabels, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(
    params: ParamsResourceVpngatewaysSetlabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceVpngatewaysSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceVpngatewaysSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.vpnGateways.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.vpnGateways.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceVpngatewaysTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceVpngatewaysTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceVpngatewaysTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceVpngatewaysTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceVpngatewaysTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

