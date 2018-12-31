package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardEntry extends js.Object {
  /** The localized string for the numerical value of this score. */
  var formattedScore: js.UndefOr[java.lang.String] = js.undefined
  /** The localized string for the rank of this score for this leaderboard. */
  var formattedScoreRank: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardEntry. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The player who holds this score. */
  var player: js.UndefOr[Player] = js.undefined
  /** The rank of this score for this leaderboard. */
  var scoreRank: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[java.lang.String] = js.undefined
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time span of this high score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time high score.
    * - "WEEKLY" - The score is a weekly high score.
    * - "DAILY" - The score is a daily high score.
    */
  var timeSpan: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestampMillis: js.UndefOr[java.lang.String] = js.undefined
}

