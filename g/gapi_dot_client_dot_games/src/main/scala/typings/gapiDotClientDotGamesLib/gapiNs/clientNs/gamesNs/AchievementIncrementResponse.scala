package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementIncrementResponse extends js.Object {
  /** The current steps recorded for this incremental achievement. */
  var currentSteps: js.UndefOr[scala.Double] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementIncrementResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the current steps for the achievement has reached the number of steps required to unlock. */
  var newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object AchievementIncrementResponse {
  @scala.inline
  def apply(
    currentSteps: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined
  ): AchievementIncrementResponse = {
    val __obj = js.Dynamic.literal()
    if (currentSteps != null) __obj.updateDynamic("currentSteps")(currentSteps.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked)
    __obj.asInstanceOf[AchievementIncrementResponse]
  }
}

