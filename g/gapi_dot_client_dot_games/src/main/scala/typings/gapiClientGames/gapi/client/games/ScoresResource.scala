package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.IncludeRankType
import typings.gapiClientGames.anon.Language
import typings.gapiClientGames.anon.ResultsAbove
import typings.gapiClientGames.anon.Score
import typings.gapiClientGames.anon.TimeSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: IncludeRankType): Request[PlayerLeaderboardScoreListResponse] = js.native
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: TimeSpan): Request[LeaderboardScores] = js.native
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: ResultsAbove): Request[LeaderboardScores] = js.native
  /** Submits a score to the specified leaderboard. */
  def submit(request: Score): Request[PlayerScoreResponse] = js.native
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: Language): Request[PlayerScoreListResponse] = js.native
}

object ScoresResource {
  @scala.inline
  def apply(
    get: IncludeRankType => Request[PlayerLeaderboardScoreListResponse],
    list: TimeSpan => Request[LeaderboardScores],
    listWindow: ResultsAbove => Request[LeaderboardScores],
    submit: Score => Request[PlayerScoreResponse],
    submitMultiple: Language => Request[PlayerScoreListResponse]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listWindow = js.Any.fromFunction1(listWindow), submit = js.Any.fromFunction1(submit), submitMultiple = js.Any.fromFunction1(submitMultiple))
    __obj.asInstanceOf[ScoresResource]
  }
  @scala.inline
  implicit class ScoresResourceOps[Self <: ScoresResource] (val x: Self) extends AnyVal {
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
    def setGet(value: IncludeRankType => Request[PlayerLeaderboardScoreListResponse]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: TimeSpan => Request[LeaderboardScores]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListWindow(value: ResultsAbove => Request[LeaderboardScores]): Self = this.set("listWindow", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: Score => Request[PlayerScoreResponse]): Self = this.set("submit", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmitMultiple(value: Language => Request[PlayerScoreListResponse]): Self = this.set("submitMultiple", js.Any.fromFunction1(value))
  }
  
}

