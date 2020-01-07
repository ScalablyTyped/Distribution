package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps")
@js.native
class Resource$Apps protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var authorizedCertificates: ResourceDollarAppsDollarAuthorizedcertificates = js.native
  var authorizedDomains: ResourceDollarAppsDollarAuthorizeddomains = js.native
  var context: APIRequestContext = js.native
  var domainMappings: ResourceDollarAppsDollarDomainmappings = js.native
  var firewall: ResourceDollarAppsDollarFirewall = js.native
  var locations: ResourceDollarAppsDollarLocations = js.native
  var operations: ResourceDollarAppsDollarOperations = js.native
  var services: ResourceDollarAppsDollarServices = js.native
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
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAppsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAppsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAppsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def get(): GaxiosPromise[Schema$Application] = js.native
  def get(callback: BodyResponseCallback[Schema$Application]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarGet): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarGet,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarGet,
    options: BodyResponseCallback[Schema$Application],
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Application]
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
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAppsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAppsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def repair(): GaxiosPromise[Schema$Operation] = js.native
  def repair(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def repair(params: ParamsDollarResourceDollarAppsDollarRepair): GaxiosPromise[Schema$Operation] = js.native
  def repair(
    params: ParamsDollarResourceDollarAppsDollarRepair,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def repair(
    params: ParamsDollarResourceDollarAppsDollarRepair,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def repair(params: ParamsDollarResourceDollarAppsDollarRepair, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def repair(
    params: ParamsDollarResourceDollarAppsDollarRepair,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

