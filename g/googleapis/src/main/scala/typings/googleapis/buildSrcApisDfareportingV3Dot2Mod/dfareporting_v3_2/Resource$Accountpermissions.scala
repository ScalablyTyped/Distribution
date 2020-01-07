package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Accountpermissions")
@js.native
class Resource$Accountpermissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.accountPermissions.get
    * @desc Gets one account permission by ID.
    * @alias dfareporting.accountPermissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Account permission ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccountPermission] = js.native
  def get(callback: BodyResponseCallback[Schema$AccountPermission]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountpermissionsDollarGet): GaxiosPromise[Schema$AccountPermission] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountpermissionsDollarGet,
    callback: BodyResponseCallback[Schema$AccountPermission]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountpermissionsDollarGet,
    options: BodyResponseCallback[Schema$AccountPermission],
    callback: BodyResponseCallback[Schema$AccountPermission]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountpermissionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccountPermission] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountpermissionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountPermission]
  ): Unit = js.native
  /**
    * dfareporting.accountPermissions.list
    * @desc Retrieves the list of account permissions.
    * @alias dfareporting.accountPermissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountPermissionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountPermissionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountpermissionsDollarList): GaxiosPromise[Schema$AccountPermissionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountpermissionsDollarList,
    callback: BodyResponseCallback[Schema$AccountPermissionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountpermissionsDollarList,
    options: BodyResponseCallback[Schema$AccountPermissionsListResponse],
    callback: BodyResponseCallback[Schema$AccountPermissionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountpermissionsDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountPermissionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountpermissionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountPermissionsListResponse]
  ): Unit = js.native
}

