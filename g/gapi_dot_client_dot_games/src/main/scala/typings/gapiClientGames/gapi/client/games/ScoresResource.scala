package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAltCollectionConsistencyTokenFields
import typings.gapiClientGames.AnonAltCollectionConsistencyTokenFieldsKey
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsIncludeRankType
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKey
import typings.gapiClientGames.AnonAltConsistencyTokenFieldsKeyLanguageLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: AnonAltConsistencyTokenFieldsIncludeRankType): Request_[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: AnonAltCollectionConsistencyTokenFields): Request_[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: AnonAltCollectionConsistencyTokenFieldsKey): Request_[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: AnonAltConsistencyTokenFieldsKeyLanguageLeaderboardId): Request_[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: AnonAltConsistencyTokenFieldsKey): Request_[PlayerScoreListResponse]
}

object ScoresResource {
  @scala.inline
  def apply(
    get: AnonAltConsistencyTokenFieldsIncludeRankType => Request_[PlayerLeaderboardScoreListResponse],
    list: AnonAltCollectionConsistencyTokenFields => Request_[LeaderboardScores],
    listWindow: AnonAltCollectionConsistencyTokenFieldsKey => Request_[LeaderboardScores],
    submit: AnonAltConsistencyTokenFieldsKeyLanguageLeaderboardId => Request_[PlayerScoreResponse],
    submitMultiple: AnonAltConsistencyTokenFieldsKey => Request_[PlayerScoreListResponse]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listWindow = js.Any.fromFunction1(listWindow), submit = js.Any.fromFunction1(submit), submitMultiple = js.Any.fromFunction1(submitMultiple))
  
    __obj.asInstanceOf[ScoresResource]
  }
}

