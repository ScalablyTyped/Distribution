package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoreSubmission extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#scoreSubmission. */
  var kind: js.UndefOr[String] = js.undefined
  /** The leaderboard this score is being submitted to. */
  var leaderboardId: js.UndefOr[String] = js.undefined
  /** The new score being submitted. */
  var score: js.UndefOr[String] = js.undefined
  /** Additional information about this score. Values will contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.undefined
  /** Signature Values will contain URI-safe characters as defined by section 2.3 of RFC 3986. */
  var signature: js.UndefOr[String] = js.undefined
}

object ScoreSubmission {
  @scala.inline
  def apply(
    kind: String = null,
    leaderboardId: String = null,
    score: String = null,
    scoreTag: String = null,
    signature: String = null
  ): ScoreSubmission = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leaderboardId != null) __obj.updateDynamic("leaderboardId")(leaderboardId)
    if (score != null) __obj.updateDynamic("score")(score)
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[ScoreSubmission]
  }
}

