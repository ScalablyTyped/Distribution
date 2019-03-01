package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateWorkspaceProposalRequest extends js.Object {
  /** When provided, this fingerprint must match the fingerprint of the proposal in storage. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** If present, a new comment is added to the workspace proposal history. */
  var newComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.undefined
  /** If present, the list of reviewers of the workspace proposal is updated. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.undefined
  /** If present, the status of the workspace proposal is updated. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object UpdateWorkspaceProposalRequest {
  @scala.inline
  def apply(
    fingerprint: java.lang.String = null,
    newComment: WorkspaceProposalHistoryComment = null,
    reviewers: js.Array[WorkspaceProposalUser] = null,
    status: java.lang.String = null
  ): UpdateWorkspaceProposalRequest = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (newComment != null) __obj.updateDynamic("newComment")(newComment)
    if (reviewers != null) __obj.updateDynamic("reviewers")(reviewers)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[UpdateWorkspaceProposalRequest]
  }
}

