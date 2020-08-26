package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.Alt
import typings.gapiClientGamesmanagement.anon.LeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScoresResource extends js.Object {
  /**
    * Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: LeaderboardId): Request[PlayerScoreResetResponse] = js.native
  /**
    * Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: Alt): Request[PlayerScoreResetAllResponse] = js.native
  /** Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  /**
    * Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards can be reset.
    */
  def resetForAllPlayers(request: LeaderboardId): Request[Unit] = js.native
  /**
    * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only
    * draft leaderboards may be reset.
    */
  def resetMultipleForAllPlayers(request: Alt): Request[Unit] = js.native
}

object ScoresResource {
  @scala.inline
  def apply(
    reset: LeaderboardId => Request[PlayerScoreResetResponse],
    resetAll: Alt => Request[PlayerScoreResetAllResponse],
    resetAllForAllPlayers: Alt => Request[Unit],
    resetForAllPlayers: LeaderboardId => Request[Unit],
    resetMultipleForAllPlayers: Alt => Request[Unit]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[ScoresResource]
  }
  @scala.inline
  implicit class ScoresResourceOps[Self <: ScoresResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReset(value: LeaderboardId => Request[PlayerScoreResetResponse]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAll(value: Alt => Request[PlayerScoreResetAllResponse]): Self = this.set("resetAll", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAllForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetAllForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetForAllPlayers(value: LeaderboardId => Request[Unit]): Self = this.set("resetForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetMultipleForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetMultipleForAllPlayers", js.Any.fromFunction1(value))
  }
  
}

