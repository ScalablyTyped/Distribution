package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Grouplicenseusers")
@js.native
class ResourceGrouplicenseusers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.grouplicenseusers.list
    * @desc Retrieves the IDs of the users who have been granted entitlements
    * under the license.
    * @alias androidenterprise.grouplicenseusers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.groupLicenseId The ID of the product the group license is for, e.g. "app:com.google.android.gm".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(params: ParamsResourceGrouplicenseusersList): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    options: BodyResponseCallback[SchemaGroupLicenseUsersListResponse],
    callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceGrouplicenseusersList, options: MethodOptions): GaxiosPromise[SchemaGroupLicenseUsersListResponse] = js.native
  def list(
    params: ParamsResourceGrouplicenseusersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGroupLicenseUsersListResponse]
  ): Unit = js.native
}

