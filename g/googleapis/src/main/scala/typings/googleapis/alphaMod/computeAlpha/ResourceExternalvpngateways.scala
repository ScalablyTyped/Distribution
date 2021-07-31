package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Externalvpngateways")
@js.native
class ResourceExternalvpngateways protected () extends StObject {
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
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceExternalvpngatewaysDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceExternalvpngatewaysDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceExternalvpngatewaysDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceExternalvpngatewaysDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceExternalvpngatewaysDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def get(): GaxiosPromise[SchemaExternalVpnGateway] = js.native
  def get(callback: BodyResponseCallback[SchemaExternalVpnGateway]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExternalVpnGateway] = js.native
  def get(params: ParamsResourceExternalvpngatewaysGet): GaxiosPromise[SchemaExternalVpnGateway] = js.native
  def get(
    params: ParamsResourceExternalvpngatewaysGet,
    callback: BodyResponseCallback[SchemaExternalVpnGateway]
  ): Unit = js.native
  def get(
    params: ParamsResourceExternalvpngatewaysGet,
    options: BodyResponseCallback[SchemaExternalVpnGateway],
    callback: BodyResponseCallback[SchemaExternalVpnGateway]
  ): Unit = js.native
  def get(params: ParamsResourceExternalvpngatewaysGet, options: MethodOptions): GaxiosPromise[SchemaExternalVpnGateway] = js.native
  def get(
    params: ParamsResourceExternalvpngatewaysGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExternalVpnGateway]
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
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceExternalvpngatewaysInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceExternalvpngatewaysInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceExternalvpngatewaysInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceExternalvpngatewaysInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceExternalvpngatewaysInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def list(): GaxiosPromise[SchemaExternalVpnGatewayList] = js.native
  def list(callback: BodyResponseCallback[SchemaExternalVpnGatewayList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaExternalVpnGatewayList] = js.native
  def list(params: ParamsResourceExternalvpngatewaysList): GaxiosPromise[SchemaExternalVpnGatewayList] = js.native
  def list(
    params: ParamsResourceExternalvpngatewaysList,
    callback: BodyResponseCallback[SchemaExternalVpnGatewayList]
  ): Unit = js.native
  def list(
    params: ParamsResourceExternalvpngatewaysList,
    options: BodyResponseCallback[SchemaExternalVpnGatewayList],
    callback: BodyResponseCallback[SchemaExternalVpnGatewayList]
  ): Unit = js.native
  def list(params: ParamsResourceExternalvpngatewaysList, options: MethodOptions): GaxiosPromise[SchemaExternalVpnGatewayList] = js.native
  def list(
    params: ParamsResourceExternalvpngatewaysList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaExternalVpnGatewayList]
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
  def setLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceExternalvpngatewaysSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceExternalvpngatewaysSetlabels,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(
    params: ParamsResourceExternalvpngatewaysSetlabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceExternalvpngatewaysSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceExternalvpngatewaysSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceExternalvpngatewaysTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceExternalvpngatewaysTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceExternalvpngatewaysTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceExternalvpngatewaysTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceExternalvpngatewaysTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}
