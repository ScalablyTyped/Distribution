package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/websecurityscanner/v1alpha", "websecurityscanner_v1alpha.Resource$Projects$Scanconfigs")
@js.native
class ResourceDollarProjectsDollarScanconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var scanRuns: ResourceDollarProjectsDollarScanconfigsDollarScanruns = js.native
  /**
    * websecurityscanner.projects.scanConfigs.create
    * @desc Creates a new ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource name where the scan is created, which should be a project resource name in the format 'projects/{projectId}'.
    * @param {().ScanConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ScanConfig] = js.native
  def create(callback: BodyResponseCallback[Schema$ScanConfig]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarCreate): GaxiosPromise[Schema$ScanConfig] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarCreate,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarCreate,
    options: BodyResponseCallback[Schema$ScanConfig],
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$ScanConfig] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanConfig]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.delete
    * @desc Deletes an existing ScanConfig and its child resources.
    * @alias websecurityscanner.projects.scanConfigs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanConfig to be deleted. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * websecurityscanner.projects.scanConfigs.get
    * @desc Gets a ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanConfig to be returned. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
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
    * websecurityscanner.projects.scanConfigs.list
    * @desc Lists ScanConfigs under a given project.
    * @alias websecurityscanner.projects.scanConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of ScanConfigs to return, can be limited by server. If not specified or not positive, the implementation will select a reasonable value.
    * @param {string=} params.pageToken A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous List request. If unspecified, the first page of results is returned.
    * @param {string} params.parent Required. The parent resource name, which should be a project resource name in the format 'projects/{projectId}'.
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
    * websecurityscanner.projects.scanConfigs.patch
    * @desc Updates a ScanConfig. This method support partial update of a
    * ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name of the ScanConfig. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'. The ScanConfig IDs are generated by the system.
    * @param {string=} params.updateMask Required. The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
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
  /**
    * websecurityscanner.projects.scanConfigs.start
    * @desc Start a ScanRun according to the given ScanConfig.
    * @alias websecurityscanner.projects.scanConfigs.start
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The resource name of the ScanConfig to be used. The name follows the format of 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    * @param {().StartScanRunRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def start(): GaxiosPromise[Schema$ScanRun] = js.native
  def start(callback: BodyResponseCallback[Schema$ScanRun]): Unit = js.native
  def start(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarStart): GaxiosPromise[Schema$ScanRun] = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarStart,
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarStart,
    options: BodyResponseCallback[Schema$ScanRun],
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
  def start(params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarStart, options: MethodOptions): GaxiosPromise[Schema$ScanRun] = js.native
  def start(
    params: ParamsDollarResourceDollarProjectsDollarScanconfigsDollarStart,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ScanRun]
  ): Unit = js.native
}

