package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a score rank in a leaderboard.
  */
@js.native
trait Schema$LeaderboardScoreRank extends js.Object {
  /**
    * The number of scores in the leaderboard as a string.
    */
  var formattedNumScores: js.UndefOr[String] = js.native
  /**
    * The rank in the leaderboard as a string.
    */
  var formattedRank: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardScoreRank.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of scores in the leaderboard.
    */
  var numScores: js.UndefOr[String] = js.native
  /**
    * The rank in the leaderboard.
    */
  var rank: js.UndefOr[String] = js.native
}

object Schema$LeaderboardScoreRank {
  @scala.inline
  def apply(
    formattedNumScores: String = null,
    formattedRank: String = null,
    kind: String = null,
    numScores: String = null,
    rank: String = null
  ): Schema$LeaderboardScoreRank = {
    val __obj = js.Dynamic.literal()
    if (formattedNumScores != null) __obj.updateDynamic("formattedNumScores")(formattedNumScores.asInstanceOf[js.Any])
    if (formattedRank != null) __obj.updateDynamic("formattedRank")(formattedRank.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numScores != null) __obj.updateDynamic("numScores")(numScores.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LeaderboardScoreRank]
  }
}

