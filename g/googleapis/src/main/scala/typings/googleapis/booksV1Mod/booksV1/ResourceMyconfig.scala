package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Myconfig")
@js.native
open class ResourceMyconfig protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getUserSettings(): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(callback: BodyResponseCallback[SchemaUsersettings]): Unit = js.native
  def getUserSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings, callback: BodyResponseCallback[SchemaUsersettings]): Unit = js.native
  def getUserSettings(
    params: ParamsResourceMyconfigGetusersettings,
    options: BodyResponseCallback[Readable | SchemaUsersettings],
    callback: BodyResponseCallback[Readable | SchemaUsersettings]
  ): Unit = js.native
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings, options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(
    params: ParamsResourceMyconfigGetusersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  /**
    * Gets the current settings for the user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.myconfig.getUserSettings({
    *     // Unused. Added only to workaround TEX mandatory request template requirement
    *     country: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "notesExport": {},
    *   //   "notification": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getUserSettings(
    params: ParamsResourceMyconfigGetusersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def releaseDownloadAccess(): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(callback: BodyResponseCallback[SchemaDownloadAccesses]): Unit = js.native
  def releaseDownloadAccess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(params: ParamsResourceMyconfigReleasedownloadaccess): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    callback: BodyResponseCallback[SchemaDownloadAccesses]
  ): Unit = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    options: BodyResponseCallback[Readable | SchemaDownloadAccesses],
    callback: BodyResponseCallback[Readable | SchemaDownloadAccesses]
  ): Unit = js.native
  def releaseDownloadAccess(params: ParamsResourceMyconfigReleasedownloadaccess, options: MethodOptions): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadAccesses]
  ): Unit = js.native
  /**
    * Release downloaded content access restriction.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.myconfig.releaseDownloadAccess({
    *     // The device/version ID from which to release the restriction.
    *     cpksver: 'placeholder-value',
    *     // ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    *     locale: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume(s) to release restrictions for.
    *     volumeIds: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "downloadAccessList": [],
    *   //   "kind": "my_kind"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def releaseDownloadAccess(params: ParamsResourceMyconfigReleasedownloadaccess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def requestAccess(): GaxiosPromise[SchemaRequestAccessData] = js.native
  def requestAccess(callback: BodyResponseCallback[SchemaRequestAccessData]): Unit = js.native
  def requestAccess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRequestAccessData] = js.native
  def requestAccess(params: ParamsResourceMyconfigRequestaccess): GaxiosPromise[SchemaRequestAccessData] = js.native
  def requestAccess(
    params: ParamsResourceMyconfigRequestaccess,
    callback: BodyResponseCallback[SchemaRequestAccessData]
  ): Unit = js.native
  def requestAccess(
    params: ParamsResourceMyconfigRequestaccess,
    options: BodyResponseCallback[Readable | SchemaRequestAccessData],
    callback: BodyResponseCallback[Readable | SchemaRequestAccessData]
  ): Unit = js.native
  def requestAccess(params: ParamsResourceMyconfigRequestaccess, options: MethodOptions): GaxiosPromise[SchemaRequestAccessData] = js.native
  def requestAccess(
    params: ParamsResourceMyconfigRequestaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRequestAccessData]
  ): Unit = js.native
  /**
    * Request concurrent and download access restrictions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.myconfig.requestAccess({
    *     // The device/version ID from which to request the restrictions.
    *     cpksver: 'placeholder-value',
    *     // The type of access license to request. If not specified, the default is BOTH.
    *     licenseTypes: 'placeholder-value',
    *     // ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    *     locale: 'placeholder-value',
    *     // The client nonce value.
    *     nonce: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume to request concurrent/download restrictions for.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "concurrentAccess": {},
    *   //   "downloadAccess": {},
    *   //   "kind": "my_kind"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def requestAccess(params: ParamsResourceMyconfigRequestaccess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def requestAccess(
    params: ParamsResourceMyconfigRequestaccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def syncVolumeLicenses(): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def syncVolumeLicenses(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def syncVolumeLicenses(
    params: ParamsResourceMyconfigSyncvolumelicenses,
    options: BodyResponseCallback[Readable | SchemaVolumes],
    callback: BodyResponseCallback[Readable | SchemaVolumes]
  ): Unit = js.native
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(
    params: ParamsResourceMyconfigSyncvolumelicenses,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  /**
    * Request downloaded content access for specified volumes on the My eBooks shelf.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.myconfig.syncVolumeLicenses({
    *     // The device/version ID from which to release the restriction.
    *     cpksver: 'placeholder-value',
    *     // List of features supported by the client, i.e., 'RENTALS'
    *     features: 'placeholder-value',
    *     // Set to true to include non-comics series. Defaults to false.
    *     includeNonComicsSeries: 'placeholder-value',
    *     // ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    *     locale: 'placeholder-value',
    *     // The client nonce value.
    *     nonce: 'placeholder-value',
    *     // Set to true to show pre-ordered books. Defaults to false.
    *     showPreorders: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume(s) to request download restrictions for.
    *     volumeIds: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "totalItems": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def syncVolumeLicenses(
    params: ParamsResourceMyconfigSyncvolumelicenses,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateUserSettings(): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(callback: BodyResponseCallback[SchemaUsersettings]): Unit = js.native
  def updateUserSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(params: ParamsResourceMyconfigUpdateusersettings): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    options: BodyResponseCallback[Readable | SchemaUsersettings],
    callback: BodyResponseCallback[Readable | SchemaUsersettings]
  ): Unit = js.native
  def updateUserSettings(params: ParamsResourceMyconfigUpdateusersettings, options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  /**
    * Sets the settings for the user. If a sub-object is specified, it will overwrite the existing sub-object stored in the server. Unspecified sub-objects will retain the existing value.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.myconfig.updateUserSettings({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "kind": "my_kind",
    *       //   "notesExport": {},
    *       //   "notification": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "notesExport": {},
    *   //   "notification": {}
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def updateUserSettings(params: ParamsResourceMyconfigUpdateusersettings, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
