package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResetMultipleForAllRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#scoresResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** The IDs of leaderboards to reset. */
  var leaderboard_ids: js.UndefOr[js.Array[String]] = js.undefined
}

object ScoresResetMultipleForAllRequest {
  @scala.inline
  def apply(kind: String = null, leaderboard_ids: js.Array[String] = null): ScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaderboard_ids != null) __obj.updateDynamic("leaderboard_ids")(leaderboard_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScoresResetMultipleForAllRequest]
  }
}

