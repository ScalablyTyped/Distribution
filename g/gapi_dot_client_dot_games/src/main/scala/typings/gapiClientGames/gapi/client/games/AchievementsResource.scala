package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAchievementId
import typings.gapiClientGames.AnonAchievementIdAlt
import typings.gapiClientGames.AnonAchievementIdAltConsistencyToken
import typings.gapiClientGames.AnonAltConsistencyToken
import typings.gapiClientGames.AnonAltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: AnonAchievementId): Request_[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: AnonAltConsistencyToken): Request_[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: AnonAchievementIdAlt): Request_[AchievementRevealResponse]
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: AnonAchievementIdAltConsistencyToken): Request_[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: AnonAchievementIdAlt): Request_[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: AnonAltConsistencyTokenFields): Request_[AchievementUpdateMultipleResponse]
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: AnonAchievementId => Request_[AchievementIncrementResponse],
    list: AnonAltConsistencyToken => Request_[PlayerAchievementListResponse],
    reveal: AnonAchievementIdAlt => Request_[AchievementRevealResponse],
    setStepsAtLeast: AnonAchievementIdAltConsistencyToken => Request_[AchievementSetStepsAtLeastResponse],
    unlock: AnonAchievementIdAlt => Request_[AchievementUnlockResponse],
    updateMultiple: AnonAltConsistencyTokenFields => Request_[AchievementUpdateMultipleResponse]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment), list = js.Any.fromFunction1(list), reveal = js.Any.fromFunction1(reveal), setStepsAtLeast = js.Any.fromFunction1(setStepsAtLeast), unlock = js.Any.fromFunction1(unlock), updateMultiple = js.Any.fromFunction1(updateMultiple))
  
    __obj.asInstanceOf[AchievementsResource]
  }
}

