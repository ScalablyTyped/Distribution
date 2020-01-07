package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Scores")
@js.native
class Resource$Scores protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.scores.get
    * @desc Get high scores, and optionally ranks, in leaderboards for the
    * currently authenticated player. For a specific time span, leaderboardId
    * can be set to ALL to retrieve data for all leaderboards in a given time
    * span. NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in
    * the same request; only one parameter may be set to 'ALL'.
    * @alias games.scores.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.includeRankType The types of ranks to return. If the parameter is omitted, no ranks will be returned.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard. Can be set to 'ALL' to retrieve data for all leaderboards for this application.
    * @param {integer=} params.maxResults The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {string} params.timeSpan The time span for the scores and ranks you're requesting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PlayerLeaderboardScoreListResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$PlayerLeaderboardScoreListResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarScoresDollarGet): GaxiosPromise[Schema$PlayerLeaderboardScoreListResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarScoresDollarGet,
    callback: BodyResponseCallback[Schema$PlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarScoresDollarGet,
    options: BodyResponseCallback[Schema$PlayerLeaderboardScoreListResponse],
    callback: BodyResponseCallback[Schema$PlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarScoresDollarGet, options: MethodOptions): GaxiosPromise[Schema$PlayerLeaderboardScoreListResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarScoresDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerLeaderboardScoreListResponse]
  ): Unit = js.native
  /**
    * games.scores.list
    * @desc Lists the scores in a leaderboard, starting from the top.
    * @alias games.scores.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of scores you're requesting.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {integer=} params.maxResults The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {string} params.timeSpan The time span for the scores and ranks you're requesting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LeaderboardScores] = js.native
  def list(callback: BodyResponseCallback[Schema$LeaderboardScores]): Unit = js.native
  def list(params: ParamsDollarResourceDollarScoresDollarList): GaxiosPromise[Schema$LeaderboardScores] = js.native
  def list(
    params: ParamsDollarResourceDollarScoresDollarList,
    callback: BodyResponseCallback[Schema$LeaderboardScores]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarScoresDollarList,
    options: BodyResponseCallback[Schema$LeaderboardScores],
    callback: BodyResponseCallback[Schema$LeaderboardScores]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarScoresDollarList, options: MethodOptions): GaxiosPromise[Schema$LeaderboardScores] = js.native
  def list(
    params: ParamsDollarResourceDollarScoresDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardScores]
  ): Unit = js.native
  /**
    * games.scores.listWindow
    * @desc Lists the scores in a leaderboard around (and including) a player's
    * score.
    * @alias games.scores.listWindow
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.collection The collection of scores you're requesting.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {integer=} params.maxResults The maximum number of leaderboard scores to return in the response. For any response, the actual number of leaderboard scores returned may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {integer=} params.resultsAbove The preferred number of scores to return above the player's score. More scores may be returned if the player is at the bottom of the leaderboard; fewer may be returned if the player is at the top. Must be less than or equal to maxResults.
    * @param {boolean=} params.returnTopIfAbsent True if the top scores should be returned when the player is not in the leaderboard. Defaults to true.
    * @param {string} params.timeSpan The time span for the scores and ranks you're requesting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listWindow(): GaxiosPromise[Schema$LeaderboardScores] = js.native
  def listWindow(callback: BodyResponseCallback[Schema$LeaderboardScores]): Unit = js.native
  def listWindow(params: ParamsDollarResourceDollarScoresDollarListwindow): GaxiosPromise[Schema$LeaderboardScores] = js.native
  def listWindow(
    params: ParamsDollarResourceDollarScoresDollarListwindow,
    callback: BodyResponseCallback[Schema$LeaderboardScores]
  ): Unit = js.native
  def listWindow(
    params: ParamsDollarResourceDollarScoresDollarListwindow,
    options: BodyResponseCallback[Schema$LeaderboardScores],
    callback: BodyResponseCallback[Schema$LeaderboardScores]
  ): Unit = js.native
  def listWindow(params: ParamsDollarResourceDollarScoresDollarListwindow, options: MethodOptions): GaxiosPromise[Schema$LeaderboardScores] = js.native
  def listWindow(
    params: ParamsDollarResourceDollarScoresDollarListwindow,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LeaderboardScores]
  ): Unit = js.native
  /**
    * games.scores.submit
    * @desc Submits a score to the specified leaderboard.
    * @alias games.scores.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.leaderboardId The ID of the leaderboard.
    * @param {string} params.score The score you're submitting. The submitted score is ignored if it is worse than a previously submitted score, where worse depends on the leaderboard sort order. The meaning of the score value depends on the leaderboard format type. For fixed-point, the score represents the raw value. For time, the score represents elapsed time in milliseconds. For currency, the score represents a value in micro units.
    * @param {string=} params.scoreTag Additional information about the score you're submitting. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[Schema$PlayerScoreResponse] = js.native
  def submit(callback: BodyResponseCallback[Schema$PlayerScoreResponse]): Unit = js.native
  def submit(params: ParamsDollarResourceDollarScoresDollarSubmit): GaxiosPromise[Schema$PlayerScoreResponse] = js.native
  def submit(
    params: ParamsDollarResourceDollarScoresDollarSubmit,
    callback: BodyResponseCallback[Schema$PlayerScoreResponse]
  ): Unit = js.native
  def submit(
    params: ParamsDollarResourceDollarScoresDollarSubmit,
    options: BodyResponseCallback[Schema$PlayerScoreResponse],
    callback: BodyResponseCallback[Schema$PlayerScoreResponse]
  ): Unit = js.native
  def submit(params: ParamsDollarResourceDollarScoresDollarSubmit, options: MethodOptions): GaxiosPromise[Schema$PlayerScoreResponse] = js.native
  def submit(
    params: ParamsDollarResourceDollarScoresDollarSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerScoreResponse]
  ): Unit = js.native
  /**
    * games.scores.submitMultiple
    * @desc Submits multiple scores to leaderboards.
    * @alias games.scores.submitMultiple
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().PlayerScoreSubmissionList} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submitMultiple(): GaxiosPromise[Schema$PlayerScoreListResponse] = js.native
  def submitMultiple(callback: BodyResponseCallback[Schema$PlayerScoreListResponse]): Unit = js.native
  def submitMultiple(params: ParamsDollarResourceDollarScoresDollarSubmitmultiple): GaxiosPromise[Schema$PlayerScoreListResponse] = js.native
  def submitMultiple(
    params: ParamsDollarResourceDollarScoresDollarSubmitmultiple,
    callback: BodyResponseCallback[Schema$PlayerScoreListResponse]
  ): Unit = js.native
  def submitMultiple(
    params: ParamsDollarResourceDollarScoresDollarSubmitmultiple,
    options: BodyResponseCallback[Schema$PlayerScoreListResponse],
    callback: BodyResponseCallback[Schema$PlayerScoreListResponse]
  ): Unit = js.native
  def submitMultiple(params: ParamsDollarResourceDollarScoresDollarSubmitmultiple, options: MethodOptions): GaxiosPromise[Schema$PlayerScoreListResponse] = js.native
  def submitMultiple(
    params: ParamsDollarResourceDollarScoresDollarSubmitmultiple,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlayerScoreListResponse]
  ): Unit = js.native
}

