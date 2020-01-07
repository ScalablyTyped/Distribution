package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var clusters: ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarClusters = js.native
  var context: APIRequestContext = js.native
  var steps: ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarSteps = js.native
  /**
    * toolresults.projects.histories.executions.create
    * @desc Creates an Execution.  The returned Execution will have the id set.
    * May return any of the following canonical error codes:  -
    * PERMISSION_DENIED - if the user is not authorized to write to project -
    * INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the
    * containing History does not exist
    * @alias toolresults.projects.histories.executions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {().Execution} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Execution] = js.native
  def create(callback: BodyResponseCallback[Schema$Execution]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarCreate): GaxiosPromise[Schema$Execution] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarCreate,
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarCreate,
    options: BodyResponseCallback[Schema$Execution],
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Execution] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.get
    * @desc Gets an Execution.  May return any of the following canonical error
    * codes:  - PERMISSION_DENIED - if the user is not authorized to write to
    * project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if
    * the Execution does not exist
    * @alias toolresults.projects.histories.executions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId An Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Execution] = js.native
  def get(callback: BodyResponseCallback[Schema$Execution]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarGet): GaxiosPromise[Schema$Execution] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarGet,
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarGet,
    options: BodyResponseCallback[Schema$Execution],
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Execution] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.list
    * @desc Lists Executions for a given History.  The executions are sorted by
    * creation_time in descending order. The execution_id key will be used to
    * order the executions with the same creation_time.  May return any of the
    * following canonical error codes:  - PERMISSION_DENIED - if the user is
    * not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the containing History does not exist
    * @alias toolresults.projects.histories.executions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.historyId A History id.  Required.
    * @param {integer=} params.pageSize The maximum number of Executions to fetch.  Default value: 25. The server will use this default if the field is not set or has a value of 0.  Optional.
    * @param {string=} params.pageToken A continuation token to resume the query at the next item.  Optional.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListExecutionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListExecutionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarList): GaxiosPromise[Schema$ListExecutionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarList,
    callback: BodyResponseCallback[Schema$ListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarList,
    options: BodyResponseCallback[Schema$ListExecutionsResponse],
    callback: BodyResponseCallback[Schema$ListExecutionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListExecutionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListExecutionsResponse]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.patch
    * @desc Updates an existing Execution with the supplied partial entity. May
    * return any of the following canonical error codes:  - PERMISSION_DENIED -
    * if the user is not authorized to write to project - INVALID_ARGUMENT - if
    * the request is malformed - FAILED_PRECONDITION - if the requested state
    * transition is illegal - NOT_FOUND - if the containing History does not
    * exist
    * @alias toolresults.projects.histories.executions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId Required.
    * @param {string} params.historyId Required.
    * @param {string} params.projectId A Project id. Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {().Execution} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Execution] = js.native
  def patch(callback: BodyResponseCallback[Schema$Execution]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarPatch): GaxiosPromise[Schema$Execution] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarPatch,
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarPatch,
    options: BodyResponseCallback[Schema$Execution],
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Execution] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Execution]
  ): Unit = js.native
}

