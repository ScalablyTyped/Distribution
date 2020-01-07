package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Grouplicenseusers")
@js.native
class Resource$Grouplicenseusers protected () extends js.Object {
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
  def list(): GaxiosPromise[Schema$GroupLicenseUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GroupLicenseUsersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGrouplicenseusersDollarList): GaxiosPromise[Schema$GroupLicenseUsersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGrouplicenseusersDollarList,
    callback: BodyResponseCallback[Schema$GroupLicenseUsersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGrouplicenseusersDollarList,
    options: BodyResponseCallback[Schema$GroupLicenseUsersListResponse],
    callback: BodyResponseCallback[Schema$GroupLicenseUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGrouplicenseusersDollarList, options: MethodOptions): GaxiosPromise[Schema$GroupLicenseUsersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarGrouplicenseusersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GroupLicenseUsersListResponse]
  ): Unit = js.native
}

