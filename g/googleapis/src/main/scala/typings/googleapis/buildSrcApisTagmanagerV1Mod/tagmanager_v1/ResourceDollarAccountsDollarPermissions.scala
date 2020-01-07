package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/tagmanager/v1", "tagmanager_v1.Resource$Accounts$Permissions")
@js.native
class ResourceDollarAccountsDollarPermissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * tagmanager.accounts.permissions.create
    * @desc Creates a user's Account & Container Permissions.
    * @alias tagmanager.accounts.permissions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {().UserAccess} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$UserAccess] = js.native
  def create(callback: BodyResponseCallback[Schema$UserAccess]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarCreate): GaxiosPromise[Schema$UserAccess] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarCreate,
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarCreate,
    options: BodyResponseCallback[Schema$UserAccess],
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$UserAccess] = js.native
  def create(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.delete
    * @desc Removes a user from the account, revoking access to it and all of
    * its containers.
    * @alias tagmanager.accounts.permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.permissionId The GTM User ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.get
    * @desc Gets a user's Account & Container Permissions.
    * @alias tagmanager.accounts.permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.permissionId The GTM User ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserAccess] = js.native
  def get(callback: BodyResponseCallback[Schema$UserAccess]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarGet): GaxiosPromise[Schema$UserAccess] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarGet,
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarGet,
    options: BodyResponseCallback[Schema$UserAccess],
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserAccess] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.list
    * @desc List all users that have access to the account along with Account
    * and Container Permissions granted to each of them.
    * @alias tagmanager.accounts.permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID. @required tagmanager.accounts.permissions.list
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAccountUsersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAccountUsersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarList): GaxiosPromise[Schema$ListAccountUsersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarList,
    callback: BodyResponseCallback[Schema$ListAccountUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarList,
    options: BodyResponseCallback[Schema$ListAccountUsersResponse],
    callback: BodyResponseCallback[Schema$ListAccountUsersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAccountUsersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAccountUsersResponse]
  ): Unit = js.native
  /**
    * tagmanager.accounts.permissions.update
    * @desc Updates a user's Account & Container Permissions.
    * @alias tagmanager.accounts.permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The GTM Account ID.
    * @param {string} params.permissionId The GTM User ID.
    * @param {().UserAccess} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$UserAccess] = js.native
  def update(callback: BodyResponseCallback[Schema$UserAccess]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarUpdate): GaxiosPromise[Schema$UserAccess] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarUpdate,
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarUpdate,
    options: BodyResponseCallback[Schema$UserAccess],
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$UserAccess] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountsDollarPermissionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserAccess]
  ): Unit = js.native
}

