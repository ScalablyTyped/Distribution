package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Userrolepermissions")
@js.native
class Resource$Userrolepermissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.userRolePermissions.get
    * @desc Gets one user role permission by ID.
    * @alias dfareporting.userRolePermissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role permission ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserRolePermission] = js.native
  def get(callback: BodyResponseCallback[Schema$UserRolePermission]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserrolepermissionsDollarGet): GaxiosPromise[Schema$UserRolePermission] = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolepermissionsDollarGet,
    callback: BodyResponseCallback[Schema$UserRolePermission]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolepermissionsDollarGet,
    options: BodyResponseCallback[Schema$UserRolePermission],
    callback: BodyResponseCallback[Schema$UserRolePermission]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserrolepermissionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserRolePermission] = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolepermissionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRolePermission]
  ): Unit = js.native
  /**
    * dfareporting.userRolePermissions.list
    * @desc Gets a list of user role permissions, possibly filtered.
    * @alias dfareporting.userRolePermissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Select only user role permissions with these IDs.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UserRolePermissionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$UserRolePermissionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserrolepermissionsDollarList): GaxiosPromise[Schema$UserRolePermissionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolepermissionsDollarList,
    callback: BodyResponseCallback[Schema$UserRolePermissionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolepermissionsDollarList,
    options: BodyResponseCallback[Schema$UserRolePermissionsListResponse],
    callback: BodyResponseCallback[Schema$UserRolePermissionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserrolepermissionsDollarList, options: MethodOptions): GaxiosPromise[Schema$UserRolePermissionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolepermissionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRolePermissionsListResponse]
  ): Unit = js.native
}

