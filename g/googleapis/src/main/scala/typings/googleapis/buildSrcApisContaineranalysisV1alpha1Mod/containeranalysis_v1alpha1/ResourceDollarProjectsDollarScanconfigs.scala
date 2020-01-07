package typings.googleapis.buildSrcApisContaineranalysisV1alpha1Mod.containeranalysis_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1alpha1", "containeranalysis_v1alpha1.Resource$Projects$Scanconfigs")
@js.native
class ResourceDollarProjectsDollarScanconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.scanConfigs.get
    * @desc Gets a specific scan configuration for a project.
    * @alias containeranalysis.projects.scanConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the ScanConfig in the form projects/{project_id}/scanConfigs/{scan_config_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ScanConfig] = js.native
  def get(callback: BodyResponseCallback[Schema$ScanConfig]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarGet): GaxiosPromise[Schema$ScanConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarGet,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarGet,
    options: BodyResponseCallback[Schema$ScanConfig],
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ScanConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  /**
    * containeranalysis.projects.scanConfigs.list
    * @desc Lists scan configurations for a project.
    * @alias containeranalysis.projects.scanConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize The number of items to return.
    * @param {string=} params.pageToken The page token to use for the next request.
    * @param {string} params.parent This containers the project Id i.e.: projects/{project_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListScanConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListScanConfigsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarList): GaxiosPromise[Schema$ListScanConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarList,
    callback: BodyResponseCallback[Schema$ListScanConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarList,
    options: BodyResponseCallback[Schema$ListScanConfigsResponse],
    callback: BodyResponseCallback[Schema$ListScanConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListScanConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListScanConfigsResponse]
  ): Unit = js.native
  /**
    * containeranalysis.projects.scanConfigs.patch
    * @desc Updates the scan configuration to a new value.
    * @alias containeranalysis.projects.scanConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The scan config to update of the form projects/{project_id}/scanConfigs/{scan_config_id}.
    * @param {string=} params.updateMask The fields to update.
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ScanConfig] = js.native
  def patch(callback: BodyResponseCallback[Schema$ScanConfig]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarPatch): GaxiosPromise[Schema$ScanConfig] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarPatch,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarPatch,
    options: BodyResponseCallback[Schema$ScanConfig],
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$ScanConfig] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
}

