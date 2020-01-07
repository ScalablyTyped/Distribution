package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Accountpermissiongroups")
@js.native
class Resource$Accountpermissiongroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.accountPermissionGroups.get
    * @desc Gets one account permission group by ID.
    * @alias dfareporting.accountPermissionGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account permission group ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccountPermissionGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$AccountPermissionGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountpermissiongroupsDollarGet): GaxiosPromise[Schema$AccountPermissionGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountpermissiongroupsDollarGet,
    callback: BodyResponseCallback[Schema$AccountPermissionGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountpermissiongroupsDollarGet,
    options: BodyResponseCallback[Schema$AccountPermissionGroup],
    callback: BodyResponseCallback[Schema$AccountPermissionGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountpermissiongroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccountPermissionGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountpermissiongroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountPermissionGroup]
  ): Unit = js.native
  /**
    * dfareporting.accountPermissionGroups.list
    * @desc Retrieves the list of account permission groups.
    * @alias dfareporting.accountPermissionGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountPermissionGroupsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountPermissionGroupsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountpermissiongroupsDollarList): GaxiosPromise[Schema$AccountPermissionGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountpermissiongroupsDollarList,
    callback: BodyResponseCallback[Schema$AccountPermissionGroupsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountpermissiongroupsDollarList,
    options: BodyResponseCallback[Schema$AccountPermissionGroupsListResponse],
    callback: BodyResponseCallback[Schema$AccountPermissionGroupsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountpermissiongroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountPermissionGroupsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountpermissiongroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountPermissionGroupsListResponse]
  ): Unit = js.native
}

