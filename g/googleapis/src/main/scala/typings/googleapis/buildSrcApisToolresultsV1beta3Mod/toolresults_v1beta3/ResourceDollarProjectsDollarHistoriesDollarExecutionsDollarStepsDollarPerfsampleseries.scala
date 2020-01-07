package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var samples: ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamples = js.native
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.create
    * @desc Creates a PerfSampleSeries.  May return any of the following error
    * code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the
    * given Step - NOT_FOUND - The containing Step does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {().PerfSampleSeries} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$PerfSampleSeries] = js.native
  def create(callback: BodyResponseCallback[Schema$PerfSampleSeries]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarCreate
  ): GaxiosPromise[Schema$PerfSampleSeries] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarCreate,
    callback: BodyResponseCallback[Schema$PerfSampleSeries]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarCreate,
    options: BodyResponseCallback[Schema$PerfSampleSeries],
    callback: BodyResponseCallback[Schema$PerfSampleSeries]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$PerfSampleSeries] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PerfSampleSeries]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.get
    * @desc Gets a PerfSampleSeries.  May return any of the following error
    * code(s): - NOT_FOUND - The specified PerfSampleSeries does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.sampleSeriesId A sample series id
    * @param {string} params.stepId A tool results step ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PerfSampleSeries] = js.native
  def get(callback: BodyResponseCallback[Schema$PerfSampleSeries]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarGet
  ): GaxiosPromise[Schema$PerfSampleSeries] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarGet,
    callback: BodyResponseCallback[Schema$PerfSampleSeries]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarGet,
    options: BodyResponseCallback[Schema$PerfSampleSeries],
    callback: BodyResponseCallback[Schema$PerfSampleSeries]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$PerfSampleSeries] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PerfSampleSeries]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.list
    * @desc Lists PerfSampleSeries for a given Step.  The request provides an
    * optional filter which specifies one or more PerfMetricsType to include in
    * the result; if none returns all. The resulting PerfSampleSeries are
    * sorted by ids.  May return any of the following canonical error codes: -
    * NOT_FOUND - The containing Step does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string=} params.filter Specify one or more PerfMetricType values such as CPU to filter the result
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListPerfSampleSeriesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListPerfSampleSeriesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList
  ): GaxiosPromise[Schema$ListPerfSampleSeriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList,
    callback: BodyResponseCallback[Schema$ListPerfSampleSeriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList,
    options: BodyResponseCallback[Schema$ListPerfSampleSeriesResponse],
    callback: BodyResponseCallback[Schema$ListPerfSampleSeriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListPerfSampleSeriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListPerfSampleSeriesResponse]
  ): Unit = js.native
}

