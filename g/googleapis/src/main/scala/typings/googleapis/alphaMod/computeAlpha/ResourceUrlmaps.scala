package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Urlmaps")
@js.native
class ResourceUrlmaps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.urlMaps.aggregatedList
    * @desc Retrieves the list of all UrlMap resources, regional and global,
    * available to the specified project.
    * @alias compute.urlMaps.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaUrlMapsAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaUrlMapsAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlMapsAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceUrlmapsAggregatedlist): GaxiosPromise[SchemaUrlMapsAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceUrlmapsAggregatedlist,
    callback: BodyResponseCallback[SchemaUrlMapsAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceUrlmapsAggregatedlist,
    options: BodyResponseCallback[SchemaUrlMapsAggregatedList],
    callback: BodyResponseCallback[SchemaUrlMapsAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceUrlmapsAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaUrlMapsAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceUrlmapsAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlMapsAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.urlMaps.delete
    * @desc Deletes the specified UrlMap resource.
    * @alias compute.urlMaps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.urlMap Name of the UrlMap resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceUrlmapsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceUrlmapsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceUrlmapsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceUrlmapsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceUrlmapsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.get
    * @desc Returns the specified UrlMap resource. Gets a list of available URL
    * maps by making a list() request.
    * @alias compute.urlMaps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.urlMap Name of the UrlMap resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaUrlMap] = js.native
  def get(callback: BodyResponseCallback[SchemaUrlMap]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlMap] = js.native
  def get(params: ParamsResourceUrlmapsGet): GaxiosPromise[SchemaUrlMap] = js.native
  def get(params: ParamsResourceUrlmapsGet, callback: BodyResponseCallback[SchemaUrlMap]): Unit = js.native
  def get(
    params: ParamsResourceUrlmapsGet,
    options: BodyResponseCallback[SchemaUrlMap],
    callback: BodyResponseCallback[SchemaUrlMap]
  ): Unit = js.native
  def get(params: ParamsResourceUrlmapsGet, options: MethodOptions): GaxiosPromise[SchemaUrlMap] = js.native
  def get(
    params: ParamsResourceUrlmapsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlMap]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.insert
    * @desc Creates a UrlMap resource in the specified project using the data
    * included in the request.
    * @alias compute.urlMaps.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().UrlMap} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceUrlmapsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceUrlmapsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceUrlmapsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceUrlmapsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceUrlmapsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.invalidateCache
    * @desc Initiates a cache invalidation operation, invalidating the
    * specified path, scoped to the specified UrlMap.
    * @alias compute.urlMaps.invalidateCache
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.urlMap Name of the UrlMap scoping this request.
    * @param {().CacheInvalidationRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def invalidateCache(): GaxiosPromise[SchemaOperation] = js.native
  def invalidateCache(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def invalidateCache(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def invalidateCache(params: ParamsResourceUrlmapsInvalidatecache): GaxiosPromise[SchemaOperation] = js.native
  def invalidateCache(params: ParamsResourceUrlmapsInvalidatecache, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def invalidateCache(
    params: ParamsResourceUrlmapsInvalidatecache,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def invalidateCache(params: ParamsResourceUrlmapsInvalidatecache, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def invalidateCache(
    params: ParamsResourceUrlmapsInvalidatecache,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.list
    * @desc Retrieves the list of UrlMap resources available to the specified
    * project.
    * @alias compute.urlMaps.list
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
  def list(): GaxiosPromise[SchemaUrlMapList] = js.native
  def list(callback: BodyResponseCallback[SchemaUrlMapList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlMapList] = js.native
  def list(params: ParamsResourceUrlmapsList): GaxiosPromise[SchemaUrlMapList] = js.native
  def list(params: ParamsResourceUrlmapsList, callback: BodyResponseCallback[SchemaUrlMapList]): Unit = js.native
  def list(
    params: ParamsResourceUrlmapsList,
    options: BodyResponseCallback[SchemaUrlMapList],
    callback: BodyResponseCallback[SchemaUrlMapList]
  ): Unit = js.native
  def list(params: ParamsResourceUrlmapsList, options: MethodOptions): GaxiosPromise[SchemaUrlMapList] = js.native
  def list(
    params: ParamsResourceUrlmapsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlMapList]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.patch
    * @desc Patches the specified UrlMap resource with the data included in the
    * request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    * @alias compute.urlMaps.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.urlMap Name of the UrlMap resource to patch.
    * @param {().UrlMap} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceUrlmapsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceUrlmapsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceUrlmapsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceUrlmapsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceUrlmapsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.urlMaps.testIamPermissions
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
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceUrlmapsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceUrlmapsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceUrlmapsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceUrlmapsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceUrlmapsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.update
    * @desc Updates the specified UrlMap resource with the data included in the
    * request.
    * @alias compute.urlMaps.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.urlMap Name of the UrlMap resource to update.
    * @param {().UrlMap} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceUrlmapsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceUrlmapsUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceUrlmapsUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceUrlmapsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceUrlmapsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.urlMaps.validate
    * @desc Runs static validation for the UrlMap. In particular, the tests of
    * the provided UrlMap will be run. Calling this method does NOT create the
    * UrlMap.
    * @alias compute.urlMaps.validate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.urlMap Name of the UrlMap resource to be validated as.
    * @param {().UrlMapsValidateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def validate(): GaxiosPromise[SchemaUrlMapsValidateResponse] = js.native
  def validate(callback: BodyResponseCallback[SchemaUrlMapsValidateResponse]): Unit = js.native
  def validate(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUrlMapsValidateResponse] = js.native
  def validate(params: ParamsResourceUrlmapsValidate): GaxiosPromise[SchemaUrlMapsValidateResponse] = js.native
  def validate(
    params: ParamsResourceUrlmapsValidate,
    callback: BodyResponseCallback[SchemaUrlMapsValidateResponse]
  ): Unit = js.native
  def validate(
    params: ParamsResourceUrlmapsValidate,
    options: BodyResponseCallback[SchemaUrlMapsValidateResponse],
    callback: BodyResponseCallback[SchemaUrlMapsValidateResponse]
  ): Unit = js.native
  def validate(params: ParamsResourceUrlmapsValidate, options: MethodOptions): GaxiosPromise[SchemaUrlMapsValidateResponse] = js.native
  def validate(
    params: ParamsResourceUrlmapsValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUrlMapsValidateResponse]
  ): Unit = js.native
}
