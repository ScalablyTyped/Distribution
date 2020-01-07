package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Turnbasedmatches")
@js.native
class Resource$Turnbasedmatches protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.turnBasedMatches.cancel
    * @desc Cancel a turn-based match.
    * @alias games.turnBasedMatches.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Unit] = js.native
  def cancel(callback: BodyResponseCallback[Unit]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarTurnbasedmatchesDollarCancel): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarCancel,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarCancel,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarTurnbasedmatchesDollarCancel, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def cancel(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.create
    * @desc Create a turn-based match.
    * @alias games.turnBasedMatches.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().TurnBasedMatchCreateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def create(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def create(params: ParamsDollarResourceDollarTurnbasedmatchesDollarCreate): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def create(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarCreate,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarCreate,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarTurnbasedmatchesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def create(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.decline
    * @desc Decline an invitation to play a turn-based match.
    * @alias games.turnBasedMatches.decline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def decline(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def decline(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def decline(params: ParamsDollarResourceDollarTurnbasedmatchesDollarDecline): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def decline(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarDecline,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def decline(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarDecline,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def decline(params: ParamsDollarResourceDollarTurnbasedmatchesDollarDecline, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def decline(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarDecline,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.dismiss
    * @desc Dismiss a turn-based match from the match list. The match will no
    * longer show up in the list and will not generate notifications.
    * @alias games.turnBasedMatches.dismiss
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dismiss(): GaxiosPromise[Unit] = js.native
  def dismiss(callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(params: ParamsDollarResourceDollarTurnbasedmatchesDollarDismiss): GaxiosPromise[Unit] = js.native
  def dismiss(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarDismiss,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarDismiss,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(params: ParamsDollarResourceDollarTurnbasedmatchesDollarDismiss, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.finish
    * @desc Finish a turn-based match. Each player should make this call once,
    * after all results are in. Only the player whose turn it is may make the
    * first call to Finish, and can pass in the final match state.
    * @alias games.turnBasedMatches.finish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {().TurnBasedMatchResults} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def finish(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def finish(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def finish(params: ParamsDollarResourceDollarTurnbasedmatchesDollarFinish): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def finish(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarFinish,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def finish(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarFinish,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def finish(params: ParamsDollarResourceDollarTurnbasedmatchesDollarFinish, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def finish(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarFinish,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.get
    * @desc Get the data for a turn-based match.
    * @alias games.turnBasedMatches.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeMatchData Get match data along with metadata.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def get(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTurnbasedmatchesDollarGet): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def get(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarGet,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarGet,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTurnbasedmatchesDollarGet, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def get(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.join
    * @desc Join a turn-based match.
    * @alias games.turnBasedMatches.join
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def join(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def join(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def join(params: ParamsDollarResourceDollarTurnbasedmatchesDollarJoin): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def join(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarJoin,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def join(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarJoin,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def join(params: ParamsDollarResourceDollarTurnbasedmatchesDollarJoin, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def join(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarJoin,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.leave
    * @desc Leave a turn-based match when it is not the current player's turn,
    * without canceling the match.
    * @alias games.turnBasedMatches.leave
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def leave(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def leave(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def leave(params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeave): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def leave(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeave,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def leave(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeave,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def leave(params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeave, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def leave(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeave,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.leaveTurn
    * @desc Leave a turn-based match during the current player's turn, without
    * canceling the match.
    * @alias games.turnBasedMatches.leaveTurn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {integer} params.matchVersion The version of the match being updated.
    * @param {string=} params.pendingParticipantId The ID of another participant who should take their turn next. If not set, the match will wait for other player(s) to join via automatching; this is only valid if automatch criteria is set on the match with remaining slots for automatched players.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def leaveTurn(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def leaveTurn(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def leaveTurn(params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeaveturn): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def leaveTurn(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeaveturn,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def leaveTurn(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeaveturn,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def leaveTurn(params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeaveturn, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def leaveTurn(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarLeaveturn,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.list
    * @desc Returns turn-based matches the player is or was involved in.
    * @alias games.turnBasedMatches.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeMatchData True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be retrievable on request.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxCompletedMatches The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled.
    * @param {integer=} params.maxResults The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TurnBasedMatchList] = js.native
  def list(callback: BodyResponseCallback[Schema$TurnBasedMatchList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTurnbasedmatchesDollarList): GaxiosPromise[Schema$TurnBasedMatchList] = js.native
  def list(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarList,
    callback: BodyResponseCallback[Schema$TurnBasedMatchList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarList,
    options: BodyResponseCallback[Schema$TurnBasedMatchList],
    callback: BodyResponseCallback[Schema$TurnBasedMatchList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTurnbasedmatchesDollarList, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatchList] = js.native
  def list(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatchList]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.rematch
    * @desc Create a rematch of a match that was previously completed, with the
    * same participants. This can be called by only one player on a match still
    * in their list; the player must have called Finish first. Returns the
    * newly created match; it will be the caller's turn.
    * @alias games.turnBasedMatches.rematch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {string=} params.requestId A randomly generated numeric ID for each request specified by the caller. This number is used at the server to ensure that the request is handled correctly across retries.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rematch(): GaxiosPromise[Schema$TurnBasedMatchRematch] = js.native
  def rematch(callback: BodyResponseCallback[Schema$TurnBasedMatchRematch]): Unit = js.native
  def rematch(params: ParamsDollarResourceDollarTurnbasedmatchesDollarRematch): GaxiosPromise[Schema$TurnBasedMatchRematch] = js.native
  def rematch(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarRematch,
    callback: BodyResponseCallback[Schema$TurnBasedMatchRematch]
  ): Unit = js.native
  def rematch(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarRematch,
    options: BodyResponseCallback[Schema$TurnBasedMatchRematch],
    callback: BodyResponseCallback[Schema$TurnBasedMatchRematch]
  ): Unit = js.native
  def rematch(params: ParamsDollarResourceDollarTurnbasedmatchesDollarRematch, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatchRematch] = js.native
  def rematch(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarRematch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatchRematch]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.sync
    * @desc Returns turn-based matches the player is or was involved in that
    * changed since the last sync call, with the least recent changes coming
    * first. Matches that should be removed from the local cache will have a
    * status of MATCH_DELETED.
    * @alias games.turnBasedMatches.sync
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {boolean=} params.includeMatchData True if match data should be returned in the response. Note that not all data will necessarily be returned if include_match_data is true; the server may decide to only return data for some of the matches to limit download size for the client. The remainder of the data for these matches will be retrievable on request.
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxCompletedMatches The maximum number of completed or canceled matches to return in the response. If not set, all matches returned could be completed or canceled.
    * @param {integer=} params.maxResults The maximum number of matches to return in the response, used for paging. For any response, the actual number of matches to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sync(): GaxiosPromise[Schema$TurnBasedMatchSync] = js.native
  def sync(callback: BodyResponseCallback[Schema$TurnBasedMatchSync]): Unit = js.native
  def sync(params: ParamsDollarResourceDollarTurnbasedmatchesDollarSync): GaxiosPromise[Schema$TurnBasedMatchSync] = js.native
  def sync(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarSync,
    callback: BodyResponseCallback[Schema$TurnBasedMatchSync]
  ): Unit = js.native
  def sync(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarSync,
    options: BodyResponseCallback[Schema$TurnBasedMatchSync],
    callback: BodyResponseCallback[Schema$TurnBasedMatchSync]
  ): Unit = js.native
  def sync(params: ParamsDollarResourceDollarTurnbasedmatchesDollarSync, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatchSync] = js.native
  def sync(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarSync,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatchSync]
  ): Unit = js.native
  /**
    * games.turnBasedMatches.takeTurn
    * @desc Commit the results of a player turn.
    * @alias games.turnBasedMatches.takeTurn
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.matchId The ID of the match.
    * @param {().TurnBasedMatchTurn} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def takeTurn(): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def takeTurn(callback: BodyResponseCallback[Schema$TurnBasedMatch]): Unit = js.native
  def takeTurn(params: ParamsDollarResourceDollarTurnbasedmatchesDollarTaketurn): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def takeTurn(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarTaketurn,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def takeTurn(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarTaketurn,
    options: BodyResponseCallback[Schema$TurnBasedMatch],
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
  def takeTurn(params: ParamsDollarResourceDollarTurnbasedmatchesDollarTaketurn, options: MethodOptions): GaxiosPromise[Schema$TurnBasedMatch] = js.native
  def takeTurn(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarTaketurn,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TurnBasedMatch]
  ): Unit = js.native
}

