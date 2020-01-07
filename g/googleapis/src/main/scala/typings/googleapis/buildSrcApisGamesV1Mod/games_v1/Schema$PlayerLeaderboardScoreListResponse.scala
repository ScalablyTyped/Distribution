package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of player leaderboard scores.
  */
@js.native
trait Schema$PlayerLeaderboardScoreListResponse extends js.Object {
  /**
    * The leaderboard scores.
    */
  var items: js.UndefOr[js.Array[Schema$PlayerLeaderboardScore]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLeaderboardScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The Player resources for the owner of this score.
    */
  var player: js.UndefOr[Schema$Player] = js.native
}

object Schema$PlayerLeaderboardScoreListResponse {
  @scala.inline
  def apply(
    items: js.Array[Schema$PlayerLeaderboardScore] = null,
    kind: String = null,
    nextPageToken: String = null,
    player: Schema$Player = null
  ): Schema$PlayerLeaderboardScoreListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerLeaderboardScoreListResponse]
  }
}

