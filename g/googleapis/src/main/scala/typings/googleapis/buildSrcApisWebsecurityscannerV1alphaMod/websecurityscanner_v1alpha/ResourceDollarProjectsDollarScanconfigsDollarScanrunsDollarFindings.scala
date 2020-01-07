package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs$Scanruns$Findings")
@js.native
class ResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findings.get
    * @desc Gets a Finding.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.findings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the Finding to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}/findings/{findingId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Finding] = js.native
  def get(callback: BodyResponseCallback[Schema$Finding]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarGet): GaxiosPromise[Schema$Finding] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarGet,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarGet,
    options: BodyResponseCallback[Schema$Finding],
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Finding] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Finding]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.scanRuns.findings.list
    * @desc List Findings under a given ScanRun.
    * @alias websecurityscanner.projects.scanConfigs.scanRuns.findings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression. The expression must be in the format: <field> <operator> <value>. Supported field: 'finding_type'. Supported operator: '='.
    * @param {integer=} params.pageSize The maximum number of Findings to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a scan run resource name in the format 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFindingsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFindingsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarList): GaxiosPromise[Schema$ListFindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarList,
    callback: BodyResponseCallback[Schema$ListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarList,
    options: BodyResponseCallback[Schema$ListFindingsResponse],
    callback: BodyResponseCallback[Schema$ListFindingsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFindingsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFindingsResponse]
  ): Unit = js.native
}

