package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerLeaderboardScoreListResponse extends js.Object {
  /** The leaderboard scores. */
  var items: js.UndefOr[js.Array[PlayerLeaderboardScore]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerLeaderboardScoreListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The Player resources for the owner of this score. */
  var player: js.UndefOr[Player] = js.undefined
}

object PlayerLeaderboardScoreListResponse {
  @scala.inline
  def apply(
    items: js.Array[PlayerLeaderboardScore] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    player: Player = null
  ): PlayerLeaderboardScoreListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (player != null) __obj.updateDynamic("player")(player)
    __obj.asInstanceOf[PlayerLeaderboardScoreListResponse]
  }
}

