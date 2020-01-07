package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regiontargethttpproxies")
@js.native
class Resource$Regiontargethttpproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionTargetHttpProxies.delete
    * @desc Deletes the specified TargetHttpProxy resource.
    * @alias compute.regionTargetHttpProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpProxy Name of the TargetHttpProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpProxies.get
    * @desc Returns the specified TargetHttpProxy resource in the specified
    * region. Gets a list of available target HTTP proxies by making a list()
    * request.
    * @alias compute.regionTargetHttpProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string} params.targetHttpProxy Name of the TargetHttpProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TargetHttpProxy] = js.native
  def get(callback: BodyResponseCallback[Schema$TargetHttpProxy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarGet): GaxiosPromise[Schema$TargetHttpProxy] = js.native
  def get(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarGet,
    callback: BodyResponseCallback[Schema$TargetHttpProxy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarGet,
    options: BodyResponseCallback[Schema$TargetHttpProxy],
    callback: BodyResponseCallback[Schema$TargetHttpProxy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$TargetHttpProxy] = js.native
  def get(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetHttpProxy]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpProxies.insert
    * @desc Creates a TargetHttpProxy resource in the specified project and
    * region using the data included in the request.
    * @alias compute.regionTargetHttpProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetHttpProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpProxies.list
    * @desc Retrieves the list of TargetHttpProxy resources available to the
    * specified project in the specified region.
    * @alias compute.regionTargetHttpProxies.list
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
  def list(): GaxiosPromise[Schema$TargetHttpProxyList] = js.native
  def list(callback: BodyResponseCallback[Schema$TargetHttpProxyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarList): GaxiosPromise[Schema$TargetHttpProxyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarList,
    callback: BodyResponseCallback[Schema$TargetHttpProxyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarList,
    options: BodyResponseCallback[Schema$TargetHttpProxyList],
    callback: BodyResponseCallback[Schema$TargetHttpProxyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarList, options: MethodOptions): GaxiosPromise[Schema$TargetHttpProxyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TargetHttpProxyList]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpProxies.setUrlMap
    * @desc Changes the URL map for TargetHttpProxy.
    * @alias compute.regionTargetHttpProxies.setUrlMap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpProxy Name of the TargetHttpProxy to set a URL map for.
    * @param {().UrlMapReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUrlMap(): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setUrlMap(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarSeturlmap): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarSeturlmap,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarSeturlmap,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setUrlMap(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarSeturlmap, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setUrlMap(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarSeturlmap,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpProxies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionTargetHttpProxies.testIamPermissions
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
  def testIamPermissions(params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiontargethttpproxiesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

