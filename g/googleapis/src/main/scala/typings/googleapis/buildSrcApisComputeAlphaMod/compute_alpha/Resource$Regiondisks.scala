package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regiondisks")
@js.native
class Resource$Regiondisks protected () extends js.Object {
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
  def addResourcePolicies(): GaxiosPromise[Schema$Operation] = js.native
  def addResourcePolicies(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addResourcePolicies(params: ParamsDollarResourceDollarRegiondisksDollarAddresourcepolicies): GaxiosPromise[Schema$Operation] = js.native
  def addResourcePolicies(
    params: ParamsDollarResourceDollarRegiondisksDollarAddresourcepolicies,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addResourcePolicies(
    params: ParamsDollarResourceDollarRegiondisksDollarAddresourcepolicies,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addResourcePolicies(params: ParamsDollarResourceDollarRegiondisksDollarAddresourcepolicies, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addResourcePolicies(
    params: ParamsDollarResourceDollarRegiondisksDollarAddresourcepolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def createSnapshot(): GaxiosPromise[Schema$Operation] = js.native
  def createSnapshot(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def createSnapshot(params: ParamsDollarResourceDollarRegiondisksDollarCreatesnapshot): GaxiosPromise[Schema$Operation] = js.native
  def createSnapshot(
    params: ParamsDollarResourceDollarRegiondisksDollarCreatesnapshot,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def createSnapshot(
    params: ParamsDollarResourceDollarRegiondisksDollarCreatesnapshot,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def createSnapshot(params: ParamsDollarResourceDollarRegiondisksDollarCreatesnapshot, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def createSnapshot(
    params: ParamsDollarResourceDollarRegiondisksDollarCreatesnapshot,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegiondisksDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiondisksDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiondisksDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegiondisksDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegiondisksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def get(): GaxiosPromise[Schema$Disk] = js.native
  def get(callback: BodyResponseCallback[Schema$Disk]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegiondisksDollarGet): GaxiosPromise[Schema$Disk] = js.native
  def get(
    params: ParamsDollarResourceDollarRegiondisksDollarGet,
    callback: BodyResponseCallback[Schema$Disk]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRegiondisksDollarGet,
    options: BodyResponseCallback[Schema$Disk],
    callback: BodyResponseCallback[Schema$Disk]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegiondisksDollarGet, options: MethodOptions): GaxiosPromise[Schema$Disk] = js.native
  def get(
    params: ParamsDollarResourceDollarRegiondisksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Disk]
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
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarRegiondisksDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarRegiondisksDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarRegiondisksDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarRegiondisksDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarRegiondisksDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
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
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegiondisksDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiondisksDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiondisksDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegiondisksDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegiondisksDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def list(): GaxiosPromise[Schema$DiskList] = js.native
  def list(callback: BodyResponseCallback[Schema$DiskList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegiondisksDollarList): GaxiosPromise[Schema$DiskList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegiondisksDollarList,
    callback: BodyResponseCallback[Schema$DiskList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRegiondisksDollarList,
    options: BodyResponseCallback[Schema$DiskList],
    callback: BodyResponseCallback[Schema$DiskList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegiondisksDollarList, options: MethodOptions): GaxiosPromise[Schema$DiskList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegiondisksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DiskList]
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
  def removeResourcePolicies(): GaxiosPromise[Schema$Operation] = js.native
  def removeResourcePolicies(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def removeResourcePolicies(params: ParamsDollarResourceDollarRegiondisksDollarRemoveresourcepolicies): GaxiosPromise[Schema$Operation] = js.native
  def removeResourcePolicies(
    params: ParamsDollarResourceDollarRegiondisksDollarRemoveresourcepolicies,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeResourcePolicies(
    params: ParamsDollarResourceDollarRegiondisksDollarRemoveresourcepolicies,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removeResourcePolicies(params: ParamsDollarResourceDollarRegiondisksDollarRemoveresourcepolicies, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def removeResourcePolicies(
    params: ParamsDollarResourceDollarRegiondisksDollarRemoveresourcepolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def resize(): GaxiosPromise[Schema$Operation] = js.native
  def resize(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def resize(params: ParamsDollarResourceDollarRegiondisksDollarResize): GaxiosPromise[Schema$Operation] = js.native
  def resize(
    params: ParamsDollarResourceDollarRegiondisksDollarResize,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resize(
    params: ParamsDollarResourceDollarRegiondisksDollarResize,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resize(params: ParamsDollarResourceDollarRegiondisksDollarResize, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def resize(
    params: ParamsDollarResourceDollarRegiondisksDollarResize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarRegiondisksDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarRegiondisksDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarRegiondisksDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarRegiondisksDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarRegiondisksDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
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
  def setLabels(): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarRegiondisksDollarSetlabels): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarRegiondisksDollarSetlabels,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(
    params: ParamsDollarResourceDollarRegiondisksDollarSetlabels,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setLabels(params: ParamsDollarResourceDollarRegiondisksDollarSetlabels, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setLabels(
    params: ParamsDollarResourceDollarRegiondisksDollarSetlabels,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarRegiondisksDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiondisksDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiondisksDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarRegiondisksDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegiondisksDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

