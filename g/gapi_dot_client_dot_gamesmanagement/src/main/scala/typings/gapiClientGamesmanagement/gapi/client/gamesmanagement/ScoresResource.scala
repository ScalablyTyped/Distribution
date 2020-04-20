package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGamesmanagement.AnonAlt
import typings.gapiClientGamesmanagement.AnonLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: AnonLeaderboardId): Request_[PlayerScoreResetResponse]
  /**
    * Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: AnonAlt): Request_[PlayerScoreResetAllResponse]
  /** Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: AnonAlt): Request_[Unit]
  /**
    * Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards can be reset.
    */
  def resetForAllPlayers(request: AnonLeaderboardId): Request_[Unit]
  /**
    * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards may be reset.
    */
  def resetMultipleForAllPlayers(request: AnonAlt): Request_[Unit]
}

object ScoresResource {
  @scala.inline
  def apply(
    reset: AnonLeaderboardId => Request_[PlayerScoreResetResponse],
    resetAll: AnonAlt => Request_[PlayerScoreResetAllResponse],
    resetAllForAllPlayers: AnonAlt => Request_[Unit],
    resetForAllPlayers: AnonLeaderboardId => Request_[Unit],
    resetMultipleForAllPlayers: AnonAlt => Request_[Unit]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[ScoresResource]
  }
}

