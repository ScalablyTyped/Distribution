package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScoreResetAllResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#playerScoreResetResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The leaderboard reset results. */
  var results: js.UndefOr[js.Array[PlayerScoreResetResponse]] = js.undefined
}

object PlayerScoreResetAllResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[PlayerScoreResetResponse] = null): PlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (results != null) __obj.updateDynamic("results")(results)
    __obj.asInstanceOf[PlayerScoreResetAllResponse]
  }
}

