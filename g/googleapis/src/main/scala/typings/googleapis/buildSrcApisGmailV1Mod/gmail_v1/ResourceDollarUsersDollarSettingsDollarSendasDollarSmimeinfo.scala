package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Sendas$Smimeinfo")
@js.native
class ResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.settings.sendAs.smimeInfo.delete
    * @desc Deletes the specified S/MIME config for the specified send-as
    * alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The immutable ID for the SmimeInfo.
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.smimeInfo.get
    * @desc Gets the specified S/MIME config for the specified send-as alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The immutable ID for the SmimeInfo.
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$SmimeInfo] = js.native
  def get(callback: BodyResponseCallback[Schema$SmimeInfo]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarGet): GaxiosPromise[Schema$SmimeInfo] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarGet,
    callback: BodyResponseCallback[Schema$SmimeInfo]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarGet,
    options: BodyResponseCallback[Schema$SmimeInfo],
    callback: BodyResponseCallback[Schema$SmimeInfo]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$SmimeInfo] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SmimeInfo]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.smimeInfo.insert
    * @desc Insert (upload) the given S/MIME config for the specified send-as
    * alias. Note that pkcs12 format is required for the key.
    * @alias gmail.users.settings.sendAs.smimeInfo.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {().SmimeInfo} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$SmimeInfo] = js.native
  def insert(callback: BodyResponseCallback[Schema$SmimeInfo]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarInsert): GaxiosPromise[Schema$SmimeInfo] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarInsert,
    callback: BodyResponseCallback[Schema$SmimeInfo]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarInsert,
    options: BodyResponseCallback[Schema$SmimeInfo],
    callback: BodyResponseCallback[Schema$SmimeInfo]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$SmimeInfo] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SmimeInfo]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.smimeInfo.list
    * @desc Lists S/MIME configs for the specified send-as alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListSmimeInfoResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListSmimeInfoResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarList): GaxiosPromise[Schema$ListSmimeInfoResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarList,
    callback: BodyResponseCallback[Schema$ListSmimeInfoResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarList,
    options: BodyResponseCallback[Schema$ListSmimeInfoResponse],
    callback: BodyResponseCallback[Schema$ListSmimeInfoResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListSmimeInfoResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListSmimeInfoResponse]
  ): Unit = js.native
  /**
    * gmail.users.settings.sendAs.smimeInfo.setDefault
    * @desc Sets the default S/MIME config for the specified send-as alias.
    * @alias gmail.users.settings.sendAs.smimeInfo.setDefault
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The immutable ID for the SmimeInfo.
    * @param {string} params.sendAsEmail The email address that appears in the "From:" header for mail sent using this alias.
    * @param {string} params.userId The user's email address. The special value me can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDefault(): GaxiosPromise[Unit] = js.native
  def setDefault(callback: BodyResponseCallback[Unit]): Unit = js.native
  def setDefault(params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarSetdefault): GaxiosPromise[Unit] = js.native
  def setDefault(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarSetdefault,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setDefault(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarSetdefault,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def setDefault(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarSetdefault,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def setDefault(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarSendasDollarSmimeinfoDollarSetdefault,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

