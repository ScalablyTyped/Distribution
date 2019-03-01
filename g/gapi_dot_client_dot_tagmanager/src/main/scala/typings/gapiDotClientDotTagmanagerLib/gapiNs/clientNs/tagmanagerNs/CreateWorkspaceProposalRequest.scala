package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspaceProposalRequest extends js.Object {
  /** If present, an initial comment to associate with the workspace proposal. */
  var initialComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.undefined
  /** List of users to review the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
}

object CreateWorkspaceProposalRequest {
  @scala.inline
  def apply(
    initialComment: WorkspaceProposalHistoryComment = null,
    reviewers: js.Array[WorkspaceProposalUser] = null
  ): CreateWorkspaceProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (initialComment != null) __obj.updateDynamic("initialComment")(initialComment)
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    __obj.asInstanceOf[CreateWorkspaceProposalRequest]
  }
}

