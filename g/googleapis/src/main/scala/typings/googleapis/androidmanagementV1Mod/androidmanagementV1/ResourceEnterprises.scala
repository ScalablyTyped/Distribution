package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises")
@js.native
class ResourceEnterprises protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var applications: ResourceEnterprisesApplications = js.native
  var context: APIRequestContext = js.native
  var devices: ResourceEnterprisesDevices = js.native
  var enrollmentTokens: ResourceEnterprisesEnrollmenttokens = js.native
  var policies: ResourceEnterprisesPolicies = js.native
  var webApps: ResourceEnterprisesWebapps = js.native
  var webTokens: ResourceEnterprisesWebtokens = js.native
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
  def create(): GaxiosPromise[SchemaEnterprise] = js.native
  def create(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def create(params: ParamsResourceEnterprisesCreate): GaxiosPromise[SchemaEnterprise] = js.native
  def create(params: ParamsResourceEnterprisesCreate, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesCreate,
    options: BodyResponseCallback[SchemaEnterprise],
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesCreate, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def create(
    params: ParamsResourceEnterprisesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
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
  def get(): GaxiosPromise[SchemaEnterprise] = js.native
  def get(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet): GaxiosPromise[SchemaEnterprise] = js.native
  def get(params: ParamsResourceEnterprisesGet, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: BodyResponseCallback[SchemaEnterprise],
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesGet, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def get(
    params: ParamsResourceEnterprisesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
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
  def patch(): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(params: ParamsResourceEnterprisesPatch): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(params: ParamsResourceEnterprisesPatch, callback: BodyResponseCallback[SchemaEnterprise]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesPatch,
    options: BodyResponseCallback[SchemaEnterprise],
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesPatch, options: MethodOptions): GaxiosPromise[SchemaEnterprise] = js.native
  def patch(
    params: ParamsResourceEnterprisesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEnterprise]
  ): Unit = js.native
}

