package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement update response.
  */
@js.native
trait Schema$AchievementUpdateResponse extends js.Object {
  /**
    * The achievement this update is was applied to.
    */
  var achievementId: js.UndefOr[String] = js.native
  /**
    * The current state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var currentState: js.UndefOr[String] = js.native
  /**
    * The current steps recorded for this achievement if it is incremental.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Whether this achievement was newly unlocked (that is, whether the unlock
    * request for the achievement was the first for the player).
    */
  var newlyUnlocked: js.UndefOr[Boolean] = js.native
  /**
    * Whether the requested updates actually affected the achievement.
    */
  var updateOccurred: js.UndefOr[Boolean] = js.native
}

object Schema$AchievementUpdateResponse {
  @scala.inline
  def apply(
    achievementId: String = null,
    currentState: String = null,
    currentSteps: Int | Double = null,
    kind: String = null,
    newlyUnlocked: js.UndefOr[Boolean] = js.undefined,
    updateOccurred: js.UndefOr[Boolean] = js.undefined
  ): Schema$AchievementUpdateResponse = {
    val __obj = js.Dynamic.literal()
    if (achievementId != null) __obj.updateDynamic("achievementId")(achievementId.asInstanceOf[js.Any])
    if (currentState != null) __obj.updateDynamic("currentState")(currentState.asInstanceOf[js.Any])
    if (currentSteps != null) __obj.updateDynamic("currentSteps")(currentSteps.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(newlyUnlocked)) __obj.updateDynamic("newlyUnlocked")(newlyUnlocked.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOccurred)) __obj.updateDynamic("updateOccurred")(updateOccurred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementUpdateResponse]
  }
}

