package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltCollectionConsistencyTokenFields
import typings.gapiDotClientDotGames.Anon_AltCollectionConsistencyTokenFieldsKey
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsIncludeRankType
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKey
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: Anon_AltConsistencyTokenFieldsIncludeRankType): Request[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: Anon_AltCollectionConsistencyTokenFields): Request[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: Anon_AltCollectionConsistencyTokenFieldsKey): Request[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId): Request[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: Anon_AltConsistencyTokenFieldsKey): Request[PlayerScoreListResponse]
}

object ScoresResource {
  @scala.inline
  def apply(
    get: Anon_AltConsistencyTokenFieldsIncludeRankType => Request[PlayerLeaderboardScoreListResponse],
    list: Anon_AltCollectionConsistencyTokenFields => Request[LeaderboardScores],
    listWindow: Anon_AltCollectionConsistencyTokenFieldsKey => Request[LeaderboardScores],
    submit: Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId => Request[PlayerScoreResponse],
    submitMultiple: Anon_AltConsistencyTokenFieldsKey => Request[PlayerScoreListResponse]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listWindow = js.Any.fromFunction1(listWindow), submit = js.Any.fromFunction1(submit), submitMultiple = js.Any.fromFunction1(submitMultiple))
  
    __obj.asInstanceOf[ScoresResource]
  }
}

