package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Settings")
@js.native
open class ResourceSettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSetting] = js.native
  def get(callback: BodyResponseCallback[SchemaSetting]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSetting] = js.native
  def get(params: ParamsResourceSettingsGet): GaxiosPromise[SchemaSetting] = js.native
  def get(params: ParamsResourceSettingsGet, callback: BodyResponseCallback[SchemaSetting]): Unit = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: BodyResponseCallback[Readable | SchemaSetting],
    callback: BodyResponseCallback[Readable | SchemaSetting]
  ): Unit = js.native
  def get(params: ParamsResourceSettingsGet, options: MethodOptions): GaxiosPromise[SchemaSetting] = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSetting]
  ): Unit = js.native
  /**
    * Returns a single user setting.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/calendar.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const calendar = google.calendar('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/calendar',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *       'https://www.googleapis.com/auth/calendar.settings.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.settings.get({
    *     // The id of the user setting.
    *     setting: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "value": "my_value"
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
  def get(params: ParamsResourceSettingsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaSettings] = js.native
  def list(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def list(params: ParamsResourceSettingsList): GaxiosPromise[SchemaSettings] = js.native
  def list(params: ParamsResourceSettingsList, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def list(
    params: ParamsResourceSettingsList,
    options: BodyResponseCallback[Readable | SchemaSettings],
    callback: BodyResponseCallback[Readable | SchemaSettings]
  ): Unit = js.native
  def list(params: ParamsResourceSettingsList, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def list(
    params: ParamsResourceSettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  /**
    * Returns all user settings for the authenticated user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/calendar.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const calendar = google.calendar('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/calendar',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *       'https://www.googleapis.com/auth/calendar.settings.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.settings.list({
    *     // Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    *     maxResults: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then.
    *     // If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
    *     // Learn more about incremental synchronization.
    *     // Optional. The default is to return all entries.
    *     syncToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken"
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
  def list(params: ParamsResourceSettingsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSettingsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceSettingsWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceSettingsWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceSettingsWatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceSettingsWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceSettingsWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Watch for changes to Settings resources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/calendar.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const calendar = google.calendar('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/calendar',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *       'https://www.googleapis.com/auth/calendar.settings.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.settings.watch({
    *     // Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    *     maxResults: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then.
    *     // If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
    *     // Learn more about incremental synchronization.
    *     // Optional. The default is to return all entries.
    *     syncToken: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "address": "my_address",
    *       //   "expiration": "my_expiration",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "params": {},
    *       //   "payload": false,
    *       //   "resourceId": "my_resourceId",
    *       //   "resourceUri": "my_resourceUri",
    *       //   "token": "my_token",
    *       //   "type": "my_type"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "address": "my_address",
    *   //   "expiration": "my_expiration",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "params": {},
    *   //   "payload": false,
    *   //   "resourceId": "my_resourceId",
    *   //   "resourceUri": "my_resourceUri",
    *   //   "token": "my_token",
    *   //   "type": "my_type"
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
  def watch(params: ParamsResourceSettingsWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceSettingsWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
