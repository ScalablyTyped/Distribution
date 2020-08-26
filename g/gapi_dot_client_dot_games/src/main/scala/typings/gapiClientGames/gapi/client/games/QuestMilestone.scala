package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuestMilestone extends js.Object {
  /**
    * The completion reward data of the milestone, represented as a Base64-encoded string. This is a developer-specified binary blob with size between 0 and
    * 2 KB before encoding.
    */
  var completionRewardData: js.UndefOr[String] = js.native
  /** The criteria of the milestone. */
  var criteria: js.UndefOr[js.Array[QuestCriterion]] = js.native
  /** The milestone ID. */
  var id: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#questMilestone. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current state of the milestone.
    * Possible values are:
    * - "COMPLETED_NOT_CLAIMED" - The milestone is complete, but has not yet been claimed.
    * - "CLAIMED" - The milestone is complete and has been claimed.
    * - "NOT_COMPLETED" - The milestone has not yet been completed.
    * - "NOT_STARTED" - The milestone is for a quest that has not yet been accepted.
    */
  var state: js.UndefOr[String] = js.native
}

object QuestMilestone {
  @scala.inline
  def apply(): QuestMilestone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuestMilestone]
  }
  @scala.inline
  implicit class QuestMilestoneOps[Self <: QuestMilestone] (val x: Self) extends AnyVal {
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
    def setCompletionRewardData(value: String): Self = this.set("completionRewardData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionRewardData: Self = this.set("completionRewardData", js.undefined)
    @scala.inline
    def setCriteriaVarargs(value: QuestCriterion*): Self = this.set("criteria", js.Array(value :_*))
    @scala.inline
    def setCriteria(value: js.Array[QuestCriterion]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

