package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Jobs$Reports")
@js.native
class ResourceDollarJobsDollarReports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubereporting.jobs.reports.get
    * @desc Gets the metadata of a specific report.
    * @alias youtubereporting.jobs.reports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The ID of the job.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {string} params.reportId The ID of the report to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Report] = js.native
  def get(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def get(params: ParamsDollarResourceDollarJobsDollarReportsDollarGet): GaxiosPromise[Schema$Report] = js.native
  def get(
    params: ParamsDollarResourceDollarJobsDollarReportsDollarGet,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarJobsDollarReportsDollarGet,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarJobsDollarReportsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def get(
    params: ParamsDollarResourceDollarJobsDollarReportsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  /**
    * youtubereporting.jobs.reports.list
    * @desc Lists reports created by a specific job. Returns NOT_FOUND if the
    * job does not exist.
    * @alias youtubereporting.jobs.reports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.createdAfter If set, only reports created after the specified date/time are returned.
    * @param {string} params.jobId The ID of the job.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {integer=} params.pageSize Requested page size. Server may return fewer report types than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListReportsResponse.next_page_token returned in response to the previous call to the `ListReports` method.
    * @param {string=} params.startTimeAtOrAfter If set, only reports whose start time is greater than or equal the specified date/time are returned.
    * @param {string=} params.startTimeBefore If set, only reports whose start time is smaller than the specified date/time are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListReportsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListReportsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarJobsDollarReportsDollarList): GaxiosPromise[Schema$ListReportsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarJobsDollarReportsDollarList,
    callback: BodyResponseCallback[Schema$ListReportsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarJobsDollarReportsDollarList,
    options: BodyResponseCallback[Schema$ListReportsResponse],
    callback: BodyResponseCallback[Schema$ListReportsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarJobsDollarReportsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListReportsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarJobsDollarReportsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListReportsResponse]
  ): Unit = js.native
}

