package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonIncludeRankType
import typings.gapiClientGames.AnonLanguage
import typings.gapiClientGames.AnonResultsAbove
import typings.gapiClientGames.AnonScore
import typings.gapiClientGames.AnonTimeSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: AnonIncludeRankType): Request_[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: AnonTimeSpan): Request_[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: AnonResultsAbove): Request_[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: AnonScore): Request_[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: AnonLanguage): Request_[PlayerScoreListResponse]
}

object ScoresResource {
  @scala.inline
  def apply(
    get: AnonIncludeRankType => Request_[PlayerLeaderboardScoreListResponse],
    list: AnonTimeSpan => Request_[LeaderboardScores],
    listWindow: AnonResultsAbove => Request_[LeaderboardScores],
    submit: AnonScore => Request_[PlayerScoreResponse],
    submitMultiple: AnonLanguage => Request_[PlayerScoreListResponse]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listWindow = js.Any.fromFunction1(listWindow), submit = js.Any.fromFunction1(submit), submitMultiple = js.Any.fromFunction1(submitMultiple))
    __obj.asInstanceOf[ScoresResource]
  }
}

