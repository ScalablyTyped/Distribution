package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Achievements")
@js.native
class Resource$Achievements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.achievements.reset
    * @desc Resets the achievement with the given ID for the currently
    * authenticated player. This method is only accessible to whitelisted
    * tester accounts for your application.
    * @alias gamesManagement.achievements.reset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Schema$AchievementResetResponse] = js.native
  def reset(callback: BodyResponseCallback[Schema$AchievementResetResponse]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarAchievementsDollarReset): GaxiosPromise[Schema$AchievementResetResponse] = js.native
  def reset(
    params: ParamsDollarResourceDollarAchievementsDollarReset,
    callback: BodyResponseCallback[Schema$AchievementResetResponse]
  ): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarAchievementsDollarReset,
    options: BodyResponseCallback[Schema$AchievementResetResponse],
    callback: BodyResponseCallback[Schema$AchievementResetResponse]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarAchievementsDollarReset, options: MethodOptions): GaxiosPromise[Schema$AchievementResetResponse] = js.native
  def reset(
    params: ParamsDollarResourceDollarAchievementsDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementResetResponse]
  ): Unit = js.native
  /**
    * gamesManagement.achievements.resetAll
    * @desc Resets all achievements for the currently authenticated player for
    * your application. This method is only accessible to whitelisted tester
    * accounts for your application.
    * @alias gamesManagement.achievements.resetAll
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAll(): GaxiosPromise[Schema$AchievementResetAllResponse] = js.native
  def resetAll(callback: BodyResponseCallback[Schema$AchievementResetAllResponse]): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarAchievementsDollarResetall): GaxiosPromise[Schema$AchievementResetAllResponse] = js.native
  def resetAll(
    params: ParamsDollarResourceDollarAchievementsDollarResetall,
    callback: BodyResponseCallback[Schema$AchievementResetAllResponse]
  ): Unit = js.native
  def resetAll(
    params: ParamsDollarResourceDollarAchievementsDollarResetall,
    options: BodyResponseCallback[Schema$AchievementResetAllResponse],
    callback: BodyResponseCallback[Schema$AchievementResetAllResponse]
  ): Unit = js.native
  def resetAll(params: ParamsDollarResourceDollarAchievementsDollarResetall, options: MethodOptions): GaxiosPromise[Schema$AchievementResetAllResponse] = js.native
  def resetAll(
    params: ParamsDollarResourceDollarAchievementsDollarResetall,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementResetAllResponse]
  ): Unit = js.native
  /**
    * gamesManagement.achievements.resetAllForAllPlayers
    * @desc Resets all draft achievements for all players. This method is only
    * available to user accounts for your developer console.
    * @alias gamesManagement.achievements.resetAllForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetAllForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarAchievementsDollarResetallforallplayers): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetallforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetallforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetAllForAllPlayers(params: ParamsDollarResourceDollarAchievementsDollarResetallforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetAllForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetallforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.achievements.resetForAllPlayers
    * @desc Resets the achievement with the given ID for all players. This
    * method is only available to user accounts for your developer console.
    * Only draft achievements can be reset.
    * @alias gamesManagement.achievements.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarAchievementsDollarResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarAchievementsDollarResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.achievements.resetMultipleForAllPlayers
    * @desc Resets achievements with the given IDs for all players. This method
    * is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    * @alias gamesManagement.achievements.resetMultipleForAllPlayers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AchievementResetMultipleForAllRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetMultipleForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetMultipleForAllPlayers(params: ParamsDollarResourceDollarAchievementsDollarResetmultipleforallplayers): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetmultipleforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetmultipleforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetmultipleforallplayers,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def resetMultipleForAllPlayers(
    params: ParamsDollarResourceDollarAchievementsDollarResetmultipleforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

