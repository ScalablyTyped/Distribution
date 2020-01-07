package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Quests")
@js.native
class Resource$Quests protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.quests.reset
    * @desc Resets all player progress on the quest with the given ID for the
    * currently authenticated player. This method is only accessible to
    * whitelisted tester accounts for your application.
    * @alias gamesManagement.quests.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.questId The ID of the quest.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarQuestsDollarReset): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsDollarResourceDollarQuestsDollarReset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarQuestsDollarReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarQuestsDollarReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(
    params: ParamsDollarResourceDollarQuestsDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.quests.resetAll
    * @desc Resets all player progress on all quests for the currently
    * authenticated player. This method is only accessible to whitelisted
    * tester accounts for your application.
    * @alias gamesManagement.quests.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[Unit] = js.native
  def resetAll(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarQuestsDollarResetall): GaxiosPromise[Unit] = js.native
  def resetAll(params: ParamsDollarResourceDollarQuestsDollarResetall, callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAll(
    params: ParamsDollarResourceDollarQuestsDollarResetall,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarQuestsDollarResetall, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAll(
    params: ParamsDollarResourceDollarQuestsDollarResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.quests.resetAllForAllPlayers
    * @desc Resets all draft quests for all players. This method is only
    * available to user accounts for your developer console.
    * @alias gamesManagement.quests.resetAllForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarQuestsDollarResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetallforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarQuestsDollarResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.quests.resetForAllPlayers
    * @desc Resets all player progress on the quest with the given ID for all
    * players. This method is only available to user accounts for your
    * developer console. Only draft quests can be reset.
    * @alias gamesManagement.quests.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.questId The ID of the quest.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarQuestsDollarResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarQuestsDollarResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.quests.resetMultipleForAllPlayers
    * @desc Resets quests with the given IDs for all players. This method is
    * only available to user accounts for your developer console. Only draft
    * quests may be reset.
    * @alias gamesManagement.quests.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().QuestsResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarQuestsDollarResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetmultipleforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarQuestsDollarResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarQuestsDollarResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

