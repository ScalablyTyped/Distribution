package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUpdateResponse extends js.Object {
  /** The achievement this update is was applied to. */
  var achievementId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var currentState: js.UndefOr[java.lang.String] = js.undefined
  /** The current steps recorded for this achievement if it is incremental. */
  var currentSteps: js.UndefOr[scala.Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the requested updates actually affected the achievement. */
  var updateOccurred: js.UndefOr[scala.Boolean] = js.undefined
}

object AchievementUpdateResponse {
  @scala.inline
  def apply(
    achievementId: java.lang.String = null,
    currentState: java.lang.String = null,
    currentSteps: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined,
    updateOccurred: js.UndefOr[scala.Boolean] = js.undefined
  ): AchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (achievementId != null) __obj.updateDynamic("achievementId")(achievementId)
    if (currentState != null) __obj.updateDynamic("currentState")(currentState)
    if (currentSteps != null) __obj.updateDynamic("currentSteps")(currentSteps.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked)
    if (!js.isUndefined(updateOccurred)) __obj.updateDynamic("updateOccurred")(updateOccurred)
    __obj.asInstanceOf[AchievementUpdateResponse]
  }
}

