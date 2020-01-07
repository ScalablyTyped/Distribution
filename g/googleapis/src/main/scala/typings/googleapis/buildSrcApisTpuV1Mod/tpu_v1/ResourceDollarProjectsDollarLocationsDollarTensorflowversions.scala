package typings.googleapis.buildSrcApisTpuV1Mod.tpu_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tpu/v1", "tpu_v1.Resource$Projects$Locations$Tensorflowversions")
@js.native
class ResourceDollarProjectsDollarLocationsDollarTensorflowversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tpu.projects.locations.tensorflowVersions.get
    * @desc Gets TensorFlow Version.
    * @alias tpu.projects.locations.tensorflowVersions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The resource name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TensorFlowVersion] = js.native
  def get(callback: BodyResponseCallback[Schema$TensorFlowVersion]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarGet): GaxiosPromise[Schema$TensorFlowVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarGet,
    callback: BodyResponseCallback[Schema$TensorFlowVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarGet,
    options: BodyResponseCallback[Schema$TensorFlowVersion],
    callback: BodyResponseCallback[Schema$TensorFlowVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$TensorFlowVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TensorFlowVersion]
  ): Unit = js.native
  /**
    * tpu.projects.locations.tensorflowVersions.list
    * @desc List TensorFlow versions supported by this API.
    * @alias tpu.projects.locations.tensorflowVersions.list
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
  def list(): GaxiosPromise[Schema$ListTensorFlowVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTensorFlowVersionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarList): GaxiosPromise[Schema$ListTensorFlowVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarList,
    callback: BodyResponseCallback[Schema$ListTensorFlowVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarList,
    options: BodyResponseCallback[Schema$ListTensorFlowVersionsResponse],
    callback: BodyResponseCallback[Schema$ListTensorFlowVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListTensorFlowVersionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarTensorflowversionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTensorFlowVersionsResponse]
  ): Unit = js.native
}

