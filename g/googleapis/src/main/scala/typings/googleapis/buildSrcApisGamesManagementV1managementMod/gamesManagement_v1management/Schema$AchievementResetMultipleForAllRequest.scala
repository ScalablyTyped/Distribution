package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for multiple achievements reset all request.
  */
@js.native
trait Schema$AchievementResetMultipleForAllRequest extends js.Object {
  /**
    * The IDs of achievements to reset.
    */
  var achievement_ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AchievementResetMultipleForAllRequest {
  @scala.inline
  def apply(achievement_ids: js.Array[String] = null, kind: String = null): Schema$AchievementResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (achievement_ids != null) __obj.updateDynamic("achievement_ids")(achievement_ids.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementResetMultipleForAllRequest]
  }
}

