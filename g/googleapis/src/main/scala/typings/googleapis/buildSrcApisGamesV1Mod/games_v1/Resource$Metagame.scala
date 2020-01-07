package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Metagame")
@js.native
class Resource$Metagame protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.metagame.getMetagameConfig
    * @desc Return the metagame configuration data for the calling application.
    * @alias games.metagame.getMetagameConfig
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetagameConfig(): GaxiosPromise[Schema$MetagameConfig] = js.native
  def getMetagameConfig(callback: BodyResponseCallback[Schema$MetagameConfig]): Unit = js.native
  def getMetagameConfig(params: ParamsDollarResourceDollarMetagameDollarGetmetagameconfig): GaxiosPromise[Schema$MetagameConfig] = js.native
  def getMetagameConfig(
    params: ParamsDollarResourceDollarMetagameDollarGetmetagameconfig,
    callback: BodyResponseCallback[Schema$MetagameConfig]
  ): Unit = js.native
  def getMetagameConfig(
    params: ParamsDollarResourceDollarMetagameDollarGetmetagameconfig,
    options: BodyResponseCallback[Schema$MetagameConfig],
    callback: BodyResponseCallback[Schema$MetagameConfig]
  ): Unit = js.native
  def getMetagameConfig(params: ParamsDollarResourceDollarMetagameDollarGetmetagameconfig, options: MethodOptions): GaxiosPromise[Schema$MetagameConfig] = js.native
  def getMetagameConfig(
    params: ParamsDollarResourceDollarMetagameDollarGetmetagameconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MetagameConfig]
  ): Unit = js.native
  /**
    * games.metagame.listCategoriesByPlayer
    * @desc List play data aggregated per category for the player corresponding
    * to playerId.
    * @alias games.metagame.listCategoriesByPlayer
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of categories for which data will be returned.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of category resources to return in the response, used for paging. For any response, the actual number of category resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listCategoriesByPlayer(): GaxiosPromise[Schema$CategoryListResponse] = js.native
  def listCategoriesByPlayer(callback: BodyResponseCallback[Schema$CategoryListResponse]): Unit = js.native
  def listCategoriesByPlayer(params: ParamsDollarResourceDollarMetagameDollarListcategoriesbyplayer): GaxiosPromise[Schema$CategoryListResponse] = js.native
  def listCategoriesByPlayer(
    params: ParamsDollarResourceDollarMetagameDollarListcategoriesbyplayer,
    callback: BodyResponseCallback[Schema$CategoryListResponse]
  ): Unit = js.native
  def listCategoriesByPlayer(
    params: ParamsDollarResourceDollarMetagameDollarListcategoriesbyplayer,
    options: BodyResponseCallback[Schema$CategoryListResponse],
    callback: BodyResponseCallback[Schema$CategoryListResponse]
  ): Unit = js.native
  def listCategoriesByPlayer(params: ParamsDollarResourceDollarMetagameDollarListcategoriesbyplayer, options: MethodOptions): GaxiosPromise[Schema$CategoryListResponse] = js.native
  def listCategoriesByPlayer(
    params: ParamsDollarResourceDollarMetagameDollarListcategoriesbyplayer,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CategoryListResponse]
  ): Unit = js.native
}

