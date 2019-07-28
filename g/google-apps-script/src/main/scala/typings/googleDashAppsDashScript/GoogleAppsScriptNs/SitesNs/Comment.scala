package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  def deleteComment(): Unit
  def getAuthorEmail(): String
  def getAuthorName(): String
  def getContent(): String
  def getDatePublished(): Date
  def getLastUpdated(): Date
  def getParent(): Page
  def setContent(content: String): Comment
  def setParent(parent: Page): Comment
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
}

