package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement set steps at least response.
  */
@js.native
trait Schema$AchievementSetStepsAtLeastResponse extends js.Object {
  /**
    * The current steps recorded for this incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementSetStepsAtLeastResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether the the current steps for the achievement has reached the number
    * of steps required to unlock.
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}

object Schema$AchievementSetStepsAtLeastResponse {
  @scala.inline
  def apply(
    currentSteps: Int | Double = null,
    kind: String = null,
    newlyUnlocked: js.UndefOr[Boolean] = js.undefined
  ): Schema$AchievementSetStepsAtLeastResponse = {
    val __obj = js.Dynamic.literal()
    if (currentSteps != null) __obj.updateDynamic("currentSteps")(currentSteps.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementSetStepsAtLeastResponse]
  }
}

