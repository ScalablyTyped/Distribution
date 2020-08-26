package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerLeaderboardScore extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerLeaderboardScore. */
  var kind: js.UndefOr[String] = js.native
  /** The ID of the leaderboard this score is in. */
  var leaderboard_id: js.UndefOr[String] = js.native
  /** The public rank of the score in this leaderboard. This object will not be present if the user is not sharing their scores publicly. */
  var publicRank: js.UndefOr[LeaderboardScoreRank] = js.native
  /** The formatted value of this score. */
  var scoreString: js.UndefOr[String] = js.native
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.native
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[String] = js.native
  /** The social rank of the score in this leaderboard. */
  var socialRank: js.UndefOr[LeaderboardScoreRank] = js.native
  /**
    * The time span of this score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var timeSpan: js.UndefOr[String] = js.native
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestamp: js.UndefOr[String] = js.native
}

object PlayerLeaderboardScore {
  @scala.inline
  def apply(): PlayerLeaderboardScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLeaderboardScore]
  }
  @scala.inline
  implicit class PlayerLeaderboardScoreOps[Self <: PlayerLeaderboardScore] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLeaderboard_id(value: String): Self = this.set("leaderboard_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderboard_id: Self = this.set("leaderboard_id", js.undefined)
    @scala.inline
    def setPublicRank(value: LeaderboardScoreRank): Self = this.set("publicRank", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicRank: Self = this.set("publicRank", js.undefined)
    @scala.inline
    def setScoreString(value: String): Self = this.set("scoreString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreString: Self = this.set("scoreString", js.undefined)
    @scala.inline
    def setScoreTag(value: String): Self = this.set("scoreTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreTag: Self = this.set("scoreTag", js.undefined)
    @scala.inline
    def setScoreValue(value: String): Self = this.set("scoreValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreValue: Self = this.set("scoreValue", js.undefined)
    @scala.inline
    def setSocialRank(value: LeaderboardScoreRank): Self = this.set("socialRank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocialRank: Self = this.set("socialRank", js.undefined)
    @scala.inline
    def setTimeSpan(value: String): Self = this.set("timeSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSpan: Self = this.set("timeSpan", js.undefined)
    @scala.inline
    def setWriteTimestamp(value: String): Self = this.set("writeTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteTimestamp: Self = this.set("writeTimestamp", js.undefined)
  }
  
}

