package typings.googleapis.buildSrcApisGamesConfigurationV1configurationMod.gamesConfiguration_v1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an leaderboard configuration resource.
  */
@js.native
trait Schema$LeaderboardConfiguration extends js.Object {
  /**
    * The draft data of the leaderboard.
    */
  var draft: js.UndefOr[Schema$LeaderboardConfigurationDetail] = js.native
  /**
    * The ID of the leaderboard.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The read-only published data of the leaderboard.
    */
  var published: js.UndefOr[Schema$LeaderboardConfigurationDetail] = js.native
  /**
    * Maximum score that can be posted to this leaderboard.
    */
  var scoreMax: js.UndefOr[String] = js.native
  /**
    * Minimum score that can be posted to this leaderboard.
    */
  var scoreMin: js.UndefOr[String] = js.native
  /**
    * The type of the leaderboard. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger scores posted are ranked higher.  -
    * &quot;SMALLER_IS_BETTER&quot; - Smaller scores posted are ranked higher.
    */
  var scoreOrder: js.UndefOr[String] = js.native
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.native
}

object Schema$LeaderboardConfiguration {
  @scala.inline
  def apply(
    draft: Schema$LeaderboardConfigurationDetail = null,
    id: String = null,
    kind: String = null,
    published: Schema$LeaderboardConfigurationDetail = null,
    scoreMax: String = null,
    scoreMin: String = null,
    scoreOrder: String = null,
    token: String = null
  ): Schema$LeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    if (draft != null) __obj.updateDynamic("draft")(draft.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (published != null) __obj.updateDynamic("published")(published.asInstanceOf[js.Any])
    if (scoreMax != null) __obj.updateDynamic("scoreMax")(scoreMax.asInstanceOf[js.Any])
    if (scoreMin != null) __obj.updateDynamic("scoreMin")(scoreMin.asInstanceOf[js.Any])
    if (scoreOrder != null) __obj.updateDynamic("scoreOrder")(scoreOrder.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LeaderboardConfiguration]
  }
}

