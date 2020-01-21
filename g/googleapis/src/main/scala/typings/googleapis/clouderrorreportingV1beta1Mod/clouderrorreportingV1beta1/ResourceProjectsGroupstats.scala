package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Groupstats")
@js.native
class ResourceProjectsGroupstats protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * clouderrorreporting.projects.groupStats.list
    * @desc Lists the specified groups.
    * @alias clouderrorreporting.projects.groupStats.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.alignment [Optional] The alignment of the timed counts to be returned. Default is `ALIGNMENT_EQUAL_AT_END`.
    * @param {string=} params.alignmentTime [Optional] Time where the timed counts shall be aligned if rounded alignment is chosen. Default is 00:00 UTC.
    * @param {string=} params.groupId [Optional] List all <code>ErrorGroupStats</code> with these IDs.
    * @param {string=} params.order [Optional] The sort order in which the results are returned. Default is `COUNT_DESC`.
    * @param {integer=} params.pageSize [Optional] The maximum number of results to return per response. Default is 20.
    * @param {string=} params.pageToken [Optional] A `next_page_token` provided by a previous response. To view additional results, pass this token along with the identical query parameters as the first request.
    * @param {string} params.projectName [Required] The resource name of the Google Cloud Platform project. Written as <code>projects/</code> plus the <a href="https://support.google.com/cloud/answer/6158840">Google Cloud Platform project ID</a>.  Example: <code>projects/my-project-123</code>.
    * @param {string=} params.serviceFilter.resourceType [Optional] The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    * @param {string=} params.serviceFilter.service [Optional] The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    * @param {string=} params.serviceFilter.version [Optional] The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    * @param {string=} params.timedCountDuration [Optional] The preferred duration for a single returned `TimedCount`. If not set, no timed counts are returned.
    * @param {string=} params.timeRange.period Restricts the query to the specified time range.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupStatsResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsGroupstatsList): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    callback: BodyResponseCallback[SchemaListGroupStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    options: BodyResponseCallback[SchemaListGroupStatsResponse],
    callback: BodyResponseCallback[SchemaListGroupStatsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsGroupstatsList, options: MethodOptions): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupStatsResponse]
  ): Unit = js.native
}

