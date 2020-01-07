package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises")
@js.native
class Resource$Enterprises protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var applications: ResourceDollarEnterprisesDollarApplications = js.native
  var context: APIRequestContext = js.native
  var devices: ResourceDollarEnterprisesDollarDevices = js.native
  var enrollmentTokens: ResourceDollarEnterprisesDollarEnrollmenttokens = js.native
  var policies: ResourceDollarEnterprisesDollarPolicies = js.native
  var webApps: ResourceDollarEnterprisesDollarWebapps = js.native
  var webTokens: ResourceDollarEnterprisesDollarWebtokens = js.native
  /**
    * androidmanagement.enterprises.create
    * @desc Creates an enterprise. This is the last step in the enterprise
    * signup flow.
    * @alias androidmanagement.enterprises.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.enterpriseToken The enterprise token appended to the callback URL.
    * @param {string=} params.projectId The ID of the Google Cloud Platform project which will own the enterprise.
    * @param {string=} params.signupUrlName The name of the SignupUrl used to sign up for the enterprise.
    * @param {().Enterprise} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Enterprise] = js.native
  def create(callback: BodyResponseCallback[Schema$Enterprise]): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarCreate): GaxiosPromise[Schema$Enterprise] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarCreate,
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarCreate,
    options: BodyResponseCallback[Schema$Enterprise],
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarEnterprisesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Enterprise] = js.native
  def create(
    params: ParamsDollarResourceDollarEnterprisesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.get
    * @desc Gets an enterprise.
    * @alias androidmanagement.enterprises.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Enterprise] = js.native
  def get(callback: BodyResponseCallback[Schema$Enterprise]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarGet): GaxiosPromise[Schema$Enterprise] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarGet,
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarGet,
    options: BodyResponseCallback[Schema$Enterprise],
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Enterprise] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.patch
    * @desc Updates an enterprise.
    * @alias androidmanagement.enterprises.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {string=} params.updateMask The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    * @param {().Enterprise} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Enterprise] = js.native
  def patch(callback: BodyResponseCallback[Schema$Enterprise]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarPatch): GaxiosPromise[Schema$Enterprise] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarPatch,
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarPatch,
    options: BodyResponseCallback[Schema$Enterprise],
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Enterprise] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Enterprise]
  ): Unit = js.native
}

