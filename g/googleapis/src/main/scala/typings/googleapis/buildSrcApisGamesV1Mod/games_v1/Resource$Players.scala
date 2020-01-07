package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Players")
@js.native
class Resource$Players protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.players.get
    * @desc Retrieves the Player resource with the given ID. To retrieve the
    * player for the currently authenticated user, set playerId to me.
    * @alias games.players.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Player] = js.native
  def get(callback: BodyResponseCallback[Schema$Player]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlayersDollarGet): GaxiosPromise[Schema$Player] = js.native
  def get(params: ParamsDollarResourceDollarPlayersDollarGet, callback: BodyResponseCallback[Schema$Player]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPlayersDollarGet,
    options: BodyResponseCallback[Schema$Player],
    callback: BodyResponseCallback[Schema$Player]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlayersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Player] = js.native
  def get(
    params: ParamsDollarResourceDollarPlayersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Player]
  ): Unit = js.native
  /**
    * games.players.list
    * @desc Get the collection of players for the currently authenticated user.
    * @alias games.players.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection Collection of players being retrieved
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of player resources to return in the response, used for paging. For any response, the actual number of player resources returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PlayerListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PlayerListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlayersDollarList): GaxiosPromise[Schema$PlayerListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlayersDollarList,
    callback: BodyResponseCallback[Schema$PlayerListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPlayersDollarList,
    options: BodyResponseCallback[Schema$PlayerListResponse],
    callback: BodyResponseCallback[Schema$PlayerListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlayersDollarList, options: MethodOptions): GaxiosPromise[Schema$PlayerListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlayersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerListResponse]
  ): Unit = js.native
}

