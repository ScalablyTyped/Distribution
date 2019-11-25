package typings.gapiDotClientDotGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationDetail extends js.Object {
  /** Localized strings for the achievement description. */
  var description: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** The icon url of this achievement. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#achievementConfigurationDetail. */
  var kind: js.UndefOr[String] = js.undefined
  /** Localized strings for the achievement name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** Point value for the achievement. */
  var pointValue: js.UndefOr[Double] = js.undefined
  /** The sort rank of this achievement. Writes to this field are ignored. */
  var sortRank: js.UndefOr[Double] = js.undefined
}

object AchievementConfigurationDetail {
  @scala.inline
  def apply(
    description: LocalizedStringBundle = null,
    iconUrl: String = null,
    kind: String = null,
    name: LocalizedStringBundle = null,
    pointValue: Int | Double = null,
    sortRank: Int | Double = null
  ): AchievementConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointValue != null) __obj.updateDynamic("pointValue")(pointValue.asInstanceOf[js.Any])
    if (sortRank != null) __obj.updateDynamic("sortRank")(sortRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievementConfigurationDetail]
  }
}

