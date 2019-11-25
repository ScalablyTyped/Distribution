package typings.gapiDotClientDotGamesconfiguration.gapi.client.gamesconfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardConfiguration extends js.Object {
  /** The draft data of the leaderboard. */
  var draft: js.UndefOr[LeaderboardConfigurationDetail] = js.undefined
  /** The ID of the leaderboard. */
  var id: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesConfiguration#leaderboardConfiguration. */
  var kind: js.UndefOr[String] = js.undefined
  /** The read-only published data of the leaderboard. */
  var published: js.UndefOr[LeaderboardConfigurationDetail] = js.undefined
  /** Maximum score that can be posted to this leaderboard. */
  var scoreMax: js.UndefOr[String] = js.undefined
  /** Minimum score that can be posted to this leaderboard. */
  var scoreMin: js.UndefOr[String] = js.undefined
  /**
    * The type of the leaderboard.
    * Possible values are:
    * - "LARGER_IS_BETTER" - Larger scores posted are ranked higher.
    * - "SMALLER_IS_BETTER" - Smaller scores posted are ranked higher.
    */
  var scoreOrder: js.UndefOr[String] = js.undefined
  /** The token for this resource. */
  var token: js.UndefOr[String] = js.undefined
}

object LeaderboardConfiguration {
  @scala.inline
  def apply(
    draft: LeaderboardConfigurationDetail = null,
    id: String = null,
    kind: String = null,
    published: LeaderboardConfigurationDetail = null,
    scoreMax: String = null,
    scoreMin: String = null,
    scoreOrder: String = null,
    token: String = null
  ): LeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    if (draft != null) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (scoreMax != null) __obj.updateDynamic("scoreMax")(scoreMax.asInstanceOf[js.Any])
    if (scoreMin != null) __obj.updateDynamic("scoreMin")(scoreMin.asInstanceOf[js.Any])
    if (scoreOrder != null) __obj.updateDynamic("scoreOrder")(scoreOrder.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardConfiguration]
  }
}

