package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Settings")
@js.native
class ResourceSettings protected () extends js.Object {
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
  def get(): GaxiosPromise[SchemaSetting] = js.native
  def get(callback: BodyResponseCallback[SchemaSetting]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSetting] = js.native
  def get(params: ParamsResourceSettingsGet): GaxiosPromise[SchemaSetting] = js.native
  def get(params: ParamsResourceSettingsGet, callback: BodyResponseCallback[SchemaSetting]): Unit = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: BodyResponseCallback[SchemaSetting],
    callback: BodyResponseCallback[SchemaSetting]
  ): Unit = js.native
  def get(params: ParamsResourceSettingsGet, options: MethodOptions): GaxiosPromise[SchemaSetting] = js.native
  def get(
    params: ParamsResourceSettingsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSetting]
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
  def list(): GaxiosPromise[SchemaSettings] = js.native
  def list(callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def list(params: ParamsResourceSettingsList): GaxiosPromise[SchemaSettings] = js.native
  def list(params: ParamsResourceSettingsList, callback: BodyResponseCallback[SchemaSettings]): Unit = js.native
  def list(
    params: ParamsResourceSettingsList,
    options: BodyResponseCallback[SchemaSettings],
    callback: BodyResponseCallback[SchemaSettings]
  ): Unit = js.native
  def list(params: ParamsResourceSettingsList, options: MethodOptions): GaxiosPromise[SchemaSettings] = js.native
  def list(
    params: ParamsResourceSettingsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSettings]
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
  def watch(): GaxiosPromise[SchemaChannel] = js.native
  def watch(callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceSettingsWatch): GaxiosPromise[SchemaChannel] = js.native
  def watch(params: ParamsResourceSettingsWatch, callback: BodyResponseCallback[SchemaChannel]): Unit = js.native
  def watch(
    params: ParamsResourceSettingsWatch,
    options: BodyResponseCallback[SchemaChannel],
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
  def watch(params: ParamsResourceSettingsWatch, options: MethodOptions): GaxiosPromise[SchemaChannel] = js.native
  def watch(
    params: ParamsResourceSettingsWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaChannel]
  ): Unit = js.native
}

