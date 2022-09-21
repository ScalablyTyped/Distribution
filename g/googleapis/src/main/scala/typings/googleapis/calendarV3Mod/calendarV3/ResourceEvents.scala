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

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Events")
@js.native
open class ResourceEvents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEventsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEventsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes an event.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.delete({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Event identifier.
    *     eventId: 'placeholder-value',
    *     // Deprecated. Please use sendUpdates instead.
    *     //
    *     // Whether to send notifications about the deletion of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
    *     sendNotifications: 'placeholder-value',
    *     // Guests who should receive notifications about the deletion of the event.
    *     sendUpdates: 'placeholder-value',
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
  def delete(params: ParamsResourceEventsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEventsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaEvent] = js.native
  def get(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def get(params: ParamsResourceEventsGet): GaxiosPromise[SchemaEvent] = js.native
  def get(params: ParamsResourceEventsGet, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def get(
    params: ParamsResourceEventsGet,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def get(params: ParamsResourceEventsGet, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def get(
    params: ParamsResourceEventsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Returns an event based on its Google Calendar ID. To retrieve an event using its iCalendar ID, call the events.list method using the iCalUID parameter.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *       'https://www.googleapis.com/auth/calendar.events.readonly',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.get({
    *     // Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    *     alwaysIncludeEmail: 'placeholder-value',
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Event identifier.
    *     eventId: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Time zone used in the response. Optional. The default is the time zone of the calendar.
    *     timeZone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def get(params: ParamsResourceEventsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEventsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaEvent] = js.native
  def `import`(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def `import`(params: ParamsResourceEventsImport): GaxiosPromise[SchemaEvent] = js.native
  def `import`(params: ParamsResourceEventsImport, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def `import`(
    params: ParamsResourceEventsImport,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def `import`(params: ParamsResourceEventsImport, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def `import`(
    params: ParamsResourceEventsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Imports an event. This operation is used to add a private copy of an existing event to a calendar.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.import({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    *     conferenceDataVersion: 'placeholder-value',
    *     // Whether API client performing operation supports event attachments. Optional. The default is False.
    *     supportsAttachments: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anyoneCanAddSelf": false,
    *       //   "attachments": [],
    *       //   "attendees": [],
    *       //   "attendeesOmitted": false,
    *       //   "colorId": "my_colorId",
    *       //   "conferenceData": {},
    *       //   "created": "my_created",
    *       //   "creator": {},
    *       //   "description": "my_description",
    *       //   "end": {},
    *       //   "endTimeUnspecified": false,
    *       //   "etag": "my_etag",
    *       //   "eventType": "my_eventType",
    *       //   "extendedProperties": {},
    *       //   "gadget": {},
    *       //   "guestsCanInviteOthers": false,
    *       //   "guestsCanModify": false,
    *       //   "guestsCanSeeOtherGuests": false,
    *       //   "hangoutLink": "my_hangoutLink",
    *       //   "htmlLink": "my_htmlLink",
    *       //   "iCalUID": "my_iCalUID",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "locked": false,
    *       //   "organizer": {},
    *       //   "originalStartTime": {},
    *       //   "privateCopy": false,
    *       //   "recurrence": [],
    *       //   "recurringEventId": "my_recurringEventId",
    *       //   "reminders": {},
    *       //   "sequence": 0,
    *       //   "source": {},
    *       //   "start": {},
    *       //   "status": "my_status",
    *       //   "summary": "my_summary",
    *       //   "transparency": "my_transparency",
    *       //   "updated": "my_updated",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def `import`(params: ParamsResourceEventsImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceEventsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaEvent] = js.native
  def insert(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def insert(params: ParamsResourceEventsInsert): GaxiosPromise[SchemaEvent] = js.native
  def insert(params: ParamsResourceEventsInsert, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def insert(
    params: ParamsResourceEventsInsert,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def insert(params: ParamsResourceEventsInsert, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def insert(
    params: ParamsResourceEventsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Creates an event.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.insert({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    *     conferenceDataVersion: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Deprecated. Please use sendUpdates instead.
    *     //
    *     // Whether to send notifications about the creation of the new event. Note that some emails might still be sent even if you set the value to false. The default is false.
    *     sendNotifications: 'placeholder-value',
    *     // Whether to send notifications about the creation of the new event. Note that some emails might still be sent. The default is false.
    *     sendUpdates: 'placeholder-value',
    *     // Whether API client performing operation supports event attachments. Optional. The default is False.
    *     supportsAttachments: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anyoneCanAddSelf": false,
    *       //   "attachments": [],
    *       //   "attendees": [],
    *       //   "attendeesOmitted": false,
    *       //   "colorId": "my_colorId",
    *       //   "conferenceData": {},
    *       //   "created": "my_created",
    *       //   "creator": {},
    *       //   "description": "my_description",
    *       //   "end": {},
    *       //   "endTimeUnspecified": false,
    *       //   "etag": "my_etag",
    *       //   "eventType": "my_eventType",
    *       //   "extendedProperties": {},
    *       //   "gadget": {},
    *       //   "guestsCanInviteOthers": false,
    *       //   "guestsCanModify": false,
    *       //   "guestsCanSeeOtherGuests": false,
    *       //   "hangoutLink": "my_hangoutLink",
    *       //   "htmlLink": "my_htmlLink",
    *       //   "iCalUID": "my_iCalUID",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "locked": false,
    *       //   "organizer": {},
    *       //   "originalStartTime": {},
    *       //   "privateCopy": false,
    *       //   "recurrence": [],
    *       //   "recurringEventId": "my_recurringEventId",
    *       //   "reminders": {},
    *       //   "sequence": 0,
    *       //   "source": {},
    *       //   "start": {},
    *       //   "status": "my_status",
    *       //   "summary": "my_summary",
    *       //   "transparency": "my_transparency",
    *       //   "updated": "my_updated",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def insert(params: ParamsResourceEventsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceEventsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def instances(): GaxiosPromise[SchemaEvents] = js.native
  def instances(callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def instances(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def instances(params: ParamsResourceEventsInstances): GaxiosPromise[SchemaEvents] = js.native
  def instances(params: ParamsResourceEventsInstances, callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def instances(
    params: ParamsResourceEventsInstances,
    options: BodyResponseCallback[Readable | SchemaEvents],
    callback: BodyResponseCallback[Readable | SchemaEvents]
  ): Unit = js.native
  def instances(params: ParamsResourceEventsInstances, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def instances(
    params: ParamsResourceEventsInstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvents]
  ): Unit = js.native
  /**
    * Returns instances of the specified recurring event.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *       'https://www.googleapis.com/auth/calendar.events.readonly',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.instances({
    *     // Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    *     alwaysIncludeEmail: 'placeholder-value',
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Recurring event identifier.
    *     eventId: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    *     maxResults: 'placeholder-value',
    *     // The original start time of the instance in the result. Optional.
    *     originalStart: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events will still be included if singleEvents is False. Optional. The default is False.
    *     showDeleted: 'placeholder-value',
    *     // Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset.
    *     timeMax: 'placeholder-value',
    *     // Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset.
    *     timeMin: 'placeholder-value',
    *     // Time zone used in the response. Optional. The default is the time zone of the calendar.
    *     timeZone: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRole": "my_accessRole",
    *   //   "defaultReminders": [],
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken",
    *   //   "summary": "my_summary",
    *   //   "timeZone": "my_timeZone",
    *   //   "updated": "my_updated"
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
  def instances(params: ParamsResourceEventsInstances, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def instances(
    params: ParamsResourceEventsInstances,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaEvents] = js.native
  def list(callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def list(params: ParamsResourceEventsList): GaxiosPromise[SchemaEvents] = js.native
  def list(params: ParamsResourceEventsList, callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def list(
    params: ParamsResourceEventsList,
    options: BodyResponseCallback[Readable | SchemaEvents],
    callback: BodyResponseCallback[Readable | SchemaEvents]
  ): Unit = js.native
  def list(params: ParamsResourceEventsList, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def list(
    params: ParamsResourceEventsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvents]
  ): Unit = js.native
  /**
    * Returns events on the specified calendar.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *       'https://www.googleapis.com/auth/calendar.events.readonly',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.list({
    *     // Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    *     alwaysIncludeEmail: 'placeholder-value',
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Specifies an event ID in the iCalendar format to be provided in the response. Optional. Use this if you want to search for an event by its iCalendar ID.
    *     iCalUID: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    *     maxResults: 'placeholder-value',
    *     // The order of the events returned in the result. Optional. The default is an unspecified, stable order.
    *     orderBy: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all given constraints.
    *     privateExtendedProperty: 'placeholder-value',
    *     // Free text search terms to find events that match these terms in the following fields: summary, description, location, attendee's displayName, attendee's email. Optional.
    *     q: 'placeholder-value',
    *     // Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all given constraints.
    *     sharedExtendedProperty: 'placeholder-value',
    *     // Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
    *     showDeleted: 'placeholder-value',
    *     // Whether to include hidden invitations in the result. Optional. The default is False.
    *     showHiddenInvitations: 'placeholder-value',
    *     // Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves. Optional. The default is False.
    *     singleEvents: 'placeholder-value',
    *     // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
    *     // There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
    *     //
    *     // These are:
    *     // - iCalUID
    *     // - orderBy
    *     // - privateExtendedProperty
    *     // - q
    *     // - sharedExtendedProperty
    *     // - timeMin
    *     // - timeMax
    *     // - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
    *     // Learn more about incremental synchronization.
    *     // Optional. The default is to return all entries.
    *     syncToken: 'placeholder-value',
    *     // Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
    *     timeMax: 'placeholder-value',
    *     // Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
    *     timeMin: 'placeholder-value',
    *     // Time zone used in the response. Optional. The default is the time zone of the calendar.
    *     timeZone: 'placeholder-value',
    *     // Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of showDeleted. Optional. The default is not to filter by last modification time.
    *     updatedMin: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessRole": "my_accessRole",
    *   //   "defaultReminders": [],
    *   //   "description": "my_description",
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "nextSyncToken": "my_nextSyncToken",
    *   //   "summary": "my_summary",
    *   //   "timeZone": "my_timeZone",
    *   //   "updated": "my_updated"
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
  def list(params: ParamsResourceEventsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEventsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def move(): GaxiosPromise[SchemaEvent] = js.native
  def move(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def move(params: ParamsResourceEventsMove): GaxiosPromise[SchemaEvent] = js.native
  def move(params: ParamsResourceEventsMove, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def move(
    params: ParamsResourceEventsMove,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def move(params: ParamsResourceEventsMove, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def move(
    params: ParamsResourceEventsMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Moves an event to another calendar, i.e. changes an event's organizer.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.move({
    *     // Calendar identifier of the source calendar where the event currently is on.
    *     calendarId: 'placeholder-value',
    *     // Calendar identifier of the target calendar where the event is to be moved to.
    *     destination: 'placeholder-value',
    *     // Event identifier.
    *     eventId: 'placeholder-value',
    *     // Deprecated. Please use sendUpdates instead.
    *     //
    *     // Whether to send notifications about the change of the event's organizer. Note that some emails might still be sent even if you set the value to false. The default is false.
    *     sendNotifications: 'placeholder-value',
    *     // Guests who should receive notifications about the change of the event's organizer.
    *     sendUpdates: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def move(params: ParamsResourceEventsMove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def move(
    params: ParamsResourceEventsMove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaEvent] = js.native
  def patch(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def patch(params: ParamsResourceEventsPatch): GaxiosPromise[SchemaEvent] = js.native
  def patch(params: ParamsResourceEventsPatch, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def patch(
    params: ParamsResourceEventsPatch,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def patch(params: ParamsResourceEventsPatch, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def patch(
    params: ParamsResourceEventsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Updates an event. This method supports patch semantics.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.patch({
    *     // Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    *     alwaysIncludeEmail: 'placeholder-value',
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    *     conferenceDataVersion: 'placeholder-value',
    *     // Event identifier.
    *     eventId: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Deprecated. Please use sendUpdates instead.
    *     //
    *     // Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you set the value to false. The default is false.
    *     sendNotifications: 'placeholder-value',
    *     // Guests who should receive notifications about the event update (for example, title changes, etc.).
    *     sendUpdates: 'placeholder-value',
    *     // Whether API client performing operation supports event attachments. Optional. The default is False.
    *     supportsAttachments: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anyoneCanAddSelf": false,
    *       //   "attachments": [],
    *       //   "attendees": [],
    *       //   "attendeesOmitted": false,
    *       //   "colorId": "my_colorId",
    *       //   "conferenceData": {},
    *       //   "created": "my_created",
    *       //   "creator": {},
    *       //   "description": "my_description",
    *       //   "end": {},
    *       //   "endTimeUnspecified": false,
    *       //   "etag": "my_etag",
    *       //   "eventType": "my_eventType",
    *       //   "extendedProperties": {},
    *       //   "gadget": {},
    *       //   "guestsCanInviteOthers": false,
    *       //   "guestsCanModify": false,
    *       //   "guestsCanSeeOtherGuests": false,
    *       //   "hangoutLink": "my_hangoutLink",
    *       //   "htmlLink": "my_htmlLink",
    *       //   "iCalUID": "my_iCalUID",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "locked": false,
    *       //   "organizer": {},
    *       //   "originalStartTime": {},
    *       //   "privateCopy": false,
    *       //   "recurrence": [],
    *       //   "recurringEventId": "my_recurringEventId",
    *       //   "reminders": {},
    *       //   "sequence": 0,
    *       //   "source": {},
    *       //   "start": {},
    *       //   "status": "my_status",
    *       //   "summary": "my_summary",
    *       //   "transparency": "my_transparency",
    *       //   "updated": "my_updated",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def patch(params: ParamsResourceEventsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEventsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def quickAdd(): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def quickAdd(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(params: ParamsResourceEventsQuickadd): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(params: ParamsResourceEventsQuickadd, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def quickAdd(
    params: ParamsResourceEventsQuickadd,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def quickAdd(params: ParamsResourceEventsQuickadd, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(
    params: ParamsResourceEventsQuickadd,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Creates an event based on a simple text string.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.quickAdd({
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Deprecated. Please use sendUpdates instead.
    *     //
    *     // Whether to send notifications about the creation of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
    *     sendNotifications: 'placeholder-value',
    *     // Guests who should receive notifications about the creation of the new event.
    *     sendUpdates: 'placeholder-value',
    *     // The text describing the event to be created.
    *     text: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def quickAdd(params: ParamsResourceEventsQuickadd, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def quickAdd(
    params: ParamsResourceEventsQuickadd,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaEvent] = js.native
  def update(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def update(params: ParamsResourceEventsUpdate): GaxiosPromise[SchemaEvent] = js.native
  def update(params: ParamsResourceEventsUpdate, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def update(
    params: ParamsResourceEventsUpdate,
    options: BodyResponseCallback[Readable | SchemaEvent],
    callback: BodyResponseCallback[Readable | SchemaEvent]
  ): Unit = js.native
  def update(params: ParamsResourceEventsUpdate, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def update(
    params: ParamsResourceEventsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  /**
    * Updates an event.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.update({
    *     // Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    *     alwaysIncludeEmail: 'placeholder-value',
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    *     conferenceDataVersion: 'placeholder-value',
    *     // Event identifier.
    *     eventId: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Deprecated. Please use sendUpdates instead.
    *     //
    *     // Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you set the value to false. The default is false.
    *     sendNotifications: 'placeholder-value',
    *     // Guests who should receive notifications about the event update (for example, title changes, etc.).
    *     sendUpdates: 'placeholder-value',
    *     // Whether API client performing operation supports event attachments. Optional. The default is False.
    *     supportsAttachments: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "anyoneCanAddSelf": false,
    *       //   "attachments": [],
    *       //   "attendees": [],
    *       //   "attendeesOmitted": false,
    *       //   "colorId": "my_colorId",
    *       //   "conferenceData": {},
    *       //   "created": "my_created",
    *       //   "creator": {},
    *       //   "description": "my_description",
    *       //   "end": {},
    *       //   "endTimeUnspecified": false,
    *       //   "etag": "my_etag",
    *       //   "eventType": "my_eventType",
    *       //   "extendedProperties": {},
    *       //   "gadget": {},
    *       //   "guestsCanInviteOthers": false,
    *       //   "guestsCanModify": false,
    *       //   "guestsCanSeeOtherGuests": false,
    *       //   "hangoutLink": "my_hangoutLink",
    *       //   "htmlLink": "my_htmlLink",
    *       //   "iCalUID": "my_iCalUID",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "location": "my_location",
    *       //   "locked": false,
    *       //   "organizer": {},
    *       //   "originalStartTime": {},
    *       //   "privateCopy": false,
    *       //   "recurrence": [],
    *       //   "recurringEventId": "my_recurringEventId",
    *       //   "reminders": {},
    *       //   "sequence": 0,
    *       //   "source": {},
    *       //   "start": {},
    *       //   "status": "my_status",
    *       //   "summary": "my_summary",
    *       //   "transparency": "my_transparency",
    *       //   "updated": "my_updated",
    *       //   "visibility": "my_visibility"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "anyoneCanAddSelf": false,
    *   //   "attachments": [],
    *   //   "attendees": [],
    *   //   "attendeesOmitted": false,
    *   //   "colorId": "my_colorId",
    *   //   "conferenceData": {},
    *   //   "created": "my_created",
    *   //   "creator": {},
    *   //   "description": "my_description",
    *   //   "end": {},
    *   //   "endTimeUnspecified": false,
    *   //   "etag": "my_etag",
    *   //   "eventType": "my_eventType",
    *   //   "extendedProperties": {},
    *   //   "gadget": {},
    *   //   "guestsCanInviteOthers": false,
    *   //   "guestsCanModify": false,
    *   //   "guestsCanSeeOtherGuests": false,
    *   //   "hangoutLink": "my_hangoutLink",
    *   //   "htmlLink": "my_htmlLink",
    *   //   "iCalUID": "my_iCalUID",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "location": "my_location",
    *   //   "locked": false,
    *   //   "organizer": {},
    *   //   "originalStartTime": {},
    *   //   "privateCopy": false,
    *   //   "recurrence": [],
    *   //   "recurringEventId": "my_recurringEventId",
    *   //   "reminders": {},
    *   //   "sequence": 0,
    *   //   "source": {},
    *   //   "start": {},
    *   //   "status": "my_status",
    *   //   "summary": "my_summary",
    *   //   "transparency": "my_transparency",
    *   //   "updated": "my_updated",
    *   //   "visibility": "my_visibility"
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
  def update(params: ParamsResourceEventsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceEventsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceEventsWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceEventsWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceEventsWatch,
    options: BodyResponseCallback[Readable | SchemaChannel],
    callback: BodyResponseCallback[Readable | SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceEventsWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceEventsWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  /**
    * Watch for changes to Events resources.
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
    *       'https://www.googleapis.com/auth/calendar.events',
    *       'https://www.googleapis.com/auth/calendar.events.readonly',
    *       'https://www.googleapis.com/auth/calendar.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await calendar.events.watch({
    *     // Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a generated, non-working value will be provided).
    *     alwaysIncludeEmail: 'placeholder-value',
    *     // Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    *     calendarId: 'placeholder-value',
    *     // Specifies an event ID in the iCalendar format to be provided in the response. Optional. Use this if you want to search for an event by its iCalendar ID.
    *     iCalUID: 'placeholder-value',
    *     // The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    *     maxAttendees: 'placeholder-value',
    *     // Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    *     maxResults: 'placeholder-value',
    *     // The order of the events returned in the result. Optional. The default is an unspecified, stable order.
    *     orderBy: 'placeholder-value',
    *     // Token specifying which result page to return. Optional.
    *     pageToken: 'placeholder-value',
    *     // Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all given constraints.
    *     privateExtendedProperty: 'placeholder-value',
    *     // Free text search terms to find events that match these terms in the following fields: summary, description, location, attendee's displayName, attendee's email. Optional.
    *     q: 'placeholder-value',
    *     // Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all given constraints.
    *     sharedExtendedProperty: 'placeholder-value',
    *     // Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
    *     showDeleted: 'placeholder-value',
    *     // Whether to include hidden invitations in the result. Optional. The default is False.
    *     showHiddenInvitations: 'placeholder-value',
    *     // Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves. Optional. The default is False.
    *     singleEvents: 'placeholder-value',
    *     // Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
    *     // There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
    *     //
    *     // These are:
    *     // - iCalUID
    *     // - orderBy
    *     // - privateExtendedProperty
    *     // - q
    *     // - sharedExtendedProperty
    *     // - timeMin
    *     // - timeMax
    *     // - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken.
    *     // Learn more about incremental synchronization.
    *     // Optional. The default is to return all entries.
    *     syncToken: 'placeholder-value',
    *     // Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
    *     timeMax: 'placeholder-value',
    *     // Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
    *     timeMin: 'placeholder-value',
    *     // Time zone used in the response. Optional. The default is the time zone of the calendar.
    *     timeZone: 'placeholder-value',
    *     // Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of showDeleted. Optional. The default is not to filter by last modification time.
    *     updatedMin: 'placeholder-value',
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
  def watch(params: ParamsResourceEventsWatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def watch(
    params: ParamsResourceEventsWatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
