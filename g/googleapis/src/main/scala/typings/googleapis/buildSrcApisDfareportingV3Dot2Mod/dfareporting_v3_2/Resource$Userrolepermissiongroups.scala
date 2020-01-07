package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Userrolepermissiongroups")
@js.native
class Resource$Userrolepermissiongroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.userRolePermissionGroups.get
    * @desc Gets one user role permission group by ID.
    * @alias dfareporting.userRolePermissionGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role permission group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserRolePermissionGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$UserRolePermissionGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarGet): GaxiosPromise[Schema$UserRolePermissionGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarGet,
    callback: BodyResponseCallback[Schema$UserRolePermissionGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarGet,
    options: BodyResponseCallback[Schema$UserRolePermissionGroup],
    callback: BodyResponseCallback[Schema$UserRolePermissionGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserRolePermissionGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRolePermissionGroup]
  ): Unit = js.native
  /**
    * dfareporting.userRolePermissionGroups.list
    * @desc Gets a list of all supported user role permission groups.
    * @alias dfareporting.userRolePermissionGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UserRolePermissionGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$UserRolePermissionGroupsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarList): GaxiosPromise[Schema$UserRolePermissionGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarList,
    callback: BodyResponseCallback[Schema$UserRolePermissionGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarList,
    options: BodyResponseCallback[Schema$UserRolePermissionGroupsListResponse],
    callback: BodyResponseCallback[Schema$UserRolePermissionGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$UserRolePermissionGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolepermissiongroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRolePermissionGroupsListResponse]
  ): Unit = js.native
}

