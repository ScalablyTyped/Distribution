package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Targethttpproxies")
@js.native
class ResourceTargethttpproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.targetHttpProxies.aggregatedList
    * @desc Retrieves the list of all TargetHttpProxy resources, regional and
    * global, available to the specified project.
    * @alias compute.targetHttpProxies.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaTargetHttpProxyAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaTargetHttpProxyAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetHttpProxyAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceTargethttpproxiesAggregatedlist): GaxiosPromise[SchemaTargetHttpProxyAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceTargethttpproxiesAggregatedlist,
    callback: BodyResponseCallback[SchemaTargetHttpProxyAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceTargethttpproxiesAggregatedlist,
    options: BodyResponseCallback[SchemaTargetHttpProxyAggregatedList],
    callback: BodyResponseCallback[SchemaTargetHttpProxyAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceTargethttpproxiesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaTargetHttpProxyAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceTargethttpproxiesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpProxyAggregatedList]
  ): Unit = js.native
  /**
    * compute.targetHttpProxies.delete
    * @desc Deletes the specified TargetHttpProxy resource.
    * @alias compute.targetHttpProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpProxy Name of the TargetHttpProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTargethttpproxiesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTargethttpproxiesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceTargethttpproxiesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceTargethttpproxiesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceTargethttpproxiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpProxies.get
    * @desc Returns the specified TargetHttpProxy resource. Gets a list of
    * available target HTTP proxies by making a list() request.
    * @alias compute.targetHttpProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.targetHttpProxy Name of the TargetHttpProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetHttpProxy] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetHttpProxy]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetHttpProxy] = js.native
  def get(params: ParamsResourceTargethttpproxiesGet): GaxiosPromise[SchemaTargetHttpProxy] = js.native
  def get(params: ParamsResourceTargethttpproxiesGet, callback: BodyResponseCallback[SchemaTargetHttpProxy]): Unit = js.native
  def get(
    params: ParamsResourceTargethttpproxiesGet,
    options: BodyResponseCallback[SchemaTargetHttpProxy],
    callback: BodyResponseCallback[SchemaTargetHttpProxy]
  ): Unit = js.native
  def get(params: ParamsResourceTargethttpproxiesGet, options: MethodOptions): GaxiosPromise[SchemaTargetHttpProxy] = js.native
  def get(
    params: ParamsResourceTargethttpproxiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpProxy]
  ): Unit = js.native
  /**
    * compute.targetHttpProxies.insert
    * @desc Creates a TargetHttpProxy resource in the specified project using
    * the data included in the request.
    * @alias compute.targetHttpProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetHttpProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTargethttpproxiesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTargethttpproxiesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceTargethttpproxiesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceTargethttpproxiesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceTargethttpproxiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpProxies.list
    * @desc Retrieves the list of TargetHttpProxy resources available to the
    * specified project.
    * @alias compute.targetHttpProxies.list
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
  def list(): GaxiosPromise[SchemaTargetHttpProxyList] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetHttpProxyList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetHttpProxyList] = js.native
  def list(params: ParamsResourceTargethttpproxiesList): GaxiosPromise[SchemaTargetHttpProxyList] = js.native
  def list(
    params: ParamsResourceTargethttpproxiesList,
    callback: BodyResponseCallback[SchemaTargetHttpProxyList]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargethttpproxiesList,
    options: BodyResponseCallback[SchemaTargetHttpProxyList],
    callback: BodyResponseCallback[SchemaTargetHttpProxyList]
  ): Unit = js.native
  def list(params: ParamsResourceTargethttpproxiesList, options: MethodOptions): GaxiosPromise[SchemaTargetHttpProxyList] = js.native
  def list(
    params: ParamsResourceTargethttpproxiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpProxyList]
  ): Unit = js.native
  /**
    * compute.targetHttpProxies.setUrlMap
    * @desc Changes the URL map for TargetHttpProxy.
    * @alias compute.targetHttpProxies.setUrlMap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpProxy Name of the TargetHttpProxy to set a URL map for.
    * @param {().UrlMapReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUrlMap(): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setUrlMap(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(params: ParamsResourceTargethttpproxiesSeturlmap): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(params: ParamsResourceTargethttpproxiesSeturlmap, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setUrlMap(
    params: ParamsResourceTargethttpproxiesSeturlmap,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setUrlMap(params: ParamsResourceTargethttpproxiesSeturlmap, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(
    params: ParamsResourceTargethttpproxiesSeturlmap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.targetHttpProxies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.targetHttpProxies.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceTargethttpproxiesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargethttpproxiesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceTargethttpproxiesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceTargethttpproxiesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargethttpproxiesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

