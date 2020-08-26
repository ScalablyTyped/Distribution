package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGamesmanagement.anon.AchievementId
import typings.gapiClientGamesmanagement.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementsResource extends js.Object {
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: AchievementId): Request[AchievementResetResponse] = js.native
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for
    * your application.
    */
  def resetAll(request: Alt): Request[AchievementResetAllResponse] = js.native
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Alt): Request[Unit] = js.native
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements can be reset.
    */
  def resetForAllPlayers(request: AchievementId): Request[Unit] = js.native
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    */
  def resetMultipleForAllPlayers(request: Alt): Request[Unit] = js.native
}

object AchievementsResource {
  @scala.inline
  def apply(
    reset: AchievementId => Request[AchievementResetResponse],
    resetAll: Alt => Request[AchievementResetAllResponse],
    resetAllForAllPlayers: Alt => Request[Unit],
    resetForAllPlayers: AchievementId => Request[Unit],
    resetMultipleForAllPlayers: Alt => Request[Unit]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
    __obj.asInstanceOf[AchievementsResource]
  }
  @scala.inline
  implicit class AchievementsResourceOps[Self <: AchievementsResource] (val x: Self) extends AnyVal {
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
    def setReset(value: AchievementId => Request[AchievementResetResponse]): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAll(value: Alt => Request[AchievementResetAllResponse]): Self = this.set("resetAll", js.Any.fromFunction1(value))
    @scala.inline
    def setResetAllForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetAllForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetForAllPlayers(value: AchievementId => Request[Unit]): Self = this.set("resetForAllPlayers", js.Any.fromFunction1(value))
    @scala.inline
    def setResetMultipleForAllPlayers(value: Alt => Request[Unit]): Self = this.set("resetMultipleForAllPlayers", js.Any.fromFunction1(value))
  }
  
}

