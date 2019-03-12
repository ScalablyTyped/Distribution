package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchesResource extends js.Object {
  /** Cancel a turn-based match. */
  def cancel(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyMatchId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Create a turn-based match. */
  def create(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Decline an invitation to play a turn-based match. */
  def decline(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Dismiss a turn-based match from the match list. The match will no longer show up in the list and will not generate notifications. */
  def dismiss(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyMatchId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Finish a turn-based match. Each player should make this call once, after all results are in. Only the player whose turn it is may make the first call
    * to Finish, and can pass in the final match state.
    */
  def finish(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Get the data for a turn-based match. */
  def get(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeMatchData): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Join a turn-based match. */
  def join(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Leave a turn-based match when it is not the current player's turn, without canceling the match. */
  def leave(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Leave a turn-based match during the current player's turn, without canceling the match. */
  def leaveTurn(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  /** Returns turn-based matches the player is or was involved in. */
  def list(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeMatchDataKey): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatchList]
  /**
    * Create a rematch of a match that was previously completed, with the same participants. This can be called by only one player on a match still in their
    * list; the player must have called Finish first. Returns the newly created match; it will be the caller's turn.
    */
  def rematch(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatchRematch]
  /**
    * Returns turn-based matches the player is or was involved in that changed since the last sync call, with the least recent changes coming first. Matches
    * that should be removed from the local cache will have a status of MATCH_DELETED.
    */
  def sync(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeMatchDataKey): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatchSync]
  /** Commit the results of a player turn. */
  def takeTurn(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(
    cancel: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyMatchId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    create: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    decline: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    dismiss: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyMatchId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    finish: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    get: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeMatchData => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    join: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    leave: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    leaveTurn: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch],
    list: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeMatchDataKey => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatchList],
    rematch: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatchRematch],
    sync: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeMatchDataKey => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatchSync],
    takeTurn: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => gapiDotClientLib.gapiNs.clientNs.Request[TurnBasedMatch]
  ): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), finish = js.Any.fromFunction1(finish), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), leaveTurn = js.Any.fromFunction1(leaveTurn), list = js.Any.fromFunction1(list), rematch = js.Any.fromFunction1(rematch), sync = js.Any.fromFunction1(sync), takeTurn = js.Any.fromFunction1(takeTurn))
  
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
}

