package typings.gapiDotClientDotGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerScore extends js.Object {
  /** The formatted score for this player score. */
  var formattedScore: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerScore. */
  var kind: js.UndefOr[String] = js.undefined
  /** The numerical value for this player score. */
  var score: js.UndefOr[String] = js.undefined
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.undefined
  /**
    * The time span for this player score.
    * Possible values are:
    * - "ALL_TIME" - The score is an all-time score.
    * - "WEEKLY" - The score is a weekly score.
    * - "DAILY" - The score is a daily score.
    */
  var timeSpan: js.UndefOr[String] = js.undefined
}

object PlayerScore {
  @scala.inline
  def apply(
    formattedScore: String = null,
    kind: String = null,
    score: String = null,
    scoreTag: String = null,
    timeSpan: String = null
  ): PlayerScore = {
    val __obj = js.Dynamic.literal()
    if (formattedScore != null) __obj.updateDynamic("formattedScore")(formattedScore)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (score != null) __obj.updateDynamic("score")(score)
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag)
    if (timeSpan != null) __obj.updateDynamic("timeSpan")(timeSpan)
    __obj.asInstanceOf[PlayerScore]
  }
}

