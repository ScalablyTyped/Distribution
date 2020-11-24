package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Targetsslproxies")
@js.native
class ResourceTargetsslproxies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.targetSslProxies.delete
    * @desc Deletes the specified TargetSslProxy resource.
    * @alias compute.targetSslProxies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetSslProxy Name of the TargetSslProxy resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTargetsslproxiesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceTargetsslproxiesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceTargetsslproxiesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceTargetsslproxiesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceTargetsslproxiesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.get
    * @desc Returns the specified TargetSslProxy resource. Gets a list of
    * available target SSL proxies by making a list() request.
    * @alias compute.targetSslProxies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.targetSslProxy Name of the TargetSslProxy resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTargetSslProxy] = js.native
  def get(callback: BodyResponseCallback[SchemaTargetSslProxy]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetSslProxy] = js.native
  def get(params: ParamsResourceTargetsslproxiesGet): GaxiosPromise[SchemaTargetSslProxy] = js.native
  def get(params: ParamsResourceTargetsslproxiesGet, callback: BodyResponseCallback[SchemaTargetSslProxy]): Unit = js.native
  def get(
    params: ParamsResourceTargetsslproxiesGet,
    options: BodyResponseCallback[SchemaTargetSslProxy],
    callback: BodyResponseCallback[SchemaTargetSslProxy]
  ): Unit = js.native
  def get(params: ParamsResourceTargetsslproxiesGet, options: MethodOptions): GaxiosPromise[SchemaTargetSslProxy] = js.native
  def get(
    params: ParamsResourceTargetsslproxiesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetSslProxy]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.insert
    * @desc Creates a TargetSslProxy resource in the specified project using
    * the data included in the request.
    * @alias compute.targetSslProxies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().TargetSslProxy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTargetsslproxiesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceTargetsslproxiesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceTargetsslproxiesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceTargetsslproxiesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceTargetsslproxiesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.list
    * @desc Retrieves the list of TargetSslProxy resources available to the
    * specified project.
    * @alias compute.targetSslProxies.list
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
  def list(): GaxiosPromise[SchemaTargetSslProxyList] = js.native
  def list(callback: BodyResponseCallback[SchemaTargetSslProxyList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTargetSslProxyList] = js.native
  def list(params: ParamsResourceTargetsslproxiesList): GaxiosPromise[SchemaTargetSslProxyList] = js.native
  def list(
    params: ParamsResourceTargetsslproxiesList,
    callback: BodyResponseCallback[SchemaTargetSslProxyList]
  ): Unit = js.native
  def list(
    params: ParamsResourceTargetsslproxiesList,
    options: BodyResponseCallback[SchemaTargetSslProxyList],
    callback: BodyResponseCallback[SchemaTargetSslProxyList]
  ): Unit = js.native
  def list(params: ParamsResourceTargetsslproxiesList, options: MethodOptions): GaxiosPromise[SchemaTargetSslProxyList] = js.native
  def list(
    params: ParamsResourceTargetsslproxiesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTargetSslProxyList]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.setBackendService
    * @desc Changes the BackendService for TargetSslProxy.
    * @alias compute.targetSslProxies.setBackendService
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetSslProxy Name of the TargetSslProxy resource whose BackendService resource is to be set.
    * @param {().TargetSslProxiesSetBackendServiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setBackendService(): GaxiosPromise[SchemaOperation] = js.native
  def setBackendService(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setBackendService(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setBackendService(params: ParamsResourceTargetsslproxiesSetbackendservice): GaxiosPromise[SchemaOperation] = js.native
  def setBackendService(
    params: ParamsResourceTargetsslproxiesSetbackendservice,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setBackendService(
    params: ParamsResourceTargetsslproxiesSetbackendservice,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setBackendService(params: ParamsResourceTargetsslproxiesSetbackendservice, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setBackendService(
    params: ParamsResourceTargetsslproxiesSetbackendservice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.setProxyHeader
    * @desc Changes the ProxyHeaderType for TargetSslProxy.
    * @alias compute.targetSslProxies.setProxyHeader
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetSslProxy Name of the TargetSslProxy resource whose ProxyHeader is to be set.
    * @param {().TargetSslProxiesSetProxyHeaderRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setProxyHeader(): GaxiosPromise[SchemaOperation] = js.native
  def setProxyHeader(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setProxyHeader(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setProxyHeader(params: ParamsResourceTargetsslproxiesSetproxyheader): GaxiosPromise[SchemaOperation] = js.native
  def setProxyHeader(
    params: ParamsResourceTargetsslproxiesSetproxyheader,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setProxyHeader(
    params: ParamsResourceTargetsslproxiesSetproxyheader,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setProxyHeader(params: ParamsResourceTargetsslproxiesSetproxyheader, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setProxyHeader(
    params: ParamsResourceTargetsslproxiesSetproxyheader,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.setSslCertificates
    * @desc Changes SslCertificates for TargetSslProxy.
    * @alias compute.targetSslProxies.setSslCertificates
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetSslProxy Name of the TargetSslProxy resource whose SslCertificate resource is to be set.
    * @param {().TargetSslProxiesSetSslCertificatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslCertificates(): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSslCertificates(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(params: ParamsResourceTargetsslproxiesSetsslcertificates): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(
    params: ParamsResourceTargetsslproxiesSetsslcertificates,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslCertificates(
    params: ParamsResourceTargetsslproxiesSetsslcertificates,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslCertificates(params: ParamsResourceTargetsslproxiesSetsslcertificates, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslCertificates(
    params: ParamsResourceTargetsslproxiesSetsslcertificates,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.setSslPolicy
    * @desc Sets the SSL policy for TargetSslProxy. The SSL policy specifies
    * the server-side support for SSL features. This affects connections
    * between clients and the SSL proxy load balancer. They do not affect the
    * connection between the load balancer and the backends.
    * @alias compute.targetSslProxies.setSslPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.targetSslProxy Name of the TargetSslProxy resource whose SSL policy is to be set. The name must be 1-63 characters long, and comply with RFC1035.
    * @param {().SslPolicyReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setSslPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setSslPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(params: ParamsResourceTargetsslproxiesSetsslpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(
    params: ParamsResourceTargetsslproxiesSetsslpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslPolicy(
    params: ParamsResourceTargetsslproxiesSetsslpolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setSslPolicy(params: ParamsResourceTargetsslproxiesSetsslpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setSslPolicy(
    params: ParamsResourceTargetsslproxiesSetsslpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.targetSslProxies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.targetSslProxies.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceTargetsslproxiesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargetsslproxiesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceTargetsslproxiesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceTargetsslproxiesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceTargetsslproxiesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}
