package typings.gapiDotClientDotGamesmanagement.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementResetMultipleForAllRequest extends js.Object {
  /** The IDs of achievements to reset. */
  var achievement_ids: js.UndefOr[js.Array[String]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#achievementResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.undefined
}

object AchievementResetMultipleForAllRequest {
  @scala.inline
  def apply(achievement_ids: js.Array[String] = null, kind: String = null): AchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (achievement_ids != null) __obj.updateDynamic("achievement_ids")(achievement_ids)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AchievementResetMultipleForAllRequest]
  }
}

