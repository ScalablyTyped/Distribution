package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Autoscalers")
@js.native
class ResourceAutoscalers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.autoscalers.aggregatedList
    * @desc Retrieves an aggregated list of autoscalers.
    * @alias compute.autoscalers.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaAutoscalerAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaAutoscalerAggregatedList]): Unit = js.native
  def aggregatedList(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoscalerAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceAutoscalersAggregatedlist): GaxiosPromise[SchemaAutoscalerAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceAutoscalersAggregatedlist,
    callback: BodyResponseCallback[SchemaAutoscalerAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceAutoscalersAggregatedlist,
    options: BodyResponseCallback[SchemaAutoscalerAggregatedList],
    callback: BodyResponseCallback[SchemaAutoscalerAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceAutoscalersAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaAutoscalerAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceAutoscalersAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalerAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.autoscalers.delete
    * @desc Deletes the specified autoscaler.
    * @alias compute.autoscalers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.autoscaler Name of the autoscaler to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone Name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAutoscalersDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAutoscalersDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceAutoscalersDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAutoscalersDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAutoscalersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.autoscalers.get
    * @desc Returns the specified autoscaler resource. Gets a list of available
    * autoscalers by making a list() request.
    * @alias compute.autoscalers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.autoscaler Name of the autoscaler to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone Name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaAutoscaler] = js.native
  def get(callback: BodyResponseCallback[SchemaAutoscaler]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoscaler] = js.native
  def get(params: ParamsResourceAutoscalersGet): GaxiosPromise[SchemaAutoscaler] = js.native
  def get(params: ParamsResourceAutoscalersGet, callback: BodyResponseCallback[SchemaAutoscaler]): Unit = js.native
  def get(
    params: ParamsResourceAutoscalersGet,
    options: BodyResponseCallback[SchemaAutoscaler],
    callback: BodyResponseCallback[SchemaAutoscaler]
  ): Unit = js.native
  def get(params: ParamsResourceAutoscalersGet, options: MethodOptions): GaxiosPromise[SchemaAutoscaler] = js.native
  def get(
    params: ParamsResourceAutoscalersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscaler]
  ): Unit = js.native
  
  /**
    * compute.autoscalers.insert
    * @desc Creates an autoscaler in the specified project using the data
    * included in the request.
    * @alias compute.autoscalers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone Name of the zone for this request.
    * @param {().Autoscaler} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceAutoscalersInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceAutoscalersInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceAutoscalersInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceAutoscalersInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceAutoscalersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.autoscalers.list
    * @desc Retrieves a list of autoscalers contained within the specified
    * zone.
    * @alias compute.autoscalers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone Name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaAutoscalerList] = js.native
  def list(callback: BodyResponseCallback[SchemaAutoscalerList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAutoscalerList] = js.native
  def list(params: ParamsResourceAutoscalersList): GaxiosPromise[SchemaAutoscalerList] = js.native
  def list(params: ParamsResourceAutoscalersList, callback: BodyResponseCallback[SchemaAutoscalerList]): Unit = js.native
  def list(
    params: ParamsResourceAutoscalersList,
    options: BodyResponseCallback[SchemaAutoscalerList],
    callback: BodyResponseCallback[SchemaAutoscalerList]
  ): Unit = js.native
  def list(params: ParamsResourceAutoscalersList, options: MethodOptions): GaxiosPromise[SchemaAutoscalerList] = js.native
  def list(
    params: ParamsResourceAutoscalersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAutoscalerList]
  ): Unit = js.native
  
  /**
    * compute.autoscalers.patch
    * @desc Updates an autoscaler in the specified project using the data
    * included in the request. This method supports PATCH semantics and uses
    * the JSON merge patch format and processing rules.
    * @alias compute.autoscalers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.autoscaler Name of the autoscaler to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone Name of the zone for this request.
    * @param {().Autoscaler} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAutoscalersPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAutoscalersPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAutoscalersPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAutoscalersPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAutoscalersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.autoscalers.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.autoscalers.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceAutoscalersTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceAutoscalersTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceAutoscalersTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceAutoscalersTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceAutoscalersTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.autoscalers.update
    * @desc Updates an autoscaler in the specified project using the data
    * included in the request.
    * @alias compute.autoscalers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.autoscaler Name of the autoscaler to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone Name of the zone for this request.
    * @param {().Autoscaler} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceAutoscalersUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceAutoscalersUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceAutoscalersUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceAutoscalersUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceAutoscalersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
