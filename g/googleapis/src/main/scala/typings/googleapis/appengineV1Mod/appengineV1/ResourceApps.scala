package typings.googleapis.appengineV1Mod.appengineV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps")
@js.native
class ResourceApps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var authorizedCertificates: ResourceAppsAuthorizedcertificates = js.native
  var authorizedDomains: ResourceAppsAuthorizeddomains = js.native
  var context: APIRequestContext = js.native
  var domainMappings: ResourceAppsDomainmappings = js.native
  var firewall: ResourceAppsFirewall = js.native
  var locations: ResourceAppsLocations = js.native
  var operations: ResourceAppsOperations = js.native
  var services: ResourceAppsServices = js.native
  /**
    * appengine.apps.create
    * @desc Creates an App Engine application for a Google Cloud Platform
    * project. Required fields: id - The ID of the target Cloud Platform
    * project. location - The region
    * (https://cloud.google.com/appengine/docs/locations) where you want the
    * App Engine application located.For more information about App Engine
    * applications, see Managing Projects, Applications, and Billing
    * (https://cloud.google.com/appengine/docs/standard/python/console/).
    * @alias appengine.apps.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Application} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: ParamsResourceAppsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceAppsCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAppsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAppsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * appengine.apps.get
    * @desc Gets information about an application.
    * @alias appengine.apps.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the Application resource to get. Example: apps/myapp.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaApplication] = js.native
  def get(callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(params: ParamsResourceAppsGet): GaxiosPromise[SchemaApplication] = js.native
  def get(params: ParamsResourceAppsGet, callback: BodyResponseCallback[SchemaApplication]): Unit = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: BodyResponseCallback[SchemaApplication],
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  def get(params: ParamsResourceAppsGet, options: MethodOptions): GaxiosPromise[SchemaApplication] = js.native
  def get(
    params: ParamsResourceAppsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaApplication]
  ): Unit = js.native
  /**
    * appengine.apps.patch
    * @desc Updates the specified Application resource. You can update the
    * following fields: auth_domain - Google authentication domain for
    * controlling user access to the application. default_cookie_expiration -
    * Cookie expiration policy for the application.
    * @alias appengine.apps.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the Application resource to update. Example: apps/myapp.
    * @param {string=} params.updateMask Standard field mask for the set of fields to be updated.
    * @param {().Application} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: ParamsResourceAppsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAppsPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAppsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * appengine.apps.repair
    * @desc Recreates the required App Engine features for the specified App
    * Engine application, for example a Cloud Storage bucket or App Engine
    * service account. Use this method if you receive an error message about a
    * missing feature, for example, Error retrieving the App Engine service
    * account.
    * @alias appengine.apps.repair
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Name of the application to repair. Example: apps/myapp
    * @param {().RepairApplicationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def repair(): GaxiosPromise[SchemaOperation] = js.native
  def repair(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def repair(params: ParamsResourceAppsRepair): GaxiosPromise[SchemaOperation] = js.native
  def repair(params: ParamsResourceAppsRepair, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def repair(
    params: ParamsResourceAppsRepair,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def repair(params: ParamsResourceAppsRepair, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def repair(
    params: ParamsResourceAppsRepair,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

