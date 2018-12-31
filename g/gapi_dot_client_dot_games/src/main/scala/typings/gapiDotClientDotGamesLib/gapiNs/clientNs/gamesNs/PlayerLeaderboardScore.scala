package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerLeaderboardScore extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerLeaderboardScore. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the leaderboard this score is in. */
  var leaderboard_id: js.UndefOr[java.lang.String] = js.undefined
  /** The public rank of the score in this leaderboard. This object will not be present if the user is not sharing their scores publicly. */
  var publicRank: js.UndefOr[LeaderboardScoreRank] = js.undefined
  /** The formatted value of this score. */
  var scoreString: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[java.lang.String] = js.undefined
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[java.lang.String] = js.undefined
  /** The social rank of the score in this leaderboard. */
  var socialRank: js.UndefOr[LeaderboardScoreRank] = js.undefined
  /**
    * The time span of this score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var timeSpan: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

