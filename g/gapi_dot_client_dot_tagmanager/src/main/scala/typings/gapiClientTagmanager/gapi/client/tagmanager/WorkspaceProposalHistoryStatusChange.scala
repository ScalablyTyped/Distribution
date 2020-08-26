package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalHistoryStatusChange extends js.Object {
  /** The new proposal status after that status change. */
  var newStatus: js.UndefOr[String] = js.native
  /** The old proposal status before the status change. */
  var oldStatus: js.UndefOr[String] = js.native
}

object WorkspaceProposalHistoryStatusChange {
  @scala.inline
  def apply(): WorkspaceProposalHistoryStatusChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalHistoryStatusChange]
  }
  @scala.inline
  implicit class WorkspaceProposalHistoryStatusChangeOps[Self <: WorkspaceProposalHistoryStatusChange] (val x: Self) extends AnyVal {
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
    def setNewStatus(value: String): Self = this.set("newStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewStatus: Self = this.set("newStatus", js.undefined)
    @scala.inline
    def setOldStatus(value: String): Self = this.set("oldStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldStatus: Self = this.set("oldStatus", js.undefined)
  }
  
}

