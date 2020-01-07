package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Tokens")
@js.native
class Resource$Tokens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.tokens.delete
    * @desc Delete all access tokens issued by a user for an application.
    * @alias directory.tokens.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clientId The Client ID of the application the token is issued to.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTokensDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTokensDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTokensDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTokensDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTokensDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.tokens.get
    * @desc Get information about an access token issued by a user.
    * @alias directory.tokens.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.clientId The Client ID of the application the token is issued to.
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Token] = js.native
  def get(callback: BodyResponseCallback[Schema$Token]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTokensDollarGet): GaxiosPromise[Schema$Token] = js.native
  def get(params: ParamsDollarResourceDollarTokensDollarGet, callback: BodyResponseCallback[Schema$Token]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTokensDollarGet,
    options: BodyResponseCallback[Schema$Token],
    callback: BodyResponseCallback[Schema$Token]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTokensDollarGet, options: MethodOptions): GaxiosPromise[Schema$Token] = js.native
  def get(
    params: ParamsDollarResourceDollarTokensDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Token]
  ): Unit = js.native
  /**
    * directory.tokens.list
    * @desc Returns the set of tokens specified user has issued to 3rd party
    * applications.
    * @alias directory.tokens.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userKey Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Tokens] = js.native
  def list(callback: BodyResponseCallback[Schema$Tokens]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTokensDollarList): GaxiosPromise[Schema$Tokens] = js.native
  def list(params: ParamsDollarResourceDollarTokensDollarList, callback: BodyResponseCallback[Schema$Tokens]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTokensDollarList,
    options: BodyResponseCallback[Schema$Tokens],
    callback: BodyResponseCallback[Schema$Tokens]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTokensDollarList, options: MethodOptions): GaxiosPromise[Schema$Tokens] = js.native
  def list(
    params: ParamsDollarResourceDollarTokensDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Tokens]
  ): Unit = js.native
}

