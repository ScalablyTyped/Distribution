package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfsampleseries$Samples")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamples protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.samples.batchCreate
    * @desc Creates a batch of PerfSamples - a client can submit multiple
    * batches of Perf Samples through repeated calls to this method in order to
    * split up a large request payload - duplicates and existing timestamp
    * entries will be ignored. - the batch operation may partially succeed -
    * the set of elements successfully inserted is returned in the response
    * (omits items which already existed in the database).  May return any of
    * the following canonical error codes: - NOT_FOUND - The containing
    * PerfSampleSeries does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.samples.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.sampleSeriesId A sample series id
    * @param {string} params.stepId A tool results step ID.
    * @param {().BatchCreatePerfSamplesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[Schema$BatchCreatePerfSamplesResponse] = js.native
  def batchCreate(callback: BodyResponseCallback[Schema$BatchCreatePerfSamplesResponse]): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarBatchcreate
  ): GaxiosPromise[Schema$BatchCreatePerfSamplesResponse] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarBatchcreate,
    callback: BodyResponseCallback[Schema$BatchCreatePerfSamplesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarBatchcreate,
    options: BodyResponseCallback[Schema$BatchCreatePerfSamplesResponse],
    callback: BodyResponseCallback[Schema$BatchCreatePerfSamplesResponse]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarBatchcreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchCreatePerfSamplesResponse] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchCreatePerfSamplesResponse]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.executions.steps.perfSampleSeries.samples.list
    * @desc Lists the Performance Samples of a given Sample Series - The list
    * results are sorted by timestamps ascending - The default page size is 500
    * samples; and maximum size allowed 5000 - The response token indicates the
    * last returned PerfSample timestamp - When the results size exceeds the
    * page size, submit a subsequent request including the page token to return
    * the rest of the samples up to the page limit  May return any of the
    * following canonical error codes: - OUT_OF_RANGE - The specified request
    * page_token is out of valid range - NOT_FOUND - The containing
    * PerfSampleSeries does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfSampleSeries.samples.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {integer=} params.pageSize The default page size is 500 samples, and the maximum size is 5000. If the page_size is greater than 5000, the effective page size will be 5000
    * @param {string=} params.pageToken Optional, the next_page_token returned in the previous response
    * @param {string} params.projectId The cloud project
    * @param {string} params.sampleSeriesId A sample series id
    * @param {string} params.stepId A tool results step ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListPerfSamplesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListPerfSamplesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarList
  ): GaxiosPromise[Schema$ListPerfSamplesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarList,
    callback: BodyResponseCallback[Schema$ListPerfSamplesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarList,
    options: BodyResponseCallback[Schema$ListPerfSamplesResponse],
    callback: BodyResponseCallback[Schema$ListPerfSamplesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListPerfSamplesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfsampleseriesDollarSamplesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListPerfSamplesResponse]
  ): Unit = js.native
}

