package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Calendars")
@js.native
class ResourceCalendars protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * calendar.calendars.clear
    * @desc Clears a primary calendar. This operation deletes all events
    * associated with the primary calendar of an account.
    * @alias calendar.calendars.clear
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def clear(): GaxiosPromise[Unit] = js.native
  def clear(callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceCalendarsClear): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceCalendarsClear, callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(
    params: ParamsResourceCalendarsClear,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def clear(params: ParamsResourceCalendarsClear, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsResourceCalendarsClear, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * calendar.calendars.delete
    * @desc Deletes a secondary calendar. Use calendars.clear for clearing all
    * events on primary calendars.
    * @alias calendar.calendars.delete
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
  def delete(params: ParamsResourceCalendarsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCalendarsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCalendarsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCalendarsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceCalendarsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  
  /**
    * calendar.calendars.get
    * @desc Returns metadata for a calendar.
    * @alias calendar.calendars.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaCalendar] = js.native
  def get(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def get(params: ParamsResourceCalendarsGet): GaxiosPromise[SchemaCalendar] = js.native
  def get(params: ParamsResourceCalendarsGet, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def get(
    params: ParamsResourceCalendarsGet,
    options: BodyResponseCallback[SchemaCalendar],
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  def get(params: ParamsResourceCalendarsGet, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def get(
    params: ParamsResourceCalendarsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  
  /**
    * calendar.calendars.insert
    * @desc Creates a secondary calendar.
    * @alias calendar.calendars.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Calendar} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaCalendar] = js.native
  def insert(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def insert(params: ParamsResourceCalendarsInsert): GaxiosPromise[SchemaCalendar] = js.native
  def insert(params: ParamsResourceCalendarsInsert, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def insert(
    params: ParamsResourceCalendarsInsert,
    options: BodyResponseCallback[SchemaCalendar],
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  def insert(params: ParamsResourceCalendarsInsert, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def insert(
    params: ParamsResourceCalendarsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  
  /**
    * calendar.calendars.patch
    * @desc Updates metadata for a calendar. This method supports patch
    * semantics.
    * @alias calendar.calendars.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {().Calendar} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaCalendar] = js.native
  def patch(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def patch(params: ParamsResourceCalendarsPatch): GaxiosPromise[SchemaCalendar] = js.native
  def patch(params: ParamsResourceCalendarsPatch, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def patch(
    params: ParamsResourceCalendarsPatch,
    options: BodyResponseCallback[SchemaCalendar],
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  def patch(params: ParamsResourceCalendarsPatch, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def patch(
    params: ParamsResourceCalendarsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  
  /**
    * calendar.calendars.update
    * @desc Updates metadata for a calendar.
    * @alias calendar.calendars.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.calendarId Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    * @param {().Calendar} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaCalendar] = js.native
  def update(callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def update(params: ParamsResourceCalendarsUpdate): GaxiosPromise[SchemaCalendar] = js.native
  def update(params: ParamsResourceCalendarsUpdate, callback: BodyResponseCallback[SchemaCalendar]): Unit = js.native
  def update(
    params: ParamsResourceCalendarsUpdate,
    options: BodyResponseCallback[SchemaCalendar],
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
  def update(params: ParamsResourceCalendarsUpdate, options: MethodOptions): GaxiosPromise[SchemaCalendar] = js.native
  def update(
    params: ParamsResourceCalendarsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCalendar]
  ): Unit = js.native
}
