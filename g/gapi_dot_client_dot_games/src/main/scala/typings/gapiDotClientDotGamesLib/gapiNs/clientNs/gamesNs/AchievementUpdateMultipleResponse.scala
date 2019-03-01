package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementUpdateMultipleResponse extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementUpdateListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The updated state of the achievements. */
  var updatedAchievements: js.UndefOr[js.Array[AchievementUpdateResponse]] = js.undefined
}

object AchievementUpdateMultipleResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, updatedAchievements: js.Array[AchievementUpdateResponse] = null): AchievementUpdateMultipleResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updatedAchievements != null) __obj.updateDynamic("updatedAchievements")(updatedAchievements)
    __obj.asInstanceOf[AchievementUpdateMultipleResponse]
  }
}

