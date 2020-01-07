package typings.googleapis.buildSrcApisContaineranalysisV1beta1Mod.containeranalysis_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/containeranalysis/v1beta1", "containeranalysis_v1beta1.Resource$Projects$Scanconfigs")
@js.native
class ResourceDollarProjectsDollarScanconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * containeranalysis.projects.scanConfigs.get
    * @desc Gets the specified scan configuration.
    * @alias containeranalysis.projects.scanConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`.
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
    * @desc Lists scan configurations for the specified project.
    * @alias containeranalysis.projects.scanConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter expression.
    * @param {integer=} params.pageSize The number of scan configs to return in the list.
    * @param {string=} params.pageToken Token to provide to skip to a particular spot in the list.
    * @param {string} params.parent The name of the project to list scan configurations for in the form of `projects/[PROJECT_ID]`.
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
    * containeranalysis.projects.scanConfigs.update
    * @desc Updates the specified scan configuration.
    * @alias containeranalysis.projects.scanConfigs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`.
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ScanConfig] = js.native
  def update(callback: BodyResponseCallback[Schema$ScanConfig]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarUpdate): GaxiosPromise[Schema$ScanConfig] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarUpdate,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarUpdate,
    options: BodyResponseCallback[Schema$ScanConfig],
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ScanConfig] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
}

