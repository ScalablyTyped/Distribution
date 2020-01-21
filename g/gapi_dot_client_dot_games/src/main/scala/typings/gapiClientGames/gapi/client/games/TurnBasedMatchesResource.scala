package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsIncludeMatchData
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsIncludeMatchDataKey
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKey
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguageMatchId
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyMatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchesResource extends js.Object {
  /** Cancel a turn-based match. */
  def cancel(request: AnonAltConsistencyTokenFieldsKeyMatchId): Request_[Unit]
  /** Create a turn-based match. */
  def create(request: AnonAltConsistencyTokenFieldsKey): Request_[TurnBasedMatch]
  /** Decline an invitation to play a turn-based match. */
  def decline(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchId): Request_[TurnBasedMatch]
  /** Dismiss a turn-based match from the match list. The match will no longer show up in the list and will not generate notifications. */
  def dismiss(request: AnonAltConsistencyTokenFieldsKeyMatchId): Request_[Unit]
  /**
    * Finish a turn-based match. Each player should make this call once, after all results are in. Only the player whose turn it is may make the first call
    * to Finish, and can pass in the final match state.
    */
  def finish(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchId): Request_[TurnBasedMatch]
  /** Get the data for a turn-based match. */
  def get(request: AnonAltConsistencyTokenFieldsIncludeMatchData): Request_[TurnBasedMatch]
  /** Join a turn-based match. */
  def join(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchId): Request_[TurnBasedMatch]
  /** Leave a turn-based match when it is not the current player's turn, without canceling the match. */
  def leave(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchId): Request_[TurnBasedMatch]
  /** Leave a turn-based match during the current player's turn, without canceling the match. */
  def leaveTurn(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion): Request_[TurnBasedMatch]
  /** Returns turn-based matches the player is or was involved in. */
  def list(request: AnonAltConsistencyTokenFieldsIncludeMatchDataKey): Request_[TurnBasedMatchList]
  /**
    * Create a rematch of a match that was previously completed, with the same participants. This can be called by only one player on a match still in their
    * list; the player must have called Finish first. Returns the newly created match; it will be the caller's turn.
    */
  def rematch(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken): Request_[TurnBasedMatchRematch]
  /**
    * Returns turn-based matches the player is or was involved in that changed since the last sync call, with the least recent changes coming first. Matches
    * that should be removed from the local cache will have a status of MATCH_DELETED.
    */
  def sync(request: AnonAltConsistencyTokenFieldsIncludeMatchDataKey): Request_[TurnBasedMatchSync]
  /** Commit the results of a player turn. */
  def takeTurn(request: AnonAltConsistencyTokenFieldsKeyLanguageMatchId): Request_[TurnBasedMatch]
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(
    cancel: AnonAltConsistencyTokenFieldsKeyMatchId => Request_[Unit],
    create: AnonAltConsistencyTokenFieldsKey => Request_[TurnBasedMatch],
    decline: AnonAltConsistencyTokenFieldsKeyLanguageMatchId => Request_[TurnBasedMatch],
    dismiss: AnonAltConsistencyTokenFieldsKeyMatchId => Request_[Unit],
    finish: AnonAltConsistencyTokenFieldsKeyLanguageMatchId => Request_[TurnBasedMatch],
    get: AnonAltConsistencyTokenFieldsIncludeMatchData => Request_[TurnBasedMatch],
    join: AnonAltConsistencyTokenFieldsKeyLanguageMatchId => Request_[TurnBasedMatch],
    leave: AnonAltConsistencyTokenFieldsKeyLanguageMatchId => Request_[TurnBasedMatch],
    leaveTurn: AnonAltConsistencyTokenFieldsKeyLanguageMatchIdMatchVersion => Request_[TurnBasedMatch],
    list: AnonAltConsistencyTokenFieldsIncludeMatchDataKey => Request_[TurnBasedMatchList],
    rematch: AnonAltConsistencyTokenFieldsKeyLanguageMatchIdOauthtoken => Request_[TurnBasedMatchRematch],
    sync: AnonAltConsistencyTokenFieldsIncludeMatchDataKey => Request_[TurnBasedMatchSync],
    takeTurn: AnonAltConsistencyTokenFieldsKeyLanguageMatchId => Request_[TurnBasedMatch]
  ): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), finish = js.Any.fromFunction1(finish), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), leaveTurn = js.Any.fromFunction1(leaveTurn), list = js.Any.fromFunction1(list), rematch = js.Any.fromFunction1(rematch), sync = js.Any.fromFunction1(sync), takeTurn = js.Any.fromFunction1(takeTurn))
  
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
}

