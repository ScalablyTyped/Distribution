package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories$Executions$Steps$Perfmetricssummary")
@js.native
class ResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummary protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * toolresults.projects.histories.executions.steps.perfMetricsSummary.create
    * @desc Creates a PerfMetricsSummary resource. Returns the existing one if
    * it has already been created.  May return any of the following error
    * code(s): - NOT_FOUND - The containing Step does not exist
    * @alias
    * toolresults.projects.histories.executions.steps.perfMetricsSummary.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.executionId A tool results execution ID.
    * @param {string} params.historyId A tool results history ID.
    * @param {string} params.projectId The cloud project
    * @param {string} params.stepId A tool results step ID.
    * @param {().PerfMetricsSummary} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$PerfMetricsSummary] = js.native
  def create(callback: BodyResponseCallback[Schema$PerfMetricsSummary]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummaryDollarCreate
  ): GaxiosPromise[Schema$PerfMetricsSummary] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummaryDollarCreate,
    callback: BodyResponseCallback[Schema$PerfMetricsSummary]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummaryDollarCreate,
    options: BodyResponseCallback[Schema$PerfMetricsSummary],
    callback: BodyResponseCallback[Schema$PerfMetricsSummary]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummaryDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$PerfMetricsSummary] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarExecutionsDollarStepsDollarPerfmetricssummaryDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PerfMetricsSummary]
  ): Unit = js.native
}

