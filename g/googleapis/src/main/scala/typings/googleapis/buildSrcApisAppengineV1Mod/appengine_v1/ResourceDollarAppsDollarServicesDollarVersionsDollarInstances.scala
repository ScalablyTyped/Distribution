package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Services$Versions$Instances")
@js.native
class ResourceDollarAppsDollarServicesDollarVersionsDollarInstances protected () extends js.Object {
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
  def debug(): GaxiosPromise[Schema$Operation] = js.native
  def debug(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def debug(params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDebug): GaxiosPromise[Schema$Operation] = js.native
  def debug(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDebug,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def debug(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDebug,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def debug(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDebug,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def debug(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDebug,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def get(): GaxiosPromise[Schema$Instance] = js.native
  def get(callback: BodyResponseCallback[Schema$Instance]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarGet): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarGet,
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarGet,
    options: BodyResponseCallback[Schema$Instance],
    callback: BodyResponseCallback[Schema$Instance]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Instance] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Instance]
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
  def list(): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListInstancesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarList): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarList,
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarList,
    options: BodyResponseCallback[Schema$ListInstancesResponse],
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListInstancesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarServicesDollarVersionsDollarInstancesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListInstancesResponse]
  ): Unit = js.native
}

