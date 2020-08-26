package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeaderboardScores extends js.Object {
  /** The scores in the leaderboard. */
  var items: js.UndefOr[js.Array[LeaderboardEntry]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardScores. */
  var kind: js.UndefOr[String] = js.native
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The total number of scores in the leaderboard. */
  var numScores: js.UndefOr[String] = js.native
  /**
    * The score of the requesting player on the leaderboard. The player's score may appear both here and in the list of scores above. If you are viewing a
    * public leaderboard and the player is not sharing their gameplay information publicly, the scoreRank and formattedScoreRank values will not be present.
    */
  var playerScore: js.UndefOr[LeaderboardEntry] = js.native
  /** The pagination token for the previous page of results. */
  var prevPageToken: js.UndefOr[String] = js.native
}

object LeaderboardScores {
  @scala.inline
  def apply(): LeaderboardScores = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardScores]
  }
  @scala.inline
  implicit class LeaderboardScoresOps[Self <: LeaderboardScores] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: LeaderboardEntry*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[LeaderboardEntry]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNumScores(value: String): Self = this.set("numScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumScores: Self = this.set("numScores", js.undefined)
    @scala.inline
    def setPlayerScore(value: LeaderboardEntry): Self = this.set("playerScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerScore: Self = this.set("playerScore", js.undefined)
    @scala.inline
    def setPrevPageToken(value: String): Self = this.set("prevPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPageToken: Self = this.set("prevPageToken", js.undefined)
  }
  
}

