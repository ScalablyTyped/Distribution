package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievementDefinition extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  /** The description of the achievement. */
  var description: js.UndefOr[String] = js.native
  /** Experience points which will be earned when unlocking this achievement. */
  var experiencePoints: js.UndefOr[String] = js.native
  /** The total steps for an incremental achievement as a string. */
  var formattedTotalSteps: js.UndefOr[String] = js.native
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[String] = js.native
  /** Indicates whether the revealed icon image being returned is a default image, or is provided by the game. */
  var isRevealedIconUrlDefault: js.UndefOr[Boolean] = js.native
  /** Indicates whether the unlocked icon image being returned is a default image, or is game-provided. */
  var isUnlockedIconUrlDefault: js.UndefOr[Boolean] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementDefinition. */
  var kind: js.UndefOr[String] = js.native
  /** The name of the achievement. */
  var name: js.UndefOr[String] = js.native
  /** The image URL for the revealed achievement icon. */
  var revealedIconUrl: js.UndefOr[String] = js.native
  /** The total steps for an incremental achievement. */
  var totalSteps: js.UndefOr[Double] = js.native
  /** The image URL for the unlocked achievement icon. */
  var unlockedIconUrl: js.UndefOr[String] = js.native
}

object AchievementDefinition {
  @scala.inline
  def apply(): AchievementDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AchievementDefinition]
  }
  @scala.inline
  implicit class AchievementDefinitionOps[Self <: AchievementDefinition] (val x: Self) extends AnyVal {
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
    def setAchievementType(value: String): Self = this.set("achievementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchievementType: Self = this.set("achievementType", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExperiencePoints(value: String): Self = this.set("experiencePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperiencePoints: Self = this.set("experiencePoints", js.undefined)
    @scala.inline
    def setFormattedTotalSteps(value: String): Self = this.set("formattedTotalSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedTotalSteps: Self = this.set("formattedTotalSteps", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInitialState(value: String): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setIsRevealedIconUrlDefault(value: Boolean): Self = this.set("isRevealedIconUrlDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRevealedIconUrlDefault: Self = this.set("isRevealedIconUrlDefault", js.undefined)
    @scala.inline
    def setIsUnlockedIconUrlDefault(value: Boolean): Self = this.set("isUnlockedIconUrlDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUnlockedIconUrlDefault: Self = this.set("isUnlockedIconUrlDefault", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRevealedIconUrl(value: String): Self = this.set("revealedIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevealedIconUrl: Self = this.set("revealedIconUrl", js.undefined)
    @scala.inline
    def setTotalSteps(value: Double): Self = this.set("totalSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalSteps: Self = this.set("totalSteps", js.undefined)
    @scala.inline
    def setUnlockedIconUrl(value: String): Self = this.set("unlockedIconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlockedIconUrl: Self = this.set("unlockedIconUrl", js.undefined)
  }
  
}

