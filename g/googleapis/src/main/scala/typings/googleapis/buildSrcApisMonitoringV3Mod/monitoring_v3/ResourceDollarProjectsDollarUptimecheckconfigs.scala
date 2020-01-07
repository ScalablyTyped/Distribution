package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Projects$Uptimecheckconfigs")
@js.native
class ResourceDollarProjectsDollarUptimecheckconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.projects.uptimeCheckConfigs.create
    * @desc Creates a new uptime check configuration.
    * @alias monitoring.projects.uptimeCheckConfigs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The project in which to create the uptime check. The format  is projects/[PROJECT_ID].
    * @param {().UptimeCheckConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def create(callback: BodyResponseCallback[Schema$UptimeCheckConfig]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarCreate): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarCreate,
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarCreate,
    options: BodyResponseCallback[Schema$UptimeCheckConfig],
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  /**
    * monitoring.projects.uptimeCheckConfigs.delete
    * @desc Deletes an uptime check configuration. Note that this method will
    * fail if the uptime check configuration is referenced by an alert policy
    * or other dependent configs that would be rendered invalid by the
    * deletion.
    * @alias monitoring.projects.uptimeCheckConfigs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The uptime check configuration to delete. The format  is projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * monitoring.projects.uptimeCheckConfigs.get
    * @desc Gets a single uptime check configuration.
    * @alias monitoring.projects.uptimeCheckConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The uptime check configuration to retrieve. The format  is projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def get(callback: BodyResponseCallback[Schema$UptimeCheckConfig]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarGet): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarGet,
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarGet,
    options: BodyResponseCallback[Schema$UptimeCheckConfig],
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  /**
    * monitoring.projects.uptimeCheckConfigs.list
    * @desc Lists the existing valid uptime check configurations for the
    * project, leaving out any invalid configurations.
    * @alias monitoring.projects.uptimeCheckConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned.
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call.
    * @param {string} params.parent The project whose uptime check configurations are listed. The format  is projects/[PROJECT_ID].
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListUptimeCheckConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListUptimeCheckConfigsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarList): GaxiosPromise[Schema$ListUptimeCheckConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarList,
    callback: BodyResponseCallback[Schema$ListUptimeCheckConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarList,
    options: BodyResponseCallback[Schema$ListUptimeCheckConfigsResponse],
    callback: BodyResponseCallback[Schema$ListUptimeCheckConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListUptimeCheckConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListUptimeCheckConfigsResponse]
  ): Unit = js.native
  /**
    * monitoring.projects.uptimeCheckConfigs.patch
    * @desc Updates an uptime check configuration. You can either replace the
    * entire configuration with a new one or replace only certain fields in the
    * current configuration by specifying the fields to be updated via
    * "updateMask". Returns the updated configuration.
    * @alias monitoring.projects.uptimeCheckConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name A unique resource name for this UptimeCheckConfig. The format is:projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].This field should be omitted when creating the uptime check configuration; on create, the resource name is assigned by the server and included in the response.
    * @param {string=} params.updateMask Optional. If present, only the listed fields in the current uptime check configuration are updated with values from the new configuration. If this field is empty, then the current configuration is completely replaced with the new configuration.
    * @param {().UptimeCheckConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def patch(callback: BodyResponseCallback[Schema$UptimeCheckConfig]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarPatch): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarPatch,
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarPatch,
    options: BodyResponseCallback[Schema$UptimeCheckConfig],
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$UptimeCheckConfig] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarUptimecheckconfigsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UptimeCheckConfig]
  ): Unit = js.native
}

