package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var anchor: js.UndefOr[String] = js.native
  var author: js.UndefOr[User] = js.native
  var commentId: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var context: js.UndefOr[CommentContext] = js.native
  var createdDate: js.UndefOr[String] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var fileId: js.UndefOr[String] = js.native
  var fileTitle: js.UndefOr[String] = js.native
  var htmlContent: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var modifiedDate: js.UndefOr[String] = js.native
  var replies: js.UndefOr[js.Array[CommentReply]] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
}

object Comment {
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setAuthor(value: User): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setCommentId(value: String): Self = this.set("commentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentId: Self = this.set("commentId", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContext(value: CommentContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileId: Self = this.set("fileId", js.undefined)
    @scala.inline
    def setFileTitle(value: String): Self = this.set("fileTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileTitle: Self = this.set("fileTitle", js.undefined)
    @scala.inline
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlContent: Self = this.set("htmlContent", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    @scala.inline
    def setRepliesVarargs(value: CommentReply*): Self = this.set("replies", js.Array(value :_*))
    @scala.inline
    def setReplies(value: js.Array[CommentReply]): Self = this.set("replies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplies: Self = this.set("replies", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

