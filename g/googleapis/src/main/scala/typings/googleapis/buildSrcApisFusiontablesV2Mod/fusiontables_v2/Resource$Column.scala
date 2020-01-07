package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Resource$Column")
@js.native
class Resource$Column protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.column.delete
    * @desc Deletes the specified column.
    * @alias fusiontables.column.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column being deleted.
    * @param {string} params.tableId Table from which the column is being deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarColumnDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarColumnDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarColumnDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarColumnDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarColumnDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fusiontables.column.get
    * @desc Retrieves a specific column by its ID.
    * @alias fusiontables.column.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column that is being requested.
    * @param {string} params.tableId Table to which the column belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Column] = js.native
  def get(callback: BodyResponseCallback[Schema$Column]): Unit = js.native
  def get(params: ParamsDollarResourceDollarColumnDollarGet): GaxiosPromise[Schema$Column] = js.native
  def get(params: ParamsDollarResourceDollarColumnDollarGet, callback: BodyResponseCallback[Schema$Column]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarColumnDollarGet,
    options: BodyResponseCallback[Schema$Column],
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarColumnDollarGet, options: MethodOptions): GaxiosPromise[Schema$Column] = js.native
  def get(
    params: ParamsDollarResourceDollarColumnDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  /**
    * fusiontables.column.insert
    * @desc Adds a new column to the table.
    * @alias fusiontables.column.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table for which a new column is being added.
    * @param {().Column} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Column] = js.native
  def insert(callback: BodyResponseCallback[Schema$Column]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarColumnDollarInsert): GaxiosPromise[Schema$Column] = js.native
  def insert(
    params: ParamsDollarResourceDollarColumnDollarInsert,
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarColumnDollarInsert,
    options: BodyResponseCallback[Schema$Column],
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarColumnDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Column] = js.native
  def insert(
    params: ParamsDollarResourceDollarColumnDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  /**
    * fusiontables.column.list
    * @desc Retrieves a list of columns.
    * @alias fusiontables.column.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of columns to return. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return.
    * @param {string} params.tableId Table whose columns are being listed.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ColumnList] = js.native
  def list(callback: BodyResponseCallback[Schema$ColumnList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarColumnDollarList): GaxiosPromise[Schema$ColumnList] = js.native
  def list(
    params: ParamsDollarResourceDollarColumnDollarList,
    callback: BodyResponseCallback[Schema$ColumnList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarColumnDollarList,
    options: BodyResponseCallback[Schema$ColumnList],
    callback: BodyResponseCallback[Schema$ColumnList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarColumnDollarList, options: MethodOptions): GaxiosPromise[Schema$ColumnList] = js.native
  def list(
    params: ParamsDollarResourceDollarColumnDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ColumnList]
  ): Unit = js.native
  /**
    * fusiontables.column.patch
    * @desc Updates the name or type of an existing column. This method
    * supports patch semantics.
    * @alias fusiontables.column.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column that is being updated.
    * @param {string} params.tableId Table for which the column is being updated.
    * @param {().Column} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Column] = js.native
  def patch(callback: BodyResponseCallback[Schema$Column]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarColumnDollarPatch): GaxiosPromise[Schema$Column] = js.native
  def patch(params: ParamsDollarResourceDollarColumnDollarPatch, callback: BodyResponseCallback[Schema$Column]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarColumnDollarPatch,
    options: BodyResponseCallback[Schema$Column],
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarColumnDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Column] = js.native
  def patch(
    params: ParamsDollarResourceDollarColumnDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  /**
    * fusiontables.column.update
    * @desc Updates the name or type of an existing column.
    * @alias fusiontables.column.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.columnId Name or identifier for the column that is being updated.
    * @param {string} params.tableId Table for which the column is being updated.
    * @param {().Column} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Column] = js.native
  def update(callback: BodyResponseCallback[Schema$Column]): Unit = js.native
  def update(params: ParamsDollarResourceDollarColumnDollarUpdate): GaxiosPromise[Schema$Column] = js.native
  def update(
    params: ParamsDollarResourceDollarColumnDollarUpdate,
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarColumnDollarUpdate,
    options: BodyResponseCallback[Schema$Column],
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarColumnDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Column] = js.native
  def update(
    params: ParamsDollarResourceDollarColumnDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Column]
  ): Unit = js.native
}

