package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Pushtokens")
@js.native
class Resource$Pushtokens protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.pushtokens.remove
    * @desc Removes a push token for the current user and application. Removing
    * a non-existent push token will report success.
    * @alias games.pushtokens.remove
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PushTokenId} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def remove(): GaxiosPromise[Unit] = js.native
  def remove(callback: BodyResponseCallback[Unit]): Unit = js.native
  def remove(params: ParamsDollarResourceDollarPushtokensDollarRemove): GaxiosPromise[Unit] = js.native
  def remove(params: ParamsDollarResourceDollarPushtokensDollarRemove, callback: BodyResponseCallback[Unit]): Unit = js.native
  def remove(
    params: ParamsDollarResourceDollarPushtokensDollarRemove,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def remove(params: ParamsDollarResourceDollarPushtokensDollarRemove, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def remove(
    params: ParamsDollarResourceDollarPushtokensDollarRemove,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * games.pushtokens.update
    * @desc Registers a push token for the current user and application.
    * @alias games.pushtokens.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().PushToken} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Unit] = js.native
  def update(callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPushtokensDollarUpdate): GaxiosPromise[Unit] = js.native
  def update(params: ParamsDollarResourceDollarPushtokensDollarUpdate, callback: BodyResponseCallback[Unit]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPushtokensDollarUpdate,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPushtokensDollarUpdate, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def update(
    params: ParamsDollarResourceDollarPushtokensDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

