package typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGamesmanagement.Anon_Alt
import typings.gapiDotClientDotGamesmanagement.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: Anon_AltFieldsKey): Request[PlayerScoreResetResponse]
  /**
    * Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: Anon_Alt): Request[PlayerScoreResetAllResponse]
  /** Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Anon_Alt): Request[Unit]
  /**
    * Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards can be reset.
    */
  def resetForAllPlayers(request: Anon_AltFieldsKey): Request[Unit]
  /**
    * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards may be reset.
    */
  def resetMultipleForAllPlayers(request: Anon_Alt): Request[Unit]
}

object ScoresResource {
  @scala.inline
  def apply(
    reset: Anon_AltFieldsKey => Request[PlayerScoreResetResponse],
    resetAll: Anon_Alt => Request[PlayerScoreResetAllResponse],
    resetAllForAllPlayers: Anon_Alt => Request[Unit],
    resetForAllPlayers: Anon_AltFieldsKey => Request[Unit],
    resetMultipleForAllPlayers: Anon_Alt => Request[Unit]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[ScoresResource]
  }
}

