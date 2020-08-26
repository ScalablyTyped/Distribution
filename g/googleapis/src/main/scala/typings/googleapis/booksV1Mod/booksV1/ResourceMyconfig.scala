package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Myconfig")
@js.native
class ResourceMyconfig protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.myconfig.getUserSettings
    * @desc Gets the current settings for the user.
    * @alias books.myconfig.getUserSettings
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getUserSettings(): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(callback: BodyResponseCallback[SchemaUsersettings]): Unit = js.native
  def getUserSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings, callback: BodyResponseCallback[SchemaUsersettings]): Unit = js.native
  def getUserSettings(
    params: ParamsResourceMyconfigGetusersettings,
    options: BodyResponseCallback[SchemaUsersettings],
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  def getUserSettings(params: ParamsResourceMyconfigGetusersettings, options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def getUserSettings(
    params: ParamsResourceMyconfigGetusersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  /**
    * books.myconfig.releaseDownloadAccess
    * @desc Release downloaded content access restriction.
    * @alias books.myconfig.releaseDownloadAccess
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.cpksver The device/version ID from which to release the restriction.
    * @param {string=} params.locale ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {string} params.volumeIds The volume(s) to release restrictions for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def releaseDownloadAccess(): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(callback: BodyResponseCallback[SchemaDownloadAccesses]): Unit = js.native
  def releaseDownloadAccess(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(params: ParamsResourceMyconfigReleasedownloadaccess): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    callback: BodyResponseCallback[SchemaDownloadAccesses]
  ): Unit = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    options: BodyResponseCallback[SchemaDownloadAccesses],
    callback: BodyResponseCallback[SchemaDownloadAccesses]
  ): Unit = js.native
  def releaseDownloadAccess(params: ParamsResourceMyconfigReleasedownloadaccess, options: MethodOptions): GaxiosPromise[SchemaDownloadAccesses] = js.native
  def releaseDownloadAccess(
    params: ParamsResourceMyconfigReleasedownloadaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDownloadAccesses]
  ): Unit = js.native
  /**
    * books.myconfig.requestAccess
    * @desc Request concurrent and download access restrictions.
    * @alias books.myconfig.requestAccess
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.cpksver The device/version ID from which to request the restrictions.
    * @param {string=} params.licenseTypes The type of access license to request. If not specified, the default is BOTH.
    * @param {string=} params.locale ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    * @param {string} params.nonce The client nonce value.
    * @param {string} params.source String to identify the originator of this request.
    * @param {string} params.volumeId The volume to request concurrent/download restrictions for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def requestAccess(): GaxiosPromise[SchemaRequestAccess] = js.native
  def requestAccess(callback: BodyResponseCallback[SchemaRequestAccess]): Unit = js.native
  def requestAccess(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRequestAccess] = js.native
  def requestAccess(params: ParamsResourceMyconfigRequestaccess): GaxiosPromise[SchemaRequestAccess] = js.native
  def requestAccess(params: ParamsResourceMyconfigRequestaccess, callback: BodyResponseCallback[SchemaRequestAccess]): Unit = js.native
  def requestAccess(
    params: ParamsResourceMyconfigRequestaccess,
    options: BodyResponseCallback[SchemaRequestAccess],
    callback: BodyResponseCallback[SchemaRequestAccess]
  ): Unit = js.native
  def requestAccess(params: ParamsResourceMyconfigRequestaccess, options: MethodOptions): GaxiosPromise[SchemaRequestAccess] = js.native
  def requestAccess(
    params: ParamsResourceMyconfigRequestaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRequestAccess]
  ): Unit = js.native
  /**
    * books.myconfig.syncVolumeLicenses
    * @desc Request downloaded content access for specified volumes on the My
    * eBooks shelf.
    * @alias books.myconfig.syncVolumeLicenses
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.cpksver The device/version ID from which to release the restriction.
    * @param {string=} params.features List of features supported by the client, i.e., 'RENTALS'
    * @param {boolean=} params.includeNonComicsSeries Set to true to include non-comics series. Defaults to false.
    * @param {string=} params.locale ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    * @param {string} params.nonce The client nonce value.
    * @param {boolean=} params.showPreorders Set to true to show pre-ordered books. Defaults to false.
    * @param {string} params.source String to identify the originator of this request.
    * @param {string=} params.volumeIds The volume(s) to request download restrictions for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def syncVolumeLicenses(): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def syncVolumeLicenses(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def syncVolumeLicenses(
    params: ParamsResourceMyconfigSyncvolumelicenses,
    options: BodyResponseCallback[SchemaVolumes],
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def syncVolumeLicenses(params: ParamsResourceMyconfigSyncvolumelicenses, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def syncVolumeLicenses(
    params: ParamsResourceMyconfigSyncvolumelicenses,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  /**
    * books.myconfig.updateUserSettings
    * @desc Sets the settings for the user. If a sub-object is specified, it
    * will overwrite the existing sub-object stored in the server. Unspecified
    * sub-objects will retain the existing value.
    * @alias books.myconfig.updateUserSettings
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Usersettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateUserSettings(): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(callback: BodyResponseCallback[SchemaUsersettings]): Unit = js.native
  def updateUserSettings(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(params: ParamsResourceMyconfigUpdateusersettings): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    options: BodyResponseCallback[SchemaUsersettings],
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
  def updateUserSettings(params: ParamsResourceMyconfigUpdateusersettings, options: MethodOptions): GaxiosPromise[SchemaUsersettings] = js.native
  def updateUserSettings(
    params: ParamsResourceMyconfigUpdateusersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersettings]
  ): Unit = js.native
}

