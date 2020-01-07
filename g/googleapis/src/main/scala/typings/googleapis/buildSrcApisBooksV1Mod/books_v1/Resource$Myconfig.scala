package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Myconfig")
@js.native
class Resource$Myconfig protected () extends js.Object {
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
  def getUserSettings(): GaxiosPromise[Schema$Usersettings] = js.native
  def getUserSettings(callback: BodyResponseCallback[Schema$Usersettings]): Unit = js.native
  def getUserSettings(params: ParamsDollarResourceDollarMyconfigDollarGetusersettings): GaxiosPromise[Schema$Usersettings] = js.native
  def getUserSettings(
    params: ParamsDollarResourceDollarMyconfigDollarGetusersettings,
    callback: BodyResponseCallback[Schema$Usersettings]
  ): Unit = js.native
  def getUserSettings(
    params: ParamsDollarResourceDollarMyconfigDollarGetusersettings,
    options: BodyResponseCallback[Schema$Usersettings],
    callback: BodyResponseCallback[Schema$Usersettings]
  ): Unit = js.native
  def getUserSettings(params: ParamsDollarResourceDollarMyconfigDollarGetusersettings, options: MethodOptions): GaxiosPromise[Schema$Usersettings] = js.native
  def getUserSettings(
    params: ParamsDollarResourceDollarMyconfigDollarGetusersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Usersettings]
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
  def releaseDownloadAccess(): GaxiosPromise[Schema$DownloadAccesses] = js.native
  def releaseDownloadAccess(callback: BodyResponseCallback[Schema$DownloadAccesses]): Unit = js.native
  def releaseDownloadAccess(params: ParamsDollarResourceDollarMyconfigDollarReleasedownloadaccess): GaxiosPromise[Schema$DownloadAccesses] = js.native
  def releaseDownloadAccess(
    params: ParamsDollarResourceDollarMyconfigDollarReleasedownloadaccess,
    callback: BodyResponseCallback[Schema$DownloadAccesses]
  ): Unit = js.native
  def releaseDownloadAccess(
    params: ParamsDollarResourceDollarMyconfigDollarReleasedownloadaccess,
    options: BodyResponseCallback[Schema$DownloadAccesses],
    callback: BodyResponseCallback[Schema$DownloadAccesses]
  ): Unit = js.native
  def releaseDownloadAccess(params: ParamsDollarResourceDollarMyconfigDollarReleasedownloadaccess, options: MethodOptions): GaxiosPromise[Schema$DownloadAccesses] = js.native
  def releaseDownloadAccess(
    params: ParamsDollarResourceDollarMyconfigDollarReleasedownloadaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DownloadAccesses]
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
  def requestAccess(): GaxiosPromise[Schema$RequestAccess] = js.native
  def requestAccess(callback: BodyResponseCallback[Schema$RequestAccess]): Unit = js.native
  def requestAccess(params: ParamsDollarResourceDollarMyconfigDollarRequestaccess): GaxiosPromise[Schema$RequestAccess] = js.native
  def requestAccess(
    params: ParamsDollarResourceDollarMyconfigDollarRequestaccess,
    callback: BodyResponseCallback[Schema$RequestAccess]
  ): Unit = js.native
  def requestAccess(
    params: ParamsDollarResourceDollarMyconfigDollarRequestaccess,
    options: BodyResponseCallback[Schema$RequestAccess],
    callback: BodyResponseCallback[Schema$RequestAccess]
  ): Unit = js.native
  def requestAccess(params: ParamsDollarResourceDollarMyconfigDollarRequestaccess, options: MethodOptions): GaxiosPromise[Schema$RequestAccess] = js.native
  def requestAccess(
    params: ParamsDollarResourceDollarMyconfigDollarRequestaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RequestAccess]
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
  def syncVolumeLicenses(): GaxiosPromise[Schema$Volumes] = js.native
  def syncVolumeLicenses(callback: BodyResponseCallback[Schema$Volumes]): Unit = js.native
  def syncVolumeLicenses(params: ParamsDollarResourceDollarMyconfigDollarSyncvolumelicenses): GaxiosPromise[Schema$Volumes] = js.native
  def syncVolumeLicenses(
    params: ParamsDollarResourceDollarMyconfigDollarSyncvolumelicenses,
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def syncVolumeLicenses(
    params: ParamsDollarResourceDollarMyconfigDollarSyncvolumelicenses,
    options: BodyResponseCallback[Schema$Volumes],
    callback: BodyResponseCallback[Schema$Volumes]
  ): Unit = js.native
  def syncVolumeLicenses(params: ParamsDollarResourceDollarMyconfigDollarSyncvolumelicenses, options: MethodOptions): GaxiosPromise[Schema$Volumes] = js.native
  def syncVolumeLicenses(
    params: ParamsDollarResourceDollarMyconfigDollarSyncvolumelicenses,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Volumes]
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
  def updateUserSettings(): GaxiosPromise[Schema$Usersettings] = js.native
  def updateUserSettings(callback: BodyResponseCallback[Schema$Usersettings]): Unit = js.native
  def updateUserSettings(params: ParamsDollarResourceDollarMyconfigDollarUpdateusersettings): GaxiosPromise[Schema$Usersettings] = js.native
  def updateUserSettings(
    params: ParamsDollarResourceDollarMyconfigDollarUpdateusersettings,
    callback: BodyResponseCallback[Schema$Usersettings]
  ): Unit = js.native
  def updateUserSettings(
    params: ParamsDollarResourceDollarMyconfigDollarUpdateusersettings,
    options: BodyResponseCallback[Schema$Usersettings],
    callback: BodyResponseCallback[Schema$Usersettings]
  ): Unit = js.native
  def updateUserSettings(params: ParamsDollarResourceDollarMyconfigDollarUpdateusersettings, options: MethodOptions): GaxiosPromise[Schema$Usersettings] = js.native
  def updateUserSettings(
    params: ParamsDollarResourceDollarMyconfigDollarUpdateusersettings,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Usersettings]
  ): Unit = js.native
}

