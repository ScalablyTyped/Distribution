package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an achievement configuration detail.
  */
@js.native
trait Schema$AchievementConfigurationDetail extends js.Object {
  /**
    * Localized strings for the achievement description.
    */
  var description: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * The icon url of this achievement. Writes to this field are ignored.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#achievementConfigurationDetail.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localized strings for the achievement name.
    */
  var name: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * Point value for the achievement.
    */
  var pointValue: js.UndefOr[Double] = js.native
  /**
    * The sort rank of this achievement. Writes to this field are ignored.
    */
  var sortRank: js.UndefOr[Double] = js.native
}

object Schema$AchievementConfigurationDetail {
  @scala.inline
  def apply(
    description: Schema$LocalizedStringBundle = null,
    iconUrl: String = null,
    kind: String = null,
    name: Schema$LocalizedStringBundle = null,
    pointValue: Int | Double = null,
    sortRank: Int | Double = null
  ): Schema$AchievementConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointValue != null) __obj.updateDynamic("pointValue")(pointValue.asInstanceOf[js.Any])
    if (sortRank != null) __obj.updateDynamic("sortRank")(sortRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementConfigurationDetail]
  }
}

