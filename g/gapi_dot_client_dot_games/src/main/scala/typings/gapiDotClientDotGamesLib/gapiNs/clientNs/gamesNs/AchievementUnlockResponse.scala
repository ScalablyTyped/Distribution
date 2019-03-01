package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUnlockResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUnlockResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined
}

object AchievementUnlockResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, newlyUnlocked: js.UndefOr[scala.Boolean] = js.undefined): AchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked)
    __obj.asInstanceOf[AchievementUnlockResponse]
  }
}

