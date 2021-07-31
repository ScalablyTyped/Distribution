package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Events")
@js.native
class ResourceEvents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * calendar.events.delete
    * @desc Deletes an event.
    * @alias calendar.events.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.eventId Event identifier.
    * @param {boolean=} params.sendNotifications Deprecated. Please use sendUpdates instead.  Whether to send notifications about the deletion of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
    * @param {string=} params.sendUpdates Guests who should receive notifications about the deletion of the event.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceEventsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceEventsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceEventsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * calendar.events.get
    * @desc Returns an event.
    * @alias calendar.events.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.alwaysIncludeEmail Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated, non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an email address value in the mentioned places. Optional. The default is False.
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.eventId Event identifier.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {string=} params.timeZone Time zone used in the response. Optional. The default is the time zone of the calendar.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaEvent] = js.native
  def get(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def get(params: ParamsResourceEventsGet): GaxiosPromise[SchemaEvent] = js.native
  def get(params: ParamsResourceEventsGet, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def get(
    params: ParamsResourceEventsGet,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def get(params: ParamsResourceEventsGet, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def get(
    params: ParamsResourceEventsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.import
    * @desc Imports an event. This operation is used to add a private copy of an
    * existing event to a calendar.
    * @alias calendar.events.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {integer=} params.conferenceDataVersion Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    * @param {boolean=} params.supportsAttachments Whether API client performing operation supports event attachments. Optional. The default is False.
    * @param {().Event} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[SchemaEvent] = js.native
  def `import`(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def `import`(params: ParamsResourceEventsImport): GaxiosPromise[SchemaEvent] = js.native
  def `import`(params: ParamsResourceEventsImport, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def `import`(
    params: ParamsResourceEventsImport,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def `import`(params: ParamsResourceEventsImport, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def `import`(
    params: ParamsResourceEventsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.insert
    * @desc Creates an event.
    * @alias calendar.events.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {integer=} params.conferenceDataVersion Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {boolean=} params.sendNotifications Deprecated. Please use sendUpdates instead.  Whether to send notifications about the creation of the new event. Note that some emails might still be sent even if you set the value to false. The default is false.
    * @param {string=} params.sendUpdates Whether to send notifications about the creation of the new event. Note that some emails might still be sent. The default is false.
    * @param {boolean=} params.supportsAttachments Whether API client performing operation supports event attachments. Optional. The default is False.
    * @param {().Event} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaEvent] = js.native
  def insert(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def insert(params: ParamsResourceEventsInsert): GaxiosPromise[SchemaEvent] = js.native
  def insert(params: ParamsResourceEventsInsert, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def insert(
    params: ParamsResourceEventsInsert,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def insert(params: ParamsResourceEventsInsert, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def insert(
    params: ParamsResourceEventsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.instances
    * @desc Returns instances of the specified recurring event.
    * @alias calendar.events.instances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.alwaysIncludeEmail Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated, non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an email address value in the mentioned places. Optional. The default is False.
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string} params.eventId Recurring event identifier.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {integer=} params.maxResults Maximum number of events returned on one result page. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    * @param {string=} params.originalStart The original start time of the instance in the result. Optional.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {boolean=} params.showDeleted Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events will still be included if singleEvents is False. Optional. The default is False.
    * @param {string=} params.timeMax Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset.
    * @param {string=} params.timeMin Lower bound (inclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset.
    * @param {string=} params.timeZone Time zone used in the response. Optional. The default is the time zone of the calendar.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def instances(): GaxiosPromise[SchemaEvents] = js.native
  def instances(callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def instances(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def instances(params: ParamsResourceEventsInstances): GaxiosPromise[SchemaEvents] = js.native
  def instances(params: ParamsResourceEventsInstances, callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def instances(
    params: ParamsResourceEventsInstances,
    options: BodyResponseCallback[SchemaEvents],
    callback: BodyResponseCallback[SchemaEvents]
  ): Unit = js.native
  def instances(params: ParamsResourceEventsInstances, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def instances(
    params: ParamsResourceEventsInstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvents]
  ): Unit = js.native
  
  /**
    * calendar.events.list
    * @desc Returns events on the specified calendar.
    * @alias calendar.events.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.alwaysIncludeEmail Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated, non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an email address value in the mentioned places. Optional. The default is False.
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string=} params.iCalUID Specifies event ID in the iCalendar format to be included in the response. Optional.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {integer=} params.maxResults Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    * @param {string=} params.orderBy The order of the events returned in the result. Optional. The default is an unspecified, stable order.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {string=} params.privateExtendedProperty Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all given constraints.
    * @param {string=} params.q Free text search terms to find events that match these terms in any field, except for extended properties. Optional.
    * @param {string=} params.sharedExtendedProperty Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all given constraints.
    * @param {boolean=} params.showDeleted Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
    * @param {boolean=} params.showHiddenInvitations Whether to include hidden invitations in the result. Optional. The default is False.
    * @param {boolean=} params.singleEvents Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves. Optional. The default is False.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False. There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.  These are:  - iCalUID  - orderBy  - privateExtendedProperty  - q  - sharedExtendedProperty  - timeMin  - timeMax  - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {string=} params.timeMax Upper bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
    * @param {string=} params.timeMin Lower bound (inclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
    * @param {string=} params.timeZone Time zone used in the response. Optional. The default is the time zone of the calendar.
    * @param {string=} params.updatedMin Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of showDeleted. Optional. The default is not to filter by last modification time.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaEvents] = js.native
  def list(callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def list(params: ParamsResourceEventsList): GaxiosPromise[SchemaEvents] = js.native
  def list(params: ParamsResourceEventsList, callback: BodyResponseCallback[SchemaEvents]): Unit = js.native
  def list(
    params: ParamsResourceEventsList,
    options: BodyResponseCallback[SchemaEvents],
    callback: BodyResponseCallback[SchemaEvents]
  ): Unit = js.native
  def list(params: ParamsResourceEventsList, options: MethodOptions): GaxiosPromise[SchemaEvents] = js.native
  def list(
    params: ParamsResourceEventsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvents]
  ): Unit = js.native
  
  /**
    * calendar.events.move
    * @desc Moves an event to another calendar, i.e. changes an event's
    * organizer.
    * @alias calendar.events.move
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier of the source calendar where the event currently is on.
    * @param {string} params.destination Calendar identifier of the target calendar where the event is to be moved to.
    * @param {string} params.eventId Event identifier.
    * @param {boolean=} params.sendNotifications Deprecated. Please use sendUpdates instead.  Whether to send notifications about the change of the event's organizer. Note that some emails might still be sent even if you set the value to false. The default is false.
    * @param {string=} params.sendUpdates Guests who should receive notifications about the change of the event's organizer.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def move(): GaxiosPromise[SchemaEvent] = js.native
  def move(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def move(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def move(params: ParamsResourceEventsMove): GaxiosPromise[SchemaEvent] = js.native
  def move(params: ParamsResourceEventsMove, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def move(
    params: ParamsResourceEventsMove,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def move(params: ParamsResourceEventsMove, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def move(
    params: ParamsResourceEventsMove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.patch
    * @desc Updates an event. This method supports patch semantics.
    * @alias calendar.events.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.alwaysIncludeEmail Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated, non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an email address value in the mentioned places. Optional. The default is False.
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {integer=} params.conferenceDataVersion Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    * @param {string} params.eventId Event identifier.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {boolean=} params.sendNotifications Deprecated. Please use sendUpdates instead.  Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you set the value to false. The default is false.
    * @param {string=} params.sendUpdates Guests who should receive notifications about the event update (for example, title changes, etc.).
    * @param {boolean=} params.supportsAttachments Whether API client performing operation supports event attachments. Optional. The default is False.
    * @param {().Event} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaEvent] = js.native
  def patch(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def patch(params: ParamsResourceEventsPatch): GaxiosPromise[SchemaEvent] = js.native
  def patch(params: ParamsResourceEventsPatch, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def patch(
    params: ParamsResourceEventsPatch,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def patch(params: ParamsResourceEventsPatch, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def patch(
    params: ParamsResourceEventsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.quickAdd
    * @desc Creates an event based on a simple text string.
    * @alias calendar.events.quickAdd
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {boolean=} params.sendNotifications Deprecated. Please use sendUpdates instead.  Whether to send notifications about the creation of the event. Note that some emails might still be sent even if you set the value to false. The default is false.
    * @param {string=} params.sendUpdates Guests who should receive notifications about the creation of the new event.
    * @param {string} params.text The text describing the event to be created.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def quickAdd(): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def quickAdd(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(params: ParamsResourceEventsQuickadd): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(params: ParamsResourceEventsQuickadd, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def quickAdd(
    params: ParamsResourceEventsQuickadd,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def quickAdd(params: ParamsResourceEventsQuickadd, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def quickAdd(
    params: ParamsResourceEventsQuickadd,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.update
    * @desc Updates an event.
    * @alias calendar.events.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.alwaysIncludeEmail Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated, non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an email address value in the mentioned places. Optional. The default is False.
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {integer=} params.conferenceDataVersion Version number of conference data supported by the API client. Version 0 assumes no conference data support and ignores conference data in the event's body. Version 1 enables support for copying of ConferenceData as well as for creating new conferences using the createRequest field of conferenceData. The default is 0.
    * @param {string} params.eventId Event identifier.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {boolean=} params.sendNotifications Deprecated. Please use sendUpdates instead.  Whether to send notifications about the event update (for example, description changes, etc.). Note that some emails might still be sent even if you set the value to false. The default is false.
    * @param {string=} params.sendUpdates Guests who should receive notifications about the event update (for example, title changes, etc.).
    * @param {boolean=} params.supportsAttachments Whether API client performing operation supports event attachments. Optional. The default is False.
    * @param {().Event} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaEvent] = js.native
  def update(callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def update(params: ParamsResourceEventsUpdate): GaxiosPromise[SchemaEvent] = js.native
  def update(params: ParamsResourceEventsUpdate, callback: BodyResponseCallback[SchemaEvent]): Unit = js.native
  def update(
    params: ParamsResourceEventsUpdate,
    options: BodyResponseCallback[SchemaEvent],
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  def update(params: ParamsResourceEventsUpdate, options: MethodOptions): GaxiosPromise[SchemaEvent] = js.native
  def update(
    params: ParamsResourceEventsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEvent]
  ): Unit = js.native
  
  /**
    * calendar.events.watch
    * @desc Watch for changes to Events resources.
    * @alias calendar.events.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.alwaysIncludeEmail Whether to always include a value in the email field for the organizer, creator and attendees, even if no real email is available (i.e. a generated, non-working value will be provided). The use of this option is discouraged and should only be used by clients which cannot handle the absence of an email address value in the mentioned places. Optional. The default is False.
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {string=} params.iCalUID Specifies event ID in the iCalendar format to be included in the response. Optional.
    * @param {integer=} params.maxAttendees The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional.
    * @param {integer=} params.maxResults Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger than 2500 events. Optional.
    * @param {string=} params.orderBy The order of the events returned in the result. Optional. The default is an unspecified, stable order.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {string=} params.privateExtendedProperty Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all given constraints.
    * @param {string=} params.q Free text search terms to find events that match these terms in any field, except for extended properties. Optional.
    * @param {string=} params.sharedExtendedProperty Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all given constraints.
    * @param {boolean=} params.showDeleted Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring events) are returned. Optional. The default is False.
    * @param {boolean=} params.showHiddenInvitations Whether to include hidden invitations in the result. Optional. The default is False.
    * @param {boolean=} params.singleEvents Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves. Optional. The default is False.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False. There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.  These are:  - iCalUID  - orderBy  - privateExtendedProperty  - q  - sharedExtendedProperty  - timeMin  - timeMax  - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {string=} params.timeMax Upper bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
    * @param {string=} params.timeMin Lower bound (inclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
    * @param {string=} params.timeZone Time zone used in the response. Optional. The default is the time zone of the calendar.
    * @param {string=} params.updatedMin Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of showDeleted. Optional. The default is not to filter by last modification time.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceEventsWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceEventsWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceEventsWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceEventsWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceEventsWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
