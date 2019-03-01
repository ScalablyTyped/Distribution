package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GamesAchievementSetStepsAtLeast extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#GamesAchievementSetStepsAtLeast. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The minimum number of steps for the achievement to be set to. */
  var steps: js.UndefOr[scala.Double] = js.undefined
}

object GamesAchievementSetStepsAtLeast {
  @scala.inline
  def apply(kind: java.lang.String = null, steps: scala.Int | scala.Double = null): GamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamesAchievementSetStepsAtLeast]
  }
}

