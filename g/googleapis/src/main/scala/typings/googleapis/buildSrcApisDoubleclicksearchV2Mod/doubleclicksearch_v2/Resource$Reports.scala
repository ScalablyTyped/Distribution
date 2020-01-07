package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclicksearch/v2", "doubleclicksearch_v2.Resource$Reports")
@js.native
class Resource$Reports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclicksearch.reports.generate
    * @desc Generates and returns a report immediately.
    * @alias doubleclicksearch.reports.generate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generate(): GaxiosPromise[Schema$Report] = js.native
  def generate(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def generate(params: ParamsDollarResourceDollarReportsDollarGenerate): GaxiosPromise[Schema$Report] = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarGenerate,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarGenerate,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def generate(params: ParamsDollarResourceDollarReportsDollarGenerate, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def generate(
    params: ParamsDollarResourceDollarReportsDollarGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  /**
    * doubleclicksearch.reports.get
    * @desc Polls for the status of a report request.
    * @alias doubleclicksearch.reports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.reportId ID of the report request being polled.
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
    * doubleclicksearch.reports.getFile
    * @desc Downloads a report file encoded in UTF-8.
    * @alias doubleclicksearch.reports.getFile
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.reportFragment The index of the report fragment to download.
    * @param {string} params.reportId ID of the report.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getFile(): GaxiosPromise[Unit] = js.native
  def getFile(callback: BodyResponseCallback[Unit]): Unit = js.native
  def getFile(params: ParamsDollarResourceDollarReportsDollarGetfile): GaxiosPromise[Unit] = js.native
  def getFile(params: ParamsDollarResourceDollarReportsDollarGetfile, callback: BodyResponseCallback[Unit]): Unit = js.native
  def getFile(
    params: ParamsDollarResourceDollarReportsDollarGetfile,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def getFile(params: ParamsDollarResourceDollarReportsDollarGetfile, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def getFile(
    params: ParamsDollarResourceDollarReportsDollarGetfile,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * doubleclicksearch.reports.request
    * @desc Inserts a report request into the reporting system.
    * @alias doubleclicksearch.reports.request
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ReportRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def request(): GaxiosPromise[Schema$Report] = js.native
  def request(callback: BodyResponseCallback[Schema$Report]): Unit = js.native
  def request(params: ParamsDollarResourceDollarReportsDollarRequest): GaxiosPromise[Schema$Report] = js.native
  def request(
    params: ParamsDollarResourceDollarReportsDollarRequest,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def request(
    params: ParamsDollarResourceDollarReportsDollarRequest,
    options: BodyResponseCallback[Schema$Report],
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
  def request(params: ParamsDollarResourceDollarReportsDollarRequest, options: MethodOptions): GaxiosPromise[Schema$Report] = js.native
  def request(
    params: ParamsDollarResourceDollarReportsDollarRequest,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Report]
  ): Unit = js.native
}

