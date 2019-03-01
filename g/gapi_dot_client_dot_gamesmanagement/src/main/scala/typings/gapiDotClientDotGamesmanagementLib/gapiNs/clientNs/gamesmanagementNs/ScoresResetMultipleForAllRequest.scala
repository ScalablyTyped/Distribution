package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResetMultipleForAllRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#scoresResetMultipleForAllRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The IDs of leaderboards to reset. */
  var leaderboard_ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ScoresResetMultipleForAllRequest {
  @scala.inline
  def apply(kind: java.lang.String = null, leaderboard_ids: js.Array[java.lang.String] = null): ScoresResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leaderboard_ids != null) __obj.updateDynamic("leaderboard_ids")(leaderboard_ids)
    __obj.asInstanceOf[ScoresResetMultipleForAllRequest]
  }
}

