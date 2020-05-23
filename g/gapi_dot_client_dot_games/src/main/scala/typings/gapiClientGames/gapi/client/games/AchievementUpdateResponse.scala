package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUpdateResponse extends js.Object {
  /** The achievement this update is was applied to. */
  var achievementId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[String] = js.undefined
  /** The current steps recorded for this achievement if it is incremental. */
  var currentSteps: js.UndefOr[Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[Boolean] = js.undefined
  /** Whether the requested updates actually affected the achievement. */
  var updateOccurred: js.UndefOr[Boolean] = js.undefined
}

object AchievementUpdateResponse {
  @scala.inline
  def apply(
    achievementId: String = null,
    currentState: String = null,
    currentSteps: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    newlyUnlocked: js.UndefOr[Boolean] = js.undefined,
    updateOccurred: js.UndefOr[Boolean] = js.undefined
  ): AchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (achievementId != null) __obj.updateDynamic("achievementId")(achievementId.asInstanceOf[js.Any])
    if (currentState != null) __obj.updateDynamic("currentState")(currentState.asInstanceOf[js.Any])
    if (!js.isUndefined(currentSteps)) __obj.updateDynamic("currentSteps")(currentSteps.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOccurred)) __obj.updateDynamic("updateOccurred")(updateOccurred.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievementUpdateResponse]
  }
}

