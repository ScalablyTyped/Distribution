package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sheets/v4", "sheets_v4.Resource$Spreadsheets$Developermetadata")
@js.native
class ResourceDollarSpreadsheetsDollarDevelopermetadata protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sheets.spreadsheets.developerMetadata.get
    * @desc Returns the developer metadata with the specified ID. The caller
    * must specify the spreadsheet ID and the developer metadata's unique
    * metadataId.
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
    *     // The ID of the spreadsheet to retrieve metadata from.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     // The ID of the developer metadata to retrieve.
    *     metadataId: 0,  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.developerMetadata.get(request, function(err,
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
    * @alias sheets.spreadsheets.developerMetadata.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.metadataId The ID of the developer metadata to retrieve.
    * @param {string} params.spreadsheetId The ID of the spreadsheet to retrieve metadata from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DeveloperMetadata] = js.native
  def get(callback: BodyResponseCallback[Schema$DeveloperMetadata]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarGet): GaxiosPromise[Schema$DeveloperMetadata] = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarGet,
    callback: BodyResponseCallback[Schema$DeveloperMetadata]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarGet,
    options: BodyResponseCallback[Schema$DeveloperMetadata],
    callback: BodyResponseCallback[Schema$DeveloperMetadata]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$DeveloperMetadata] = js.native
  def get(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DeveloperMetadata]
  ): Unit = js.native
  /**
    * sheets.spreadsheets.developerMetadata.search
    * @desc Returns all developer metadata matching the specified DataFilter.
    * If the provided DataFilter represents a DeveloperMetadataLookup object,
    * this will return all DeveloperMetadata entries selected by it. If the
    * DataFilter represents a location in a spreadsheet, this will return all
    * developer metadata associated with locations intersecting that region.
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
    *     // The ID of the spreadsheet to retrieve metadata from.
    *     spreadsheetId: 'my-spreadsheet-id',  // TODO: Update placeholder
    * value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   sheets.spreadsheets.developerMetadata.search(request, function(err,
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
    * @alias sheets.spreadsheets.developerMetadata.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.spreadsheetId The ID of the spreadsheet to retrieve metadata from.
    * @param {().SearchDeveloperMetadataRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchDeveloperMetadataResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchDeveloperMetadataResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarSearch): GaxiosPromise[Schema$SearchDeveloperMetadataResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarSearch,
    callback: BodyResponseCallback[Schema$SearchDeveloperMetadataResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarSearch,
    options: BodyResponseCallback[Schema$SearchDeveloperMetadataResponse],
    callback: BodyResponseCallback[Schema$SearchDeveloperMetadataResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarSearch,
    options: MethodOptions
  ): GaxiosPromise[Schema$SearchDeveloperMetadataResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarSpreadsheetsDollarDevelopermetadataDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchDeveloperMetadataResponse]
  ): Unit = js.native
}

