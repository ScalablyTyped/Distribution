package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Services$Versions")
@js.native
class ResourceAppsServicesVersions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var instances: ResourceAppsServicesVersionsInstances = js.native
  /**
    * appengine.apps.services.versions.create
    * @desc Deploys code and resource files to a new version.
    * @alias appengine.apps.services.versions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent resource to create this version under. Example: apps/myapp/services/default.
    * @param {string} params.servicesId Part of `parent`. See documentation of `appsId`.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsServicesVersionsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsServicesVersionsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceAppsServicesVersionsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAppsServicesVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAppsServicesVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * appengine.apps.services.versions.delete
    * @desc Deletes an existing Version resource.
    * @alias appengine.apps.services.versions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.versionsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesVersionsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesVersionsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsServicesVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * appengine.apps.services.versions.get
    * @desc Gets the specified Version resource. By default, only a BASIC_VIEW
    * will be returned. Specify the FULL_VIEW parameter to get the full
    * resource.
    * @alias appengine.apps.services.versions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string} params.versionsId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.view Controls the set of fields returned in the Get response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceAppsServicesVersionsGet): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceAppsServicesVersionsGet, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsGet,
    options: BodyResponseCallback[SchemaVersion],
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  def get(params: ParamsResourceAppsServicesVersionsGet, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * appengine.apps.services.versions.list
    * @desc Lists the versions of a service.
    * @alias appengine.apps.services.versions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `parent`. Name of the parent Service resource. Example: apps/myapp/services/default.
    * @param {integer=} params.pageSize Maximum results to return per page.
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.servicesId Part of `parent`. See documentation of `appsId`.
    * @param {string=} params.view Controls the set of fields returned in the List response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourceAppsServicesVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    options: BodyResponseCallback[SchemaListVersionsResponse],
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsServicesVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  /**
    * appengine.apps.services.versions.patch
    * @desc Updates the specified Version resource. You can specify the
    * following fields depending on the App Engine environment and type of
    * scaling that the version resource uses:Standard environment
    * instance_class
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.instance_class)automatic
    * scaling in the standard environment: automatic_scaling.min_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.max_idle_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automaticScaling.standard_scheduler_settings.max_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StandardSchedulerSettings)
    * automaticScaling.standard_scheduler_settings.min_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StandardSchedulerSettings)
    * automaticScaling.standard_scheduler_settings.target_cpu_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StandardSchedulerSettings)
    * automaticScaling.standard_scheduler_settings.target_throughput_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StandardSchedulerSettings)basic
    * scaling or manual scaling in the standard environment: serving_status
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.serving_status)Flexible
    * environment serving_status
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.serving_status)automatic
    * scaling in the flexible environment:
    * automatic_scaling.min_total_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.max_total_instances
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.cool_down_period_sec
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.automatic_scaling)
    * automatic_scaling.cpu_utilization.target_utilization
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#Version.FIELDS.automatic_scaling)
    * @alias appengine.apps.services.versions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the resource to update. Example: apps/myapp/services/default/versions/1.
    * @param {string} params.servicesId Part of `name`. See documentation of `appsId`.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {string} params.versionsId Part of `name`. See documentation of `appsId`.
    * @param {().Version} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsServicesVersionsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsServicesVersionsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAppsServicesVersionsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsServicesVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAppsServicesVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

