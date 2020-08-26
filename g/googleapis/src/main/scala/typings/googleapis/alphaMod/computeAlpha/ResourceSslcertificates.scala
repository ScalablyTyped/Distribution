package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Sslcertificates")
@js.native
class ResourceSslcertificates protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.sslCertificates.aggregatedList
    * @desc Retrieves the list of all SslCertificate resources, regional and
    * global, available to the specified project.
    * @alias compute.sslCertificates.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaSslCertificateAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaSslCertificateAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSslCertificateAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceSslcertificatesAggregatedlist): GaxiosPromise[SchemaSslCertificateAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceSslcertificatesAggregatedlist,
    callback: BodyResponseCallback[SchemaSslCertificateAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceSslcertificatesAggregatedlist,
    options: BodyResponseCallback[SchemaSslCertificateAggregatedList],
    callback: BodyResponseCallback[SchemaSslCertificateAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceSslcertificatesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaSslCertificateAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceSslcertificatesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertificateAggregatedList]
  ): Unit = js.native
  /**
    * compute.sslCertificates.delete
    * @desc Deletes the specified SslCertificate resource.
    * @alias compute.sslCertificates.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.sslCertificate Name of the SslCertificate resource to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSslcertificatesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSslcertificatesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceSslcertificatesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSslcertificatesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSslcertificatesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.sslCertificates.get
    * @desc Returns the specified SslCertificate resource. Gets a list of
    * available SSL certificates by making a list() request.
    * @alias compute.sslCertificates.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.sslCertificate Name of the SslCertificate resource to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaSslCertificate] = js.native
  def get(callback: BodyResponseCallback[SchemaSslCertificate]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSslCertificate] = js.native
  def get(params: ParamsResourceSslcertificatesGet): GaxiosPromise[SchemaSslCertificate] = js.native
  def get(params: ParamsResourceSslcertificatesGet, callback: BodyResponseCallback[SchemaSslCertificate]): Unit = js.native
  def get(
    params: ParamsResourceSslcertificatesGet,
    options: BodyResponseCallback[SchemaSslCertificate],
    callback: BodyResponseCallback[SchemaSslCertificate]
  ): Unit = js.native
  def get(params: ParamsResourceSslcertificatesGet, options: MethodOptions): GaxiosPromise[SchemaSslCertificate] = js.native
  def get(
    params: ParamsResourceSslcertificatesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertificate]
  ): Unit = js.native
  /**
    * compute.sslCertificates.insert
    * @desc Creates a SslCertificate resource in the specified project using
    * the data included in the request.
    * @alias compute.sslCertificates.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SslCertificate} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceSslcertificatesInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceSslcertificatesInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceSslcertificatesInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceSslcertificatesInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceSslcertificatesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.sslCertificates.list
    * @desc Retrieves the list of SslCertificate resources available to the
    * specified project.
    * @alias compute.sslCertificates.list
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
  def list(): GaxiosPromise[SchemaSslCertificateList] = js.native
  def list(callback: BodyResponseCallback[SchemaSslCertificateList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSslCertificateList] = js.native
  def list(params: ParamsResourceSslcertificatesList): GaxiosPromise[SchemaSslCertificateList] = js.native
  def list(
    params: ParamsResourceSslcertificatesList,
    callback: BodyResponseCallback[SchemaSslCertificateList]
  ): Unit = js.native
  def list(
    params: ParamsResourceSslcertificatesList,
    options: BodyResponseCallback[SchemaSslCertificateList],
    callback: BodyResponseCallback[SchemaSslCertificateList]
  ): Unit = js.native
  def list(params: ParamsResourceSslcertificatesList, options: MethodOptions): GaxiosPromise[SchemaSslCertificateList] = js.native
  def list(
    params: ParamsResourceSslcertificatesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSslCertificateList]
  ): Unit = js.native
  /**
    * compute.sslCertificates.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.sslCertificates.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceSslcertificatesTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceSslcertificatesTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceSslcertificatesTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceSslcertificatesTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceSslcertificatesTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

