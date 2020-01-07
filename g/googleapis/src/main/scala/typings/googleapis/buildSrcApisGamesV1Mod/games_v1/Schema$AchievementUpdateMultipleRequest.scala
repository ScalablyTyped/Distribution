package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a list of achievement update requests.
  */
@js.native
trait Schema$AchievementUpdateMultipleRequest extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementUpdateMultipleRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The individual achievement update requests.
    */
  var updates: js.UndefOr[js.Array[Schema$AchievementUpdateRequest]] = js.native
}

object Schema$AchievementUpdateMultipleRequest {
  @scala.inline
  def apply(kind: String = null, updates: js.Array[Schema$AchievementUpdateRequest] = null): Schema$AchievementUpdateMultipleRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AchievementUpdateMultipleRequest]
  }
}

