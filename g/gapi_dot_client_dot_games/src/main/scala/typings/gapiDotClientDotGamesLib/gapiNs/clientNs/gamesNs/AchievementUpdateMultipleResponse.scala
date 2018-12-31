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

