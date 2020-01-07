package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/spanner/v1", "spanner_v1.Resource$Projects$Instanceconfigs")
@js.native
class ResourceDollarProjectsDollarInstanceconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * spanner.projects.instanceConfigs.get
    * @desc Gets information about a particular instance configuration.
    * @alias spanner.projects.instanceConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the requested instance configuration. Values are of the form `projects/<project>/instanceConfigs/<config>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$InstanceConfig] = js.native
  def get(callback: BodyResponseCallback[Schema$InstanceConfig]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarGet): GaxiosPromise[Schema$InstanceConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarGet,
    callback: BodyResponseCallback[Schema$InstanceConfig]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarGet,
    options: BodyResponseCallback[Schema$InstanceConfig],
    callback: BodyResponseCallback[Schema$InstanceConfig]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarGet, options: MethodOptions): GaxiosPromise[Schema$InstanceConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceConfig]
  ): Unit = js.native
  /**
    * spanner.projects.instanceConfigs.list
    * @desc Lists the supported instance configurations for a given project.
    * @alias spanner.projects.instanceConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of instance configurations to be returned in the response. If 0 or less, defaults to the server's maximum allowed page size.
    * @param {string=} params.pageToken If non-empty, `page_token` should contain a next_page_token from a previous ListInstanceConfigsResponse.
    * @param {string} params.parent Required. The name of the project for which a list of supported instance configurations is requested. Values are of the form `projects/<project>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListInstanceConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListInstanceConfigsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarList): GaxiosPromise[Schema$ListInstanceConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarList,
    callback: BodyResponseCallback[Schema$ListInstanceConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarList,
    options: BodyResponseCallback[Schema$ListInstanceConfigsResponse],
    callback: BodyResponseCallback[Schema$ListInstanceConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListInstanceConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarInstanceconfigsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListInstanceConfigsResponse]
  ): Unit = js.native
}

