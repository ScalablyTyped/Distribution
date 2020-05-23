package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerAchievement extends js.Object {
  /**
    * The state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var achievementState: js.UndefOr[String] = js.undefined
  /** The current steps for an incremental achievement. */
  var currentSteps: js.UndefOr[Double] = js.undefined
  /**
    * Experience points earned for the achievement. This field is absent for achievements that have not yet been unlocked and 0 for achievements that have
    * been unlocked by testers but that are unpublished.
    */
  var experiencePoints: js.UndefOr[String] = js.undefined
  /** The current steps for an incremental achievement as a string. */
  var formattedCurrentStepsString: js.UndefOr[String] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerAchievement. */
  var kind: js.UndefOr[String] = js.undefined
  /** The timestamp of the last modification to this achievement's state. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.undefined
}

object PlayerAchievement {
  @scala.inline
  def apply(
    achievementState: String = null,
    currentSteps: js.UndefOr[Double] = js.undefined,
    experiencePoints: String = null,
    formattedCurrentStepsString: String = null,
    id: String = null,
    kind: String = null,
    lastUpdatedTimestamp: String = null
  ): PlayerAchievement = {
    val __obj = js.Dynamic.literal()
    if (achievementState != null) __obj.updateDynamic("achievementState")(achievementState.asInstanceOf[js.Any])
    if (!js.isUndefined(currentSteps)) __obj.updateDynamic("currentSteps")(currentSteps.get.asInstanceOf[js.Any])
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints.asInstanceOf[js.Any])
    if (formattedCurrentStepsString != null) __obj.updateDynamic("formattedCurrentStepsString")(formattedCurrentStepsString.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerAchievement]
  }
}

