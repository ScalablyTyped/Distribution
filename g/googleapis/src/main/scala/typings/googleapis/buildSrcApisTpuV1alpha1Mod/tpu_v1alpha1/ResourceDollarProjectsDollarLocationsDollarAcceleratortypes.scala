package typings.googleapis.buildSrcApisTpuV1alpha1Mod.tpu_v1alpha1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1alpha1", "tpu_v1alpha1.Resource$Projects$Locations$Acceleratortypes")
@js.native
class ResourceDollarProjectsDollarLocationsDollarAcceleratortypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tpu.projects.locations.acceleratorTypes.get
    * @desc Gets AcceleratorType.
    * @alias tpu.projects.locations.acceleratorTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AcceleratorType] = js.native
  def get(callback: BodyResponseCallback[Schema$AcceleratorType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarGet): GaxiosPromise[Schema$AcceleratorType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarGet,
    callback: BodyResponseCallback[Schema$AcceleratorType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarGet,
    options: BodyResponseCallback[Schema$AcceleratorType],
    callback: BodyResponseCallback[Schema$AcceleratorType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AcceleratorType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AcceleratorType]
  ): Unit = js.native
  /**
    * tpu.projects.locations.acceleratorTypes.list
    * @desc Lists accelerator types supported by this API.
    * @alias tpu.projects.locations.acceleratorTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter List filter.
    * @param {string=} params.orderBy Sort results.
    * @param {integer=} params.pageSize The maximum number of items to return.
    * @param {string=} params.pageToken The next_page_token value returned from a previous List request, if any.
    * @param {string} params.parent The parent resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAcceleratorTypesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAcceleratorTypesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarList): GaxiosPromise[Schema$ListAcceleratorTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarList,
    callback: BodyResponseCallback[Schema$ListAcceleratorTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarList,
    options: BodyResponseCallback[Schema$ListAcceleratorTypesResponse],
    callback: BodyResponseCallback[Schema$ListAcceleratorTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAcceleratorTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAcceleratortypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAcceleratorTypesResponse]
  ): Unit = js.native
}

