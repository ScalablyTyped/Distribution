package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement object.
  */
@js.native
trait Schema$PlayerAchievement extends js.Object {
  /**
    * The state of the achievement. Possible values are:   - &quot;HIDDEN&quot;
    * - Achievement is hidden.  - &quot;REVEALED&quot; - Achievement is
    * revealed.  - &quot;UNLOCKED&quot; - Achievement is unlocked.
    */
  var achievementState: js.UndefOr[String] = js.native
  /**
    * The current steps for an incremental achievement.
    */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Experience points earned for the achievement. This field is absent for
    * achievements that have not yet been unlocked and 0 for achievements that
    * have been unlocked by testers but that are unpublished.
    */
  var experiencePoints: js.UndefOr[String] = js.native
  /**
    * The current steps for an incremental achievement as a string.
    */
  var formattedCurrentStepsString: js.UndefOr[String] = js.native
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerAchievement.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp of the last modification to this achievement&#39;s state.
    */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
}

object Schema$PlayerAchievement {
  @scala.inline
  def apply(
    achievementState: String = null,
    currentSteps: Int | Double = null,
    experiencePoints: String = null,
    formattedCurrentStepsString: String = null,
    id: String = null,
    kind: String = null,
    lastUpdatedTimestamp: String = null
  ): Schema$PlayerAchievement = {
    val __obj = js.Dynamic.literal()
    if (achievementState != null) __obj.updateDynamic("achievementState")(achievementState.asInstanceOf[js.Any])
    if (currentSteps != null) __obj.updateDynamic("currentSteps")(currentSteps.asInstanceOf[js.Any])
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints.asInstanceOf[js.Any])
    if (formattedCurrentStepsString != null) __obj.updateDynamic("formattedCurrentStepsString")(formattedCurrentStepsString.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerAchievement]
  }
}

