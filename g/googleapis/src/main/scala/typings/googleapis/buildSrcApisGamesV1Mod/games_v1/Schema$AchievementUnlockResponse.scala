package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement unlock response
  */
@js.native
trait Schema$AchievementUnlockResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUnlockResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock
    * request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
}

object Schema$AchievementUnlockResponse {
  @scala.inline
  def apply(kind: String = null, newlyUnlocked: js.UndefOr[Boolean] = js.undefined): Schema$AchievementUnlockResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementUnlockResponse]
  }
}

