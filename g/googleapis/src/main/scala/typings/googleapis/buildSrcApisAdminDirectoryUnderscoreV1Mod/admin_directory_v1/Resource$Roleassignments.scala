package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Roleassignments")
@js.native
class Resource$Roleassignments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.roleAssignments.delete
    * @desc Deletes a role assignment.
    * @alias directory.roleAssignments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleAssignmentId Immutable ID of the role assignment.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRoleassignmentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarRoleassignmentsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRoleassignmentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRoleassignmentsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarRoleassignmentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.roleAssignments.get
    * @desc Retrieve a role assignment.
    * @alias directory.roleAssignments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {string} params.roleAssignmentId Immutable ID of the role assignment.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$RoleAssignment] = js.native
  def get(callback: BodyResponseCallback[Schema$RoleAssignment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRoleassignmentsDollarGet): GaxiosPromise[Schema$RoleAssignment] = js.native
  def get(
    params: ParamsDollarResourceDollarRoleassignmentsDollarGet,
    callback: BodyResponseCallback[Schema$RoleAssignment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRoleassignmentsDollarGet,
    options: BodyResponseCallback[Schema$RoleAssignment],
    callback: BodyResponseCallback[Schema$RoleAssignment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRoleassignmentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$RoleAssignment] = js.native
  def get(
    params: ParamsDollarResourceDollarRoleassignmentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RoleAssignment]
  ): Unit = js.native
  /**
    * directory.roleAssignments.insert
    * @desc Creates a role assignment.
    * @alias directory.roleAssignments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {().RoleAssignment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$RoleAssignment] = js.native
  def insert(callback: BodyResponseCallback[Schema$RoleAssignment]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRoleassignmentsDollarInsert): GaxiosPromise[Schema$RoleAssignment] = js.native
  def insert(
    params: ParamsDollarResourceDollarRoleassignmentsDollarInsert,
    callback: BodyResponseCallback[Schema$RoleAssignment]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRoleassignmentsDollarInsert,
    options: BodyResponseCallback[Schema$RoleAssignment],
    callback: BodyResponseCallback[Schema$RoleAssignment]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRoleassignmentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$RoleAssignment] = js.native
  def insert(
    params: ParamsDollarResourceDollarRoleassignmentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RoleAssignment]
  ): Unit = js.native
  /**
    * directory.roleAssignments.list
    * @desc Retrieves a paginated list of all roleAssignments.
    * @alias directory.roleAssignments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer Immutable ID of the G Suite account.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {string=} params.roleId Immutable ID of a role. If included in the request, returns only role assignments containing this role ID.
    * @param {string=} params.userKey The user's primary email address, alias email address, or unique user ID. If included in the request, returns role assignments only for this user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RoleAssignments] = js.native
  def list(callback: BodyResponseCallback[Schema$RoleAssignments]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRoleassignmentsDollarList): GaxiosPromise[Schema$RoleAssignments] = js.native
  def list(
    params: ParamsDollarResourceDollarRoleassignmentsDollarList,
    callback: BodyResponseCallback[Schema$RoleAssignments]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRoleassignmentsDollarList,
    options: BodyResponseCallback[Schema$RoleAssignments],
    callback: BodyResponseCallback[Schema$RoleAssignments]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRoleassignmentsDollarList, options: MethodOptions): GaxiosPromise[Schema$RoleAssignments] = js.native
  def list(
    params: ParamsDollarResourceDollarRoleassignmentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RoleAssignments]
  ): Unit = js.native
}

