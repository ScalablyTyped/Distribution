package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestsResetMultipleForAllRequest extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string gamesManagement#questsResetMultipleForAllRequest. */
  var kind: js.UndefOr[String] = js.native
  /** The IDs of quests to reset. */
  var quest_ids: js.UndefOr[js.Array[String]] = js.native
}

object QuestsResetMultipleForAllRequest {
  @scala.inline
  def apply(): QuestsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestsResetMultipleForAllRequest]
  }
  @scala.inline
  implicit class QuestsResetMultipleForAllRequestOps[Self <: QuestsResetMultipleForAllRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setQuest_idsVarargs(value: String*): Self = this.set("quest_ids", js.Array(value :_*))
    @scala.inline
    def setQuest_ids(value: js.Array[String]): Self = this.set("quest_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuest_ids: Self = this.set("quest_ids", js.undefined)
  }
  
}

