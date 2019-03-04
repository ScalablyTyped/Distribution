package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: gapiDotClientDotGamesLib.Anon_AchievementId): gapiDotClientLib.gapiNs.clientNs.Request[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: gapiDotClientDotGamesLib.Anon_AltConsistencyToken): gapiDotClientLib.gapiNs.clientNs.Request[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: gapiDotClientDotGamesLib.Anon_AchievementIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[AchievementRevealResponse]
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: gapiDotClientDotGamesLib.Anon_AchievementIdAltConsistencyToken): gapiDotClientLib.gapiNs.clientNs.Request[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: gapiDotClientDotGamesLib.Anon_AchievementIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields): gapiDotClientLib.gapiNs.clientNs.Request[AchievementUpdateMultipleResponse]
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: js.Function1[
      gapiDotClientDotGamesLib.Anon_AchievementId, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementIncrementResponse]
    ],
    list: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyToken, 
      gapiDotClientLib.gapiNs.clientNs.Request[PlayerAchievementListResponse]
    ],
    reveal: js.Function1[
      gapiDotClientDotGamesLib.Anon_AchievementIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementRevealResponse]
    ],
    setStepsAtLeast: js.Function1[
      gapiDotClientDotGamesLib.Anon_AchievementIdAltConsistencyToken, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementSetStepsAtLeastResponse]
    ],
    unlock: js.Function1[
      gapiDotClientDotGamesLib.Anon_AchievementIdAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementUnlockResponse]
    ],
    updateMultiple: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[AchievementUpdateMultipleResponse]
    ]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(increment = increment, list = list, reveal = reveal, setStepsAtLeast = setStepsAtLeast, unlock = unlock, updateMultiple = updateMultiple)
  
    __obj.asInstanceOf[AchievementsResource]
  }
}

