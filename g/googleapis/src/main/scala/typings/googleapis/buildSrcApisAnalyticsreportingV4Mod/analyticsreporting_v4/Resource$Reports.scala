package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Resource$Reports")
@js.native
class Resource$Reports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analyticsreporting.reports.batchGet
    * @desc Returns the Analytics data.
    * @alias analyticsreporting.reports.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetReportsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[Schema$GetReportsResponse] = js.native
  def batchGet(callback: BodyResponseCallback[Schema$GetReportsResponse]): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarReportsDollarBatchget): GaxiosPromise[Schema$GetReportsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarReportsDollarBatchget,
    callback: BodyResponseCallback[Schema$GetReportsResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarReportsDollarBatchget,
    options: BodyResponseCallback[Schema$GetReportsResponse],
    callback: BodyResponseCallback[Schema$GetReportsResponse]
  ): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarReportsDollarBatchget, options: MethodOptions): GaxiosPromise[Schema$GetReportsResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarReportsDollarBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetReportsResponse]
  ): Unit = js.native
}

