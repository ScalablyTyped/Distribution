package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of leaderboard reset resources.
  */
@js.native
trait Schema$PlayerScoreResetAllResponse extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#playerScoreResetResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The leaderboard reset results.
    */
  var results: js.UndefOr[js.Array[Schema$PlayerScoreResetResponse]] = js.native
}

object Schema$PlayerScoreResetAllResponse {
  @scala.inline
  def apply(kind: String = null, results: js.Array[Schema$PlayerScoreResetResponse] = null): Schema$PlayerScoreResetAllResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlayerScoreResetAllResponse]
  }
}

