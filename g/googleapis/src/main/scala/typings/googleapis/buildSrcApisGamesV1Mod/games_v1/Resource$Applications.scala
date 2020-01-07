package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Applications")
@js.native
class Resource$Applications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.applications.get
    * @desc Retrieves the metadata of the application with the given ID. If the
    * requested application is not available for the specified platformType,
    * the returned response will not include any instance data.
    * @alias games.applications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string=} params.platformType Restrict application details returned to the specific platform.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Application] = js.native
  def get(callback: BodyResponseCallback[Schema$Application]): Unit = js.native
  def get(params: ParamsDollarResourceDollarApplicationsDollarGet): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarApplicationsDollarGet,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarApplicationsDollarGet,
    options: BodyResponseCallback[Schema$Application],
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarApplicationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Application] = js.native
  def get(
    params: ParamsDollarResourceDollarApplicationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Application]
  ): Unit = js.native
  /**
    * games.applications.played
    * @desc Indicate that the the currently authenticated user is playing your
    * application.
    * @alias games.applications.played
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.builtinGameId Override used only by built-in games in Play Games application.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def played(): GaxiosPromise[Unit] = js.native
  def played(callback: BodyResponseCallback[Unit]): Unit = js.native
  def played(params: ParamsDollarResourceDollarApplicationsDollarPlayed): GaxiosPromise[Unit] = js.native
  def played(params: ParamsDollarResourceDollarApplicationsDollarPlayed, callback: BodyResponseCallback[Unit]): Unit = js.native
  def played(
    params: ParamsDollarResourceDollarApplicationsDollarPlayed,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def played(params: ParamsDollarResourceDollarApplicationsDollarPlayed, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def played(
    params: ParamsDollarResourceDollarApplicationsDollarPlayed,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * games.applications.verify
    * @desc Verifies the auth token provided with this request is for the
    * application with the specified ID, and returns the ID of the player it
    * was granted for.
    * @alias games.applications.verify
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def verify(): GaxiosPromise[Schema$ApplicationVerifyResponse] = js.native
  def verify(callback: BodyResponseCallback[Schema$ApplicationVerifyResponse]): Unit = js.native
  def verify(params: ParamsDollarResourceDollarApplicationsDollarVerify): GaxiosPromise[Schema$ApplicationVerifyResponse] = js.native
  def verify(
    params: ParamsDollarResourceDollarApplicationsDollarVerify,
    callback: BodyResponseCallback[Schema$ApplicationVerifyResponse]
  ): Unit = js.native
  def verify(
    params: ParamsDollarResourceDollarApplicationsDollarVerify,
    options: BodyResponseCallback[Schema$ApplicationVerifyResponse],
    callback: BodyResponseCallback[Schema$ApplicationVerifyResponse]
  ): Unit = js.native
  def verify(params: ParamsDollarResourceDollarApplicationsDollarVerify, options: MethodOptions): GaxiosPromise[Schema$ApplicationVerifyResponse] = js.native
  def verify(
    params: ParamsDollarResourceDollarApplicationsDollarVerify,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ApplicationVerifyResponse]
  ): Unit = js.native
}

