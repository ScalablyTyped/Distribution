package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Permissions")
@js.native
class ResourcePermissions protected () extends js.Object {
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
  def get(): GaxiosPromise[SchemaPermission] = js.native
  def get(callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def get(params: ParamsResourcePermissionsGet): GaxiosPromise[SchemaPermission] = js.native
  def get(params: ParamsResourcePermissionsGet, callback: BodyResponseCallback[SchemaPermission]): Unit = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: BodyResponseCallback[SchemaPermission],
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
  def get(params: ParamsResourcePermissionsGet, options: MethodOptions): GaxiosPromise[SchemaPermission] = js.native
  def get(
    params: ParamsResourcePermissionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPermission]
  ): Unit = js.native
}

