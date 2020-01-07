package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Reports")
@js.native
class Resource$Reports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var compatibleFields: ResourceDollarReportsDollarCompatiblefields = js.native
  var context: APIRequestContext = js.native
  var files: ResourceDollarReportsDollarFiles = js.native
  /**
    * dfareporting.reports.delete
    * @desc Deletes a report by its ID.
    * @alias dfareporting.reports.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarReportsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarReportsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarReportsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarReportsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarReportsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.reports.get
    * @desc Retrieves a report by its ID.
    * @alias dfareporting.reports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Report] = js.native
  def get(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def get(params: ParamsDollarResourceDollarReportsDollarGet): GaxiosPromise[Schema$Report] = js.native
  def get(params: ParamsDollarResourceDollarReportsDollarGet, callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarReportsDollarGet,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarReportsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def get(
    params: ParamsDollarResourceDollarReportsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  /**
    * dfareporting.reports.insert
    * @desc Creates a report.
    * @alias dfareporting.reports.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Report] = js.native
  def insert(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarReportsDollarInsert): GaxiosPromise[Schema$Report] = js.native
  def insert(
    params: ParamsDollarResourceDollarReportsDollarInsert,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarReportsDollarInsert,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarReportsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def insert(
    params: ParamsDollarResourceDollarReportsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  /**
    * dfareporting.reports.list
    * @desc Retrieves list of reports.
    * @alias dfareporting.reports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string=} params.scope The scope that defines which results are returned.
    * @param {string=} params.sortField The field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ReportList] = js.native
  def list(callback: BodyResponseCallback[Schema$ReportList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarReportsDollarList): GaxiosPromise[Schema$ReportList] = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarList,
    callback: BodyResponseCallback[Schema$ReportList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarList,
    options: BodyResponseCallback[Schema$ReportList],
    callback: BodyResponseCallback[Schema$ReportList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarReportsDollarList, options: MethodOptions): GaxiosPromise[Schema$ReportList] = js.native
  def list(
    params: ParamsDollarResourceDollarReportsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReportList]
  ): Unit = js.native
  /**
    * dfareporting.reports.patch
    * @desc Updates a report. This method supports patch semantics.
    * @alias dfareporting.reports.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Report] = js.native
  def patch(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarReportsDollarPatch): GaxiosPromise[Schema$Report] = js.native
  def patch(
    params: ParamsDollarResourceDollarReportsDollarPatch,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarReportsDollarPatch,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarReportsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def patch(
    params: ParamsDollarResourceDollarReportsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  /**
    * dfareporting.reports.run
    * @desc Runs a report.
    * @alias dfareporting.reports.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {boolean=} params.synchronous If set and true, tries to run the report synchronously.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$File] = js.native
  def run(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def run(params: ParamsDollarResourceDollarReportsDollarRun): GaxiosPromise[Schema$File] = js.native
  def run(params: ParamsDollarResourceDollarReportsDollarRun, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarReportsDollarRun,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def run(params: ParamsDollarResourceDollarReportsDollarRun, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def run(
    params: ParamsDollarResourceDollarReportsDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * dfareporting.reports.update
    * @desc Updates a report.
    * @alias dfareporting.reports.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {string} params.reportId The ID of the report.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Report] = js.native
  def update(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def update(params: ParamsDollarResourceDollarReportsDollarUpdate): GaxiosPromise[Schema$Report] = js.native
  def update(
    params: ParamsDollarResourceDollarReportsDollarUpdate,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarReportsDollarUpdate,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarReportsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def update(
    params: ParamsDollarResourceDollarReportsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
}

