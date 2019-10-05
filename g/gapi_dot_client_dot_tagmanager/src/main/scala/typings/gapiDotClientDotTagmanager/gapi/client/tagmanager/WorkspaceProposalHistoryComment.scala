package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProposalHistoryComment extends js.Object {
  /** The contents of the reviewer or author comment. */
  var content: js.UndefOr[String] = js.undefined
}

object WorkspaceProposalHistoryComment {
  @scala.inline
  def apply(content: String = null): WorkspaceProposalHistoryComment = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[WorkspaceProposalHistoryComment]
  }
}

