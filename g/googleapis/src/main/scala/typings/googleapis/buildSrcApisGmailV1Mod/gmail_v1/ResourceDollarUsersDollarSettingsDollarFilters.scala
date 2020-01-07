package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Filters")
@js.native
class ResourceDollarUsersDollarSettingsDollarFilters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.settings.filters.create
    * @desc Creates a filter.
    * @alias gmail.users.settings.filters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Filter] = js.native
  def create(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarCreate): GaxiosPromise[Schema$Filter] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarCreate,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarCreate,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Filter] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  /**
    * gmail.users.settings.filters.delete
    * @desc Deletes a filter.
    * @alias gmail.users.settings.filters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the filter to be deleted.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.settings.filters.get
    * @desc Gets a filter.
    * @alias gmail.users.settings.filters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the filter to be fetched.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Filter] = js.native
  def get(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarGet): GaxiosPromise[Schema$Filter] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarGet,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarGet,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Filter] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  /**
    * gmail.users.settings.filters.list
    * @desc Lists the message filters of a Gmail user.
    * @alias gmail.users.settings.filters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListFiltersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListFiltersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarList): GaxiosPromise[Schema$ListFiltersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarList,
    callback: BodyResponseCallback[Schema$ListFiltersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarList,
    options: BodyResponseCallback[Schema$ListFiltersResponse],
    callback: BodyResponseCallback[Schema$ListFiltersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListFiltersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarFiltersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListFiltersResponse]
  ): Unit = js.native
}

