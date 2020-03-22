package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAchievementId
import typings.gapiClientGames.AnonConsistencyToken
import typings.gapiClientGames.AnonFields
import typings.gapiClientGames.AnonKey
import typings.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: AnonAchievementId): Request_[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: AnonConsistencyToken): Request_[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: AnonFields): Request_[AchievementRevealResponse]
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: AnonKey): Request_[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: AnonFields): Request_[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: AnonOauthtoken): Request_[AchievementUpdateMultipleResponse]
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: AnonAchievementId => Request_[AchievementIncrementResponse],
    list: AnonConsistencyToken => Request_[PlayerAchievementListResponse],
    reveal: AnonFields => Request_[AchievementRevealResponse],
    setStepsAtLeast: AnonKey => Request_[AchievementSetStepsAtLeastResponse],
    unlock: AnonFields => Request_[AchievementUnlockResponse],
    updateMultiple: AnonOauthtoken => Request_[AchievementUpdateMultipleResponse]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment), list = js.Any.fromFunction1(list), reveal = js.Any.fromFunction1(reveal), setStepsAtLeast = js.Any.fromFunction1(setStepsAtLeast), unlock = js.Any.fromFunction1(unlock), updateMultiple = js.Any.fromFunction1(updateMultiple))
  
    __obj.asInstanceOf[AchievementsResource]
  }
}

