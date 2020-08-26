package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regiondisks")
@js.native
class ResourceRegiondisks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionDisks.addResourcePolicies
    * @desc Adds existing resource policies to a regional disk. You can only
    * add one policy which will be applied to this disk for scheduling snapshot
    * creation.
    * @alias compute.regionDisks.addResourcePolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disk The disk name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionDisksAddResourcePoliciesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addResourcePolicies(): GaxiosPromise[SchemaOperation] = js.native
  def addResourcePolicies(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addResourcePolicies(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addResourcePolicies(params: ParamsResourceRegiondisksAddresourcepolicies): GaxiosPromise[SchemaOperation] = js.native
  def addResourcePolicies(
    params: ParamsResourceRegiondisksAddresourcepolicies,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addResourcePolicies(
    params: ParamsResourceRegiondisksAddresourcepolicies,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addResourcePolicies(params: ParamsResourceRegiondisksAddresourcepolicies, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addResourcePolicies(
    params: ParamsResourceRegiondisksAddresourcepolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.createSnapshot
    * @desc Creates a snapshot of this regional disk.
    * @alias compute.regionDisks.createSnapshot
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disk Name of the regional persistent disk to snapshot.
    * @param {boolean=} params.guestFlush
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Snapshot} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createSnapshot(): GaxiosPromise[SchemaOperation] = js.native
  def createSnapshot(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def createSnapshot(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def createSnapshot(params: ParamsResourceRegiondisksCreatesnapshot): GaxiosPromise[SchemaOperation] = js.native
  def createSnapshot(params: ParamsResourceRegiondisksCreatesnapshot, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def createSnapshot(
    params: ParamsResourceRegiondisksCreatesnapshot,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def createSnapshot(params: ParamsResourceRegiondisksCreatesnapshot, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def createSnapshot(
    params: ParamsResourceRegiondisksCreatesnapshot,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.delete
    * @desc Deletes the specified regional persistent disk. Deleting a regional
    * disk removes all the replicas of its data permanently and is
    * irreversible. However, deleting a disk does not delete any snapshots
    * previously made from the disk. You must separately delete snapshots.
    * @alias compute.regionDisks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disk Name of the regional persistent disk to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegiondisksDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceRegiondisksDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceRegiondisksDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceRegiondisksDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceRegiondisksDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.get
    * @desc Returns a specified regional persistent disk.
    * @alias compute.regionDisks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disk Name of the regional persistent disk to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDisk] = js.native
  def get(callback: BodyResponseCallback[SchemaDisk]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDisk] = js.native
  def get(params: ParamsResourceRegiondisksGet): GaxiosPromise[SchemaDisk] = js.native
  def get(params: ParamsResourceRegiondisksGet, callback: BodyResponseCallback[SchemaDisk]): Unit = js.native
  def get(
    params: ParamsResourceRegiondisksGet,
    options: BodyResponseCallback[SchemaDisk],
    callback: BodyResponseCallback[SchemaDisk]
  ): Unit = js.native
  def get(params: ParamsResourceRegiondisksGet, options: MethodOptions): GaxiosPromise[SchemaDisk] = js.native
  def get(
    params: ParamsResourceRegiondisksGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDisk]
  ): Unit = js.native
  /**
    * compute.regionDisks.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.regionDisks.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceRegiondisksGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceRegiondisksGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceRegiondisksGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceRegiondisksGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceRegiondisksGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * compute.regionDisks.insert
    * @desc Creates a persistent regional disk in the specified project using
    * the data included in the request.
    * @alias compute.regionDisks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string=} params.sourceImage Optional. Source image to restore onto a disk.
    * @param {().Disk} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegiondisksInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegiondisksInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceRegiondisksInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegiondisksInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegiondisksInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.list
    * @desc Retrieves the list of persistent disks contained within the
    * specified region.
    * @alias compute.regionDisks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDiskList] = js.native
  def list(callback: BodyResponseCallback[SchemaDiskList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDiskList] = js.native
  def list(params: ParamsResourceRegiondisksList): GaxiosPromise[SchemaDiskList] = js.native
  def list(params: ParamsResourceRegiondisksList, callback: BodyResponseCallback[SchemaDiskList]): Unit = js.native
  def list(
    params: ParamsResourceRegiondisksList,
    options: BodyResponseCallback[SchemaDiskList],
    callback: BodyResponseCallback[SchemaDiskList]
  ): Unit = js.native
  def list(params: ParamsResourceRegiondisksList, options: MethodOptions): GaxiosPromise[SchemaDiskList] = js.native
  def list(
    params: ParamsResourceRegiondisksList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiskList]
  ): Unit = js.native
  /**
    * compute.regionDisks.removeResourcePolicies
    * @desc Removes resource policies from a regional disk.
    * @alias compute.regionDisks.removeResourcePolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disk The disk name for this request.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionDisksRemoveResourcePoliciesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeResourcePolicies(): GaxiosPromise[SchemaOperation] = js.native
  def removeResourcePolicies(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def removeResourcePolicies(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeResourcePolicies(params: ParamsResourceRegiondisksRemoveresourcepolicies): GaxiosPromise[SchemaOperation] = js.native
  def removeResourcePolicies(
    params: ParamsResourceRegiondisksRemoveresourcepolicies,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeResourcePolicies(
    params: ParamsResourceRegiondisksRemoveresourcepolicies,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def removeResourcePolicies(params: ParamsResourceRegiondisksRemoveresourcepolicies, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def removeResourcePolicies(
    params: ParamsResourceRegiondisksRemoveresourcepolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.resize
    * @desc Resizes the specified regional persistent disk.
    * @alias compute.regionDisks.resize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.disk Name of the regional persistent disk.
    * @param {string} params.project The project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionDisksResizeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resize(): GaxiosPromise[SchemaOperation] = js.native
  def resize(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resize(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(params: ParamsResourceRegiondisksResize): GaxiosPromise[SchemaOperation] = js.native
  def resize(params: ParamsResourceRegiondisksResize, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def resize(
    params: ParamsResourceRegiondisksResize,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def resize(params: ParamsResourceRegiondisksResize, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def resize(
    params: ParamsResourceRegiondisksResize,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.regionDisks.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().RegionSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceRegiondisksSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceRegiondisksSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceRegiondisksSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceRegiondisksSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceRegiondisksSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * compute.regionDisks.setLabels
    * @desc Sets the labels on the target regional disk.
    * @alias compute.regionDisks.setLabels
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().RegionSetLabelsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setLabels(): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceRegiondisksSetlabels): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(params: ParamsResourceRegiondisksSetlabels, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setLabels(
    params: ParamsResourceRegiondisksSetlabels,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setLabels(params: ParamsResourceRegiondisksSetlabels, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setLabels(
    params: ParamsResourceRegiondisksSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionDisks.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionDisks.testIamPermissions
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
  def testIamPermissions(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceRegiondisksTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegiondisksTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegiondisksTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegiondisksTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegiondisksTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

