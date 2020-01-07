package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Achievements")
@js.native
class Resource$Achievements protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.achievements.increment
    * @desc Increments the steps of the achievement with the given ID for the
    * currently authenticated player.
    * @alias games.achievements.increment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {string=} params.requestId A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries.
    * @param {integer} params.stepsToIncrement The number of steps to increment.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def increment(): GaxiosPromise[Schema$AchievementIncrementResponse] = js.native
  def increment(callback: BodyResponseCallback[Schema$AchievementIncrementResponse]): Unit = js.native
  def increment(params: ParamsDollarResourceDollarAchievementsDollarIncrement): GaxiosPromise[Schema$AchievementIncrementResponse] = js.native
  def increment(
    params: ParamsDollarResourceDollarAchievementsDollarIncrement,
    callback: BodyResponseCallback[Schema$AchievementIncrementResponse]
  ): Unit = js.native
  def increment(
    params: ParamsDollarResourceDollarAchievementsDollarIncrement,
    options: BodyResponseCallback[Schema$AchievementIncrementResponse],
    callback: BodyResponseCallback[Schema$AchievementIncrementResponse]
  ): Unit = js.native
  def increment(params: ParamsDollarResourceDollarAchievementsDollarIncrement, options: MethodOptions): GaxiosPromise[Schema$AchievementIncrementResponse] = js.native
  def increment(
    params: ParamsDollarResourceDollarAchievementsDollarIncrement,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementIncrementResponse]
  ): Unit = js.native
  /**
    * games.achievements.list
    * @desc Lists the progress for all your application's achievements for the
    * currently authenticated player.
    * @alias games.achievements.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {string=} params.state Tells the server to return only achievements with the specified state. If this parameter isn't specified, all achievements are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PlayerAchievementListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PlayerAchievementListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAchievementsDollarList): GaxiosPromise[Schema$PlayerAchievementListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementsDollarList,
    callback: BodyResponseCallback[Schema$PlayerAchievementListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementsDollarList,
    options: BodyResponseCallback[Schema$PlayerAchievementListResponse],
    callback: BodyResponseCallback[Schema$PlayerAchievementListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAchievementsDollarList, options: MethodOptions): GaxiosPromise[Schema$PlayerAchievementListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerAchievementListResponse]
  ): Unit = js.native
  /**
    * games.achievements.reveal
    * @desc Sets the state of the achievement with the given ID to REVEALED for
    * the currently authenticated player.
    * @alias games.achievements.reveal
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reveal(): GaxiosPromise[Schema$AchievementRevealResponse] = js.native
  def reveal(callback: BodyResponseCallback[Schema$AchievementRevealResponse]): Unit = js.native
  def reveal(params: ParamsDollarResourceDollarAchievementsDollarReveal): GaxiosPromise[Schema$AchievementRevealResponse] = js.native
  def reveal(
    params: ParamsDollarResourceDollarAchievementsDollarReveal,
    callback: BodyResponseCallback[Schema$AchievementRevealResponse]
  ): Unit = js.native
  def reveal(
    params: ParamsDollarResourceDollarAchievementsDollarReveal,
    options: BodyResponseCallback[Schema$AchievementRevealResponse],
    callback: BodyResponseCallback[Schema$AchievementRevealResponse]
  ): Unit = js.native
  def reveal(params: ParamsDollarResourceDollarAchievementsDollarReveal, options: MethodOptions): GaxiosPromise[Schema$AchievementRevealResponse] = js.native
  def reveal(
    params: ParamsDollarResourceDollarAchievementsDollarReveal,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementRevealResponse]
  ): Unit = js.native
  /**
    * games.achievements.setStepsAtLeast
    * @desc Sets the steps for the currently authenticated player towards
    * unlocking an achievement. If the steps parameter is less than the current
    * number of steps that the player already gained for the achievement, the
    * achievement is not modified.
    * @alias games.achievements.setStepsAtLeast
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {integer} params.steps The minimum value to set the steps to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setStepsAtLeast(): GaxiosPromise[Schema$AchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(callback: BodyResponseCallback[Schema$AchievementSetStepsAtLeastResponse]): Unit = js.native
  def setStepsAtLeast(params: ParamsDollarResourceDollarAchievementsDollarSetstepsatleast): GaxiosPromise[Schema$AchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(
    params: ParamsDollarResourceDollarAchievementsDollarSetstepsatleast,
    callback: BodyResponseCallback[Schema$AchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  def setStepsAtLeast(
    params: ParamsDollarResourceDollarAchievementsDollarSetstepsatleast,
    options: BodyResponseCallback[Schema$AchievementSetStepsAtLeastResponse],
    callback: BodyResponseCallback[Schema$AchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  def setStepsAtLeast(params: ParamsDollarResourceDollarAchievementsDollarSetstepsatleast, options: MethodOptions): GaxiosPromise[Schema$AchievementSetStepsAtLeastResponse] = js.native
  def setStepsAtLeast(
    params: ParamsDollarResourceDollarAchievementsDollarSetstepsatleast,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementSetStepsAtLeastResponse]
  ): Unit = js.native
  /**
    * games.achievements.unlock
    * @desc Unlocks this achievement for the currently authenticated player.
    * @alias games.achievements.unlock
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.achievementId The ID of the achievement used by this method.
    * @param {string=} params.builtinGameId Override used only by built-in games in Play Games application.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unlock(): GaxiosPromise[Schema$AchievementUnlockResponse] = js.native
  def unlock(callback: BodyResponseCallback[Schema$AchievementUnlockResponse]): Unit = js.native
  def unlock(params: ParamsDollarResourceDollarAchievementsDollarUnlock): GaxiosPromise[Schema$AchievementUnlockResponse] = js.native
  def unlock(
    params: ParamsDollarResourceDollarAchievementsDollarUnlock,
    callback: BodyResponseCallback[Schema$AchievementUnlockResponse]
  ): Unit = js.native
  def unlock(
    params: ParamsDollarResourceDollarAchievementsDollarUnlock,
    options: BodyResponseCallback[Schema$AchievementUnlockResponse],
    callback: BodyResponseCallback[Schema$AchievementUnlockResponse]
  ): Unit = js.native
  def unlock(params: ParamsDollarResourceDollarAchievementsDollarUnlock, options: MethodOptions): GaxiosPromise[Schema$AchievementUnlockResponse] = js.native
  def unlock(
    params: ParamsDollarResourceDollarAchievementsDollarUnlock,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementUnlockResponse]
  ): Unit = js.native
  /**
    * games.achievements.updateMultiple
    * @desc Updates multiple achievements for the currently authenticated
    * player.
    * @alias games.achievements.updateMultiple
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.builtinGameId Override used only by built-in games in Play Games application.
    * @param {().AchievementUpdateMultipleRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateMultiple(): GaxiosPromise[Schema$AchievementUpdateMultipleResponse] = js.native
  def updateMultiple(callback: BodyResponseCallback[Schema$AchievementUpdateMultipleResponse]): Unit = js.native
  def updateMultiple(params: ParamsDollarResourceDollarAchievementsDollarUpdatemultiple): GaxiosPromise[Schema$AchievementUpdateMultipleResponse] = js.native
  def updateMultiple(
    params: ParamsDollarResourceDollarAchievementsDollarUpdatemultiple,
    callback: BodyResponseCallback[Schema$AchievementUpdateMultipleResponse]
  ): Unit = js.native
  def updateMultiple(
    params: ParamsDollarResourceDollarAchievementsDollarUpdatemultiple,
    options: BodyResponseCallback[Schema$AchievementUpdateMultipleResponse],
    callback: BodyResponseCallback[Schema$AchievementUpdateMultipleResponse]
  ): Unit = js.native
  def updateMultiple(params: ParamsDollarResourceDollarAchievementsDollarUpdatemultiple, options: MethodOptions): GaxiosPromise[Schema$AchievementUpdateMultipleResponse] = js.native
  def updateMultiple(
    params: ParamsDollarResourceDollarAchievementsDollarUpdatemultiple,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementUpdateMultipleResponse]
  ): Unit = js.native
}

