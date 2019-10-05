package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardListResponse extends js.Object {
  /** The leaderboards. */
  var items: js.UndefOr[js.Array[Leaderboard]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object LeaderboardListResponse {
  @scala.inline
  def apply(items: js.Array[Leaderboard] = null, kind: String = null, nextPageToken: String = null): LeaderboardListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[LeaderboardListResponse]
  }
}

