package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalHistory extends js.Object {
  /** A user or reviewer comment. */
  var comment: js.UndefOr[WorkspaceProposalHistoryComment] = js.native
  /** The party responsible for the change in history. */
  var createdBy: js.UndefOr[WorkspaceProposalUser] = js.native
  /** When this history event was added to the workspace proposal. */
  var createdTimestamp: js.UndefOr[Timestamp] = js.native
  /** A change in the proposal's status. */
  var statusChange: js.UndefOr[WorkspaceProposalHistoryStatusChange] = js.native
  /** The history type distinguishing between comments and status changes. */
  var `type`: js.UndefOr[String] = js.native
}

object WorkspaceProposalHistory {
  @scala.inline
  def apply(): WorkspaceProposalHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalHistory]
  }
  @scala.inline
  implicit class WorkspaceProposalHistoryOps[Self <: WorkspaceProposalHistory] (val x: Self) extends AnyVal {
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
    def setComment(value: WorkspaceProposalHistoryComment): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setCreatedBy(value: WorkspaceProposalUser): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = this.set("createdTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("createdTimestamp", js.undefined)
    @scala.inline
    def setStatusChange(value: WorkspaceProposalHistoryStatusChange): Self = this.set("statusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusChange: Self = this.set("statusChange", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

