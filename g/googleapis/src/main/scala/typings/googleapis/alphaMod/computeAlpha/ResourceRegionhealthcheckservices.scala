package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regionhealthcheckservices")
@js.native
class ResourceRegionhealthcheckservices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionHealthCheckServices.delete
    * @desc Deletes the specified regional HealthCheckService.
    * @alias compute.regionHealthCheckServices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheckService Name of the HealthCheckService to delete. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceRegionhealthcheckservicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegionhealthcheckservicesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceRegionhealthcheckservicesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRegionhealthcheckservicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegionhealthcheckservicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionHealthCheckServices.get
    * @desc Returns the specified regional HealthCheckService resource.
    * @alias compute.regionHealthCheckServices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheckService Name of the HealthCheckService to update. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHealthCheckService] = js.native
  def get(callback: BodyResponseCallback[SchemaHealthCheckService]): Unit = js.native
  def get(params: ParamsResourceRegionhealthcheckservicesGet): GaxiosPromise[SchemaHealthCheckService] = js.native
  def get(
    params: ParamsResourceRegionhealthcheckservicesGet,
    callback: BodyResponseCallback[SchemaHealthCheckService]
  ): Unit = js.native
  def get(
    params: ParamsResourceRegionhealthcheckservicesGet,
    options: BodyResponseCallback[SchemaHealthCheckService],
    callback: BodyResponseCallback[SchemaHealthCheckService]
  ): Unit = js.native
  def get(params: ParamsResourceRegionhealthcheckservicesGet, options: MethodOptions): GaxiosPromise[SchemaHealthCheckService] = js.native
  def get(
    params: ParamsResourceRegionhealthcheckservicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthCheckService]
  ): Unit = js.native
  /**
    * compute.regionHealthCheckServices.insert
    * @desc Creates a regional HealthCheckService resource in the specified
    * project and region using the data included in the request.
    * @alias compute.regionHealthCheckServices.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheckService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceRegionhealthcheckservicesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegionhealthcheckservicesInsert,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRegionhealthcheckservicesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegionhealthcheckservicesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegionhealthcheckservicesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionHealthCheckServices.list
    * @desc Lists all the HealthCheckService resources that have been
    * configured for the specified project in the given region.
    * @alias compute.regionHealthCheckServices.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaHealthCheckServicesList] = js.native
  def list(callback: BodyResponseCallback[SchemaHealthCheckServicesList]): Unit = js.native
  def list(params: ParamsResourceRegionhealthcheckservicesList): GaxiosPromise[SchemaHealthCheckServicesList] = js.native
  def list(
    params: ParamsResourceRegionhealthcheckservicesList,
    callback: BodyResponseCallback[SchemaHealthCheckServicesList]
  ): Unit = js.native
  def list(
    params: ParamsResourceRegionhealthcheckservicesList,
    options: BodyResponseCallback[SchemaHealthCheckServicesList],
    callback: BodyResponseCallback[SchemaHealthCheckServicesList]
  ): Unit = js.native
  def list(params: ParamsResourceRegionhealthcheckservicesList, options: MethodOptions): GaxiosPromise[SchemaHealthCheckServicesList] = js.native
  def list(
    params: ParamsResourceRegionhealthcheckservicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthCheckServicesList]
  ): Unit = js.native
  /**
    * compute.regionHealthCheckServices.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionHealthCheckServices.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceRegionhealthcheckservicesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegionhealthcheckservicesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegionhealthcheckservicesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegionhealthcheckservicesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegionhealthcheckservicesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

