package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Quests")
@js.native
class Resource$Quests protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.quests.accept
    * @desc Indicates that the currently authorized user will participate in
    * the quest.
    * @alias games.quests.accept
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.questId The ID of the quest.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def accept(): GaxiosPromise[Schema$Quest] = js.native
  def accept(callback: BodyResponseCallback[Schema$Quest]): Unit = js.native
  def accept(params: ParamsDollarResourceDollarQuestsDollarAccept): GaxiosPromise[Schema$Quest] = js.native
  def accept(params: ParamsDollarResourceDollarQuestsDollarAccept, callback: BodyResponseCallback[Schema$Quest]): Unit = js.native
  def accept(
    params: ParamsDollarResourceDollarQuestsDollarAccept,
    options: BodyResponseCallback[Schema$Quest],
    callback: BodyResponseCallback[Schema$Quest]
  ): Unit = js.native
  def accept(params: ParamsDollarResourceDollarQuestsDollarAccept, options: MethodOptions): GaxiosPromise[Schema$Quest] = js.native
  def accept(
    params: ParamsDollarResourceDollarQuestsDollarAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Quest]
  ): Unit = js.native
  /**
    * games.quests.list
    * @desc Get a list of quests for your application and the currently
    * authenticated player.
    * @alias games.quests.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of quest resources to return in the response, used for paging. For any response, the actual number of quest resources returned may be less than the specified maxResults. Acceptable values are 1 to 50, inclusive. (Default: 50).
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$QuestListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$QuestListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarQuestsDollarList): GaxiosPromise[Schema$QuestListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarQuestsDollarList,
    callback: BodyResponseCallback[Schema$QuestListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarQuestsDollarList,
    options: BodyResponseCallback[Schema$QuestListResponse],
    callback: BodyResponseCallback[Schema$QuestListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarQuestsDollarList, options: MethodOptions): GaxiosPromise[Schema$QuestListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarQuestsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$QuestListResponse]
  ): Unit = js.native
}

