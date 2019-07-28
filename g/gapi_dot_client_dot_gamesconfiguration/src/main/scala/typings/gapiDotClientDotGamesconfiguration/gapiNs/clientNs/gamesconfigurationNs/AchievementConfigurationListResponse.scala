package typings.gapiDotClientDotGamesconfiguration.gapiNs.clientNs.gamesconfigurationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementConfigurationListResponse extends js.Object {
  /** The achievement configurations. */
  var items: js.UndefOr[js.Array[AchievementConfiguration]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementConfigurationListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AchievementConfigurationListResponse {
  @scala.inline
  def apply(
    items: js.Array[AchievementConfiguration] = null,
    kind: String = null,
    nextPageToken: String = null
  ): AchievementConfigurationListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AchievementConfigurationListResponse]
  }
}

