package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Reports")
@js.native
class Resource$Reports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var saved: ResourceDollarReportsDollarSaved = js.native
  /**
    * adsense.reports.generate
    * @desc Generate an AdSense report based on the report request sent in the
    * query parameters. Returns the result as JSON; to retrieve output in CSV
    * format specify "alt=csv" as a query parameter.
    * @alias adsense.reports.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.accountId Accounts upon which to report.
    * @param {string=} params.currency Optional currency to use when reporting on monetary metrics. Defaults to the account's currency if not set.
    * @param {string=} params.dimension Dimensions to base the report on.
    * @param {string} params.endDate End of the date range to report on in "YYYY-MM-DD" format, inclusive.
    * @param {string=} params.filter Filters to be run on the report.
    * @param {string=} params.locale Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    * @param {integer=} params.maxResults The maximum number of rows of report data to return.
    * @param {string=} params.metric Numeric columns to include in the report.
    * @param {string=} params.sort The name of a dimension or metric to sort the resulting report on, optionally prefixed with "+" to sort ascending or "-" to sort descending. If no prefix is specified, the column is sorted ascending.
    * @param {string} params.startDate Start of the date range to report on in "YYYY-MM-DD" format, inclusive.
    * @param {integer=} params.startIndex Index of the first row of report data to return.
    * @param {boolean=} params.useTimezoneReporting Whether the report should be generated in the AdSense account's local timezone. If false default PST/PDT timezone will be used.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[Schema$AdsenseReportsGenerateResponse] = js.native
  def generate(callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]): Unit = js.native
  def generate(params: ParamsDollarResourceDollarReportsDollarGenerate): GaxiosPromise[Schema$AdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarGenerate,
    callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarGenerate,
    options: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse],
    callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(params: ParamsDollarResourceDollarReportsDollarGenerate, options: MethodOptions): GaxiosPromise[Schema$AdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]
  ): Unit = js.native
}

