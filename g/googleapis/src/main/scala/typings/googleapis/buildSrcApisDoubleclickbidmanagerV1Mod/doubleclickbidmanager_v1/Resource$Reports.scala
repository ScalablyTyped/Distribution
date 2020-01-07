package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Reports")
@js.native
class Resource$Reports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.reports.listreports
    * @desc Retrieves stored reports.
    * @alias doubleclickbidmanager.reports.listreports
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID with which the reports are associated.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listreports(): GaxiosPromise[Schema$ListReportsResponse] = js.native
  def listreports(callback: BodyResponseCallback[Schema$ListReportsResponse]): Unit = js.native
  def listreports(params: ParamsDollarResourceDollarReportsDollarListreports): GaxiosPromise[Schema$ListReportsResponse] = js.native
  def listreports(
    params: ParamsDollarResourceDollarReportsDollarListreports,
    callback: BodyResponseCallback[Schema$ListReportsResponse]
  ): Unit = js.native
  def listreports(
    params: ParamsDollarResourceDollarReportsDollarListreports,
    options: BodyResponseCallback[Schema$ListReportsResponse],
    callback: BodyResponseCallback[Schema$ListReportsResponse]
  ): Unit = js.native
  def listreports(params: ParamsDollarResourceDollarReportsDollarListreports, options: MethodOptions): GaxiosPromise[Schema$ListReportsResponse] = js.native
  def listreports(
    params: ParamsDollarResourceDollarReportsDollarListreports,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListReportsResponse]
  ): Unit = js.native
}

