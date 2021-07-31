package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Healthchecks")
@js.native
class ResourceHealthchecks protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.healthChecks.aggregatedList
    * @desc Retrieves the list of all HealthCheck resources, regional and
    * global, available to the specified project.
    * @alias compute.healthChecks.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Name of the project scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaHealthChecksAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaHealthChecksAggregatedList]): Unit = js.native
  def aggregatedList(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHealthChecksAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceHealthchecksAggregatedlist): GaxiosPromise[SchemaHealthChecksAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceHealthchecksAggregatedlist,
    callback: BodyResponseCallback[SchemaHealthChecksAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceHealthchecksAggregatedlist,
    options: BodyResponseCallback[SchemaHealthChecksAggregatedList],
    callback: BodyResponseCallback[SchemaHealthChecksAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceHealthchecksAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaHealthChecksAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceHealthchecksAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthChecksAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.healthChecks.delete
    * @desc Deletes the specified HealthCheck resource.
    * @alias compute.healthChecks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceHealthchecksDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceHealthchecksDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceHealthchecksDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceHealthchecksDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceHealthchecksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.healthChecks.get
    * @desc Returns the specified HealthCheck resource. Gets a list of
    * available health checks by making a list() request.
    * @alias compute.healthChecks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(callback: BodyResponseCallback[SchemaHealthCheck]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(params: ParamsResourceHealthchecksGet): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(params: ParamsResourceHealthchecksGet, callback: BodyResponseCallback[SchemaHealthCheck]): Unit = js.native
  def get(
    params: ParamsResourceHealthchecksGet,
    options: BodyResponseCallback[SchemaHealthCheck],
    callback: BodyResponseCallback[SchemaHealthCheck]
  ): Unit = js.native
  def get(params: ParamsResourceHealthchecksGet, options: MethodOptions): GaxiosPromise[SchemaHealthCheck] = js.native
  def get(
    params: ParamsResourceHealthchecksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthCheck]
  ): Unit = js.native
  
  /**
    * compute.healthChecks.insert
    * @desc Creates a HealthCheck resource in the specified project using the
    * data included in the request.
    * @alias compute.healthChecks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceHealthchecksInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceHealthchecksInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceHealthchecksInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceHealthchecksInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceHealthchecksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.healthChecks.list
    * @desc Retrieves the list of HealthCheck resources available to the
    * specified project.
    * @alias compute.healthChecks.list
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
  def list(): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(callback: BodyResponseCallback[SchemaHealthCheckList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(params: ParamsResourceHealthchecksList): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(params: ParamsResourceHealthchecksList, callback: BodyResponseCallback[SchemaHealthCheckList]): Unit = js.native
  def list(
    params: ParamsResourceHealthchecksList,
    options: BodyResponseCallback[SchemaHealthCheckList],
    callback: BodyResponseCallback[SchemaHealthCheckList]
  ): Unit = js.native
  def list(params: ParamsResourceHealthchecksList, options: MethodOptions): GaxiosPromise[SchemaHealthCheckList] = js.native
  def list(
    params: ParamsResourceHealthchecksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHealthCheckList]
  ): Unit = js.native
  
  /**
    * compute.healthChecks.patch
    * @desc Updates a HealthCheck resource in the specified project using the
    * data included in the request. This method supports PATCH semantics and
    * uses the JSON merge patch format and processing rules.
    * @alias compute.healthChecks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceHealthchecksPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceHealthchecksPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceHealthchecksPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceHealthchecksPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceHealthchecksPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.healthChecks.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.healthChecks.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceHealthchecksTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceHealthchecksTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceHealthchecksTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceHealthchecksTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceHealthchecksTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.healthChecks.update
    * @desc Updates a HealthCheck resource in the specified project using the
    * data included in the request.
    * @alias compute.healthChecks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.healthCheck Name of the HealthCheck resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().HealthCheck} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceHealthchecksUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceHealthchecksUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceHealthchecksUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceHealthchecksUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceHealthchecksUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
