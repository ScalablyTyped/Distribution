package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardScoreRank extends js.Object {
  /** The number of scores in the leaderboard as a string. */
  var formattedNumScores: js.UndefOr[String] = js.undefined
  /** The rank in the leaderboard as a string. */
  var formattedRank: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardScoreRank. */
  var kind: js.UndefOr[String] = js.undefined
  /** The number of scores in the leaderboard. */
  var numScores: js.UndefOr[String] = js.undefined
  /** The rank in the leaderboard. */
  var rank: js.UndefOr[String] = js.undefined
}

object LeaderboardScoreRank {
  @scala.inline
  def apply(
    formattedNumScores: String = null,
    formattedRank: String = null,
    kind: String = null,
    numScores: String = null,
    rank: String = null
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

