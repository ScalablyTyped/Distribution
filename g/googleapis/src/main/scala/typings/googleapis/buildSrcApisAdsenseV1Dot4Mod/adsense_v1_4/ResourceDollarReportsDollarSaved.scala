package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Reports$Saved")
@js.native
class ResourceDollarReportsDollarSaved protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.reports.saved.generate
    * @desc Generate an AdSense report based on the saved report ID sent in the
    * query parameters.
    * @alias adsense.reports.saved.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.locale Optional locale to use for translating report output to a local language. Defaults to "en_US" if not specified.
    * @param {integer=} params.maxResults The maximum number of rows of report data to return.
    * @param {string} params.savedReportId The saved report to retrieve.
    * @param {integer=} params.startIndex Index of the first row of report data to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[Schema$AdsenseReportsGenerateResponse] = js.native
  def generate(callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]): Unit = js.native
  def generate(params: ParamsDollarResourceDollarReportsDollarSavedDollarGenerate): GaxiosPromise[Schema$AdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarSavedDollarGenerate,
    callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarSavedDollarGenerate,
    options: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse],
    callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]
  ): Unit = js.native
  def generate(params: ParamsDollarResourceDollarReportsDollarSavedDollarGenerate, options: MethodOptions): GaxiosPromise[Schema$AdsenseReportsGenerateResponse] = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarSavedDollarGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdsenseReportsGenerateResponse]
  ): Unit = js.native
  /**
    * adsense.reports.saved.list
    * @desc List all saved reports in this AdSense account.
    * @alias adsense.reports.saved.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of saved reports to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through saved reports. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SavedReports] = js.native
  def list(callback: BodyResponseCallback[Schema$SavedReports]): Unit = js.native
  def list(params: ParamsDollarResourceDollarReportsDollarSavedDollarList): GaxiosPromise[Schema$SavedReports] = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarSavedDollarList,
    callback: BodyResponseCallback[Schema$SavedReports]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarSavedDollarList,
    options: BodyResponseCallback[Schema$SavedReports],
    callback: BodyResponseCallback[Schema$SavedReports]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarReportsDollarSavedDollarList, options: MethodOptions): GaxiosPromise[Schema$SavedReports] = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarSavedDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SavedReports]
  ): Unit = js.native
}

