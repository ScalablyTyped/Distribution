package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/iam/v1", "iam_v1.Resource$Permissions")
@js.native
class Resource$Permissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * iam.permissions.queryTestablePermissions
    * @desc Lists the permissions testable on a resource. A permission is
    * testable if it can be tested for an identity on a resource.
    * @alias iam.permissions.queryTestablePermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QueryTestablePermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def queryTestablePermissions(): GaxiosPromise[Schema$QueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(callback: BodyResponseCallback[Schema$QueryTestablePermissionsResponse]): Unit = js.native
  def queryTestablePermissions(params: ParamsDollarResourceDollarPermissionsDollarQuerytestablepermissions): GaxiosPromise[Schema$QueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(
    params: ParamsDollarResourceDollarPermissionsDollarQuerytestablepermissions,
    callback: BodyResponseCallback[Schema$QueryTestablePermissionsResponse]
  ): Unit = js.native
  def queryTestablePermissions(
    params: ParamsDollarResourceDollarPermissionsDollarQuerytestablepermissions,
    options: BodyResponseCallback[Schema$QueryTestablePermissionsResponse],
    callback: BodyResponseCallback[Schema$QueryTestablePermissionsResponse]
  ): Unit = js.native
  def queryTestablePermissions(
    params: ParamsDollarResourceDollarPermissionsDollarQuerytestablepermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$QueryTestablePermissionsResponse] = js.native
  def queryTestablePermissions(
    params: ParamsDollarResourceDollarPermissionsDollarQuerytestablepermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$QueryTestablePermissionsResponse]
  ): Unit = js.native
}

