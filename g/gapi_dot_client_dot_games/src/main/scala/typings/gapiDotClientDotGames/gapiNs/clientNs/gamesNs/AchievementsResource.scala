package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AchievementId
import typings.gapiDotClientDotGames.Anon_AchievementIdAlt
import typings.gapiDotClientDotGames.Anon_AchievementIdAltConsistencyToken
import typings.gapiDotClientDotGames.Anon_AltConsistencyToken
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: Anon_AchievementId): Request[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: Anon_AltConsistencyToken): Request[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: Anon_AchievementIdAlt): Request[AchievementRevealResponse]
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: Anon_AchievementIdAltConsistencyToken): Request[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: Anon_AchievementIdAlt): Request[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: Anon_AltConsistencyTokenFields): Request[AchievementUpdateMultipleResponse]
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: Anon_AchievementId => Request[AchievementIncrementResponse],
    list: Anon_AltConsistencyToken => Request[PlayerAchievementListResponse],
    reveal: Anon_AchievementIdAlt => Request[AchievementRevealResponse],
    setStepsAtLeast: Anon_AchievementIdAltConsistencyToken => Request[AchievementSetStepsAtLeastResponse],
    unlock: Anon_AchievementIdAlt => Request[AchievementUnlockResponse],
    updateMultiple: Anon_AltConsistencyTokenFields => Request[AchievementUpdateMultipleResponse]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment), list = js.Any.fromFunction1(list), reveal = js.Any.fromFunction1(reveal), setStepsAtLeast = js.Any.fromFunction1(setStepsAtLeast), unlock = js.Any.fromFunction1(unlock), updateMultiple = js.Any.fromFunction1(updateMultiple))
  
    __obj.asInstanceOf[AchievementsResource]
  }
}

