package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerAchievementListResponse extends js.Object {
  /** The achievements. */
  var items: js.UndefOr[js.Array[PlayerAchievement]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerAchievementListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object PlayerAchievementListResponse {
  @scala.inline
  def apply(items: js.Array[PlayerAchievement] = null, kind: String = null, nextPageToken: String = null): PlayerAchievementListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[PlayerAchievementListResponse]
  }
}

