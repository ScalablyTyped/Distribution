package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkspaceProposalRequest extends js.Object {
  /** If present, an initial comment to associate with the workspace proposal. */
  var initialComment: js.UndefOr[WorkspaceProposalHistoryComment] = js.native
  /** List of users to review the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.native
}

object CreateWorkspaceProposalRequest {
  @scala.inline
  def apply(): CreateWorkspaceProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspaceProposalRequest]
  }
  @scala.inline
  implicit class CreateWorkspaceProposalRequestOps[Self <: CreateWorkspaceProposalRequest] (val x: Self) extends AnyVal {
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
    def setInitialComment(value: WorkspaceProposalHistoryComment): Self = this.set("initialComment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialComment: Self = this.set("initialComment", js.undefined)
    @scala.inline
    def setReviewersVarargs(value: WorkspaceProposalUser*): Self = this.set("reviewers", js.Array(value :_*))
    @scala.inline
    def setReviewers(value: js.Array[WorkspaceProposalUser]): Self = this.set("reviewers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewers: Self = this.set("reviewers", js.undefined)
  }
  
}

