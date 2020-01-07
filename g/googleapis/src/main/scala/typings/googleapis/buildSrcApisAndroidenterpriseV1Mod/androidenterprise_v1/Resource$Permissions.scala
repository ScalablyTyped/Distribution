package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Permissions")
@js.native
class Resource$Permissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.permissions.get
    * @desc Retrieves details of an Android app permission for display to an
    * enterprise admin.
    * @alias androidenterprise.permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The BCP47 tag for the user's preferred language (e.g. "en-US", "de")
    * @param {string} params.permissionId The ID of the permission.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Permission] = js.native
  def get(callback: BodyResponseCallback[Schema$Permission]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPermissionsDollarGet): GaxiosPromise[Schema$Permission] = js.native
  def get(
    params: ParamsDollarResourceDollarPermissionsDollarGet,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPermissionsDollarGet,
    options: BodyResponseCallback[Schema$Permission],
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPermissionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Permission] = js.native
  def get(
    params: ParamsDollarResourceDollarPermissionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
}

