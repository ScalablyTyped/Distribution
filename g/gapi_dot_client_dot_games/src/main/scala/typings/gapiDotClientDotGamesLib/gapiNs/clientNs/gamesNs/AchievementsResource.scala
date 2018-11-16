package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: gapiDotClientDotGamesLib.Anon_StepsToIncrement): gapiDotClientLib.gapiNs.clientNs.Request[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenState): gapiDotClientLib.gapiNs.clientNs.Request[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[AchievementRevealResponse]
  /**
               * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
               * that the player already gained for the achievement, the achievement is not modified.
               */
  def setStepsAtLeast(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[AchievementUpdateMultipleResponse]
}

