package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesAchievementSetStepsAtLeast extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#GamesAchievementSetStepsAtLeast. */
  var kind: js.UndefOr[String] = js.undefined
  /** The minimum number of steps for the achievement to be set to. */
  var steps: js.UndefOr[Double] = js.undefined
}

object GamesAchievementSetStepsAtLeast {
  @scala.inline
  def apply(kind: String = null, steps: Int | Double = null): GamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamesAchievementSetStepsAtLeast]
  }
}

