package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns")
@js.native
class ResourceDollarProjectsDollarScanconfigsDollarScanruns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var crawledUrls: ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarCrawledurls = js.native
  var findingTypeStats: ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestats = js.native
  var findings: ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindings = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.get
    * @desc Gets a ScanRun.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanRun to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ScanRun] = js.native
  def get(callback: BodyResponseCallback[Schema$ScanRun]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarGet): GaxiosPromise[Schema$ScanRun] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarGet,
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarGet,
    options: BodyResponseCallback[Schema$ScanRun],
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ScanRun] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.list
    * @desc Lists ScanRuns under a given ScanConfig, in descending order of
    * ScanRun stop time.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of ScanRuns to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a scan resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListScanRunsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListScanRunsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarList): GaxiosPromise[Schema$ListScanRunsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarList,
    callback: BodyResponseCallback[Schema$ListScanRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarList,
    options: BodyResponseCallback[Schema$ListScanRunsResponse],
    callback: BodyResponseCallback[Schema$ListScanRunsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListScanRunsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListScanRunsResponse]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.stop
    * @desc Stops a ScanRun. The stopped ScanRun is returned.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.stop
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanRun to be stopped. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {().StopScanRunRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def stop(): GaxiosPromise[Schema$ScanRun] = js.native
  def stop(callback: BodyResponseCallback[Schema$ScanRun]): Unit = js.native
  def stop(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarStop): GaxiosPromise[Schema$ScanRun] = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarStop,
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarStop,
    options: BodyResponseCallback[Schema$ScanRun],
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarStop,
    options: MethodOptions
  ): GaxiosPromise[Schema$ScanRun] = js.native
  def stop(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarStop,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
}

