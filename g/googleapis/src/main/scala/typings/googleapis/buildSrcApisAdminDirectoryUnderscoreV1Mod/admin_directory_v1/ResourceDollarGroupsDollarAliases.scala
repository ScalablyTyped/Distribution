package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Groups$Aliases")
@js.native
class ResourceDollarGroupsDollarAliases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.groups.aliases.delete
    * @desc Remove a alias for the group
    * @alias directory.groups.aliases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.alias The alias to be removed
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarAliasesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarGroupsDollarAliasesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.groups.aliases.insert
    * @desc Add a alias for the group
    * @alias directory.groups.aliases.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {().Alias} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Alias] = js.native
  def insert(callback: BodyResponseCallback[Schema$Alias]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarAliasesDollarInsert): GaxiosPromise[Schema$Alias] = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarInsert,
    callback: BodyResponseCallback[Schema$Alias]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarInsert,
    options: BodyResponseCallback[Schema$Alias],
    callback: BodyResponseCallback[Schema$Alias]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarGroupsDollarAliasesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Alias] = js.native
  def insert(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Alias]
  ): Unit = js.native
  /**
    * directory.groups.aliases.list
    * @desc List all aliases for a group
    * @alias directory.groups.aliases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.groupKey Email or immutable ID of the group
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Aliases] = js.native
  def list(callback: BodyResponseCallback[Schema$Aliases]): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarAliasesDollarList): GaxiosPromise[Schema$Aliases] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarList,
    callback: BodyResponseCallback[Schema$Aliases]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarList,
    options: BodyResponseCallback[Schema$Aliases],
    callback: BodyResponseCallback[Schema$Aliases]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarGroupsDollarAliasesDollarList, options: MethodOptions): GaxiosPromise[Schema$Aliases] = js.native
  def list(
    params: ParamsDollarResourceDollarGroupsDollarAliasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Aliases]
  ): Unit = js.native
}

