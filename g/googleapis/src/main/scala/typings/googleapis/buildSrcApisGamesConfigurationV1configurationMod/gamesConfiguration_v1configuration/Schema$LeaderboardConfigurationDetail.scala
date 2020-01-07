package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a leaderboard configuration detail.
  */
@js.native
trait Schema$LeaderboardConfigurationDetail extends js.Object {
  /**
    * The icon url of this leaderboard. Writes to this field are ignored.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfigurationDetail.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Localized strings for the leaderboard name.
    */
  var name: js.UndefOr[Schema$LocalizedStringBundle] = js.native
  /**
    * The score formatting for the leaderboard.
    */
  var scoreFormat: js.UndefOr[Schema$GamesNumberFormatConfiguration] = js.native
  /**
    * The sort rank of this leaderboard. Writes to this field are ignored.
    */
  var sortRank: js.UndefOr[Double] = js.native
}

object Schema$LeaderboardConfigurationDetail {
  @scala.inline
  def apply(
    iconUrl: String = null,
    kind: String = null,
    name: Schema$LocalizedStringBundle = null,
    scoreFormat: Schema$GamesNumberFormatConfiguration = null,
    sortRank: Int | Double = null
  ): Schema$LeaderboardConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scoreFormat != null) __obj.updateDynamic("scoreFormat")(scoreFormat.asInstanceOf[js.Any])
    if (sortRank != null) __obj.updateDynamic("sortRank")(sortRank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LeaderboardConfigurationDetail]
  }
}

