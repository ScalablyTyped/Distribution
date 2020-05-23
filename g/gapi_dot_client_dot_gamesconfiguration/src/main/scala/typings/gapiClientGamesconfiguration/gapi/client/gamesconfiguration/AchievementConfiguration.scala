package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfiguration extends js.Object {
  /**
    * The type of the achievement.
    * Possible values are:
    * - "STANDARD" - Achievement is either locked or unlocked.
    * - "INCREMENTAL" - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.undefined
  /** The draft data of the achievement. */
  var draft: js.UndefOr[AchievementConfigurationDetail] = js.undefined
  /** The ID of the achievement. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The initial state of the achievement.
    * Possible values are:
    * - "HIDDEN" - Achievement is hidden.
    * - "REVEALED" - Achievement is revealed.
    * - "UNLOCKED" - Achievement is unlocked.
    */
  var initialState: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfiguration. */
  var kind: js.UndefOr[String] = js.undefined
  /** The read-only published data of the achievement. */
  var published: js.UndefOr[AchievementConfigurationDetail] = js.undefined
  /** Steps to unlock. Only applicable to incremental achievements. */
  var stepsToUnlock: js.UndefOr[Double] = js.undefined
  /** The token for this resource. */
  var token: js.UndefOr[String] = js.undefined
}

object AchievementConfiguration {
  @scala.inline
  def apply(
    achievementType: String = null,
    draft: AchievementConfigurationDetail = null,
    id: String = null,
    initialState: String = null,
    kind: String = null,
    published: AchievementConfigurationDetail = null,
    stepsToUnlock: js.UndefOr[Double] = js.undefined,
    token: String = null
  ): AchievementConfiguration = {
    val __obj = js.Dynamic.literal()
    if (achievementType != null) __obj.updateDynamic("achievementType")(achievementType.asInstanceOf[js.Any])
    if (draft != null) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (!js.isUndefined(stepsToUnlock)) __obj.updateDynamic("stepsToUnlock")(stepsToUnlock.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievementConfiguration]
  }
}

