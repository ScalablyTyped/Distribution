package typings.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfigurationDetail extends js.Object {
  /** The icon url of this leaderboard. Writes to this field are ignored. */
  var iconUrl: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#leaderboardConfigurationDetail. */
  var kind: js.UndefOr[String] = js.undefined
  /** Localized strings for the leaderboard name. */
  var name: js.UndefOr[LocalizedStringBundle] = js.undefined
  /** The score formatting for the leaderboard. */
  var scoreFormat: js.UndefOr[GamesNumberFormatConfiguration] = js.undefined
  /** The sort rank of this leaderboard. Writes to this field are ignored. */
  var sortRank: js.UndefOr[Double] = js.undefined
}

object LeaderboardConfigurationDetail {
  @scala.inline
  def apply(
    iconUrl: String = null,
    kind: String = null,
    name: LocalizedStringBundle = null,
    scoreFormat: GamesNumberFormatConfiguration = null,
    sortRank: Int | Double = null
  ): LeaderboardConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scoreFormat != null) __obj.updateDynamic("scoreFormat")(scoreFormat.asInstanceOf[js.Any])
    if (sortRank != null) __obj.updateDynamic("sortRank")(sortRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardConfigurationDetail]
  }
}

