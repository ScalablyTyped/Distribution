package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AchievementDefinitionsListResponse extends js.Object {
  /** The achievement definitions. */
  var items: js.UndefOr[js.Array[AchievementDefinition]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#achievementDefinitionsListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object AchievementDefinitionsListResponse {
  @scala.inline
  def apply(items: js.Array[AchievementDefinition] = null, kind: String = null, nextPageToken: String = null): AchievementDefinitionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AchievementDefinitionsListResponse]
  }
}

