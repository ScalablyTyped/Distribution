package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of score submission requests
  */
@js.native
trait Schema$PlayerScoreSubmissionList extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreSubmissionList.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The score submissions.
    */
  var scores: js.UndefOr[js.Array[Schema$ScoreSubmission]] = js.native
}

object Schema$PlayerScoreSubmissionList {
  @scala.inline
  def apply(kind: String = null, scores: js.Array[Schema$ScoreSubmission] = null): Schema$PlayerScoreSubmissionList = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (scores != null) __obj.updateDynamic("scores")(scores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerScoreSubmissionList]
  }
}

