package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerAchievement extends js.Object {
  /**
    * The state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var achievementState: js.UndefOr[String] = js.native
  /** The current steps for an incremental achievement. */
  var currentSteps: js.UndefOr[Double] = js.native
  /**
    * Experience points earned for the achievement. This field is absent for achievements that have not yet been unlocked and 0 for achievements that have
    * been unlocked by testers but that are unpublished.
    */
  var experiencePoints: js.UndefOr[String] = js.native
  /** The current steps for an incremental achievement as a string. */
  var formattedCurrentStepsString: js.UndefOr[String] = js.native
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerAchievement. */
  var kind: js.UndefOr[String] = js.native
  /** The timestamp of the last modification to this achievement's state. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
}

object PlayerAchievement {
  @scala.inline
  def apply(): PlayerAchievement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerAchievement]
  }
  @scala.inline
  implicit class PlayerAchievementOps[Self <: PlayerAchievement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAchievementState(value: String): Self = this.set("achievementState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchievementState: Self = this.set("achievementState", js.undefined)
    @scala.inline
    def setCurrentSteps(value: Double): Self = this.set("currentSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSteps: Self = this.set("currentSteps", js.undefined)
    @scala.inline
    def setExperiencePoints(value: String): Self = this.set("experiencePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperiencePoints: Self = this.set("experiencePoints", js.undefined)
    @scala.inline
    def setFormattedCurrentStepsString(value: String): Self = this.set("formattedCurrentStepsString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedCurrentStepsString: Self = this.set("formattedCurrentStepsString", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = this.set("lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("lastUpdatedTimestamp", js.undefined)
  }
  
}

