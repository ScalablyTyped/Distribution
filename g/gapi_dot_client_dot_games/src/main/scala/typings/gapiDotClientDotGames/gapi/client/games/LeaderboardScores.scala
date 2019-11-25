package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardScores extends js.Object {
  /** The scores in the leaderboard. */
  var items: js.UndefOr[js.Array[LeaderboardEntry]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardScores. */
  var kind: js.UndefOr[String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of scores in the leaderboard. */
  var numScores: js.UndefOr[String] = js.undefined
  /**
    * The score of the requesting player on the leaderboard. The player's score may appear both here and in the list of scores above. If you are viewing a
    * public leaderboard and the player is not sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will not be present.
    */
  var playerScore: js.UndefOr[LeaderboardEntry] = js.undefined
  /** The pagination token for the previous page of results. */
  var prevPageToken: js.UndefOr[String] = js.undefined
}

object LeaderboardScores {
  @scala.inline
  def apply(
    items: js.Array[LeaderboardEntry] = null,
    kind: String = null,
    nextPageToken: String = null,
    numScores: String = null,
    playerScore: LeaderboardEntry = null,
    prevPageToken: String = null
  ): LeaderboardScores = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (numScores != null) __obj.updateDynamic("numScores")(numScores.asInstanceOf[js.Any])
    if (playerScore != null) __obj.updateDynamic("playerScore")(playerScore.asInstanceOf[js.Any])
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardScores]
  }
}

