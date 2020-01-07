package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for achievement reset all response.
  */
@js.native
trait Schema$AchievementResetAllResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#achievementResetAllResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The achievement reset results.
    */
  var results: js.UndefOr[js.Array[Schema$AchievementResetResponse]] = js.native
}

object Schema$AchievementResetAllResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[Schema$AchievementResetResponse] = null): Schema$AchievementResetAllResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementResetAllResponse]
  }
}

