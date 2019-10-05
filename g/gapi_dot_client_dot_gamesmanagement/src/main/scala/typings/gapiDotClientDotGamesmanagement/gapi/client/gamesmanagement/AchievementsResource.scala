package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGamesmanagement.Anon_AchievementId
import typings.gapiDotClientDotGamesmanagement.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: Anon_AchievementId): Request[AchievementResetResponse]
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for
    * your application.
    */
  def resetAll(request: Anon_Alt): Request[AchievementResetAllResponse]
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: Anon_Alt): Request[Unit]
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements can be reset.
    */
  def resetForAllPlayers(request: Anon_AchievementId): Request[Unit]
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    */
  def resetMultipleForAllPlayers(request: Anon_Alt): Request[Unit]
}

object AchievementsResource {
  @scala.inline
  def apply(
    reset: Anon_AchievementId => Request[AchievementResetResponse],
    resetAll: Anon_Alt => Request[AchievementResetAllResponse],
    resetAllForAllPlayers: Anon_Alt => Request[Unit],
    resetForAllPlayers: Anon_AchievementId => Request[Unit],
    resetMultipleForAllPlayers: Anon_Alt => Request[Unit]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[AchievementsResource]
  }
}

