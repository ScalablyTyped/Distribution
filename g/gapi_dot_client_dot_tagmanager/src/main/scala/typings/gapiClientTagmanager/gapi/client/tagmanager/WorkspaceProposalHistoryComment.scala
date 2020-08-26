package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProposalHistoryComment extends js.Object {
  /** The contents of the reviewer or author comment. */
  var content: js.UndefOr[String] = js.native
}

object WorkspaceProposalHistoryComment {
  @scala.inline
  def apply(): WorkspaceProposalHistoryComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProposalHistoryComment]
  }
  @scala.inline
  implicit class WorkspaceProposalHistoryCommentOps[Self <: WorkspaceProposalHistoryComment] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

