package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScoresResource extends js.Object {
  /**
               * Resets scores for the leaderboard with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
               * accounts for your application.
               */
  def reset(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreResetResponse]
  /**
               * Resets all scores for all leaderboards for the currently authenticated players. This method is only accessible to whitelisted tester accounts for your
               * application.
               */
  def resetAll(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreResetAllResponse]
  /** Resets scores for all draft leaderboards for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
               * Resets scores for the leaderboard with the given ID for all players. This method is only available to user accounts for your developer console. Only
               * draft leaderboards can be reset.
               */
  def resetForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
               * Resets scores for the leaderboards with the given IDs for all players. This method is only available to user accounts for your developer console. Only
               * draft leaderboards may be reset.
               */
  def resetMultipleForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

