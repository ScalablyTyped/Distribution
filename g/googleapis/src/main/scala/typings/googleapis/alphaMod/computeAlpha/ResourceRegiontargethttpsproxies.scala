package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regiontargethttpsproxies")
@js.native
class ResourceRegiontargethttpsproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionTargetHttpsProxies.delete
    * @desc Deletes the specified TargetHttpsProxy resource.
    * @alias compute.regionTargetHttpsProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceRegiontargethttpsproxiesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegiontargethttpsproxiesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceRegiontargethttpsproxiesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRegiontargethttpsproxiesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegiontargethttpsproxiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.get
    * @desc Returns the specified TargetHttpsProxy resource in the specified
    * region. Gets a list of available target HTTP proxies by making a list()
    * request.
    * @alias compute.regionTargetHttpsProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetHttpsProxy] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetHttpsProxy]): Unit = js.native
  def get(params: ParamsResourceRegiontargethttpsproxiesGet): GaxiosPromise[SchemaTargetHttpsProxy] = js.native
  def get(
    params: ParamsResourceRegiontargethttpsproxiesGet,
    callback: BodyResponseCallback[SchemaTargetHttpsProxy]
  ): Unit = js.native
  def get(
    params: ParamsResourceRegiontargethttpsproxiesGet,
    options: BodyResponseCallback[SchemaTargetHttpsProxy],
    callback: BodyResponseCallback[SchemaTargetHttpsProxy]
  ): Unit = js.native
  def get(params: ParamsResourceRegiontargethttpsproxiesGet, options: MethodOptions): GaxiosPromise[SchemaTargetHttpsProxy] = js.native
  def get(
    params: ParamsResourceRegiontargethttpsproxiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpsProxy]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.insert
    * @desc Creates a TargetHttpsProxy resource in the specified project and
    * region using the data included in the request.
    * @alias compute.regionTargetHttpsProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetHttpsProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceRegiontargethttpsproxiesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegiontargethttpsproxiesInsert,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(
    params: ParamsResourceRegiontargethttpsproxiesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegiontargethttpsproxiesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegiontargethttpsproxiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.list
    * @desc Retrieves the list of TargetHttpsProxy resources available to the
    * specified project in the specified region.
    * @alias compute.regionTargetHttpsProxies.list
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
  def list(): GaxiosPromise[SchemaTargetHttpsProxyList] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetHttpsProxyList]): Unit = js.native
  def list(params: ParamsResourceRegiontargethttpsproxiesList): GaxiosPromise[SchemaTargetHttpsProxyList] = js.native
  def list(
    params: ParamsResourceRegiontargethttpsproxiesList,
    callback: BodyResponseCallback[SchemaTargetHttpsProxyList]
  ): Unit = js.native
  def list(
    params: ParamsResourceRegiontargethttpsproxiesList,
    options: BodyResponseCallback[SchemaTargetHttpsProxyList],
    callback: BodyResponseCallback[SchemaTargetHttpsProxyList]
  ): Unit = js.native
  def list(params: ParamsResourceRegiontargethttpsproxiesList, options: MethodOptions): GaxiosPromise[SchemaTargetHttpsProxyList] = js.native
  def list(
    params: ParamsResourceRegiontargethttpsproxiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetHttpsProxyList]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.setSslCertificates
    * @desc Replaces SslCertificates for TargetHttpsProxy.
    * @alias compute.regionTargetHttpsProxies.setSslCertificates
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy resource to set an SslCertificates resource for.
    * @param {().RegionTargetHttpsProxiesSetSslCertificatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslCertificates(): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSslCertificates(params: ParamsResourceRegiontargethttpsproxiesSetsslcertificates): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(
    params: ParamsResourceRegiontargethttpsproxiesSetsslcertificates,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsResourceRegiontargethttpsproxiesSetsslcertificates,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslCertificates(params: ParamsResourceRegiontargethttpsproxiesSetsslcertificates, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(
    params: ParamsResourceRegiontargethttpsproxiesSetsslcertificates,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.setUrlMap
    * @desc Changes the URL map for TargetHttpsProxy.
    * @alias compute.regionTargetHttpsProxies.setUrlMap
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetHttpsProxy Name of the TargetHttpsProxy to set a URL map for.
    * @param {().UrlMapReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUrlMap(): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setUrlMap(params: ParamsResourceRegiontargethttpsproxiesSeturlmap): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(
    params: ParamsResourceRegiontargethttpsproxiesSeturlmap,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setUrlMap(
    params: ParamsResourceRegiontargethttpsproxiesSeturlmap,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setUrlMap(params: ParamsResourceRegiontargethttpsproxiesSeturlmap, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setUrlMap(
    params: ParamsResourceRegiontargethttpsproxiesSeturlmap,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionTargetHttpsProxies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionTargetHttpsProxies.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceRegiontargethttpsproxiesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegiontargethttpsproxiesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegiontargethttpsproxiesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegiontargethttpsproxiesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegiontargethttpsproxiesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

