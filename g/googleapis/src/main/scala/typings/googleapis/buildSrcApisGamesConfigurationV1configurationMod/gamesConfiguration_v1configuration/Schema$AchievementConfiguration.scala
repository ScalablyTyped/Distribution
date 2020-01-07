package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement configuration resource.
  */
@js.native
trait Schema$AchievementConfiguration extends js.Object {
  /**
    * The type of the achievement. Possible values are:   -
    * &quot;STANDARD&quot; - Achievement is either locked or unlocked.  -
    * &quot;INCREMENTAL&quot; - Achievement is incremental.
    */
  var achievementType: js.UndefOr[String] = js.native
  /**
    * The draft data of the achievement.
    */
  var draft: js.UndefOr[Schema$AchievementConfigurationDetail] = js.native
  /**
    * The ID of the achievement.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The initial state of the achievement. Possible values are:   -
    * &quot;HIDDEN&quot; - Achievement is hidden.  - &quot;REVEALED&quot; -
    * Achievement is revealed.  - &quot;UNLOCKED&quot; - Achievement is
    * unlocked.
    */
  var initialState: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#achievementConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The read-only published data of the achievement.
    */
  var published: js.UndefOr[Schema$AchievementConfigurationDetail] = js.native
  /**
    * Steps to unlock. Only applicable to incremental achievements.
    */
  var stepsToUnlock: js.UndefOr[Double] = js.native
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.native
}

object Schema$AchievementConfiguration {
  @scala.inline
  def apply(
    achievementType: String = null,
    draft: Schema$AchievementConfigurationDetail = null,
    id: String = null,
    initialState: String = null,
    kind: String = null,
    published: Schema$AchievementConfigurationDetail = null,
    stepsToUnlock: Int | Double = null,
    token: String = null
  ): Schema$AchievementConfiguration = {
    val __obj = js.Dynamic.literal()
    if (achievementType != null) __obj.updateDynamic("achievementType")(achievementType.asInstanceOf[js.Any])
    if (draft != null) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (stepsToUnlock != null) __obj.updateDynamic("stepsToUnlock")(stepsToUnlock.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementConfiguration]
  }
}

