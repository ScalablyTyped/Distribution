package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Resource$Customerusagereports")
@js.native
class Resource$Customerusagereports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reports.customerUsageReports.get
    * @desc Retrieves a report which is a collection of properties / statistics
    * for a specific customer.
    * @alias reports.customerUsageReports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string} params.date Represents the date in yyyy-mm-dd format for which the data is to be fetched.
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.parameters Represents the application name, parameter name pairs to fetch in csv as app_name1:param_name1, app_name2:param_name2.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UsageReports] = js.native
  def get(callback: BodyResponseCallback[Schema$UsageReports]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomerusagereportsDollarGet): GaxiosPromise[Schema$UsageReports] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomerusagereportsDollarGet,
    callback: BodyResponseCallback[Schema$UsageReports]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCustomerusagereportsDollarGet,
    options: BodyResponseCallback[Schema$UsageReports],
    callback: BodyResponseCallback[Schema$UsageReports]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomerusagereportsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UsageReports] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomerusagereportsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UsageReports]
  ): Unit = js.native
}

