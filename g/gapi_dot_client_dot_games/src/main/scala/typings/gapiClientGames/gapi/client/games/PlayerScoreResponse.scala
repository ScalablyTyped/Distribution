package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerScoreResponse extends js.Object {
  /**
    * The time spans where the submitted score is better than the existing score for that time span.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var beatenScoreTimeSpans: js.UndefOr[js.Array[String]] = js.native
  /** The formatted value of the submitted score. */
  var formattedScore: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScoreResponse. */
  var kind: js.UndefOr[String] = js.native
  /** The leaderboard ID that this score was submitted to. */
  var leaderboardId: js.UndefOr[String] = js.native
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * The scores in time spans that have not been beaten. As an example, the submitted score may be better than the player's DAILY score, but not better than
    * the player's scores for the WEEKLY or ALL_TIME time spans.
    */
  var unbeatenScores: js.UndefOr[js.Array[PlayerScore]] = js.native
}

object PlayerScoreResponse {
  @scala.inline
  def apply(): PlayerScoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerScoreResponse]
  }
  @scala.inline
  implicit class PlayerScoreResponseOps[Self <: PlayerScoreResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeatenScoreTimeSpansVarargs(value: String*): Self = this.set("beatenScoreTimeSpans", js.Array(value :_*))
    @scala.inline
    def setBeatenScoreTimeSpans(value: js.Array[String]): Self = this.set("beatenScoreTimeSpans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeatenScoreTimeSpans: Self = this.set("beatenScoreTimeSpans", js.undefined)
    @scala.inline
    def setFormattedScore(value: String): Self = this.set("formattedScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedScore: Self = this.set("formattedScore", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLeaderboardId(value: String): Self = this.set("leaderboardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderboardId: Self = this.set("leaderboardId", js.undefined)
    @scala.inline
    def setScoreTag(value: String): Self = this.set("scoreTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreTag: Self = this.set("scoreTag", js.undefined)
    @scala.inline
    def setUnbeatenScoresVarargs(value: PlayerScore*): Self = this.set("unbeatenScores", js.Array(value :_*))
    @scala.inline
    def setUnbeatenScores(value: js.Array[PlayerScore]): Self = this.set("unbeatenScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnbeatenScores: Self = this.set("unbeatenScores", js.undefined)
  }
  
}

