package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Performancereport")
@js.native
class Resource$Performancereport protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.performanceReport.list
    * @desc Retrieves the authenticated user's list of performance metrics.
    * @alias adexchangebuyer.performanceReport.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the reports.
    * @param {string} params.endDateTime The end time of the report in ISO 8601 timestamp format using UTC.
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. If not set, the default is 100. Optional.
    * @param {string=} params.pageToken A continuation token, used to page through performance reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response. Optional.
    * @param {string} params.startDateTime The start time of the report in ISO 8601 timestamp format using UTC.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PerformanceReportList] = js.native
  def list(callback: BodyResponseCallback[Schema$PerformanceReportList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPerformancereportDollarList): GaxiosPromise[Schema$PerformanceReportList] = js.native
  def list(
    params: ParamsDollarResourceDollarPerformancereportDollarList,
    callback: BodyResponseCallback[Schema$PerformanceReportList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPerformancereportDollarList,
    options: BodyResponseCallback[Schema$PerformanceReportList],
    callback: BodyResponseCallback[Schema$PerformanceReportList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPerformancereportDollarList, options: MethodOptions): GaxiosPromise[Schema$PerformanceReportList] = js.native
  def list(
    params: ParamsDollarResourceDollarPerformancereportDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PerformanceReportList]
  ): Unit = js.native
}

