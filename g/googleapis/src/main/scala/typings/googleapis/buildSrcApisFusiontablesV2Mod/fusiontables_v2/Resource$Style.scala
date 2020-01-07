package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Resource$Style")
@js.native
class Resource$Style protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.style.delete
    * @desc Deletes a style.
    * @alias fusiontables.style.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (within a table) for the style being deleted
    * @param {string} params.tableId Table from which the style is being deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStyleDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarStyleDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarStyleDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarStyleDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarStyleDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fusiontables.style.get
    * @desc Gets a specific style.
    * @alias fusiontables.style.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (integer) for a specific style in a table
    * @param {string} params.tableId Table to which the requested style belongs
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$StyleSetting] = js.native
  def get(callback: BodyResponseCallback[Schema$StyleSetting]): Unit = js.native
  def get(params: ParamsDollarResourceDollarStyleDollarGet): GaxiosPromise[Schema$StyleSetting] = js.native
  def get(
    params: ParamsDollarResourceDollarStyleDollarGet,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarStyleDollarGet,
    options: BodyResponseCallback[Schema$StyleSetting],
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarStyleDollarGet, options: MethodOptions): GaxiosPromise[Schema$StyleSetting] = js.native
  def get(
    params: ParamsDollarResourceDollarStyleDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  /**
    * fusiontables.style.insert
    * @desc Adds a new style for the table.
    * @alias fusiontables.style.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table for which a new style is being added
    * @param {().StyleSetting} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$StyleSetting] = js.native
  def insert(callback: BodyResponseCallback[Schema$StyleSetting]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarStyleDollarInsert): GaxiosPromise[Schema$StyleSetting] = js.native
  def insert(
    params: ParamsDollarResourceDollarStyleDollarInsert,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarStyleDollarInsert,
    options: BodyResponseCallback[Schema$StyleSetting],
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarStyleDollarInsert, options: MethodOptions): GaxiosPromise[Schema$StyleSetting] = js.native
  def insert(
    params: ParamsDollarResourceDollarStyleDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  /**
    * fusiontables.style.list
    * @desc Retrieves a list of styles.
    * @alias fusiontables.style.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of styles to return. Optional. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return. Optional.
    * @param {string} params.tableId Table whose styles are being listed
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$StyleSettingList] = js.native
  def list(callback: BodyResponseCallback[Schema$StyleSettingList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarStyleDollarList): GaxiosPromise[Schema$StyleSettingList] = js.native
  def list(
    params: ParamsDollarResourceDollarStyleDollarList,
    callback: BodyResponseCallback[Schema$StyleSettingList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarStyleDollarList,
    options: BodyResponseCallback[Schema$StyleSettingList],
    callback: BodyResponseCallback[Schema$StyleSettingList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarStyleDollarList, options: MethodOptions): GaxiosPromise[Schema$StyleSettingList] = js.native
  def list(
    params: ParamsDollarResourceDollarStyleDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StyleSettingList]
  ): Unit = js.native
  /**
    * fusiontables.style.patch
    * @desc Updates an existing style. This method supports patch semantics.
    * @alias fusiontables.style.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (within a table) for the style being updated.
    * @param {string} params.tableId Table whose style is being updated.
    * @param {().StyleSetting} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$StyleSetting] = js.native
  def patch(callback: BodyResponseCallback[Schema$StyleSetting]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarStyleDollarPatch): GaxiosPromise[Schema$StyleSetting] = js.native
  def patch(
    params: ParamsDollarResourceDollarStyleDollarPatch,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarStyleDollarPatch,
    options: BodyResponseCallback[Schema$StyleSetting],
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarStyleDollarPatch, options: MethodOptions): GaxiosPromise[Schema$StyleSetting] = js.native
  def patch(
    params: ParamsDollarResourceDollarStyleDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  /**
    * fusiontables.style.update
    * @desc Updates an existing style.
    * @alias fusiontables.style.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.styleId Identifier (within a table) for the style being updated.
    * @param {string} params.tableId Table whose style is being updated.
    * @param {().StyleSetting} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$StyleSetting] = js.native
  def update(callback: BodyResponseCallback[Schema$StyleSetting]): Unit = js.native
  def update(params: ParamsDollarResourceDollarStyleDollarUpdate): GaxiosPromise[Schema$StyleSetting] = js.native
  def update(
    params: ParamsDollarResourceDollarStyleDollarUpdate,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarStyleDollarUpdate,
    options: BodyResponseCallback[Schema$StyleSetting],
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarStyleDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$StyleSetting] = js.native
  def update(
    params: ParamsDollarResourceDollarStyleDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$StyleSetting]
  ): Unit = js.native
}

