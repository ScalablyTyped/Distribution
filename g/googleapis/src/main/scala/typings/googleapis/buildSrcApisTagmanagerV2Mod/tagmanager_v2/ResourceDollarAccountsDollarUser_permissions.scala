package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v2", "tagmanager_v2.Resource$Accounts$User_permissions")
@js.native
class ResourceDollarAccountsDollarUser_permissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.user_permissions.create
    * @desc Creates a user's Account & Container access.
    * @alias tagmanager.accounts.user_permissions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent GTM Account's API relative path. Example: accounts/{account_id}
    * @param {().UserPermission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$UserPermission] = js.native
  def create(callback: BodyResponseCallback[Schema$UserPermission]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarCreate): GaxiosPromise[Schema$UserPermission] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarCreate,
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarCreate,
    options: BodyResponseCallback[Schema$UserPermission],
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$UserPermission] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  /**
    * tagmanager.accounts.user_permissions.delete
    * @desc Removes a user from the account, revoking access to it and all of
    * its containers.
    * @alias tagmanager.accounts.user_permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM UserPermission's API relative path. Example: accounts/{account_id}/user_permissions/{user_permission_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.user_permissions.get
    * @desc Gets a user's Account & Container access.
    * @alias tagmanager.accounts.user_permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM UserPermission's API relative path. Example: accounts/{account_id}/user_permissions/{user_permission_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserPermission] = js.native
  def get(callback: BodyResponseCallback[Schema$UserPermission]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarGet): GaxiosPromise[Schema$UserPermission] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarGet,
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarGet,
    options: BodyResponseCallback[Schema$UserPermission],
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserPermission] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  /**
    * tagmanager.accounts.user_permissions.list
    * @desc List all users that have access to the account along with Account
    * and Container user access granted to each of them.
    * @alias tagmanager.accounts.user_permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.pageToken Continuation token for fetching the next page of results.
    * @param {string} params.parent GTM Accounts's API relative path. Example: accounts/{account_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListUserPermissionsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListUserPermissionsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarList): GaxiosPromise[Schema$ListUserPermissionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarList,
    callback: BodyResponseCallback[Schema$ListUserPermissionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarList,
    options: BodyResponseCallback[Schema$ListUserPermissionsResponse],
    callback: BodyResponseCallback[Schema$ListUserPermissionsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListUserPermissionsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListUserPermissionsResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.user_permissions.update
    * @desc Updates a user's Account & Container access.
    * @alias tagmanager.accounts.user_permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.path GTM UserPermission's API relative path. Example: accounts/{account_id}/user_permissions/{user_permission_id}
    * @param {().UserPermission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$UserPermission] = js.native
  def update(callback: BodyResponseCallback[Schema$UserPermission]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarUpdate): GaxiosPromise[Schema$UserPermission] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarUpdate,
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarUpdate,
    options: BodyResponseCallback[Schema$UserPermission],
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$UserPermission] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarUser_permissionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserPermission]
  ): Unit = js.native
}

