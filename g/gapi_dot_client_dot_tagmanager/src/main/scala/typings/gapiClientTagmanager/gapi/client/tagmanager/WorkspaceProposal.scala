package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposal extends js.Object {
  /** List of authors for the workspace proposal. */
  var authors: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.native
  /** The fingerprint of the GTM workspace proposal as computed at storage time. This value is recomputed whenever the proposal is modified. */
  var fingerprint: js.UndefOr[String] = js.native
  /** Records the history of comments and status changes. */
  var history: js.UndefOr[js.Array[WorkspaceProposalHistory]] = js.native
  /** GTM workspace proposal's relative path. */
  var path: js.UndefOr[String] = js.native
  /** Lists of reviewers for the workspace proposal. */
  var reviewers: js.UndefOr[js.Array[WorkspaceProposalUser]] = js.native
  /** The status of the workspace proposal as it goes through review. */
  var status: js.UndefOr[String] = js.native
}

object WorkspaceProposal {
  @scala.inline
  def apply(): WorkspaceProposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposal]
  }
  @scala.inline
  implicit class WorkspaceProposalOps[Self <: WorkspaceProposal] (val x: Self) extends AnyVal {
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
    def setAuthorsVarargs(value: WorkspaceProposalUser*): Self = this.set("authors", js.Array(value :_*))
    @scala.inline
    def setAuthors(value: js.Array[WorkspaceProposalUser]): Self = this.set("authors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setHistoryVarargs(value: WorkspaceProposalHistory*): Self = this.set("history", js.Array(value :_*))
    @scala.inline
    def setHistory(value: js.Array[WorkspaceProposalHistory]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
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

