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

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: IncludeRankType): Request[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: TimeSpan): Request[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: ResultsAbove): Request[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: Score): Request[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: Language): Request[PlayerScoreListResponse]
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
}

