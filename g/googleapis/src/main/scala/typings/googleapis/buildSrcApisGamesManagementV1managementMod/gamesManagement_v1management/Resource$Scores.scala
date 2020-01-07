package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Scores")
@js.native
class Resource$Scores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.scores.reset
    * @desc Resets scores for the leaderboard with the given ID for the
    * currently authenticated player. This method is only accessible to
    * whitelisted tester accounts for your application.
    * @alias gamesManagement.scores.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Schema$PlayerScoreResetResponse] = js.native
  def reset(callback: BodyResponseCallback[Schema$PlayerScoreResetResponse]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarScoresDollarReset): GaxiosPromise[Schema$PlayerScoreResetResponse] = js.native
  def reset(
    params: ParamsDollarResourceDollarScoresDollarReset,
    callback: BodyResponseCallback[Schema$PlayerScoreResetResponse]
  ): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarScoresDollarReset,
    options: BodyResponseCallback[Schema$PlayerScoreResetResponse],
    callback: BodyResponseCallback[Schema$PlayerScoreResetResponse]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarScoresDollarReset, options: MethodOptions): GaxiosPromise[Schema$PlayerScoreResetResponse] = js.native
  def reset(
    params: ParamsDollarResourceDollarScoresDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerScoreResetResponse]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetAll
    * @desc Resets all scores for all leaderboards for the currently
    * authenticated players. This method is only accessible to whitelisted
    * tester accounts for your application.
    * @alias gamesManagement.scores.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[Schema$PlayerScoreResetAllResponse] = js.native
  def resetAll(callback: BodyResponseCallback[Schema$PlayerScoreResetAllResponse]): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarScoresDollarResetall): GaxiosPromise[Schema$PlayerScoreResetAllResponse] = js.native
  def resetAll(
    params: ParamsDollarResourceDollarScoresDollarResetall,
    callback: BodyResponseCallback[Schema$PlayerScoreResetAllResponse]
  ): Unit = js.native
  def resetAll(
    params: ParamsDollarResourceDollarScoresDollarResetall,
    options: BodyResponseCallback[Schema$PlayerScoreResetAllResponse],
    callback: BodyResponseCallback[Schema$PlayerScoreResetAllResponse]
  ): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarScoresDollarResetall, options: MethodOptions): GaxiosPromise[Schema$PlayerScoreResetAllResponse] = js.native
  def resetAll(
    params: ParamsDollarResourceDollarScoresDollarResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerScoreResetAllResponse]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetAllForAllPlayers
    * @desc Resets scores for all draft leaderboards for all players. This
    * method is only available to user accounts for your developer console.
    * @alias gamesManagement.scores.resetAllForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarScoresDollarResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetallforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarScoresDollarResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetForAllPlayers
    * @desc Resets scores for the leaderboard with the given ID for all
    * players. This method is only available to user accounts for your
    * developer console. Only draft leaderboards can be reset.
    * @alias gamesManagement.scores.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarScoresDollarResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarScoresDollarResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.scores.resetMultipleForAllPlayers
    * @desc Resets scores for the leaderboards with the given IDs for all
    * players. This method is only available to user accounts for your
    * developer console. Only draft leaderboards may be reset.
    * @alias gamesManagement.scores.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ScoresResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarScoresDollarResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetmultipleforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarScoresDollarResetmultipleforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarScoresDollarResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

