package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUnlockResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUnlockResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Whether this achievement was newly unlocked (that is, whether the unlock request for the achievement was the first for the player). */
  var newlyUnlocked: js.UndefOr[Boolean] = js.undefined
}

object AchievementUnlockResponse {
  @scala.inline
  def apply(kind: String = null, newlyUnlocked: js.UndefOr[Boolean] = js.undefined): AchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievementUnlockResponse]
  }
}

