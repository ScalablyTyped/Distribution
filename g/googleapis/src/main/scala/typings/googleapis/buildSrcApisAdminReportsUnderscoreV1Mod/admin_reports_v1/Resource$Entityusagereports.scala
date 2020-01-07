package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Resource$Entityusagereports")
@js.native
class Resource$Entityusagereports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reports.entityUsageReports.get
    * @desc Retrieves a report which is a collection of properties / statistics
    * for a set of objects.
    * @alias reports.entityUsageReports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string} params.date Represents the date in yyyy-mm-dd format for which the data is to be fetched.
    * @param {string} params.entityKey Represents the key of object for which the data should be filtered.
    * @param {string} params.entityType Type of object. Should be one of - gplus_communities.
    * @param {string=} params.filters Represents the set of filters including parameter operator value.
    * @param {integer=} params.maxResults Maximum number of results to return. Maximum allowed is 1000
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.parameters Represents the application name, parameter name pairs to fetch in csv as app_name1:param_name1, app_name2:param_name2.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UsageReports] = js.native
  def get(callback: BodyResponseCallback[Schema$UsageReports]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEntityusagereportsDollarGet): GaxiosPromise[Schema$UsageReports] = js.native
  def get(
    params: ParamsDollarResourceDollarEntityusagereportsDollarGet,
    callback: BodyResponseCallback[Schema$UsageReports]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEntityusagereportsDollarGet,
    options: BodyResponseCallback[Schema$UsageReports],
    callback: BodyResponseCallback[Schema$UsageReports]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEntityusagereportsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UsageReports] = js.native
  def get(
    params: ParamsDollarResourceDollarEntityusagereportsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UsageReports]
  ): Unit = js.native
}

