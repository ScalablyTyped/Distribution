package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of score submission statuses.
  */
@js.native
trait Schema$PlayerScoreListResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerScoreListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The score submissions statuses.
    */
  var submittedScores: js.UndefOr[js.Array[Schema$PlayerScoreResponse]] = js.native
}

object Schema$PlayerScoreListResponse {
  @scala.inline
  def apply(kind: String = null, submittedScores: js.Array[Schema$PlayerScoreResponse] = null): Schema$PlayerScoreListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (submittedScores != null) __obj.updateDynamic("submittedScores")(submittedScores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerScoreListResponse]
  }
}

