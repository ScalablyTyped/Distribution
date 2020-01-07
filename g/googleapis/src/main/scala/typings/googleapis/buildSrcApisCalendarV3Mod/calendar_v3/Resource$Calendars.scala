package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Calendars")
@js.native
class Resource$Calendars protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
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
  def clear(params: ParamsDollarResourceDollarCalendarsDollarClear): GaxiosPromise[Unit] = js.native
  def clear(params: ParamsDollarResourceDollarCalendarsDollarClear, callback: BodyResponseCallback[Unit]): Unit = js.native
  def clear(
    params: ParamsDollarResourceDollarCalendarsDollarClear,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def clear(params: ParamsDollarResourceDollarCalendarsDollarClear, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def clear(
    params: ParamsDollarResourceDollarCalendarsDollarClear,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
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
  def delete(params: ParamsDollarResourceDollarCalendarsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarCalendarsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCalendarsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCalendarsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarCalendarsDollarDelete,
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
  def get(): GaxiosPromise[Schema$Calendar] = js.native
  def get(callback: BodyResponseCallback[Schema$Calendar]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCalendarsDollarGet): GaxiosPromise[Schema$Calendar] = js.native
  def get(
    params: ParamsDollarResourceDollarCalendarsDollarGet,
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCalendarsDollarGet,
    options: BodyResponseCallback[Schema$Calendar],
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCalendarsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Calendar] = js.native
  def get(
    params: ParamsDollarResourceDollarCalendarsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Calendar]
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
  def insert(): GaxiosPromise[Schema$Calendar] = js.native
  def insert(callback: BodyResponseCallback[Schema$Calendar]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCalendarsDollarInsert): GaxiosPromise[Schema$Calendar] = js.native
  def insert(
    params: ParamsDollarResourceDollarCalendarsDollarInsert,
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCalendarsDollarInsert,
    options: BodyResponseCallback[Schema$Calendar],
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCalendarsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Calendar] = js.native
  def insert(
    params: ParamsDollarResourceDollarCalendarsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Calendar]
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
  def patch(): GaxiosPromise[Schema$Calendar] = js.native
  def patch(callback: BodyResponseCallback[Schema$Calendar]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCalendarsDollarPatch): GaxiosPromise[Schema$Calendar] = js.native
  def patch(
    params: ParamsDollarResourceDollarCalendarsDollarPatch,
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCalendarsDollarPatch,
    options: BodyResponseCallback[Schema$Calendar],
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCalendarsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Calendar] = js.native
  def patch(
    params: ParamsDollarResourceDollarCalendarsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Calendar]
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
  def update(): GaxiosPromise[Schema$Calendar] = js.native
  def update(callback: BodyResponseCallback[Schema$Calendar]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCalendarsDollarUpdate): GaxiosPromise[Schema$Calendar] = js.native
  def update(
    params: ParamsDollarResourceDollarCalendarsDollarUpdate,
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCalendarsDollarUpdate,
    options: BodyResponseCallback[Schema$Calendar],
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCalendarsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Calendar] = js.native
  def update(
    params: ParamsDollarResourceDollarCalendarsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Calendar]
  ): Unit = js.native
}

