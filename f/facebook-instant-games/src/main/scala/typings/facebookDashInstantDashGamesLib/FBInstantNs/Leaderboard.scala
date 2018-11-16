package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An Instant Game leaderboard
     */
@js.native
trait Leaderboard extends js.Object {
  /**
           * Retrieves the leaderboard score entries of the current player's connected players (including the current player), ordered by local rank within the set of connected players.
           * @param count  The number of entries to attempt to fetch from the leaderboard. Defaults to 10 if not specified. Currently, up to a maximum of 100 entries may be fetched per query.
           * @param offset The offset from the set of ordered connected player score entries to fetch from.
           * @returns Resolves with the leaderboard entries that match the query.
           */
  def getConnectedPlayerEntriesAsync(count: scala.Double, offset: scala.Double): stdLib.Promise[js.Array[LeaderboardEntry]] = js.native
  /**
           * The ID of the context that the leaderboard is associated with, or null if the leaderboard is not tied to a particular context.
           */
  def getContextID(): java.lang.String | scala.Null = js.native
  /**
           * Retrieves a set of leaderboard entries, ordered by score ranking in the leaderboard.
           *
           * @param count The number of entries to attempt to fetch from the leaderboard. Defaults to 10 if not specified. Up to a maximum of 100 entries may be fetched per query.
           * @param offset The offset from the top of the leaderboard that entries will be fetched from.
           * @returns Resolves with the leaderboard entries that match the query.
           * @throws NETWORK_FAILURE
           * @throws RATE_LIMITED
           */
  def getEntriesAsync(count: scala.Double, offset: scala.Double): stdLib.Promise[js.Array[LeaderboardEntry]] = js.native
  /**
           * Fetches the total number of player entries in the leaderboard.
           *
           * @returns  A unique identifier for the player.
           * @throws NETWORK_FAILURE
           * @throws RATE_LIMITED
           */
  def getEntryCountAsync(): stdLib.Promise[scala.Double] = js.native
  /**
           * The name of the leaderboard.
           */
  def getName(): java.lang.String = js.native
  /**
           * Retrieves the leaderboard's entry for the current player, or null if the player has not set one yet.
           *
           * @returns Resolves with the current leaderboard entry for the player.
           * @throws NETWORK_FAILURE
           * @throws INVALID_OPERATION
           * @throws RATE_LIMITED
           */
  def getPlayerEntryAsync(): stdLib.Promise[LeaderboardEntry | scala.Null] = js.native
  /**
           * Updates the player's score. If the player has an existing score, the old score will only be replaced if the new score is better than it.
           * NOTE: If the leaderboard is associated with a specific context, the game must be in that context to set a score for the player.
           *
           * @param score The new score for the player. Must be a 64-bit integer number.
           * @param extraData Metadata to associate with the stored score. Must be less than 2KB in size.
           * @returns Resolves with the current leaderboard entry for the player after the update.
           * @throws LEADERBOARD_WRONG_CONTEXT
           * @throws NETWORK_FAILURE
           * @throws INVALID_PARAM
           * @throws INVALID_OPERATION
           * @throws RATE_LIMITED
           */
  def setScoreAsync(score: scala.Double): stdLib.Promise[LeaderboardEntry] = js.native
  /**
           * Updates the player's score. If the player has an existing score, the old score will only be replaced if the new score is better than it.
           * NOTE: If the leaderboard is associated with a specific context, the game must be in that context to set a score for the player.
           *
           * @param score The new score for the player. Must be a 64-bit integer number.
           * @param extraData Metadata to associate with the stored score. Must be less than 2KB in size.
           * @returns Resolves with the current leaderboard entry for the player after the update.
           * @throws LEADERBOARD_WRONG_CONTEXT
           * @throws NETWORK_FAILURE
           * @throws INVALID_PARAM
           * @throws INVALID_OPERATION
           * @throws RATE_LIMITED
           */
  def setScoreAsync(score: scala.Double, extraData: java.lang.String): stdLib.Promise[LeaderboardEntry] = js.native
}

