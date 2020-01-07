package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regionurlmaps")
@js.native
class Resource$Regionurlmaps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionUrlMaps.delete
    * @desc Deletes the specified UrlMap resource.
    * @alias compute.regionUrlMaps.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
    * @param {string} params.urlMap Name of the UrlMap resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegionurlmapsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegionurlmapsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRegionurlmapsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegionurlmapsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegionurlmapsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.get
    * @desc Returns the specified UrlMap resource. Gets a list of available URL
    * maps by making a list() request.
    * @alias compute.regionUrlMaps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string} params.urlMap Name of the UrlMap resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UrlMap] = js.native
  def get(callback: BodyResponseCallback[Schema$UrlMap]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegionurlmapsDollarGet): GaxiosPromise[Schema$UrlMap] = js.native
  def get(
    params: ParamsDollarResourceDollarRegionurlmapsDollarGet,
    callback: BodyResponseCallback[Schema$UrlMap]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRegionurlmapsDollarGet,
    options: BodyResponseCallback[Schema$UrlMap],
    callback: BodyResponseCallback[Schema$UrlMap]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegionurlmapsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UrlMap] = js.native
  def get(
    params: ParamsDollarResourceDollarRegionurlmapsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlMap]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.insert
    * @desc Creates a UrlMap resource in the specified project using the data
    * included in the request.
    * @alias compute.regionUrlMaps.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
    * @param {().UrlMap} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegionurlmapsDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegionurlmapsDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRegionurlmapsDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegionurlmapsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegionurlmapsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.invalidateCache
    * @desc Initiates a cache invalidation operation, invalidating the
    * specified path, scoped to the specified UrlMap.
    * @alias compute.regionUrlMaps.invalidateCache
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
    * @param {string} params.urlMap Name of the UrlMap scoping this request.
    * @param {().CacheInvalidationRule} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def invalidateCache(): GaxiosPromise[Schema$Operation] = js.native
  def invalidateCache(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def invalidateCache(params: ParamsDollarResourceDollarRegionurlmapsDollarInvalidatecache): GaxiosPromise[Schema$Operation] = js.native
  def invalidateCache(
    params: ParamsDollarResourceDollarRegionurlmapsDollarInvalidatecache,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def invalidateCache(
    params: ParamsDollarResourceDollarRegionurlmapsDollarInvalidatecache,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def invalidateCache(params: ParamsDollarResourceDollarRegionurlmapsDollarInvalidatecache, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def invalidateCache(
    params: ParamsDollarResourceDollarRegionurlmapsDollarInvalidatecache,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.list
    * @desc Retrieves the list of UrlMap resources available to the specified
    * project in the specified region.
    * @alias compute.regionUrlMaps.list
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
  def list(): GaxiosPromise[Schema$UrlMapList] = js.native
  def list(callback: BodyResponseCallback[Schema$UrlMapList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegionurlmapsDollarList): GaxiosPromise[Schema$UrlMapList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegionurlmapsDollarList,
    callback: BodyResponseCallback[Schema$UrlMapList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRegionurlmapsDollarList,
    options: BodyResponseCallback[Schema$UrlMapList],
    callback: BodyResponseCallback[Schema$UrlMapList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegionurlmapsDollarList, options: MethodOptions): GaxiosPromise[Schema$UrlMapList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegionurlmapsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlMapList]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.patch
    * @desc Patches the specified UrlMap resource with the data included in the
    * request. This method supports PATCH semantics and uses JSON merge patch
    * format and processing rules.
    * @alias compute.regionUrlMaps.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
    * @param {string} params.urlMap Name of the UrlMap resource to patch.
    * @param {().UrlMap} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRegionurlmapsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarRegionurlmapsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarRegionurlmapsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRegionurlmapsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarRegionurlmapsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionUrlMaps.testIamPermissions
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
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarRegionurlmapsDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegionurlmapsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegionurlmapsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarRegionurlmapsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegionurlmapsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.update
    * @desc Updates the specified UrlMap resource with the data included in the
    * request.
    * @alias compute.regionUrlMaps.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId begin_interface: MixerMutationRequestBuilder Request ID to support idempotency.
    * @param {string} params.urlMap Name of the UrlMap resource to update.
    * @param {().UrlMap} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRegionurlmapsDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarRegionurlmapsDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRegionurlmapsDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRegionurlmapsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarRegionurlmapsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionUrlMaps.validate
    * @desc Runs static validation for the UrlMap. In particular, the tests of
    * the provided UrlMap will be run. Calling this method does NOT create the
    * UrlMap.
    * @alias compute.regionUrlMaps.validate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string} params.urlMap Name of the UrlMap resource to be validated as.
    * @param {().RegionUrlMapsValidateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def validate(): GaxiosPromise[Schema$UrlMapsValidateResponse] = js.native
  def validate(callback: BodyResponseCallback[Schema$UrlMapsValidateResponse]): Unit = js.native
  def validate(params: ParamsDollarResourceDollarRegionurlmapsDollarValidate): GaxiosPromise[Schema$UrlMapsValidateResponse] = js.native
  def validate(
    params: ParamsDollarResourceDollarRegionurlmapsDollarValidate,
    callback: BodyResponseCallback[Schema$UrlMapsValidateResponse]
  ): Unit = js.native
  def validate(
    params: ParamsDollarResourceDollarRegionurlmapsDollarValidate,
    options: BodyResponseCallback[Schema$UrlMapsValidateResponse],
    callback: BodyResponseCallback[Schema$UrlMapsValidateResponse]
  ): Unit = js.native
  def validate(params: ParamsDollarResourceDollarRegionurlmapsDollarValidate, options: MethodOptions): GaxiosPromise[Schema$UrlMapsValidateResponse] = js.native
  def validate(
    params: ParamsDollarResourceDollarRegionurlmapsDollarValidate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlMapsValidateResponse]
  ): Unit = js.native
}

