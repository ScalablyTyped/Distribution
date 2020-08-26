package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Backendbuckets")
@js.native
class ResourceBackendbuckets protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.backendBuckets.addSignedUrlKey
    * @desc Adds a key for validating requests with signed URLs for this
    * backend bucket.
    * @alias compute.backendBuckets.addSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().SignedUrlKey} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addSignedUrlKey(): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addSignedUrlKey(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(params: ParamsResourceBackendbucketsAddsignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendbucketsAddsignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendbucketsAddsignedurlkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addSignedUrlKey(params: ParamsResourceBackendbucketsAddsignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addSignedUrlKey(
    params: ParamsResourceBackendbucketsAddsignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.backendBuckets.delete
    * @desc Deletes the specified BackendBucket resource.
    * @alias compute.backendBuckets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendbucketsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceBackendbucketsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceBackendbucketsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceBackendbucketsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceBackendbucketsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.backendBuckets.deleteSignedUrlKey
    * @desc Deletes a key for validating requests with signed URLs for this
    * backend bucket.
    * @alias compute.backendBuckets.deleteSignedUrlKey
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to which the Signed URL Key should be added. The name should conform to RFC1035.
    * @param {string} params.keyName The name of the Signed URL Key to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteSignedUrlKey(): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteSignedUrlKey(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendbucketsDeletesignedurlkey): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendbucketsDeletesignedurlkey,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendbucketsDeletesignedurlkey,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSignedUrlKey(params: ParamsResourceBackendbucketsDeletesignedurlkey, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSignedUrlKey(
    params: ParamsResourceBackendbucketsDeletesignedurlkey,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.backendBuckets.get
    * @desc Returns the specified BackendBucket resource. Gets a list of
    * available backend buckets by making a list() request.
    * @alias compute.backendBuckets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(callback: BodyResponseCallback[SchemaBackendBucket]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(params: ParamsResourceBackendbucketsGet): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(params: ParamsResourceBackendbucketsGet, callback: BodyResponseCallback[SchemaBackendBucket]): Unit = js.native
  def get(
    params: ParamsResourceBackendbucketsGet,
    options: BodyResponseCallback[SchemaBackendBucket],
    callback: BodyResponseCallback[SchemaBackendBucket]
  ): Unit = js.native
  def get(params: ParamsResourceBackendbucketsGet, options: MethodOptions): GaxiosPromise[SchemaBackendBucket] = js.native
  def get(
    params: ParamsResourceBackendbucketsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendBucket]
  ): Unit = js.native
  /**
    * compute.backendBuckets.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.backendBuckets.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBackendbucketsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceBackendbucketsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceBackendbucketsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceBackendbucketsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceBackendbucketsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * compute.backendBuckets.insert
    * @desc Creates a BackendBucket resource in the specified project using the
    * data included in the request.
    * @alias compute.backendBuckets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendBucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendbucketsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceBackendbucketsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceBackendbucketsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceBackendbucketsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceBackendbucketsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.backendBuckets.list
    * @desc Retrieves the list of BackendBucket resources available to the
    * specified project.
    * @alias compute.backendBuckets.list
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
  def list(): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(callback: BodyResponseCallback[SchemaBackendBucketList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(params: ParamsResourceBackendbucketsList): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(params: ParamsResourceBackendbucketsList, callback: BodyResponseCallback[SchemaBackendBucketList]): Unit = js.native
  def list(
    params: ParamsResourceBackendbucketsList,
    options: BodyResponseCallback[SchemaBackendBucketList],
    callback: BodyResponseCallback[SchemaBackendBucketList]
  ): Unit = js.native
  def list(params: ParamsResourceBackendbucketsList, options: MethodOptions): GaxiosPromise[SchemaBackendBucketList] = js.native
  def list(
    params: ParamsResourceBackendbucketsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBackendBucketList]
  ): Unit = js.native
  /**
    * compute.backendBuckets.patch
    * @desc Updates the specified BackendBucket resource with the data included
    * in the request. This method supports PATCH semantics and uses the JSON
    * merge patch format and processing rules.
    * @alias compute.backendBuckets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to patch.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendBucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendbucketsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceBackendbucketsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceBackendbucketsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceBackendbucketsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceBackendbucketsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.backendBuckets.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.backendBuckets.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().GlobalSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBackendbucketsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceBackendbucketsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceBackendbucketsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceBackendbucketsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceBackendbucketsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * compute.backendBuckets.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.backendBuckets.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceBackendbucketsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendbucketsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceBackendbucketsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceBackendbucketsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceBackendbucketsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.backendBuckets.update
    * @desc Updates the specified BackendBucket resource with the data included
    * in the request.
    * @alias compute.backendBuckets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.backendBucket Name of the BackendBucket resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().BackendBucket} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendbucketsUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceBackendbucketsUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceBackendbucketsUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceBackendbucketsUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceBackendbucketsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

