package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /**
    * Resets the achievement with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def reset(request: gapiDotClientDotGamesmanagementLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[AchievementResetResponse]
  /**
    * Resets all achievements for the currently authenticated player for your application. This method is only accessible to whitelisted tester accounts for
    * your application.
    */
  def resetAll(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[AchievementResetAllResponse]
  /** Resets all draft achievements for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Resets the achievement with the given ID for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements can be reset.
    */
  def resetForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Resets achievements with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft
    * achievements may be reset.
    */
  def resetMultipleForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object AchievementsResource {
  @scala.inline
  def apply(
    reset: gapiDotClientDotGamesmanagementLib.Anon_AchievementId => gapiDotClientLib.gapiNs.clientNs.Request[AchievementResetResponse],
    resetAll: gapiDotClientDotGamesmanagementLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[AchievementResetAllResponse],
    resetAllForAllPlayers: gapiDotClientDotGamesmanagementLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    resetForAllPlayers: gapiDotClientDotGamesmanagementLib.Anon_AchievementId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    resetMultipleForAllPlayers: gapiDotClientDotGamesmanagementLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[AchievementsResource]
  }
}

