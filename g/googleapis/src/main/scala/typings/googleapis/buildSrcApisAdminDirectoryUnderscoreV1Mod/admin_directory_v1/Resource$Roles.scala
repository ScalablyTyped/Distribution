package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Roles")
@js.native
class Resource$Roles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.roles.delete
    * @desc Deletes a role.
    * @alias directory.roles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRolesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarRolesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRolesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRolesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarRolesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.roles.get
    * @desc Retrieves a role.
    * @alias directory.roles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Role] = js.native
  def get(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRolesDollarGet): GaxiosPromise[Schema$Role] = js.native
  def get(params: ParamsDollarResourceDollarRolesDollarGet, callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRolesDollarGet,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRolesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def get(
    params: ParamsDollarResourceDollarRolesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * directory.roles.insert
    * @desc Creates a role.
    * @alias directory.roles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Role] = js.native
  def insert(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRolesDollarInsert): GaxiosPromise[Schema$Role] = js.native
  def insert(params: ParamsDollarResourceDollarRolesDollarInsert, callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRolesDollarInsert,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRolesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def insert(
    params: ParamsDollarResourceDollarRolesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * directory.roles.list
    * @desc Retrieves a paginated list of all the roles in a domain.
    * @alias directory.roles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Roles] = js.native
  def list(callback: BodyResponseCallback[Schema$Roles]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRolesDollarList): GaxiosPromise[Schema$Roles] = js.native
  def list(params: ParamsDollarResourceDollarRolesDollarList, callback: BodyResponseCallback[Schema$Roles]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRolesDollarList,
    options: BodyResponseCallback[Schema$Roles],
    callback: BodyResponseCallback[Schema$Roles]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRolesDollarList, options: MethodOptions): GaxiosPromise[Schema$Roles] = js.native
  def list(
    params: ParamsDollarResourceDollarRolesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Roles]
  ): Unit = js.native
  /**
    * directory.roles.patch
    * @desc Updates a role. This method supports patch semantics.
    * @alias directory.roles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Role] = js.native
  def patch(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRolesDollarPatch): GaxiosPromise[Schema$Role] = js.native
  def patch(params: ParamsDollarResourceDollarRolesDollarPatch, callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarRolesDollarPatch,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRolesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def patch(
    params: ParamsDollarResourceDollarRolesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  /**
    * directory.roles.update
    * @desc Updates a role.
    * @alias directory.roles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleId Immutable ID of the role.
    * @param {().Role} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Role] = js.native
  def update(callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRolesDollarUpdate): GaxiosPromise[Schema$Role] = js.native
  def update(params: ParamsDollarResourceDollarRolesDollarUpdate, callback: BodyResponseCallback[Schema$Role]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRolesDollarUpdate,
    options: BodyResponseCallback[Schema$Role],
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRolesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Role] = js.native
  def update(
    params: ParamsDollarResourceDollarRolesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Role]
  ): Unit = js.native
}

