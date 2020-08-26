package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regionbackendservices")
@js.native
class ResourceRegionbackendservices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionBackendServices.delete
    * @desc Deletes the specified regional BackendService resource.
    * @alias compute.regionBackendServices.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegionbackendservicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegionbackendservicesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceRegionbackendservicesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRegionbackendservicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegionbackendservicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.get
    * @desc Returns the specified regional BackendService resource.
    * @alias compute.regionBackendServices.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBackendService] = js.native
  def get(callback: BodyResponseCallback[SchemaBackendService]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendService] = js.native
  def get(params: ParamsResourceRegionbackendservicesGet): GaxiosPromise[SchemaBackendService] = js.native
  def get(
    params: ParamsResourceRegionbackendservicesGet,
    callback: BodyResponseCallback[SchemaBackendService]
  ): Unit = js.native
  def get(
    params: ParamsResourceRegionbackendservicesGet,
    options: BodyResponseCallback[SchemaBackendService],
    callback: BodyResponseCallback[SchemaBackendService]
  ): Unit = js.native
  def get(params: ParamsResourceRegionbackendservicesGet, options: MethodOptions): GaxiosPromise[SchemaBackendService] = js.native
  def get(
    params: ParamsResourceRegionbackendservicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendService]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.getHealth
    * @desc Gets the most recent health check results for this regional
    * BackendService.
    * @alias compute.regionBackendServices.getHealth
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource for which to get health.
    * @param {string} params.project
    * @param {string} params.region Name of the region scoping this request.
    * @param {().ResourceGroupReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getHealth(): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]): Unit = js.native
  def getHealth(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(params: ParamsResourceRegionbackendservicesGethealth): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsResourceRegionbackendservicesGethealth,
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(
    params: ParamsResourceRegionbackendservicesGethealth,
    options: BodyResponseCallback[SchemaBackendServiceGroupHealth],
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  def getHealth(params: ParamsResourceRegionbackendservicesGethealth, options: MethodOptions): GaxiosPromise[SchemaBackendServiceGroupHealth] = js.native
  def getHealth(
    params: ParamsResourceRegionbackendservicesGethealth,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceGroupHealth]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.insert
    * @desc Creates a regional BackendService resource in the specified project
    * using the data included in the request. There are several restrictions
    * and guidelines to keep in mind when creating a regional backend service.
    * Read  Restrictions and Guidelines for more information.
    * @alias compute.regionBackendServices.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegionbackendservicesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegionbackendservicesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceRegionbackendservicesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegionbackendservicesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegionbackendservicesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.list
    * @desc Retrieves the list of regional BackendService resources available
    * to the specified project in the given region.
    * @alias compute.regionBackendServices.list
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
  def list(): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(callback: BodyResponseCallback[SchemaBackendServiceList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(params: ParamsResourceRegionbackendservicesList): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(
    params: ParamsResourceRegionbackendservicesList,
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  def list(
    params: ParamsResourceRegionbackendservicesList,
    options: BodyResponseCallback[SchemaBackendServiceList],
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  def list(params: ParamsResourceRegionbackendservicesList, options: MethodOptions): GaxiosPromise[SchemaBackendServiceList] = js.native
  def list(
    params: ParamsResourceRegionbackendservicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendServiceList]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.patch
    * @desc Updates the specified regional BackendService resource with the
    * data included in the request. There are several restrictions and
    * guidelines to keep in mind when updating a backend service. Read
    * Restrictions and Guidelines for more information. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.regionBackendServices.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRegionbackendservicesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceRegionbackendservicesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceRegionbackendservicesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceRegionbackendservicesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceRegionbackendservicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionBackendServices.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceRegionbackendservicesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegionbackendservicesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegionbackendservicesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegionbackendservicesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegionbackendservicesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.regionBackendServices.update
    * @desc Updates the specified regional BackendService resource with the
    * data included in the request. There are several restrictions and
    * guidelines to keep in mind when updating a backend service. Read
    * Restrictions and Guidelines for more information.
    * @alias compute.regionBackendServices.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendService Name of the BackendService resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendService} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRegionbackendservicesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceRegionbackendservicesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceRegionbackendservicesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceRegionbackendservicesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceRegionbackendservicesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

