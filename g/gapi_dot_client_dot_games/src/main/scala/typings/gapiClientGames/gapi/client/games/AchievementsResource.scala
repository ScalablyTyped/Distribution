package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.AchievementId
import typings.gapiClientGames.anon.ConsistencyToken
import typings.gapiClientGames.anon.Fields
import typings.gapiClientGames.anon.Key
import typings.gapiClientGames.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementsResource extends js.Object {
  /** Increments the steps of the achievement with the given ID for the currently authenticated player. */
  def increment(request: AchievementId): Request[AchievementIncrementResponse]
  /** Lists the progress for all your application's achievements for the currently authenticated player. */
  def list(request: ConsistencyToken): Request[PlayerAchievementListResponse]
  /** Sets the state of the achievement with the given ID to REVEALED for the currently authenticated player. */
  def reveal(request: Fields): Request[AchievementRevealResponse]
  /**
    * Sets the steps for the currently authenticated player towards unlocking an achievement. If the steps parameter is less than the current number of steps
    * that the player already gained for the achievement, the achievement is not modified.
    */
  def setStepsAtLeast(request: Key): Request[AchievementSetStepsAtLeastResponse]
  /** Unlocks this achievement for the currently authenticated player. */
  def unlock(request: Fields): Request[AchievementUnlockResponse]
  /** Updates multiple achievements for the currently authenticated player. */
  def updateMultiple(request: Oauthtoken): Request[AchievementUpdateMultipleResponse]
}

object AchievementsResource {
  @scala.inline
  def apply(
    increment: AchievementId => Request[AchievementIncrementResponse],
    list: ConsistencyToken => Request[PlayerAchievementListResponse],
    reveal: Fields => Request[AchievementRevealResponse],
    setStepsAtLeast: Key => Request[AchievementSetStepsAtLeastResponse],
    unlock: Fields => Request[AchievementUnlockResponse],
    updateMultiple: Oauthtoken => Request[AchievementUpdateMultipleResponse]
  ): AchievementsResource = {
    val __obj = js.Dynamic.literal(increment = js.Any.fromFunction1(increment), list = js.Any.fromFunction1(list), reveal = js.Any.fromFunction1(reveal), setStepsAtLeast = js.Any.fromFunction1(setStepsAtLeast), unlock = js.Any.fromFunction1(unlock), updateMultiple = js.Any.fromFunction1(updateMultiple))
    __obj.asInstanceOf[AchievementsResource]
  }
}

