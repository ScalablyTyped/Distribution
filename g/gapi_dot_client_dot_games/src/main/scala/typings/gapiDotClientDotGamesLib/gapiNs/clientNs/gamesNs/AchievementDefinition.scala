package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinition extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[java.lang.String] = js.undefined
  /** The description of the achievement. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Experience points which will be earned when unlocking this achievement. */
  var experiencePoints: js.UndefOr[java.lang.String] = js.undefined
  /** The total steps for an incremental achievement as a string. */
  var formattedTotalSteps: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the revealed icon image being returned is a default image, or is provided by the game. */
  var isRevealedIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the unlocked icon image being returned is a default image, or is game-provided. */
  var isUnlockedIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementDefinition. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the achievement. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The image URL for the revealed achievement icon. */
  var revealedIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The total steps for an incremental achievement. */
  var totalSteps: js.UndefOr[scala.Double] = js.undefined
  /** The image URL for the unlocked achievement icon. */
  var unlockedIconUrl: js.UndefOr[java.lang.String] = js.undefined
}

object AchievementDefinition {
  @scala.inline
  def apply(
    achievementType: java.lang.String = null,
    description: java.lang.String = null,
    experiencePoints: java.lang.String = null,
    formattedTotalSteps: java.lang.String = null,
    id: java.lang.String = null,
    initialState: java.lang.String = null,
    isRevealedIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined,
    isUnlockedIconUrlDefault: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    revealedIconUrl: java.lang.String = null,
    totalSteps: scala.Int | scala.Double = null,
    unlockedIconUrl: java.lang.String = null
  ): AchievementDefinition = {
    val __obj = js.Dynamic.literal()
    if (achievementType != null) __obj.updateDynamic("achievementType")(achievementType)
    if (description != null) __obj.updateDynamic("description")(description)
    if (experiencePoints != null) __obj.updateDynamic("experiencePoints")(experiencePoints)
    if (formattedTotalSteps != null) __obj.updateDynamic("formattedTotalSteps")(formattedTotalSteps)
    if (id != null) __obj.updateDynamic("id")(id)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (!js.isUndefined(isRevealedIconUrlDefault)) __obj.updateDynamic("isRevealedIconUrlDefault")(isRevealedIconUrlDefault)
    if (!js.isUndefined(isUnlockedIconUrlDefault)) __obj.updateDynamic("isUnlockedIconUrlDefault")(isUnlockedIconUrlDefault)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (revealedIconUrl != null) __obj.updateDynamic("revealedIconUrl")(revealedIconUrl)
    if (totalSteps != null) __obj.updateDynamic("totalSteps")(totalSteps.asInstanceOf[js.Any])
    if (unlockedIconUrl != null) __obj.updateDynamic("unlockedIconUrl")(unlockedIconUrl)
    __obj.asInstanceOf[AchievementDefinition]
  }
}

