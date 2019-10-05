package typings.gapiDotClientDotGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResetMultipleForAllRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#questsResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.undefined
  /** The IDs of quests to reset. */
  var quest_ids: js.UndefOr[js.Array[String]] = js.undefined
}

object QuestsResetMultipleForAllRequest {
  @scala.inline
  def apply(kind: String = null, quest_ids: js.Array[String] = null): QuestsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (quest_ids != null) __obj.updateDynamic("quest_ids")(quest_ids)
    __obj.asInstanceOf[QuestsResetMultipleForAllRequest]
  }
}

