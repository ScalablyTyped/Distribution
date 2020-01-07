package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Events")
@js.native
class Resource$Events protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.events.reset
    * @desc Resets all player progress on the event with the given ID for the
    * currently authenticated player. This method is only accessible to
    * whitelisted tester accounts for your application. All quests for this
    * player that use the event will also be reset.
    * @alias gamesManagement.events.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.eventId The ID of the event.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarEventsDollarReset): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsDollarResourceDollarEventsDollarReset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarEventsDollarReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarEventsDollarReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(
    params: ParamsDollarResourceDollarEventsDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.events.resetAll
    * @desc Resets all player progress on all events for the currently
    * authenticated player. This method is only accessible to whitelisted
    * tester accounts for your application. All quests for this player will
    * also be reset.
    * @alias gamesManagement.events.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[Unit] = js.native
  def resetAll(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarEventsDollarResetall): GaxiosPromise[Unit] = js.native
  def resetAll(params: ParamsDollarResourceDollarEventsDollarResetall, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAll(
    params: ParamsDollarResourceDollarEventsDollarResetall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarEventsDollarResetall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAll(
    params: ParamsDollarResourceDollarEventsDollarResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.events.resetAllForAllPlayers
    * @desc Resets all draft events for all players. This method is only
    * available to user accounts for your developer console. All quests that
    * use any of these events will also be reset.
    * @alias gamesManagement.events.resetAllForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarEventsDollarResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetallforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarEventsDollarResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.events.resetForAllPlayers
    * @desc Resets the event with the given ID for all players. This method is
    * only available to user accounts for your developer console. Only draft
    * events can be reset. All quests that use the event will also be reset.
    * @alias gamesManagement.events.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.eventId The ID of the event.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarEventsDollarResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarEventsDollarResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.events.resetMultipleForAllPlayers
    * @desc Resets events with the given IDs for all players. This method is
    * only available to user accounts for your developer console. Only draft
    * events may be reset. All quests that use any of the events will also be
    * reset.
    * @alias gamesManagement.events.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().EventsResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarEventsDollarResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetmultipleforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarEventsDollarResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarEventsDollarResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

