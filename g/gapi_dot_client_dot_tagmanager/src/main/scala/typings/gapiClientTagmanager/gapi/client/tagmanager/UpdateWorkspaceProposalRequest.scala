package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWorkspaceProposalRequest extends js.Object {
  /** When provided, this fingerprint must match the fingerprint of the proposal in storage. */
  var fingerprint: js.UndefOr[String] = js.native
  /** If present, a new comment is added to the workspace proposal history. */
  var newComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.native
  /** If present, the list of reviewers of the workspace proposal is updated. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.native
  /** If present, the status of the workspace proposal is updated. */
  var status: js.UndefOr[String] = js.native
}

object UpdateWorkspaceProposalRequest {
  @scala.inline
  def apply(): UpdateWorkspaceProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkspaceProposalRequest]
  }
  @scala.inline
  implicit class UpdateWorkspaceProposalRequestOps[Self <: UpdateWorkspaceProposalRequest] (val x: Self) extends AnyVal {
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setNewComment(value: WorkspaceProposalHistoryComment): Self = this.set("newComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewComment: Self = this.set("newComment", js.undefined)
    @scala.inline
    def setReviewersVarargs(value: WorkspaceProposalUser*): Self = this.set("reviewers", js.Array(value :_*))
    @scala.inline
    def setReviewers(value: js.Array[WorkspaceProposalUser]): Self = this.set("reviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewers: Self = this.set("reviewers", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

