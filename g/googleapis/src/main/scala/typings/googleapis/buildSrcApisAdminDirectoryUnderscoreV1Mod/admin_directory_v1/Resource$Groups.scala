package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Groups")
@js.native
class Resource$Groups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var aliases: ResourceDollarGroupsDollarAliases = js.native
  var context: APIRequestContext = js.native
  /**
    * directory.groups.delete
    * @desc Delete Group
    * @alias directory.groups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.groups.get
    * @desc Retrieve Group
    * @alias directory.groups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Group] = js.native
  def get(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet): GaxiosPromise[Schema$Group] = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarGet,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarGroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def get(
    params: ParamsDollarResourceDollarGroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  /**
    * directory.groups.insert
    * @desc Create Group
    * @alias directory.groups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Group] = js.native
  def insert(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarInsert): GaxiosPromise[Schema$Group] = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarInsert, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarInsert,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  /**
    * directory.groups.list
    * @desc Retrieve all groups of a domain or of a user given a userKey
    * (paginated)
    * @alias directory.groups.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customer Immutable ID of the G Suite account. In case of multi-domain, to fetch all groups for a customer, fill this field instead of domain.
    * @param {string=} params.domain Name of the domain. Fill this field to get groups from only this domain. To return all groups in a multi-domain fill customer field instead.
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 200
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.query Query string search. Should be of the form "". Complete documentation is at https://developers.google.com/admin-sdk/directory/v1/guides/search-groups
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order. Only of use when orderBy is also used
    * @param {string=} params.userKey Email or immutable Id of the user if only those groups are to be listed, the given user is a member of. If Id, it should match with id of user object
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Groups] = js.native
  def list(callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList): GaxiosPromise[Schema$Groups] = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList, callback: BodyResponseCallback[Schema$Groups]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    options: BodyResponseCallback[Schema$Groups],
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$Groups] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Groups]
  ): Unit = js.native
  /**
    * directory.groups.patch
    * @desc Update Group. This method supports patch semantics.
    * @alias directory.groups.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Group] = js.native
  def patch(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch): GaxiosPromise[Schema$Group] = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarGroupsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def patch(
    params: ParamsDollarResourceDollarGroupsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  /**
    * directory.groups.update
    * @desc Update Group
    * @alias directory.groups.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group. If ID, it should match with id of group object
    * @param {().Group} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Group] = js.native
  def update(callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate): GaxiosPromise[Schema$Group] = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate, callback: BodyResponseCallback[Schema$Group]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    options: BodyResponseCallback[Schema$Group],
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarGroupsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Group] = js.native
  def update(
    params: ParamsDollarResourceDollarGroupsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Group]
  ): Unit = js.native
}

