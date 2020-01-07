package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets$Values")
@js.native
class ResourceDollarSpreadsheetsDollarValues protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sheets.spreadsheets.values.append
    * @desc Appends values to a spreadsheet. The input range is used to search
    * for existing data and find a "table" within that range. Values will be
    * appended to the next row of the table, starting with the first column of
    * the table. See the [guide](/sheets/api/guides/values#appending_values)
    * and [sample code](/sheets/api/samples/writing#append_values) for specific
    * details of how tables are detected and data is appended.  The caller must
    * specify the spreadsheet ID, range, and a valueInputOption.  The
    * `valueInputOption` only controls how the input data will be added to the
    * sheet (column-wise or row-wise), it does not influence what cell the data
    * starts being written to.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The A1 notation of a range to search for a logical table of data.
    *     // Values will be appended after the last row of the table.
    *     range: 'my-range',  // TODO: Update placeholder value.
    *
    *     // How the input data should be interpreted.
    *     valueInputOption: '',  // TODO: Update placeholder value.
    *
    *     // How the input data should be inserted.
    *     insertDataOption: '',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.append(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.append
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeValuesInResponse Determines if the update response should include the values of the cells that were appended. By default, responses do not include the updated values.
    * @param {string=} params.insertDataOption How the input data should be inserted.
    * @param {string} params.range The A1 notation of a range to search for a logical table of data. Values will be appended after the last row of the table.
    * @param {string=} params.responseDateTimeRenderOption Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    * @param {string=} params.responseValueRenderOption Determines how values in the response should be rendered. The default render option is ValueRenderOption.FORMATTED_VALUE.
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {string=} params.valueInputOption How the input data should be interpreted.
    * @param {().ValueRange} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def append(): GaxiosPromise[Schema$AppendValuesResponse] = js.native
  def append(callback: BodyResponseCallback[Schema$AppendValuesResponse]): Unit = js.native
  def append(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarAppend): GaxiosPromise[Schema$AppendValuesResponse] = js.native
  def append(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarAppend,
    callback: BodyResponseCallback[Schema$AppendValuesResponse]
  ): Unit = js.native
  def append(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarAppend,
    options: BodyResponseCallback[Schema$AppendValuesResponse],
    callback: BodyResponseCallback[Schema$AppendValuesResponse]
  ): Unit = js.native
  def append(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarAppend, options: MethodOptions): GaxiosPromise[Schema$AppendValuesResponse] = js.native
  def append(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarAppend,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AppendValuesResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.batchClear
    * @desc Clears one or more ranges of values from a spreadsheet. The caller
    * must specify the spreadsheet ID and one or more ranges. Only values are
    * cleared -- all other properties of the cell (such as formatting, data
    * validation, etc..) are kept.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // The ranges to clear, in A1 notation.
    *       ranges: [],  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.batchClear(request, function(err, response)
    * { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.batchClear
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {().BatchClearValuesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchClear(): GaxiosPromise[Schema$BatchClearValuesResponse] = js.native
  def batchClear(callback: BodyResponseCallback[Schema$BatchClearValuesResponse]): Unit = js.native
  def batchClear(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclear): GaxiosPromise[Schema$BatchClearValuesResponse] = js.native
  def batchClear(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclear,
    callback: BodyResponseCallback[Schema$BatchClearValuesResponse]
  ): Unit = js.native
  def batchClear(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclear,
    options: BodyResponseCallback[Schema$BatchClearValuesResponse],
    callback: BodyResponseCallback[Schema$BatchClearValuesResponse]
  ): Unit = js.native
  def batchClear(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclear, options: MethodOptions): GaxiosPromise[Schema$BatchClearValuesResponse] = js.native
  def batchClear(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclear,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchClearValuesResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.batchClearByDataFilter
    * @desc Clears one or more ranges of values from a spreadsheet. The caller
    * must specify the spreadsheet ID and one or more DataFilters. Ranges
    * matching any of the specified data filters will be cleared.  Only values
    * are cleared -- all other properties of the cell (such as formatting, data
    * validation, etc..) are kept.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // The DataFilters used to determine which ranges to clear.
    *       dataFilters: [],  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.batchClearByDataFilter(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.batchClearByDataFilter
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {().BatchClearValuesByDataFilterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchClearByDataFilter(): GaxiosPromise[Schema$BatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(callback: BodyResponseCallback[Schema$BatchClearValuesByDataFilterResponse]): Unit = js.native
  def batchClearByDataFilter(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclearbydatafilter): GaxiosPromise[Schema$BatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclearbydatafilter,
    callback: BodyResponseCallback[Schema$BatchClearValuesByDataFilterResponse]
  ): Unit = js.native
  def batchClearByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclearbydatafilter,
    options: BodyResponseCallback[Schema$BatchClearValuesByDataFilterResponse],
    callback: BodyResponseCallback[Schema$BatchClearValuesByDataFilterResponse]
  ): Unit = js.native
  def batchClearByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclearbydatafilter,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchclearbydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchClearValuesByDataFilterResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.batchGet
    * @desc Returns one or more ranges of values from a spreadsheet. The caller
    * must specify the spreadsheet ID and one or more ranges.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to retrieve data from.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The A1 notation of the values to retrieve.
    *     ranges: [],  // TODO: Update placeholder value.
    *
    *     // How values should be represented in the output.
    *     // The default render option is ValueRenderOption.FORMATTED_VALUE.
    *     valueRenderOption: '',  // TODO: Update placeholder value.
    *
    *     // How dates, times, and durations should be represented in the
    * output.
    *     // This is ignored if value_render_option is
    *     // FORMATTED_VALUE.
    *     // The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER]. dateTimeRenderOption: '',  // TODO:
    * Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.batchGet(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/drive.readonly'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   //   'https://www.googleapis.com/auth/spreadsheets.readonly'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.batchGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dateTimeRenderOption How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    * @param {string=} params.majorDimension The major dimension that results should use.  For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`.
    * @param {string=} params.ranges The A1 notation of the values to retrieve.
    * @param {string} params.spreadsheetId The ID of the spreadsheet to retrieve data from.
    * @param {string=} params.valueRenderOption How values should be represented in the output. The default render option is ValueRenderOption.FORMATTED_VALUE.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGet(): GaxiosPromise[Schema$BatchGetValuesResponse] = js.native
  def batchGet(callback: BodyResponseCallback[Schema$BatchGetValuesResponse]): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchget): GaxiosPromise[Schema$BatchGetValuesResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchget,
    callback: BodyResponseCallback[Schema$BatchGetValuesResponse]
  ): Unit = js.native
  def batchGet(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchget,
    options: BodyResponseCallback[Schema$BatchGetValuesResponse],
    callback: BodyResponseCallback[Schema$BatchGetValuesResponse]
  ): Unit = js.native
  def batchGet(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchget, options: MethodOptions): GaxiosPromise[Schema$BatchGetValuesResponse] = js.native
  def batchGet(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetValuesResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.batchGetByDataFilter
    * @desc Returns one or more ranges of values that match the specified data
    * filters. The caller must specify the spreadsheet ID and one or more
    * DataFilters.  Ranges that match any of the data filters in the request
    * will be returned.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to retrieve data from.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // How values should be represented in the output.
    *       // The default render option is ValueRenderOption.FORMATTED_VALUE.
    *       valueRenderOption: '',  // TODO: Update placeholder value.
    *
    *       // The data filters used to match the ranges of values to retrieve.
    * Ranges
    *       // that match any of the specified data filters will be included in
    * the
    *       // response.
    *       dataFilters: [],  // TODO: Update placeholder value.
    *
    *       // How dates, times, and durations should be represented in the
    * output.
    *       // This is ignored if value_render_option is
    *       // FORMATTED_VALUE.
    *       // The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER]. dateTimeRenderOption: '',  // TODO:
    * Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.batchGetByDataFilter(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.batchGetByDataFilter
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The ID of the spreadsheet to retrieve data from.
    * @param {().BatchGetValuesByDataFilterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchGetByDataFilter(): GaxiosPromise[Schema$BatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(callback: BodyResponseCallback[Schema$BatchGetValuesByDataFilterResponse]): Unit = js.native
  def batchGetByDataFilter(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchgetbydatafilter): GaxiosPromise[Schema$BatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchgetbydatafilter,
    callback: BodyResponseCallback[Schema$BatchGetValuesByDataFilterResponse]
  ): Unit = js.native
  def batchGetByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchgetbydatafilter,
    options: BodyResponseCallback[Schema$BatchGetValuesByDataFilterResponse],
    callback: BodyResponseCallback[Schema$BatchGetValuesByDataFilterResponse]
  ): Unit = js.native
  def batchGetByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchgetbydatafilter,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchgetbydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchGetValuesByDataFilterResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.batchUpdate
    * @desc Sets values in one or more ranges of a spreadsheet. The caller must
    * specify the spreadsheet ID, a valueInputOption, and one or more
    * ValueRanges.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // How the input data should be interpreted.
    *       valueInputOption: '',  // TODO: Update placeholder value.
    *
    *       // The new values to apply to the spreadsheet.
    *       data: [],  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.batchUpdate(request, function(err, response)
    * { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {().BatchUpdateValuesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[Schema$BatchUpdateValuesResponse] = js.native
  def batchUpdate(callback: BodyResponseCallback[Schema$BatchUpdateValuesResponse]): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdate): GaxiosPromise[Schema$BatchUpdateValuesResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdate,
    callback: BodyResponseCallback[Schema$BatchUpdateValuesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdate,
    options: BodyResponseCallback[Schema$BatchUpdateValuesResponse],
    callback: BodyResponseCallback[Schema$BatchUpdateValuesResponse]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchUpdateValuesResponse] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchUpdateValuesResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.batchUpdateByDataFilter
    * @desc Sets values in one or more ranges of a spreadsheet. The caller must
    * specify the spreadsheet ID, a valueInputOption, and one or more
    * DataFilterValueRanges.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // How the input data should be interpreted.
    *       valueInputOption: '',  // TODO: Update placeholder value.
    *
    *       // The new values to apply to the spreadsheet.  If more than one
    * range is
    *       // matched by the specified DataFilter the specified values will be
    *       // applied to all of those ranges.
    *       data: [],  // TODO: Update placeholder value.
    *
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.batchUpdateByDataFilter(request,
    * function(err, response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.batchUpdateByDataFilter
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {().BatchUpdateValuesByDataFilterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdateByDataFilter(): GaxiosPromise[Schema$BatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(callback: BodyResponseCallback[Schema$BatchUpdateValuesByDataFilterResponse]): Unit = js.native
  def batchUpdateByDataFilter(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdatebydatafilter): GaxiosPromise[Schema$BatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdatebydatafilter,
    callback: BodyResponseCallback[Schema$BatchUpdateValuesByDataFilterResponse]
  ): Unit = js.native
  def batchUpdateByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdatebydatafilter,
    options: BodyResponseCallback[Schema$BatchUpdateValuesByDataFilterResponse],
    callback: BodyResponseCallback[Schema$BatchUpdateValuesByDataFilterResponse]
  ): Unit = js.native
  def batchUpdateByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdatebydatafilter,
    options: MethodOptions
  ): GaxiosPromise[Schema$BatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarBatchupdatebydatafilter,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BatchUpdateValuesByDataFilterResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.clear
    * @desc Clears values from a spreadsheet. The caller must specify the
    * spreadsheet ID and range. Only values are cleared -- all other properties
    * of the cell (such as formatting, data validation, etc..) are kept.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The A1 notation of the values to clear.
    *     range: 'my-range',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.clear(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.clear
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.range The A1 notation of the values to clear.
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {().ClearValuesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def clear(): GaxiosPromise[Schema$ClearValuesResponse] = js.native
  def clear(callback: BodyResponseCallback[Schema$ClearValuesResponse]): Unit = js.native
  def clear(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarClear): GaxiosPromise[Schema$ClearValuesResponse] = js.native
  def clear(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarClear,
    callback: BodyResponseCallback[Schema$ClearValuesResponse]
  ): Unit = js.native
  def clear(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarClear,
    options: BodyResponseCallback[Schema$ClearValuesResponse],
    callback: BodyResponseCallback[Schema$ClearValuesResponse]
  ): Unit = js.native
  def clear(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarClear, options: MethodOptions): GaxiosPromise[Schema$ClearValuesResponse] = js.native
  def clear(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarClear,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ClearValuesResponse]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.get
    * @desc Returns a range of values from a spreadsheet. The caller must
    * specify the spreadsheet ID and a range.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to retrieve data from.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The A1 notation of the values to retrieve.
    *     range: 'my-range',  // TODO: Update placeholder value.
    *
    *     // How values should be represented in the output.
    *     // The default render option is ValueRenderOption.FORMATTED_VALUE.
    *     valueRenderOption: '',  // TODO: Update placeholder value.
    *
    *     // How dates, times, and durations should be represented in the
    * output.
    *     // This is ignored if value_render_option is
    *     // FORMATTED_VALUE.
    *     // The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER]. dateTimeRenderOption: '',  // TODO:
    * Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/drive.readonly'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   //   'https://www.googleapis.com/auth/spreadsheets.readonly'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dateTimeRenderOption How dates, times, and durations should be represented in the output. This is ignored if value_render_option is FORMATTED_VALUE. The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    * @param {string=} params.majorDimension The major dimension that results should use.  For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`.
    * @param {string} params.range The A1 notation of the values to retrieve.
    * @param {string} params.spreadsheetId The ID of the spreadsheet to retrieve data from.
    * @param {string=} params.valueRenderOption How values should be represented in the output. The default render option is ValueRenderOption.FORMATTED_VALUE.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ValueRange] = js.native
  def get(callback: BodyResponseCallback[Schema$ValueRange]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarGet): GaxiosPromise[Schema$ValueRange] = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarGet,
    callback: BodyResponseCallback[Schema$ValueRange]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarGet,
    options: BodyResponseCallback[Schema$ValueRange],
    callback: BodyResponseCallback[Schema$ValueRange]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ValueRange] = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ValueRange]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.values.update
    * @desc Sets values in a range of a spreadsheet. The caller must specify
    * the spreadsheet ID, range, and a valueInputOption.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Sheets API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/sheets
    * // 2. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var sheets = google.sheets('v4');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The ID of the spreadsheet to update.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The A1 notation of the values to update.
    *     range: 'my-range',  // TODO: Update placeholder value.
    *
    *     // How the input data should be interpreted.
    *     valueInputOption: '',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.values.update(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   // TODO: Change placeholder below to generate authentication
    * credentials. See
    *   //
    * https://developers.google.com/sheets/quickstart/nodejs#step_3_set_up_the_sample
    *   //
    *   // Authorize using one of the following scopes:
    *   //   'https://www.googleapis.com/auth/drive'
    *   //   'https://www.googleapis.com/auth/drive.file'
    *   //   'https://www.googleapis.com/auth/spreadsheets'
    *   var authClient = null;
    *
    *   if (authClient == null) {
    *     console.log('authentication failed');
    *     return;
    *   }
    *   callback(authClient);
    * }
    * @alias sheets.spreadsheets.values.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeValuesInResponse Determines if the update response should include the values of the cells that were updated. By default, responses do not include the updated values. If the range to write was larger than than the range actually written, the response will include all values in the requested range (excluding trailing empty rows and columns).
    * @param {string} params.range The A1 notation of the values to update.
    * @param {string=} params.responseDateTimeRenderOption Determines how dates, times, and durations in the response should be rendered. This is ignored if response_value_render_option is FORMATTED_VALUE. The default dateTime render option is DateTimeRenderOption.SERIAL_NUMBER.
    * @param {string=} params.responseValueRenderOption Determines how values in the response should be rendered. The default render option is ValueRenderOption.FORMATTED_VALUE.
    * @param {string} params.spreadsheetId The ID of the spreadsheet to update.
    * @param {string=} params.valueInputOption How the input data should be interpreted.
    * @param {().ValueRange} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$UpdateValuesResponse] = js.native
  def update(callback: BodyResponseCallback[Schema$UpdateValuesResponse]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarUpdate): GaxiosPromise[Schema$UpdateValuesResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarUpdate,
    callback: BodyResponseCallback[Schema$UpdateValuesResponse]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarUpdate,
    options: BodyResponseCallback[Schema$UpdateValuesResponse],
    callback: BodyResponseCallback[Schema$UpdateValuesResponse]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$UpdateValuesResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UpdateValuesResponse]
  ): Unit = js.native
}

