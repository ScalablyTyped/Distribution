package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardEntry extends js.Object {
  /** The localized string for the numerical value of this score. */
  var formattedScore: js.UndefOr[String] = js.native
  /** The localized string for the rank of this score for this leaderboard. */
  var formattedScoreRank: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardEntry. */
  var kind: js.UndefOr[String] = js.native
  /** The player who holds this score. */
  var player: js.UndefOr[Player] = js.native
  /** The rank of this score for this leaderboard. */
  var scoreRank: js.UndefOr[String] = js.native
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[String] = js.native
  /**
    * The time span of this high score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time high score.
    * - "WEEKLY" - The score is a weekly high score.
    * - "DAILY" - The score is a daily high score.
    */
  var timeSpan: js.UndefOr[String] = js.native
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestampMillis: js.UndefOr[String] = js.native
}

object LeaderboardEntry {
  @scala.inline
  def apply(): LeaderboardEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardEntry]
  }
  @scala.inline
  implicit class LeaderboardEntryOps[Self <: LeaderboardEntry] (val x: Self) extends AnyVal {
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
    def setFormattedScore(value: String): Self = this.set("formattedScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedScore: Self = this.set("formattedScore", js.undefined)
    @scala.inline
    def setFormattedScoreRank(value: String): Self = this.set("formattedScoreRank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormattedScoreRank: Self = this.set("formattedScoreRank", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPlayer(value: Player): Self = this.set("player", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayer: Self = this.set("player", js.undefined)
    @scala.inline
    def setScoreRank(value: String): Self = this.set("scoreRank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreRank: Self = this.set("scoreRank", js.undefined)
    @scala.inline
    def setScoreTag(value: String): Self = this.set("scoreTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreTag: Self = this.set("scoreTag", js.undefined)
    @scala.inline
    def setScoreValue(value: String): Self = this.set("scoreValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreValue: Self = this.set("scoreValue", js.undefined)
    @scala.inline
    def setTimeSpan(value: String): Self = this.set("timeSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSpan: Self = this.set("timeSpan", js.undefined)
    @scala.inline
    def setWriteTimestampMillis(value: String): Self = this.set("writeTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteTimestampMillis: Self = this.set("writeTimestampMillis", js.undefined)
  }
  
}

