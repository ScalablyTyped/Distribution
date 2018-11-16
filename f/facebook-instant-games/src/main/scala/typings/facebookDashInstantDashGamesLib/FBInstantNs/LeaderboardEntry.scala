package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A score entry for an Instant Game leaderboard
     */

trait LeaderboardEntry extends js.Object {
  /**
           * Gets the developer-specified payload associated with the score, or null if one was not set.
           * @returns An optional developer-specified payload associated with the score.
           */
  def getExtraData(): java.lang.String | scala.Null
  /**
           * Gets the score associated with the entry, formatted with the score format associated with the leaderboard.
           * @returns Returns a formatted score.
           */
  def getFormattedScore(): java.lang.String
  /**
           * Gets information about the player associated with the entry.
           */
  def getPlayer(): LeaderboardPlayer
  /**
           * Gets the rank of the player's score in the leaderboard
           * @returns Returns the entry's leaderboard ranking.
           */
  def getRank(): scala.Double
  /**
           * Gets the score associated with the entry.
           * @returns Returns an integer score value.
           */
  def getScore(): scala.Double
  /**
           * Gets the timestamp of when the leaderboard entry was last updated.
           * @returns Returns a Unix timestamp.
           */
  def getTimestamp(): scala.Double
}

