package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Services")
@js.native
class ResourceAppsServices protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceAppsServicesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsServicesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAppsServicesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def get(): GaxiosPromise[SchemaService] = js.native
  def get(callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceAppsServicesGet): GaxiosPromise[SchemaService] = js.native
  def get(params: ParamsResourceAppsServicesGet, callback: BodyResponseCallback[SchemaService]): Unit = js.native
  def get(
    params: ParamsResourceAppsServicesGet,
    options: BodyResponseCallback[SchemaService],
    callback: BodyResponseCallback[SchemaService]
  ): Unit = js.native
  def get(params: ParamsResourceAppsServicesGet, options: MethodOptions): GaxiosPromise[SchemaService] = js.native
  def get(
    params: ParamsResourceAppsServicesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaService]
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
  def list(): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceAppsServicesList): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(params: ParamsResourceAppsServicesList, callback: BodyResponseCallback[SchemaListServicesResponse]): Unit = js.native
  def list(
    params: ParamsResourceAppsServicesList,
    options: BodyResponseCallback[SchemaListServicesResponse],
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsServicesList, options: MethodOptions): GaxiosPromise[SchemaListServicesResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListServicesResponse]
  ): Unit = js.native
  
  /**
    * appengine.apps.services.patch
    * @desc Updates the configuration of the specified service.
    * @alias appengine.apps.services.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to update. Example: apps/myapp/services/default.
    * @param {boolean=} params.migrateTraffic Set to true to gradually shift traffic to one or more versions that you specify. By default, traffic is shifted immediately. For gradual traffic migration, the target versions must be located within instances that are configured for both warmup requests (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#InboundServiceType) and automatic scaling (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#AutomaticScaling). You must specify the shardBy (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services#ShardBy) field in the Service resource. Gradual traffic migration is not supported in the App Engine flexible environment. For examples, see Migrating and Splitting Traffic (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {().Service} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsServicesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsServicesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAppsServicesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsServicesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAppsServicesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var versions: ResourceAppsServicesVersions = js.native
}
