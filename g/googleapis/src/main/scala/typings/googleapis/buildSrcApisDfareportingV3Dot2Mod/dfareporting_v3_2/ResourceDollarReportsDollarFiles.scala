package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Reports$Files")
@js.native
class ResourceDollarReportsDollarFiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.reports.files.get
    * @desc Retrieves a report file. This method supports media download.
    * @alias dfareporting.reports.files.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the report file.
    * @param {string} params.profileId The DFA profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$File] = js.native
  def get(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def get(params: ParamsDollarResourceDollarReportsDollarFilesDollarGet): GaxiosPromise[Schema$File] = js.native
  def get(
    params: ParamsDollarResourceDollarReportsDollarFilesDollarGet,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarReportsDollarFilesDollarGet,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarReportsDollarFilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def get(
    params: ParamsDollarResourceDollarReportsDollarFilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * dfareporting.reports.files.list
    * @desc Lists files for a report.
    * @alias dfareporting.reports.files.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA profile ID.
    * @param {string} params.reportId The ID of the parent report.
    * @param {string=} params.sortField The field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FileList] = js.native
  def list(callback: BodyResponseCallback[Schema$FileList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarReportsDollarFilesDollarList): GaxiosPromise[Schema$FileList] = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarFilesDollarList,
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarFilesDollarList,
    options: BodyResponseCallback[Schema$FileList],
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarReportsDollarFilesDollarList, options: MethodOptions): GaxiosPromise[Schema$FileList] = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarFilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
}

