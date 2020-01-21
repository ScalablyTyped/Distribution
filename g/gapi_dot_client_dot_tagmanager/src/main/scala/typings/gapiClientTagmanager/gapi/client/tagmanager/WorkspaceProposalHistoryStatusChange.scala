package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposalHistoryStatusChange extends js.Object {
  /** The new proposal status after that status change. */
  var newStatus: js.UndefOr[String] = js.undefined
  /** The old proposal status before the status change. */
  var oldStatus: js.UndefOr[String] = js.undefined
}

object WorkspaceProposalHistoryStatusChange {
  @scala.inline
  def apply(newStatus: String = null, oldStatus: String = null): WorkspaceProposalHistoryStatusChange = {
    val __obj = js.Dynamic.literal()
    if (newStatus != null) __obj.updateDynamic("newStatus")(newStatus.asInstanceOf[js.Any])
    if (oldStatus != null) __obj.updateDynamic("oldStatus")(oldStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceProposalHistoryStatusChange]
  }
}

