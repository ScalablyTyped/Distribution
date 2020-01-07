package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarSteps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var perfMetricsSummary: ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummary = js.native
  var perfSampleSeries: ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseries = js.native
  var thumbnails: ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarThumbnails = js.native
  /**
    * toolresults.projects.histories.executions.steps.create
    * @desc Creates a Step.  The returned Step will have the id set.  May
    * return any of the following canonical error codes:  - PERMISSION_DENIED -
    * if the user is not authorized to write to project - INVALID_ARGUMENT - if
    * the request is malformed - FAILED_PRECONDITION - if the step is too large
    * (more than 10Mib) - NOT_FOUND - if the containing Execution does not
    * exist
    * @alias toolresults.projects.histories.executions.steps.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {().Step} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Step] = js.native
  def create(callback: BodyResponseCallback[Schema$Step]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarCreate): GaxiosPromise[Schema$Step] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarCreate,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarCreate,
    options: BodyResponseCallback[Schema$Step],
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Step] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.get
    * @desc Gets a Step.  May return any of the following canonical error
    * codes:  - PERMISSION_DENIED - if the user is not authorized to read
    * project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if
    * the Step does not exist
    * @alias toolresults.projects.histories.executions.steps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string} params.stepId A Step id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Step] = js.native
  def get(callback: BodyResponseCallback[Schema$Step]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGet): GaxiosPromise[Schema$Step] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGet,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGet,
    options: BodyResponseCallback[Schema$Step],
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Step] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.getPerfMetricsSummary
    * @desc Retrieves a PerfMetricsSummary.  May return any of the following
    * error code(s): - NOT_FOUND - The specified PerfMetricsSummary does not
    * exist
    * @alias
    * toolresults.projects.histories.executions.steps.getPerfMetricsSummary
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getPerfMetricsSummary(): GaxiosPromise[Schema$PerfMetricsSummary] = js.native
  def getPerfMetricsSummary(callback: BodyResponseCallback[Schema$PerfMetricsSummary]): Unit = js.native
  def getPerfMetricsSummary(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGetperfmetricssummary
  ): GaxiosPromise[Schema$PerfMetricsSummary] = js.native
  def getPerfMetricsSummary(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGetperfmetricssummary,
    callback: BodyResponseCallback[Schema$PerfMetricsSummary]
  ): Unit = js.native
  def getPerfMetricsSummary(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGetperfmetricssummary,
    options: BodyResponseCallback[Schema$PerfMetricsSummary],
    callback: BodyResponseCallback[Schema$PerfMetricsSummary]
  ): Unit = js.native
  def getPerfMetricsSummary(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGetperfmetricssummary,
    options: MethodOptions
  ): GaxiosPromise[Schema$PerfMetricsSummary] = js.native
  def getPerfMetricsSummary(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarGetperfmetricssummary,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PerfMetricsSummary]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.list
    * @desc Lists Steps for a given Execution.  The steps are sorted by
    * creation_time in descending order. The step_id key will be used to order
    * the steps with the same creation_time.  May return any of the following
    * canonical error codes:  - PERMISSION_DENIED - if the user is not
    * authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - FAILED_PRECONDITION - if an argument in the request happens
    * to be invalid; e.g. if an attempt is made to list the children of a
    * nonexistent Step - NOT_FOUND - if the containing Execution does not exist
    * @alias toolresults.projects.histories.executions.steps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {integer=} params.pageSize The maximum number of Steps to fetch.  Default value: 25. The server will use this default if the field is not set or has a value of 0.  Optional.
    * @param {string=} params.pageToken A continuation token to resume the query at the next item.  Optional.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListStepsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListStepsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarList): GaxiosPromise[Schema$ListStepsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarList,
    callback: BodyResponseCallback[Schema$ListStepsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarList,
    options: BodyResponseCallback[Schema$ListStepsResponse],
    callback: BodyResponseCallback[Schema$ListStepsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListStepsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListStepsResponse]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.patch
    * @desc Updates an existing Step with the supplied partial entity.  May
    * return any of the following canonical error codes:  - PERMISSION_DENIED -
    * if the user is not authorized to write project - INVALID_ARGUMENT - if
    * the request is malformed - FAILED_PRECONDITION - if the requested state
    * transition is illegal (e.g try to upload a duplicate xml file), if the
    * updated step is too large (more than 10Mib) - NOT_FOUND - if the
    * containing Execution does not exist
    * @alias toolresults.projects.histories.executions.steps.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {string} params.stepId A Step id.  Required.
    * @param {().Step} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Step] = js.native
  def patch(callback: BodyResponseCallback[Schema$Step]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPatch): GaxiosPromise[Schema$Step] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPatch,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPatch,
    options: BodyResponseCallback[Schema$Step],
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Step] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.publishXunitXmlFiles
    * @desc Publish xml files to an existing Step.  May return any of the
    * following canonical error codes:  - PERMISSION_DENIED - if the user is
    * not authorized to write project - INVALID_ARGUMENT - if the request is
    * malformed - FAILED_PRECONDITION - if the requested state transition is
    * illegal, e.g try to upload a duplicate xml file or a file too large. -
    * NOT_FOUND - if the containing Execution does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.publishXunitXmlFiles
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A Execution id.  Required.
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {string} params.stepId A Step id. Note: This step must include a TestExecutionStep.  Required.
    * @param {().PublishXunitXmlFilesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publishXunitXmlFiles(): GaxiosPromise[Schema$Step] = js.native
  def publishXunitXmlFiles(callback: BodyResponseCallback[Schema$Step]): Unit = js.native
  def publishXunitXmlFiles(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPublishxunitxmlfiles
  ): GaxiosPromise[Schema$Step] = js.native
  def publishXunitXmlFiles(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPublishxunitxmlfiles,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def publishXunitXmlFiles(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPublishxunitxmlfiles,
    options: BodyResponseCallback[Schema$Step],
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
  def publishXunitXmlFiles(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPublishxunitxmlfiles,
    options: MethodOptions
  ): GaxiosPromise[Schema$Step] = js.native
  def publishXunitXmlFiles(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPublishxunitxmlfiles,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Step]
  ): Unit = js.native
}

