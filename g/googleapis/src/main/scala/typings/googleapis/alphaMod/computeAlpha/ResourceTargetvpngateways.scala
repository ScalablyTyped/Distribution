package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Targetvpngateways")
@js.native
class ResourceTargetvpngateways protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.targetVpnGateways.aggregatedList
    * @desc Retrieves an aggregated list of target VPN gateways.
    * @alias compute.targetVpnGateways.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaTargetVpnGatewayAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaTargetVpnGatewayAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsResourceTargetvpngatewaysAggregatedlist): GaxiosPromise[SchemaTargetVpnGatewayAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceTargetvpngatewaysAggregatedlist,
    callback: BodyResponseCallback[SchemaTargetVpnGatewayAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceTargetvpngatewaysAggregatedlist,
    options: BodyResponseCallback[SchemaTargetVpnGatewayAggregatedList],
    callback: BodyResponseCallback[SchemaTargetVpnGatewayAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceTargetvpngatewaysAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaTargetVpnGatewayAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceTargetvpngatewaysAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetVpnGatewayAggregatedList]
  ): Unit = js.native
  /**
    * compute.targetVpnGateways.delete
    * @desc Deletes the specified target VPN gateway.
    * @alias compute.targetVpnGateways.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetVpnGateway Name of the target VPN gateway to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceTargetvpngatewaysDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTargetvpngatewaysDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceTargetvpngatewaysDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceTargetvpngatewaysDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceTargetvpngatewaysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetVpnGateways.get
    * @desc Returns the specified target VPN gateway. Gets a list of available
    * target VPN gateways by making a list() request.
    * @alias compute.targetVpnGateways.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string} params.targetVpnGateway Name of the target VPN gateway to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetVpnGateway] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetVpnGateway]): Unit = js.native
  def get(params: ParamsResourceTargetvpngatewaysGet): GaxiosPromise[SchemaTargetVpnGateway] = js.native
  def get(params: ParamsResourceTargetvpngatewaysGet, callback: BodyResponseCallback[SchemaTargetVpnGateway]): Unit = js.native
  def get(
    params: ParamsResourceTargetvpngatewaysGet,
    options: BodyResponseCallback[SchemaTargetVpnGateway],
    callback: BodyResponseCallback[SchemaTargetVpnGateway]
  ): Unit = js.native
  def get(params: ParamsResourceTargetvpngatewaysGet, options: MethodOptions): GaxiosPromise[SchemaTargetVpnGateway] = js.native
  def get(
    params: ParamsResourceTargetvpngatewaysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetVpnGateway]
  ): Unit = js.native
  /**
    * compute.targetVpnGateways.insert
    * @desc Creates a target VPN gateway in the specified project and region
    * using the data included in the request.
    * @alias compute.targetVpnGateways.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetVpnGateway} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceTargetvpngatewaysInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTargetvpngatewaysInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceTargetvpngatewaysInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceTargetvpngatewaysInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceTargetvpngatewaysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetVpnGateways.list
    * @desc Retrieves a list of target VPN gateways available to the specified
    * project and region.
    * @alias compute.targetVpnGateways.list
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
  def list(): GaxiosPromise[SchemaTargetVpnGatewayList] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetVpnGatewayList]): Unit = js.native
  def list(params: ParamsResourceTargetvpngatewaysList): GaxiosPromise[SchemaTargetVpnGatewayList] = js.native
  def list(
    params: ParamsResourceTargetvpngatewaysList,
    callback: BodyResponseCallback[SchemaTargetVpnGatewayList]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetvpngatewaysList,
    options: BodyResponseCallback[SchemaTargetVpnGatewayList],
    callback: BodyResponseCallback[SchemaTargetVpnGatewayList]
  ): Unit = js.native
  def list(params: ParamsResourceTargetvpngatewaysList, options: MethodOptions): GaxiosPromise[SchemaTargetVpnGatewayList] = js.native
  def list(
    params: ParamsResourceTargetvpngatewaysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetVpnGatewayList]
  ): Unit = js.native
  /**
    * compute.targetVpnGateways.setLabels
    * @desc Sets the labels on a TargetVpnGateway. To learn more about labels,
    * read the Labeling Resources documentation.
    * @alias compute.targetVpnGateways.setLabels
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
  def setLabels(params: ParamsResourceTargetvpngatewaysSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceTargetvpngatewaysSetlabels, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(
    params: ParamsResourceTargetvpngatewaysSetlabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceTargetvpngatewaysSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceTargetvpngatewaysSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetVpnGateways.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.targetVpnGateways.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceTargetvpngatewaysTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargetvpngatewaysTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceTargetvpngatewaysTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceTargetvpngatewaysTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargetvpngatewaysTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

