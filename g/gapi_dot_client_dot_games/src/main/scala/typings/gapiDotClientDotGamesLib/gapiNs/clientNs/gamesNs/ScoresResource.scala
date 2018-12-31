package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenIncludeRankType): gapiDotClientLib.gapiNs.clientNs.Request[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: gapiDotClientDotGamesLib.Anon_CollectionConsistencyTokenMaxResultsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: gapiDotClientDotGamesLib.Anon_CollectionConsistencyTokenMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintScore): gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: gapiDotClientDotGamesLib.Anon_ConsistencyTokenPrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreListResponse]
}

