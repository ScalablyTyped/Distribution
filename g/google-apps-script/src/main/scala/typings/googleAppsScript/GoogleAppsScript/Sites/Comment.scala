package typings.googleAppsScript.GoogleAppsScript.Sites

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Comment attached to any Sites page.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@js.native
trait Comment extends js.Object {
  def deleteComment(): Unit = js.native
  def getAuthorEmail(): String = js.native
  def getAuthorName(): String = js.native
  def getContent(): String = js.native
  def getDatePublished(): Date = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def setContent(content: String): Comment = js.native
  def setParent(parent: Page): Comment = js.native
}

object Comment {
  @scala.inline
  def apply(
    deleteComment: () => Unit,
    getAuthorEmail: () => String,
    getAuthorName: () => String,
    getContent: () => String,
    getDatePublished: () => Date,
    getLastUpdated: () => Date,
    getParent: () => Page,
    setContent: String => Comment,
    setParent: Page => Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(deleteComment = js.Any.fromFunction0(deleteComment), getAuthorEmail = js.Any.fromFunction0(getAuthorEmail), getAuthorName = js.Any.fromFunction0(getAuthorName), getContent = js.Any.fromFunction0(getContent), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), setContent = js.Any.fromFunction1(setContent), setParent = js.Any.fromFunction1(setParent))
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
    def setDeleteComment(value: () => Unit): Self = this.set("deleteComment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAuthorEmail(value: () => String): Self = this.set("getAuthorEmail", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAuthorName(value: () => String): Self = this.set("getAuthorName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContent(value: () => String): Self = this.set("getContent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDatePublished(value: () => Date): Self = this.set("getDatePublished", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastUpdated(value: () => Date): Self = this.set("getLastUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParent(value: () => Page): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContent(value: String => Comment): Self = this.set("setContent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParent(value: Page => Comment): Self = this.set("setParent", js.Any.fromFunction1(value))
  }
  
}

