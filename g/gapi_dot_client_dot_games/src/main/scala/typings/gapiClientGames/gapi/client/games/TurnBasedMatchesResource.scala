package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.IncludeMatchData
import typings.gapiClientGames.anon.Language
import typings.gapiClientGames.anon.MatchId
import typings.gapiClientGames.anon.MatchVersion
import typings.gapiClientGames.anon.MaxCompletedMatches
import typings.gapiClientGames.anon.RequestId
import typings.gapiClientGames.anon.UserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TurnBasedMatchesResource extends js.Object {
  /** Cancel a turn-based match. */
  def cancel(request: MatchId): Request[Unit]
  /** Create a turn-based match. */
  def create(request: Language): Request[TurnBasedMatch]
  /** Decline an invitation to play a turn-based match. */
  def decline(request: UserIp): Request[TurnBasedMatch]
  /** Dismiss a turn-based match from the match list. The match will no longer show up in the list and will not generate notifications. */
  def dismiss(request: MatchId): Request[Unit]
  /**
    * Finish a turn-based match. Each player should make this call once, after all results are in. Only the player whose turn it is may make the first call
    * to Finish, and can pass in the final match state.
    */
  def finish(request: UserIp): Request[TurnBasedMatch]
  /** Get the data for a turn-based match. */
  def get(request: IncludeMatchData): Request[TurnBasedMatch]
  /** Join a turn-based match. */
  def join(request: UserIp): Request[TurnBasedMatch]
  /** Leave a turn-based match when it is not the current player's turn, without canceling the match. */
  def leave(request: UserIp): Request[TurnBasedMatch]
  /** Leave a turn-based match during the current player's turn, without canceling the match. */
  def leaveTurn(request: MatchVersion): Request[TurnBasedMatch]
  /** Returns turn-based matches the player is or was involved in. */
  def list(request: MaxCompletedMatches): Request[TurnBasedMatchList]
  /**
    * Create a rematch of a match that was previously completed, with the same participants. This can be called by only one player on a match still in their
    * list; the player must have called Finish first. Returns the newly created match; it will be the caller's turn.
    */
  def rematch(request: RequestId): Request[TurnBasedMatchRematch]
  /**
    * Returns turn-based matches the player is or was involved in that changed since the last sync call, with the least recent changes coming first. Matches
    * that should be removed from the local cache will have a status of MATCH_DELETED.
    */
  def sync(request: MaxCompletedMatches): Request[TurnBasedMatchSync]
  /** Commit the results of a player turn. */
  def takeTurn(request: UserIp): Request[TurnBasedMatch]
}

object TurnBasedMatchesResource {
  @scala.inline
  def apply(
    cancel: MatchId => Request[Unit],
    create: Language => Request[TurnBasedMatch],
    decline: UserIp => Request[TurnBasedMatch],
    dismiss: MatchId => Request[Unit],
    finish: UserIp => Request[TurnBasedMatch],
    get: IncludeMatchData => Request[TurnBasedMatch],
    join: UserIp => Request[TurnBasedMatch],
    leave: UserIp => Request[TurnBasedMatch],
    leaveTurn: MatchVersion => Request[TurnBasedMatch],
    list: MaxCompletedMatches => Request[TurnBasedMatchList],
    rematch: RequestId => Request[TurnBasedMatchRematch],
    sync: MaxCompletedMatches => Request[TurnBasedMatchSync],
    takeTurn: UserIp => Request[TurnBasedMatch]
  ): TurnBasedMatchesResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), decline = js.Any.fromFunction1(decline), dismiss = js.Any.fromFunction1(dismiss), finish = js.Any.fromFunction1(finish), get = js.Any.fromFunction1(get), join = js.Any.fromFunction1(join), leave = js.Any.fromFunction1(leave), leaveTurn = js.Any.fromFunction1(leaveTurn), list = js.Any.fromFunction1(list), rematch = js.Any.fromFunction1(rematch), sync = js.Any.fromFunction1(sync), takeTurn = js.Any.fromFunction1(takeTurn))
    __obj.asInstanceOf[TurnBasedMatchesResource]
  }
}

