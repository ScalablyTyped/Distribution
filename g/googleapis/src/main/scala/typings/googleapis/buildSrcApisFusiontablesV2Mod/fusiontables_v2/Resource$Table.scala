package typings.googleapis.buildSrcApisFusiontablesV2Mod.fusiontables_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v2", "fusiontables_v2.Resource$Table")
@js.native
class Resource$Table protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.table.copy
    * @desc Copies a table.
    * @alias fusiontables.table.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.copyPresentation Whether to also copy tabs, styles, and templates. Default is false.
    * @param {string} params.tableId ID of the table that is being copied.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[Schema$Table] = js.native
  def copy(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def copy(params: ParamsDollarResourceDollarTableDollarCopy): GaxiosPromise[Schema$Table] = js.native
  def copy(params: ParamsDollarResourceDollarTableDollarCopy, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def copy(
    params: ParamsDollarResourceDollarTableDollarCopy,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def copy(params: ParamsDollarResourceDollarTableDollarCopy, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def copy(
    params: ParamsDollarResourceDollarTableDollarCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * fusiontables.table.delete
    * @desc Deletes a table.
    * @alias fusiontables.table.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId ID of the table to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTableDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTableDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTableDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTableDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTableDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * fusiontables.table.get
    * @desc Retrieves a specific table by its ID.
    * @alias fusiontables.table.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Identifier for the table being requested.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Table] = js.native
  def get(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTableDollarGet): GaxiosPromise[Schema$Table] = js.native
  def get(params: ParamsDollarResourceDollarTableDollarGet, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTableDollarGet,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTableDollarGet, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def get(
    params: ParamsDollarResourceDollarTableDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * fusiontables.table.importRows
    * @desc Imports more rows into a table.
    * @alias fusiontables.table.importRows
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.delimiter The delimiter used to separate cell values. This can only consist of a single character. Default is ,.
    * @param {string=} params.encoding The encoding of the content. Default is UTF-8. Use auto-detect if you are unsure of the encoding.
    * @param {integer=} params.endLine The index of the line up to which data will be imported. Default is to import the entire file. If endLine is negative, it is an offset from the end of the file; the imported content will exclude the last endLine lines.
    * @param {boolean=} params.isStrict Whether the imported CSV must have the same number of values for each row. If false, rows with fewer values will be padded with empty values. Default is true.
    * @param {integer=} params.startLine The index of the first line from which to start importing, inclusive. Default is 0.
    * @param {string} params.tableId The table into which new rows are being imported.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importRows(): GaxiosPromise[Schema$Import] = js.native
  def importRows(callback: BodyResponseCallback[Schema$Import]): Unit = js.native
  def importRows(params: ParamsDollarResourceDollarTableDollarImportrows): GaxiosPromise[Schema$Import] = js.native
  def importRows(
    params: ParamsDollarResourceDollarTableDollarImportrows,
    callback: BodyResponseCallback[Schema$Import]
  ): Unit = js.native
  def importRows(
    params: ParamsDollarResourceDollarTableDollarImportrows,
    options: BodyResponseCallback[Schema$Import],
    callback: BodyResponseCallback[Schema$Import]
  ): Unit = js.native
  def importRows(params: ParamsDollarResourceDollarTableDollarImportrows, options: MethodOptions): GaxiosPromise[Schema$Import] = js.native
  def importRows(
    params: ParamsDollarResourceDollarTableDollarImportrows,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Import]
  ): Unit = js.native
  /**
    * fusiontables.table.importTable
    * @desc Imports a new table.
    * @alias fusiontables.table.importTable
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.delimiter The delimiter used to separate cell values. This can only consist of a single character. Default is ,.
    * @param {string=} params.encoding The encoding of the content. Default is UTF-8. Use auto-detect if you are unsure of the encoding.
    * @param {string} params.name The name to be assigned to the new table.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def importTable(): GaxiosPromise[Schema$Table] = js.native
  def importTable(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def importTable(params: ParamsDollarResourceDollarTableDollarImporttable): GaxiosPromise[Schema$Table] = js.native
  def importTable(
    params: ParamsDollarResourceDollarTableDollarImporttable,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def importTable(
    params: ParamsDollarResourceDollarTableDollarImporttable,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def importTable(params: ParamsDollarResourceDollarTableDollarImporttable, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def importTable(
    params: ParamsDollarResourceDollarTableDollarImporttable,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * fusiontables.table.insert
    * @desc Creates a new table.
    * @alias fusiontables.table.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Table] = js.native
  def insert(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTableDollarInsert): GaxiosPromise[Schema$Table] = js.native
  def insert(params: ParamsDollarResourceDollarTableDollarInsert, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTableDollarInsert,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTableDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def insert(
    params: ParamsDollarResourceDollarTableDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * fusiontables.table.list
    * @desc Retrieves a list of tables a user owns.
    * @alias fusiontables.table.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of tables to return. Default is 5.
    * @param {string=} params.pageToken Continuation token specifying which result page to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TableList] = js.native
  def list(callback: BodyResponseCallback[Schema$TableList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTableDollarList): GaxiosPromise[Schema$TableList] = js.native
  def list(
    params: ParamsDollarResourceDollarTableDollarList,
    callback: BodyResponseCallback[Schema$TableList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTableDollarList,
    options: BodyResponseCallback[Schema$TableList],
    callback: BodyResponseCallback[Schema$TableList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTableDollarList, options: MethodOptions): GaxiosPromise[Schema$TableList] = js.native
  def list(
    params: ParamsDollarResourceDollarTableDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TableList]
  ): Unit = js.native
  /**
    * fusiontables.table.patch
    * @desc Updates an existing table. Unless explicitly requested, only the
    * name, description, and attribution will be updated. This method supports
    * patch semantics.
    * @alias fusiontables.table.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.replaceViewDefinition Whether the view definition is also updated. The specified view definition replaces the existing one. Only a view can be updated with a new definition.
    * @param {string} params.tableId ID of the table that is being updated.
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Table] = js.native
  def patch(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTableDollarPatch): GaxiosPromise[Schema$Table] = js.native
  def patch(params: ParamsDollarResourceDollarTableDollarPatch, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTableDollarPatch,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTableDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def patch(
    params: ParamsDollarResourceDollarTableDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  /**
    * fusiontables.table.refetchSheet
    * @desc Replaces rows of the table with the rows of the spreadsheet that is
    * first imported from. Current rows remain visible until all replacement
    * rows are ready.
    * @alias fusiontables.table.refetchSheet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.tableId Table whose rows will be replaced from the spreadsheet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def refetchSheet(): GaxiosPromise[Schema$Task] = js.native
  def refetchSheet(callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def refetchSheet(params: ParamsDollarResourceDollarTableDollarRefetchsheet): GaxiosPromise[Schema$Task] = js.native
  def refetchSheet(
    params: ParamsDollarResourceDollarTableDollarRefetchsheet,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def refetchSheet(
    params: ParamsDollarResourceDollarTableDollarRefetchsheet,
    options: BodyResponseCallback[Schema$Task],
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def refetchSheet(params: ParamsDollarResourceDollarTableDollarRefetchsheet, options: MethodOptions): GaxiosPromise[Schema$Task] = js.native
  def refetchSheet(
    params: ParamsDollarResourceDollarTableDollarRefetchsheet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  /**
    * fusiontables.table.replaceRows
    * @desc Replaces rows of an existing table. Current rows remain visible
    * until all replacement rows are ready.
    * @alias fusiontables.table.replaceRows
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.delimiter The delimiter used to separate cell values. This can only consist of a single character. Default is ,.
    * @param {string=} params.encoding The encoding of the content. Default is UTF-8. Use 'auto-detect' if you are unsure of the encoding.
    * @param {integer=} params.endLine The index of the line up to which data will be imported. Default is to import the entire file. If endLine is negative, it is an offset from the end of the file; the imported content will exclude the last endLine lines.
    * @param {boolean=} params.isStrict Whether the imported CSV must have the same number of column values for each row. If true, throws an exception if the CSV does not have the same number of columns. If false, rows with fewer column values will be padded with empty values. Default is true.
    * @param {integer=} params.startLine The index of the first line from which to start importing, inclusive. Default is 0.
    * @param {string} params.tableId Table whose rows will be replaced.
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def replaceRows(): GaxiosPromise[Schema$Task] = js.native
  def replaceRows(callback: BodyResponseCallback[Schema$Task]): Unit = js.native
  def replaceRows(params: ParamsDollarResourceDollarTableDollarReplacerows): GaxiosPromise[Schema$Task] = js.native
  def replaceRows(
    params: ParamsDollarResourceDollarTableDollarReplacerows,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def replaceRows(
    params: ParamsDollarResourceDollarTableDollarReplacerows,
    options: BodyResponseCallback[Schema$Task],
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  def replaceRows(params: ParamsDollarResourceDollarTableDollarReplacerows, options: MethodOptions): GaxiosPromise[Schema$Task] = js.native
  def replaceRows(
    params: ParamsDollarResourceDollarTableDollarReplacerows,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Task]
  ): Unit = js.native
  /**
    * fusiontables.table.update
    * @desc Updates an existing table. Unless explicitly requested, only the
    * name, description, and attribution will be updated.
    * @alias fusiontables.table.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.replaceViewDefinition Whether the view definition is also updated. The specified view definition replaces the existing one. Only a view can be updated with a new definition.
    * @param {string} params.tableId ID of the table that is being updated.
    * @param {().Table} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Table] = js.native
  def update(callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTableDollarUpdate): GaxiosPromise[Schema$Table] = js.native
  def update(params: ParamsDollarResourceDollarTableDollarUpdate, callback: BodyResponseCallback[Schema$Table]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTableDollarUpdate,
    options: BodyResponseCallback[Schema$Table],
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTableDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Table] = js.native
  def update(
    params: ParamsDollarResourceDollarTableDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Table]
  ): Unit = js.native
}

