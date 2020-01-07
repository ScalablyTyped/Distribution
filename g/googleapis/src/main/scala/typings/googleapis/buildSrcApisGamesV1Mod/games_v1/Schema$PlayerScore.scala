package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a player score.
  */
@js.native
trait Schema$PlayerScore extends js.Object {
  /**
    * The formatted score for this player score.
    */
  var formattedScore: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScore.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The numerical value for this player score.
    */
  var score: js.UndefOr[String] = js.native
  /**
    * Additional information about this score. Values will contain no more than
    * 64 URI-safe characters as defined by section 2.3 of RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
  /**
    * The time span for this player score. Possible values are:   -
    * &quot;ALL_TIME&quot; - The score is an all-time score.  -
    * &quot;WEEKLY&quot; - The score is a weekly score.  - &quot;DAILY&quot; -
    * The score is a daily score.
    */
  var timeSpan: js.UndefOr[String] = js.native
}

object Schema$PlayerScore {
  @scala.inline
  def apply(
    formattedScore: String = null,
    kind: String = null,
    score: String = null,
    scoreTag: String = null,
    timeSpan: String = null
  ): Schema$PlayerScore = {
    val __obj = js.Dynamic.literal()
    if (formattedScore != null) __obj.updateDynamic("formattedScore")(formattedScore.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (scoreTag != null) __obj.updateDynamic("scoreTag")(scoreTag.asInstanceOf[js.Any])
    if (timeSpan != null) __obj.updateDynamic("timeSpan")(timeSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerScore]
  }
}

