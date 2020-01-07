package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Calendarlist")
@js.native
class Resource$Calendarlist protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * calendar.calendarList.delete
    * @desc Removes a calendar from the user's calendar list.
    * @alias calendar.calendarList.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCalendarlistDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarCalendarlistDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCalendarlistDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCalendarlistDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarCalendarlistDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * calendar.calendarList.get
    * @desc Returns a calendar from the user's calendar list.
    * @alias calendar.calendarList.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def get(callback: BodyResponseCallback[Schema$CalendarListEntry]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCalendarlistDollarGet): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def get(
    params: ParamsDollarResourceDollarCalendarlistDollarGet,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCalendarlistDollarGet,
    options: BodyResponseCallback[Schema$CalendarListEntry],
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCalendarlistDollarGet, options: MethodOptions): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def get(
    params: ParamsDollarResourceDollarCalendarlistDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  /**
    * calendar.calendarList.insert
    * @desc Inserts an existing calendar into the user's calendar list.
    * @alias calendar.calendarList.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.colorRgbFormat Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    * @param {().CalendarListEntry} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def insert(callback: BodyResponseCallback[Schema$CalendarListEntry]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCalendarlistDollarInsert): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def insert(
    params: ParamsDollarResourceDollarCalendarlistDollarInsert,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCalendarlistDollarInsert,
    options: BodyResponseCallback[Schema$CalendarListEntry],
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCalendarlistDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def insert(
    params: ParamsDollarResourceDollarCalendarlistDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  /**
    * calendar.calendarList.list
    * @desc Returns the calendars on the user's calendar list.
    * @alias calendar.calendarList.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    * @param {string=} params.minAccessRole The minimum access role for the user in the returned entries. Optional. The default is no restriction.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {boolean=} params.showDeleted Whether to include deleted calendar list entries in the result. Optional. The default is False.
    * @param {boolean=} params.showHidden Whether to show hidden entries. Optional. The default is False.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False. To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CalendarList] = js.native
  def list(callback: BodyResponseCallback[Schema$CalendarList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCalendarlistDollarList): GaxiosPromise[Schema$CalendarList] = js.native
  def list(
    params: ParamsDollarResourceDollarCalendarlistDollarList,
    callback: BodyResponseCallback[Schema$CalendarList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCalendarlistDollarList,
    options: BodyResponseCallback[Schema$CalendarList],
    callback: BodyResponseCallback[Schema$CalendarList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCalendarlistDollarList, options: MethodOptions): GaxiosPromise[Schema$CalendarList] = js.native
  def list(
    params: ParamsDollarResourceDollarCalendarlistDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarList]
  ): Unit = js.native
  /**
    * calendar.calendarList.patch
    * @desc Updates an existing calendar on the user's calendar list. This
    * method supports patch semantics.
    * @alias calendar.calendarList.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {boolean=} params.colorRgbFormat Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    * @param {().CalendarListEntry} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def patch(callback: BodyResponseCallback[Schema$CalendarListEntry]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCalendarlistDollarPatch): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def patch(
    params: ParamsDollarResourceDollarCalendarlistDollarPatch,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCalendarlistDollarPatch,
    options: BodyResponseCallback[Schema$CalendarListEntry],
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCalendarlistDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def patch(
    params: ParamsDollarResourceDollarCalendarlistDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  /**
    * calendar.calendarList.update
    * @desc Updates an existing calendar on the user's calendar list.
    * @alias calendar.calendarList.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {boolean=} params.colorRgbFormat Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    * @param {().CalendarListEntry} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def update(callback: BodyResponseCallback[Schema$CalendarListEntry]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCalendarlistDollarUpdate): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def update(
    params: ParamsDollarResourceDollarCalendarlistDollarUpdate,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCalendarlistDollarUpdate,
    options: BodyResponseCallback[Schema$CalendarListEntry],
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCalendarlistDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CalendarListEntry] = js.native
  def update(
    params: ParamsDollarResourceDollarCalendarlistDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CalendarListEntry]
  ): Unit = js.native
  /**
    * calendar.calendarList.watch
    * @desc Watch for changes to CalendarList resources.
    * @alias calendar.calendarList.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    * @param {string=} params.minAccessRole The minimum access role for the user in the returned entries. Optional. The default is no restriction.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {boolean=} params.showDeleted Whether to include deleted calendar list entries in the result. Optional. The default is False.
    * @param {boolean=} params.showHidden Whether to show hidden entries. Optional. The default is False.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If only read-only fields such as calendar properties or ACLs have changed, the entry won't be returned. All entries deleted and hidden since the previous list request will always be in the result set and it is not allowed to set showDeleted neither showHidden to False. To ensure client state consistency minAccessRole query parameter cannot be specified together with nextSyncToken. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarCalendarlistDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarCalendarlistDollarWatch,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarCalendarlistDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarCalendarlistDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarCalendarlistDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

