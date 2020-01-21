package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regioncommitments")
@js.native
class ResourceRegioncommitments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionCommitments.aggregatedList
    * @desc Retrieves an aggregated list of commitments.
    * @alias compute.regionCommitments.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaCommitmentAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaCommitmentAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsResourceRegioncommitmentsAggregatedlist): GaxiosPromise[SchemaCommitmentAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceRegioncommitmentsAggregatedlist,
    callback: BodyResponseCallback[SchemaCommitmentAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceRegioncommitmentsAggregatedlist,
    options: BodyResponseCallback[SchemaCommitmentAggregatedList],
    callback: BodyResponseCallback[SchemaCommitmentAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceRegioncommitmentsAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaCommitmentAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceRegioncommitmentsAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitmentAggregatedList]
  ): Unit = js.native
  /**
    * compute.regionCommitments.get
    * @desc Returns the specified commitment resource. Gets a list of available
    * commitments by making a list() request.
    * @alias compute.regionCommitments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commitment Name of the commitment to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCommitment] = js.native
  def get(callback: BodyResponseCallback[SchemaCommitment]): Unit = js.native
  def get(params: ParamsResourceRegioncommitmentsGet): GaxiosPromise[SchemaCommitment] = js.native
  def get(params: ParamsResourceRegioncommitmentsGet, callback: BodyResponseCallback[SchemaCommitment]): Unit = js.native
  def get(
    params: ParamsResourceRegioncommitmentsGet,
    options: BodyResponseCallback[SchemaCommitment],
    callback: BodyResponseCallback[SchemaCommitment]
  ): Unit = js.native
  def get(params: ParamsResourceRegioncommitmentsGet, options: MethodOptions): GaxiosPromise[SchemaCommitment] = js.native
  def get(
    params: ParamsResourceRegioncommitmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitment]
  ): Unit = js.native
  /**
    * compute.regionCommitments.insert
    * @desc Creates a commitment in the specified project using the data
    * included in the request.
    * @alias compute.regionCommitments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Commitment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceRegioncommitmentsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceRegioncommitmentsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceRegioncommitmentsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceRegioncommitmentsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceRegioncommitmentsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionCommitments.list
    * @desc Retrieves a list of commitments contained within the specified
    * region.
    * @alias compute.regionCommitments.list
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
  def list(): GaxiosPromise[SchemaCommitmentList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommitmentList]): Unit = js.native
  def list(params: ParamsResourceRegioncommitmentsList): GaxiosPromise[SchemaCommitmentList] = js.native
  def list(params: ParamsResourceRegioncommitmentsList, callback: BodyResponseCallback[SchemaCommitmentList]): Unit = js.native
  def list(
    params: ParamsResourceRegioncommitmentsList,
    options: BodyResponseCallback[SchemaCommitmentList],
    callback: BodyResponseCallback[SchemaCommitmentList]
  ): Unit = js.native
  def list(params: ParamsResourceRegioncommitmentsList, options: MethodOptions): GaxiosPromise[SchemaCommitmentList] = js.native
  def list(
    params: ParamsResourceRegioncommitmentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommitmentList]
  ): Unit = js.native
  /**
    * compute.regionCommitments.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionCommitments.testIamPermissions
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
  def testIamPermissions(params: ParamsResourceRegioncommitmentsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegioncommitmentsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegioncommitmentsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegioncommitmentsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegioncommitmentsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.regionCommitments.updateReservations
    * @desc Update the shape of reservations for GPUS/Local SSDs of
    * reservations within the commitments.
    * @alias compute.regionCommitments.updateReservations
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commitment Name of the commitment of which the reservation's capacities are being updated.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionCommitmentsUpdateReservationsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateReservations(): GaxiosPromise[SchemaOperation] = js.native
  def updateReservations(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateReservations(params: ParamsResourceRegioncommitmentsUpdatereservations): GaxiosPromise[SchemaOperation] = js.native
  def updateReservations(
    params: ParamsResourceRegioncommitmentsUpdatereservations,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateReservations(
    params: ParamsResourceRegioncommitmentsUpdatereservations,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateReservations(params: ParamsResourceRegioncommitmentsUpdatereservations, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateReservations(
    params: ParamsResourceRegioncommitmentsUpdatereservations,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

