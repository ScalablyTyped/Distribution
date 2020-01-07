package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Services")
@js.native
class ResourceDollarAppsDollarServices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var versions: ResourceDollarAppsDollarServicesDollarVersions = js.native
  /**
    * appengine.apps.services.delete
    * @desc Deletes the specified service and all enclosed versions.
    * @alias appengine.apps.services.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarServicesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarServicesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * appengine.apps.services.get
    * @desc Gets the current configuration of the specified service.
    * @alias appengine.apps.services.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Service] = js.native
  def get(callback: BodyResponseCallback[Schema$Service]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarServicesDollarGet): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarGet,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarGet,
    options: BodyResponseCallback[Schema$Service],
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarServicesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Service] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Service]
  ): Unit = js.native
  /**
    * appengine.apps.services.list
    * @desc Lists all the services in the application.
    * @alias appengine.apps.services.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListServicesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarServicesDollarList): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarList,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarList,
    options: BodyResponseCallback[Schema$ListServicesResponse],
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarServicesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListServicesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListServicesResponse]
  ): Unit = js.native
  /**
    * appengine.apps.services.patch
    * @desc Updates the configuration of the specified service.
    * @alias appengine.apps.services.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to update. Example: apps/myapp/services/default.
    * @param {boolean=} params.migrateTraffic Set to true to gradually shift traffic to one or more versions that you specify. By default, traffic is shifted immediately. For gradual traffic migration, the target versions must be located within instances that are configured for both warmup requests (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#InboundServiceType) and automatic scaling (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#AutomaticScaling). You must specify the shardBy (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services#ShardBy) field in the Service resource. Gradual traffic migration is not supported in the App Engine flexible environment. For examples, see Migrating and Splitting Traffic (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarServicesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarServicesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

