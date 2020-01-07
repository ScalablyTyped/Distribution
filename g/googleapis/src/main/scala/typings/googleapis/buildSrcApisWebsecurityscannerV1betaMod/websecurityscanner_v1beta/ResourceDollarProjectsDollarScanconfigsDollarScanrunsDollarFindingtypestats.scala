package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1beta", "websecurityscanner_v1beta.Resource$Projects$Scanconfigs$Scanruns$Findingtypestats")
@js.native
class ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestats protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findingTypeStats.list
    * @desc List all FindingTypeStats under a given ScanRun.
    * @alias
    * websecurityscanner.projects.scanConfigs.scanRuns.findingTypeStats.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFindingTypeStatsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList
  ): GaxiosPromise[Schema$ListFindingTypeStatsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    options: BodyResponseCallback[Schema$ListFindingTypeStatsResponse],
    callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFindingTypeStatsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFindingTypeStatsResponse]
  ): Unit = js.native
}

