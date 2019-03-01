package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScoreResponse extends js.Object {
  /**
    * The time spans where the submitted score is better than the existing score for that time span.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var beatenScoreTimeSpans: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The formatted value of the submitted score. */
  var formattedScore: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScoreResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The leaderboard ID that this score was submitted to. */
  var leaderboardId: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The scores in time spans that have not been beaten. As an example, the submitted score may be better than the player's DAILY score, but not better than
    * the player's scores for the WEEKLY or ALL_TIME time spans.
    */
  var unbeatenScores: js.UndefOr[js.Array[PlayerScore]] = js.undefined
}

object PlayerScoreResponse {
  @scala.inline
  def apply(
    beatenScoreTimeSpans: js.Array[java.lang.String] = null,
    formattedScore: java.lang.String = null,
    kind: java.lang.String = null,
    leaderboardId: java.lang.String = null,
    scoreTag: java.lang.String = null,
    unbeatenScores: js.Array[PlayerScore] = null
  ): PlayerScoreResponse = {
    val __obj = js.Dynamic.literal()
    if (beatenScoreTimeSpans != null) __obj.updateDynamic("beatenScoreTimeSpans")(beatenScoreTimeSpans)
    if (formattedScore != null) __obj.updateDynamic("formattedScore")(formattedScore)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leaderboardId != null) __obj.updateDynamic("leaderboardId")(leaderboardId)
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag)
    if (unbeatenScores != null) __obj.updateDynamic("unbeatenScores")(unbeatenScores)
    __obj.asInstanceOf[PlayerScoreResponse]
  }
}

