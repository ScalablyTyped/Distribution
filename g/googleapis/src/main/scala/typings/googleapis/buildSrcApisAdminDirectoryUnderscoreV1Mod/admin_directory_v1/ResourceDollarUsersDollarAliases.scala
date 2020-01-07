package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Users$Aliases")
@js.native
class ResourceDollarUsersDollarAliases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.users.aliases.delete
    * @desc Remove a alias for the user
    * @alias directory.users.aliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alias The alias to be removed
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarAliasesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarAliasesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.users.aliases.insert
    * @desc Add a alias for the user
    * @alias directory.users.aliases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().Alias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Alias] = js.native
  def insert(callback: BodyResponseCallback[Schema$Alias]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarAliasesDollarInsert): GaxiosPromise[Schema$Alias] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarInsert,
    callback: BodyResponseCallback[Schema$Alias]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarInsert,
    options: BodyResponseCallback[Schema$Alias],
    callback: BodyResponseCallback[Schema$Alias]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarAliasesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Alias] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Alias]
  ): Unit = js.native
  /**
    * directory.users.aliases.list
    * @desc List all aliases for a user
    * @alias directory.users.aliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Aliases] = js.native
  def list(callback: BodyResponseCallback[Schema$Aliases]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarAliasesDollarList): GaxiosPromise[Schema$Aliases] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarList,
    callback: BodyResponseCallback[Schema$Aliases]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarList,
    options: BodyResponseCallback[Schema$Aliases],
    callback: BodyResponseCallback[Schema$Aliases]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarAliasesDollarList, options: MethodOptions): GaxiosPromise[Schema$Aliases] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Aliases]
  ): Unit = js.native
  /**
    * directory.users.aliases.watch
    * @desc Watch for changes in user aliases list
    * @alias directory.users.aliases.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.event Event on which subscription is intended (if subscribing)
    * @param {string} params.userKey Email or immutable ID of the user
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarAliasesDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarWatch,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarUsersDollarAliasesDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarUsersDollarAliasesDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

