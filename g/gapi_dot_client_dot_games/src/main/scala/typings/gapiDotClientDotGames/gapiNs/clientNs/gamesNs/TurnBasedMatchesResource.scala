package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsIncludeMatchData
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsIncludeMatchDataKey
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKey
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageMatchId
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyMatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchesResource extends js.Object {
  /** Cancel a turn-based match. */
  def cancel(request: Anon_AltConsistencyTokenFieldsKeyMatchId): Request[Unit]
  /** Create a turn-based match. */
  def create(request: Anon_AltConsistencyTokenFieldsKey): Request[TurnBasedMatch]
  /** Decline an invitation to play a turn-based match. */
  def decline(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): Request[TurnBasedMatch]
  /** Dismiss a turn-based match from the match list. The match will no longer show up in the list and will not generate notifications. */
  def dismiss(request: Anon_AltConsistencyTokenFieldsKeyMatchId): Request[Unit]
  /**
    * Finish a turn-based match. Each player should make this call once, after all results are in. Only the player whose turn it is may make the first call
    * to Finish, and can pass in the final match state.
    */
  def finish(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): Request[TurnBasedMatch]
  /** Get the data for a turn-based match. */
  def get(request: Anon_AltConsistencyTokenFieldsIncludeMatchData): Request[TurnBasedMatch]
  /** Join a turn-based match. */
  def join(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): Request[TurnBasedMatch]
  /** Leave a turn-based match when it is not the current player's turn, without canceling the match. */
  def leave(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): Request[TurnBasedMatch]
  /** Leave a turn-based match during the current player's turn, without canceling the match. */
  def leaveTurn(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion): Request[TurnBasedMatch]
  /** Returns turn-based matches the player is or was involved in. */
  def list(request: Anon_AltConsistencyTokenFieldsIncludeMatchDataKey): Request[TurnBasedMatchList]
  /**
    * Create a rematch of a match that was previously completed, with the same participants. This can be called by only one player on a match still in their
    * list; the player must have called Finish first. Returns the newly created match; it will be the caller's turn.
    */
  def rematch(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken): Request[TurnBasedMatchRematch]
  /**
    * Returns turn-based matches the player is or was involved in that changed since the last sync call, with the least recent changes coming first. Matches
    * that should be removed from the local cache will have a status of MATCH_DELETED.
    */
  def sync(request: Anon_AltConsistencyTokenFieldsIncludeMatchDataKey): Request[TurnBasedMatchSync]
  /** Commit the results of a player turn. */
  def takeTurn(request: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId): Request[TurnBasedMatch]
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(
    cancel: Anon_AltConsistencyTokenFieldsKeyMatchId => Request[Unit],
    create: Anon_AltConsistencyTokenFieldsKey => Request[TurnBasedMatch],
    decline: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => Request[TurnBasedMatch],
    dismiss: Anon_AltConsistencyTokenFieldsKeyMatchId => Request[Unit],
    finish: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => Request[TurnBasedMatch],
    get: Anon_AltConsistencyTokenFieldsIncludeMatchData => Request[TurnBasedMatch],
    join: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => Request[TurnBasedMatch],
    leave: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => Request[TurnBasedMatch],
    leaveTurn: Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion => Request[TurnBasedMatch],
    list: Anon_AltConsistencyTokenFieldsIncludeMatchDataKey => Request[TurnBasedMatchList],
    rematch: Anon_AltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken => Request[TurnBasedMatchRematch],
    sync: Anon_AltConsistencyTokenFieldsIncludeMatchDataKey => Request[TurnBasedMatchSync],
    takeTurn: Anon_AltConsistencyTokenFieldsKeyLanguageMatchId => Request[TurnBasedMatch]
  ): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), finish = js.Any.fromFunction1(finish), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), leaveTurn = js.Any.fromFunction1(leaveTurn), list = js.Any.fromFunction1(list), rematch = js.Any.fromFunction1(rematch), sync = js.Any.fromFunction1(sync), takeTurn = js.Any.fromFunction1(takeTurn))
  
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
}

