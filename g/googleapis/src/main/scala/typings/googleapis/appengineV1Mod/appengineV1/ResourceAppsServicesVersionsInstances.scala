package typings.googleapis.appengineV1Mod.appengineV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Services$Versions$Instances")
@js.native
class ResourceAppsServicesVersionsInstances protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * appengine.apps.services.versions.instances.debug
    * @desc Enables debugging on a VM instance. This allows you to use the SSH
    * command to connect to the virtual machine where the instance lives. While
    * in "debug mode", the instance continues to serve live traffic. You should
    * delete the instance when you are done debugging and then allow the system
    * to take over and determine if another instance should be started.Only
    * applicable for instances in App Engine flexible environment.
    * @alias appengine.apps.services.versions.instances.debug
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
    * @param {string} params.instancesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.versionsId Part of `name`. See documentation of `appsId`.
    * @param {().DebugInstanceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def debug(): GaxiosPromise[SchemaOperation] = js.native
  def debug(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def debug(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def debug(params: ParamsResourceAppsServicesVersionsInstancesDebug): GaxiosPromise[SchemaOperation] = js.native
  def debug(
    params: ParamsResourceAppsServicesVersionsInstancesDebug,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def debug(
    params: ParamsResourceAppsServicesVersionsInstancesDebug,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def debug(params: ParamsResourceAppsServicesVersionsInstancesDebug, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def debug(
    params: ParamsResourceAppsServicesVersionsInstancesDebug,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * appengine.apps.services.versions.instances.delete
    * @desc Stops a running instance.
    * @alias appengine.apps.services.versions.instances.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
    * @param {string} params.instancesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.versionsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesVersionsInstancesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsInstancesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsInstancesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsServicesVersionsInstancesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsInstancesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * appengine.apps.services.versions.instances.get
    * @desc Gets instance information.
    * @alias appengine.apps.services.versions.instances.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
    * @param {string} params.instancesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.versionsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstance] = js.native
  def get(callback: BodyResponseCallback[SchemaInstance]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(params: ParamsResourceAppsServicesVersionsInstancesGet): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsInstancesGet,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsInstancesGet,
    options: BodyResponseCallback[SchemaInstance],
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  def get(params: ParamsResourceAppsServicesVersionsInstancesGet, options: MethodOptions): GaxiosPromise[SchemaInstance] = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsInstancesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstance]
  ): Unit = js.native
  
  /**
    * appengine.apps.services.versions.instances.list
    * @desc Lists the instances of a version.Tip: To aggregate details about
    * instances over time, see the Stackdriver Monitoring API
    * (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list).
    * @alias appengine.apps.services.versions.instances.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Version resource. Example: apps/myapp/services/default/versions/v1.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.servicesId Part of `parent`. See documentation of `appsId`.
    * @param {string} params.versionsId Part of `parent`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListInstancesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(params: ParamsResourceAppsServicesVersionsInstancesList): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsInstancesList,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsInstancesList,
    options: BodyResponseCallback[SchemaListInstancesResponse],
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsServicesVersionsInstancesList, options: MethodOptions): GaxiosPromise[SchemaListInstancesResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsInstancesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListInstancesResponse]
  ): Unit = js.native
}
