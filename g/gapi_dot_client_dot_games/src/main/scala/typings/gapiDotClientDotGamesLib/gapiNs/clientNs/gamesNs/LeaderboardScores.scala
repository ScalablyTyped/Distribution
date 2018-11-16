package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LeaderboardScores extends js.Object {
  /** The scores in the leaderboard. */
  var items: js.UndefOr[js.Array[LeaderboardEntry]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardScores. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of scores in the leaderboard. */
  var numScores: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The score of the requesting player on the leaderboard. The player's score may appear both here and in the list of scores above. If you are viewing a
               * public leaderboard and the player is not sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will not be present.
               */
  var playerScore: js.UndefOr[LeaderboardEntry] = js.undefined
  /** The pagination token for the previous page of results. */
  var prevPageToken: js.UndefOr[java.lang.String] = js.undefined
}

