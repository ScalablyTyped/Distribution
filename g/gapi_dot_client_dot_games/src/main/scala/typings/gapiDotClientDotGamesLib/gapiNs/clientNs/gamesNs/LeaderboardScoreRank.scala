package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardScoreRank extends js.Object {
  /** The number of scores in the leaderboard as a string. */
  var formattedNumScores: js.UndefOr[java.lang.String] = js.undefined
  /** The rank in the leaderboard as a string. */
  var formattedRank: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardScoreRank. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The number of scores in the leaderboard. */
  var numScores: js.UndefOr[java.lang.String] = js.undefined
  /** The rank in the leaderboard. */
  var rank: js.UndefOr[java.lang.String] = js.undefined
}

object LeaderboardScoreRank {
  @scala.inline
  def apply(
    formattedNumScores: java.lang.String = null,
    formattedRank: java.lang.String = null,
    kind: java.lang.String = null,
    numScores: java.lang.String = null,
    rank: java.lang.String = null
  ): LeaderboardScoreRank = {
    val __obj = js.Dynamic.literal()
    if (formattedNumScores != null) __obj.updateDynamic("formattedNumScores")(formattedNumScores)
    if (formattedRank != null) __obj.updateDynamic("formattedRank")(formattedRank)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numScores != null) __obj.updateDynamic("numScores")(numScores)
    if (rank != null) __obj.updateDynamic("rank")(rank)
    __obj.asInstanceOf[LeaderboardScoreRank]
  }
}

