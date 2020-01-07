package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Achievementdefinitions")
@js.native
class Resource$Achievementdefinitions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.achievementDefinitions.list
    * @desc Lists all the achievement definitions for your application.
    * @alias games.achievementDefinitions.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of achievement resources to return in the response, used for paging. For any response, the actual number of achievement resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AchievementDefinitionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AchievementDefinitionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAchievementdefinitionsDollarList): GaxiosPromise[Schema$AchievementDefinitionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementdefinitionsDollarList,
    callback: BodyResponseCallback[Schema$AchievementDefinitionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementdefinitionsDollarList,
    options: BodyResponseCallback[Schema$AchievementDefinitionsListResponse],
    callback: BodyResponseCallback[Schema$AchievementDefinitionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAchievementdefinitionsDollarList, options: MethodOptions): GaxiosPromise[Schema$AchievementDefinitionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAchievementdefinitionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AchievementDefinitionsListResponse]
  ): Unit = js.native
}

