package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposalHistoryStatusChange extends js.Object {
  /** The new proposal status after that status change. */
  var newStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The old proposal status before the status change. */
  var oldStatus: js.UndefOr[java.lang.String] = js.undefined
}

object WorkspaceProposalHistoryStatusChange {
  @scala.inline
  def apply(newStatus: java.lang.String = null, oldStatus: java.lang.String = null): WorkspaceProposalHistoryStatusChange = {
    val __obj = js.Dynamic.literal()
    if (newStatus != null) __obj.updateDynamic("newStatus")(newStatus)
    if (oldStatus != null) __obj.updateDynamic("oldStatus")(oldStatus)
    __obj.asInstanceOf[WorkspaceProposalHistoryStatusChange]
  }
}

