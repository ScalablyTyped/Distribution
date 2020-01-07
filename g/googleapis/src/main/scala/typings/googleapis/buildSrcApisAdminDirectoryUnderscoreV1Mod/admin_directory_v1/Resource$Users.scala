package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users")
@js.native
class Resource$Users protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var aliases: ResourceDollarUsersDollarAliases = js.native
  var context: APIRequestContext = js.native
  var photos: ResourceDollarUsersDollarPhotos = js.native
  /**
    * directory.users.delete
    * @desc Delete user
    * @alias directory.users.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.users.get
    * @desc retrieve user
    * @alias directory.users.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customFieldMask Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    * @param {string=} params.projection What subset of fields to fetch for this user.
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {string=} params.viewType Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$User] = js.native
  def get(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet): GaxiosPromise[Schema$User] = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarGet,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * directory.users.insert
    * @desc create user.
    * @alias directory.users.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$User] = js.native
  def insert(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarInsert): GaxiosPromise[Schema$User] = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarInsert, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarInsert,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * directory.users.list
    * @desc Retrieve either deleted users or all users in a domain (paginated)
    * @alias directory.users.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.customer Immutable ID of the G Suite account. In case of multi-domain, to fetch all users for a customer, fill this field instead of domain.
    * @param {string=} params.customFieldMask Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    * @param {string=} params.domain Name of the domain. Fill this field to get users from only this domain. To return all users in a multi-domain fill customer field instead.
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100. Max allowed is 500
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection What subset of fields to fetch for this user.
    * @param {string=} params.query Query string search. Should be of the form "". Complete documentation is at https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    * @param {string=} params.showDeleted If set to true retrieves the list of deleted users. Default is false
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order.
    * @param {string=} params.viewType Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Users] = js.native
  def list(callback: BodyResponseCallback[Schema$Users]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarList): GaxiosPromise[Schema$Users] = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarList, callback: BodyResponseCallback[Schema$Users]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarList,
    options: BodyResponseCallback[Schema$Users],
    callback: BodyResponseCallback[Schema$Users]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarList, options: MethodOptions): GaxiosPromise[Schema$Users] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Users]
  ): Unit = js.native
  /**
    * directory.users.makeAdmin
    * @desc change admin status of a user
    * @alias directory.users.makeAdmin
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user as admin
    * @param {().UserMakeAdmin} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def makeAdmin(): GaxiosPromise[Unit] = js.native
  def makeAdmin(callback: BodyResponseCallback[Unit]): Unit = js.native
  def makeAdmin(params: ParamsDollarResourceDollarUsersDollarMakeadmin): GaxiosPromise[Unit] = js.native
  def makeAdmin(params: ParamsDollarResourceDollarUsersDollarMakeadmin, callback: BodyResponseCallback[Unit]): Unit = js.native
  def makeAdmin(
    params: ParamsDollarResourceDollarUsersDollarMakeadmin,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def makeAdmin(params: ParamsDollarResourceDollarUsersDollarMakeadmin, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def makeAdmin(
    params: ParamsDollarResourceDollarUsersDollarMakeadmin,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.users.patch
    * @desc update user. This method supports patch semantics.
    * @alias directory.users.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user. If ID, it should match with id of user object
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$User] = js.native
  def patch(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPatch): GaxiosPromise[Schema$User] = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPatch, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPatch,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * directory.users.undelete
    * @desc Undelete a deleted user
    * @alias directory.users.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey The immutable id of the user
    * @param {().UserUndelete} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Unit] = js.native
  def undelete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarUsersDollarUndelete): GaxiosPromise[Unit] = js.native
  def undelete(params: ParamsDollarResourceDollarUsersDollarUndelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarUsersDollarUndelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarUsersDollarUndelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def undelete(
    params: ParamsDollarResourceDollarUsersDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.users.update
    * @desc update user
    * @alias directory.users.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user. If ID, it should match with id of user object
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$User] = js.native
  def update(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarUpdate): GaxiosPromise[Schema$User] = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarUpdate, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarUpdate,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * directory.users.watch
    * @desc Watch for changes in users list
    * @alias directory.users.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customer Immutable ID of the G Suite account. In case of multi-domain, to fetch all users for a customer, fill this field instead of domain.
    * @param {string=} params.customFieldMask Comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when projection=custom.
    * @param {string=} params.domain Name of the domain. Fill this field to get users from only this domain. To return all users in a multi-domain fill customer field instead.
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {integer=} params.maxResults Maximum number of results to return. Default is 100. Max allowed is 500
    * @param {string=} params.orderBy Column to use for sorting results
    * @param {string=} params.pageToken Token to specify next page in the list
    * @param {string=} params.projection What subset of fields to fetch for this user.
    * @param {string=} params.query Query string search. Should be of the form "". Complete documentation is at https://developers.google.com/admin-sdk/directory/v1/guides/search-users
    * @param {string=} params.showDeleted If set to true retrieves the list of deleted users. Default is false
    * @param {string=} params.sortOrder Whether to return results in ascending or descending order.
    * @param {string=} params.viewType Whether to fetch the ADMIN_VIEW or DOMAIN_PUBLIC view of the user.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarWatch, callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

