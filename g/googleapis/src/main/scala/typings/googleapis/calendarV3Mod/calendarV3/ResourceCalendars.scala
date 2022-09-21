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

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Calendars")
@js.native
open class ResourceCalendars protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def clear(): GaxiosPromise[Unit] = js.native
  def clear(callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceCalendarsClear): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceCalendarsClear, callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(
    params: ParamsResourceCalendarsClear,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def clear(params: ParamsResourceCalendarsClear, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceCalendarsClear, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
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
    *   const res = await calendar.calendars.clear({
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
  def clear(params: ParamsResourceCalendarsClear, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clear(
    params: ParamsResourceCalendarsClear,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCalendarsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCalendarsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCalendarsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
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
    *   const res = await calendar.calendars.delete({
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
  def delete(params: ParamsResourceCalendarsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCalendarsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaCalendar] = js.native
  def get(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def get(params: ParamsResourceCalendarsGet): GaxiosPromise[SchemaCalendar] = js.native
  def get(params: ParamsResourceCalendarsGet, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def get(
    params: ParamsResourceCalendarsGet,
    options: BodyResponseCallback[Readable | SchemaCalendar],
    callback: BodyResponseCallback[Readable | SchemaCalendar]
  ): Unit = js.native
  def get(params: ParamsResourceCalendarsGet, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def get(
    params: ParamsResourceCalendarsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  /**
    * Returns metadata for a calendar.
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
    *   const res = await calendar.calendars.get({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conferenceProperties": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "summary": "my_summary",
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
  def get(params: ParamsResourceCalendarsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCalendarsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaCalendar] = js.native
  def insert(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def insert(params: ParamsResourceCalendarsInsert): GaxiosPromise[SchemaCalendar] = js.native
  def insert(params: ParamsResourceCalendarsInsert, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def insert(
    params: ParamsResourceCalendarsInsert,
    options: BodyResponseCallback[Readable | SchemaCalendar],
    callback: BodyResponseCallback[Readable | SchemaCalendar]
  ): Unit = js.native
  def insert(params: ParamsResourceCalendarsInsert, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def insert(
    params: ParamsResourceCalendarsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  /**
    * Creates a secondary calendar.
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
    *   const res = await calendar.calendars.insert({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conferenceProperties": {},
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "summary": "my_summary",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conferenceProperties": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "summary": "my_summary",
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
  def insert(params: ParamsResourceCalendarsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceCalendarsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaCalendar] = js.native
  def patch(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def patch(params: ParamsResourceCalendarsPatch): GaxiosPromise[SchemaCalendar] = js.native
  def patch(params: ParamsResourceCalendarsPatch, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def patch(
    params: ParamsResourceCalendarsPatch,
    options: BodyResponseCallback[Readable | SchemaCalendar],
    callback: BodyResponseCallback[Readable | SchemaCalendar]
  ): Unit = js.native
  def patch(params: ParamsResourceCalendarsPatch, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def patch(
    params: ParamsResourceCalendarsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  /**
    * Updates metadata for a calendar. This method supports patch semantics.
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
    *   const res = await calendar.calendars.patch({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conferenceProperties": {},
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "summary": "my_summary",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conferenceProperties": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "summary": "my_summary",
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
  def patch(params: ParamsResourceCalendarsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceCalendarsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaCalendar] = js.native
  def update(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def update(params: ParamsResourceCalendarsUpdate): GaxiosPromise[SchemaCalendar] = js.native
  def update(params: ParamsResourceCalendarsUpdate, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def update(
    params: ParamsResourceCalendarsUpdate,
    options: BodyResponseCallback[Readable | SchemaCalendar],
    callback: BodyResponseCallback[Readable | SchemaCalendar]
  ): Unit = js.native
  def update(params: ParamsResourceCalendarsUpdate, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def update(
    params: ParamsResourceCalendarsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  /**
    * Updates metadata for a calendar.
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
    *   const res = await calendar.calendars.update({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "conferenceProperties": {},
    *       //   "description": "my_description",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "summary": "my_summary",
    *       //   "timeZone": "my_timeZone"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "conferenceProperties": {},
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "summary": "my_summary",
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
  def update(params: ParamsResourceCalendarsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceCalendarsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
