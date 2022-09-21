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

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Calendarlist")
@js.native
open class ResourceCalendarlist protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarlistDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarlistDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCalendarlistDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCalendarlistDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCalendarlistDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a calendar from the user's calendar list.
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
    *     scopes: ['https://www.googleapis.com/auth/calendar'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.delete({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceCalendarlistDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCalendarlistDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(params: ParamsResourceCalendarlistGet): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(params: ParamsResourceCalendarlistGet, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def get(
    params: ParamsResourceCalendarlistGet,
    options: BodyResponseCallback[Readable | SchemaCalendarListEntry],
    callback: BodyResponseCallback[Readable | SchemaCalendarListEntry]
  ): Unit = js.native
  def get(params: ParamsResourceCalendarlistGet, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(
    params: ParamsResourceCalendarlistGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  /**
    * Returns a calendar from the user's calendar list.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.get({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRole": "my_accessRole",
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "colorId": "my_colorId",
    *   //   "conferenceProperties": {},
    *   //   "defaultReminders": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "foregroundColor": "my_foregroundColor",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "notificationSettings": {},
    *   //   "primary": false,
    *   //   "selected": false,
    *   //   "summary": "my_summary",
    *   //   "summaryOverride": "my_summaryOverride",
    *   //   "timeZone": "my_timeZone"
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
  def get(params: ParamsResourceCalendarlistGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCalendarlistGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(params: ParamsResourceCalendarlistInsert): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(params: ParamsResourceCalendarlistInsert, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def insert(
    params: ParamsResourceCalendarlistInsert,
    options: BodyResponseCallback[Readable | SchemaCalendarListEntry],
    callback: BodyResponseCallback[Readable | SchemaCalendarListEntry]
  ): Unit = js.native
  def insert(params: ParamsResourceCalendarlistInsert, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(
    params: ParamsResourceCalendarlistInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  /**
    * Inserts an existing calendar into the user's calendar list.
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
    *     scopes: ['https://www.googleapis.com/auth/calendar'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.insert({
    *     // Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    *     colorRgbFormat: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessRole": "my_accessRole",
    *       //   "backgroundColor": "my_backgroundColor",
    *       //   "colorId": "my_colorId",
    *       //   "conferenceProperties": {},
    *       //   "defaultReminders": [],
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "foregroundColor": "my_foregroundColor",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "notificationSettings": {},
    *       //   "primary": false,
    *       //   "selected": false,
    *       //   "summary": "my_summary",
    *       //   "summaryOverride": "my_summaryOverride",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRole": "my_accessRole",
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "colorId": "my_colorId",
    *   //   "conferenceProperties": {},
    *   //   "defaultReminders": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "foregroundColor": "my_foregroundColor",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "notificationSettings": {},
    *   //   "primary": false,
    *   //   "selected": false,
    *   //   "summary": "my_summary",
    *   //   "summaryOverride": "my_summaryOverride",
    *   //   "timeZone": "my_timeZone"
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
  def insert(params: ParamsResourceCalendarlistInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCalendarlistInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCalendarList] = js.native
  def list(callback: BodyResponseCallback[SchemaCalendarList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarList] = js.native
  def list(params: ParamsResourceCalendarlistList): GaxiosPromise[SchemaCalendarList] = js.native
  def list(params: ParamsResourceCalendarlistList, callback: BodyResponseCallback[SchemaCalendarList]): Unit = js.native
  def list(
    params: ParamsResourceCalendarlistList,
    options: BodyResponseCallback[Readable | SchemaCalendarList],
    callback: BodyResponseCallback[Readable | SchemaCalendarList]
  ): Unit = js.native
  def list(params: ParamsResourceCalendarlistList, options: MethodOptions): GaxiosPromise[SchemaCalendarList] = js.native
  def list(
    params: ParamsResourceCalendarlistList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarList]
  ): Unit = js.native
  /**
    * Returns the calendars on the user's calendar list.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.list({
    *     // Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    *     maxResults: 'placeholder-value',
    *     // The minimum access role for the user in the returned entries. Optional. The default is no restriction.
    *     minAccessRole: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Whether to include deleted calendar list entries in the result. Optional. The default is False.
    *     showDeleted: 'placeholder-value',
    *     // Whether to show hidden entries. Optional. The default is False.
    *     showHidden: 'placeholder-value',
    *     // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False.
    *     // To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken.
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
  def list(params: ParamsResourceCalendarlistList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCalendarlistList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(params: ParamsResourceCalendarlistPatch): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(params: ParamsResourceCalendarlistPatch, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def patch(
    params: ParamsResourceCalendarlistPatch,
    options: BodyResponseCallback[Readable | SchemaCalendarListEntry],
    callback: BodyResponseCallback[Readable | SchemaCalendarListEntry]
  ): Unit = js.native
  def patch(params: ParamsResourceCalendarlistPatch, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(
    params: ParamsResourceCalendarlistPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  /**
    * Updates an existing calendar on the user's calendar list. This method supports patch semantics.
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
    *     scopes: ['https://www.googleapis.com/auth/calendar'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.patch({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    *     colorRgbFormat: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessRole": "my_accessRole",
    *       //   "backgroundColor": "my_backgroundColor",
    *       //   "colorId": "my_colorId",
    *       //   "conferenceProperties": {},
    *       //   "defaultReminders": [],
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "foregroundColor": "my_foregroundColor",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "notificationSettings": {},
    *       //   "primary": false,
    *       //   "selected": false,
    *       //   "summary": "my_summary",
    *       //   "summaryOverride": "my_summaryOverride",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRole": "my_accessRole",
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "colorId": "my_colorId",
    *   //   "conferenceProperties": {},
    *   //   "defaultReminders": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "foregroundColor": "my_foregroundColor",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "notificationSettings": {},
    *   //   "primary": false,
    *   //   "selected": false,
    *   //   "summary": "my_summary",
    *   //   "summaryOverride": "my_summaryOverride",
    *   //   "timeZone": "my_timeZone"
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
  def patch(params: ParamsResourceCalendarlistPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCalendarlistPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(params: ParamsResourceCalendarlistUpdate): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(params: ParamsResourceCalendarlistUpdate, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def update(
    params: ParamsResourceCalendarlistUpdate,
    options: BodyResponseCallback[Readable | SchemaCalendarListEntry],
    callback: BodyResponseCallback[Readable | SchemaCalendarListEntry]
  ): Unit = js.native
  def update(params: ParamsResourceCalendarlistUpdate, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(
    params: ParamsResourceCalendarlistUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  /**
    * Updates an existing calendar on the user's calendar list.
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
    *     scopes: ['https://www.googleapis.com/auth/calendar'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.update({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    *     colorRgbFormat: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessRole": "my_accessRole",
    *       //   "backgroundColor": "my_backgroundColor",
    *       //   "colorId": "my_colorId",
    *       //   "conferenceProperties": {},
    *       //   "defaultReminders": [],
    *       //   "deleted": false,
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "foregroundColor": "my_foregroundColor",
    *       //   "hidden": false,
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "notificationSettings": {},
    *       //   "primary": false,
    *       //   "selected": false,
    *       //   "summary": "my_summary",
    *       //   "summaryOverride": "my_summaryOverride",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRole": "my_accessRole",
    *   //   "backgroundColor": "my_backgroundColor",
    *   //   "colorId": "my_colorId",
    *   //   "conferenceProperties": {},
    *   //   "defaultReminders": [],
    *   //   "deleted": false,
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "foregroundColor": "my_foregroundColor",
    *   //   "hidden": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "notificationSettings": {},
    *   //   "primary": false,
    *   //   "selected": false,
    *   //   "summary": "my_summary",
    *   //   "summaryOverride": "my_summaryOverride",
    *   //   "timeZone": "my_timeZone"
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
  def update(params: ParamsResourceCalendarlistUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCalendarlistUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceCalendarlistWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceCalendarlistWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceCalendarlistWatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceCalendarlistWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceCalendarlistWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Watch for changes to CalendarList resources.
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
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.calendarList.watch({
    *     // Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    *     maxResults: 'placeholder-value',
    *     // The minimum access role for the user in the returned entries. Optional. The default is no restriction.
    *     minAccessRole: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Whether to include deleted calendar list entries in the result. Optional. The default is False.
    *     showDeleted: 'placeholder-value',
    *     // Whether to show hidden entries. Optional. The default is False.
    *     showHidden: 'placeholder-value',
    *     // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False.
    *     // To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken.
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
  def watch(params: ParamsResourceCalendarlistWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceCalendarlistWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
