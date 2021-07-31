package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Calendarlist")
@js.native
class ResourceCalendarlist protected () extends StObject {
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
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarlistDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarlistDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCalendarlistDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCalendarlistDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCalendarlistDelete,
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
  def get(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(params: ParamsResourceCalendarlistGet): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(params: ParamsResourceCalendarlistGet, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def get(
    params: ParamsResourceCalendarlistGet,
    options: BodyResponseCallback[SchemaCalendarListEntry],
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  def get(params: ParamsResourceCalendarlistGet, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def get(
    params: ParamsResourceCalendarlistGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
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
  def insert(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(params: ParamsResourceCalendarlistInsert): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(params: ParamsResourceCalendarlistInsert, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def insert(
    params: ParamsResourceCalendarlistInsert,
    options: BodyResponseCallback[SchemaCalendarListEntry],
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  def insert(params: ParamsResourceCalendarlistInsert, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def insert(
    params: ParamsResourceCalendarlistInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
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
  def list(): GaxiosPromise[SchemaCalendarList] = js.native
  def list(callback: BodyResponseCallback[SchemaCalendarList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarList] = js.native
  def list(params: ParamsResourceCalendarlistList): GaxiosPromise[SchemaCalendarList] = js.native
  def list(params: ParamsResourceCalendarlistList, callback: BodyResponseCallback[SchemaCalendarList]): Unit = js.native
  def list(
    params: ParamsResourceCalendarlistList,
    options: BodyResponseCallback[SchemaCalendarList],
    callback: BodyResponseCallback[SchemaCalendarList]
  ): Unit = js.native
  def list(params: ParamsResourceCalendarlistList, options: MethodOptions): GaxiosPromise[SchemaCalendarList] = js.native
  def list(
    params: ParamsResourceCalendarlistList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarList]
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
  def patch(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(params: ParamsResourceCalendarlistPatch): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(params: ParamsResourceCalendarlistPatch, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def patch(
    params: ParamsResourceCalendarlistPatch,
    options: BodyResponseCallback[SchemaCalendarListEntry],
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  def patch(params: ParamsResourceCalendarlistPatch, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def patch(
    params: ParamsResourceCalendarlistPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
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
  def update(): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(params: ParamsResourceCalendarlistUpdate): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(params: ParamsResourceCalendarlistUpdate, callback: BodyResponseCallback[SchemaCalendarListEntry]): Unit = js.native
  def update(
    params: ParamsResourceCalendarlistUpdate,
    options: BodyResponseCallback[SchemaCalendarListEntry],
    callback: BodyResponseCallback[SchemaCalendarListEntry]
  ): Unit = js.native
  def update(params: ParamsResourceCalendarlistUpdate, options: MethodOptions): GaxiosPromise[SchemaCalendarListEntry] = js.native
  def update(
    params: ParamsResourceCalendarlistUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendarListEntry]
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
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceCalendarlistWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceCalendarlistWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceCalendarlistWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceCalendarlistWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceCalendarlistWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}
