package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Members")
@js.native
class Resource$Members protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.members.delete
    * @desc Remove membership.
    * @alias directory.members.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {string} params.memberKey Email or immutable ID of the member
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMembersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarMembersDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMembersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMembersDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarMembersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.members.get
    * @desc Retrieve Group Member
    * @alias directory.members.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {string} params.memberKey Email or immutable ID of the member
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Member] = js.native
  def get(callback: BodyResponseCallback[Schema$Member]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMembersDollarGet): GaxiosPromise[Schema$Member] = js.native
  def get(params: ParamsDollarResourceDollarMembersDollarGet, callback: BodyResponseCallback[Schema$Member]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMembersDollarGet,
    options: BodyResponseCallback[Schema$Member],
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMembersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Member] = js.native
  def get(
    params: ParamsDollarResourceDollarMembersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  /**
    * directory.members.hasMember
    * @desc Checks whether the given user is a member of the group. Membership
    * can be direct or nested.
    * @alias directory.members.hasMember
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Identifies the group in the API request. The value can be the group's email address, group alias, or the unique group ID.
    * @param {string} params.memberKey Identifies the user member in the API request. The value can be the user's primary email address, alias, or unique ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def hasMember(): GaxiosPromise[Schema$MembersHasMember] = js.native
  def hasMember(callback: BodyResponseCallback[Schema$MembersHasMember]): Unit = js.native
  def hasMember(params: ParamsDollarResourceDollarMembersDollarHasmember): GaxiosPromise[Schema$MembersHasMember] = js.native
  def hasMember(
    params: ParamsDollarResourceDollarMembersDollarHasmember,
    callback: BodyResponseCallback[Schema$MembersHasMember]
  ): Unit = js.native
  def hasMember(
    params: ParamsDollarResourceDollarMembersDollarHasmember,
    options: BodyResponseCallback[Schema$MembersHasMember],
    callback: BodyResponseCallback[Schema$MembersHasMember]
  ): Unit = js.native
  def hasMember(params: ParamsDollarResourceDollarMembersDollarHasmember, options: MethodOptions): GaxiosPromise[Schema$MembersHasMember] = js.native
  def hasMember(
    params: ParamsDollarResourceDollarMembersDollarHasmember,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MembersHasMember]
  ): Unit = js.native
  /**
    * directory.members.insert
    * @desc Add user to the specified group.
    * @alias directory.members.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {().Member} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Member] = js.native
  def insert(callback: BodyResponseCallback[Schema$Member]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMembersDollarInsert): GaxiosPromise[Schema$Member] = js.native
  def insert(
    params: ParamsDollarResourceDollarMembersDollarInsert,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarMembersDollarInsert,
    options: BodyResponseCallback[Schema$Member],
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarMembersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Member] = js.native
  def insert(
    params: ParamsDollarResourceDollarMembersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  /**
    * directory.members.list
    * @desc Retrieve all members in a group (paginated)
    * @alias directory.members.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {boolean=} params.includeDerivedMembership Whether to list indirect memberships. Default: false.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 200
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.roles Comma separated role values to filter list results on.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Members] = js.native
  def list(callback: BodyResponseCallback[Schema$Members]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMembersDollarList): GaxiosPromise[Schema$Members] = js.native
  def list(
    params: ParamsDollarResourceDollarMembersDollarList,
    callback: BodyResponseCallback[Schema$Members]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMembersDollarList,
    options: BodyResponseCallback[Schema$Members],
    callback: BodyResponseCallback[Schema$Members]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMembersDollarList, options: MethodOptions): GaxiosPromise[Schema$Members] = js.native
  def list(
    params: ParamsDollarResourceDollarMembersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Members]
  ): Unit = js.native
  /**
    * directory.members.patch
    * @desc Update membership of a user in the specified group. This method
    * supports patch semantics.
    * @alias directory.members.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {string} params.memberKey Email or immutable ID of the user. If ID, it should match with id of member object
    * @param {().Member} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Member] = js.native
  def patch(callback: BodyResponseCallback[Schema$Member]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarMembersDollarPatch): GaxiosPromise[Schema$Member] = js.native
  def patch(
    params: ParamsDollarResourceDollarMembersDollarPatch,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarMembersDollarPatch,
    options: BodyResponseCallback[Schema$Member],
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarMembersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Member] = js.native
  def patch(
    params: ParamsDollarResourceDollarMembersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  /**
    * directory.members.update
    * @desc Update membership of a user in the specified group.
    * @alias directory.members.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {string} params.memberKey Email or immutable ID of the user. If ID, it should match with id of member object
    * @param {().Member} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Member] = js.native
  def update(callback: BodyResponseCallback[Schema$Member]): Unit = js.native
  def update(params: ParamsDollarResourceDollarMembersDollarUpdate): GaxiosPromise[Schema$Member] = js.native
  def update(
    params: ParamsDollarResourceDollarMembersDollarUpdate,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarMembersDollarUpdate,
    options: BodyResponseCallback[Schema$Member],
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarMembersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Member] = js.native
  def update(
    params: ParamsDollarResourceDollarMembersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Member]
  ): Unit = js.native
}

