package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Settings")
@js.native
class Resource$Settings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * calendar.settings.get
    * @desc Returns a single user setting.
    * @alias calendar.settings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.setting The id of the user setting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Setting] = js.native
  def get(callback: BodyResponseCallback[Schema$Setting]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarGet): GaxiosPromise[Schema$Setting] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarGet,
    callback: BodyResponseCallback[Schema$Setting]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarGet,
    options: BodyResponseCallback[Schema$Setting],
    callback: BodyResponseCallback[Schema$Setting]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Setting] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Setting]
  ): Unit = js.native
  /**
    * calendar.settings.list
    * @desc Returns all user settings for the authenticated user.
    * @alias calendar.settings.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Settings] = js.native
  def list(callback: BodyResponseCallback[Schema$Settings]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSettingsDollarList): GaxiosPromise[Schema$Settings] = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarList,
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarList,
    options: BodyResponseCallback[Schema$Settings],
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSettingsDollarList, options: MethodOptions): GaxiosPromise[Schema$Settings] = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Settings]
  ): Unit = js.native
  /**
    * calendar.settings.watch
    * @desc Watch for changes to Settings resources.
    * @alias calendar.settings.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of entries returned on one result page. By default the value is 100 entries. The page size can never be larger than 250 entries. Optional.
    * @param {string=} params.pageToken Token specifying which result page to return. Optional.
    * @param {string=} params.syncToken Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries that have changed since then. If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without any syncToken. Learn more about incremental synchronization. Optional. The default is to return all entries.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarSettingsDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarSettingsDollarWatch,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarSettingsDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarSettingsDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarSettingsDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

