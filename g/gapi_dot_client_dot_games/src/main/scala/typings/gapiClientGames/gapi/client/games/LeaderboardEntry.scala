package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardEntry extends js.Object {
  /** The localized string for the numerical value of this score. */
  var formattedScore: js.UndefOr[String] = js.undefined
  /** The localized string for the rank of this score for this leaderboard. */
  var formattedScoreRank: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#leaderboardEntry. */
  var kind: js.UndefOr[String] = js.undefined
  /** The player who holds this score. */
  var player: js.UndefOr[Player] = js.undefined
  /** The rank of this score for this leaderboard. */
  var scoreRank: js.UndefOr[String] = js.undefined
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.undefined
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[String] = js.undefined
  /**
    * The time span of this high score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time high score.
    * - "WEEKLY" - The score is a weekly high score.
    * - "DAILY" - The score is a daily high score.
    */
  var timeSpan: js.UndefOr[String] = js.undefined
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestampMillis: js.UndefOr[String] = js.undefined
}

object LeaderboardEntry {
  @scala.inline
  def apply(
    formattedScore: String = null,
    formattedScoreRank: String = null,
    kind: String = null,
    player: Player = null,
    scoreRank: String = null,
    scoreTag: String = null,
    scoreValue: String = null,
    timeSpan: String = null,
    writeTimestampMillis: String = null
  ): LeaderboardEntry = {
    val __obj = js.Dynamic.literal()
    if (formattedScore != null) __obj.updateDynamic("formattedScore")(formattedScore.asInstanceOf[js.Any])
    if (formattedScoreRank != null) __obj.updateDynamic("formattedScoreRank")(formattedScoreRank.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (player != null) __obj.updateDynamic("player")(player.asInstanceOf[js.Any])
    if (scoreRank != null) __obj.updateDynamic("scoreRank")(scoreRank.asInstanceOf[js.Any])
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag.asInstanceOf[js.Any])
    if (scoreValue != null) __obj.updateDynamic("scoreValue")(scoreValue.asInstanceOf[js.Any])
    if (timeSpan != null) __obj.updateDynamic("timeSpan")(timeSpan.asInstanceOf[js.Any])
    if (writeTimestampMillis != null) __obj.updateDynamic("writeTimestampMillis")(writeTimestampMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardEntry]
  }
}

