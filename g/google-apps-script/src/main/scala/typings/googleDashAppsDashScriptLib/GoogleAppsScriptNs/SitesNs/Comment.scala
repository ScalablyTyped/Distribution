package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  def deleteComment(): scala.Unit
  def getAuthorEmail(): java.lang.String
  def getAuthorName(): java.lang.String
  def getContent(): java.lang.String
  def getDatePublished(): stdLib.Date
  def getLastUpdated(): stdLib.Date
  def getParent(): Page
  def setContent(content: java.lang.String): Comment
  def setParent(parent: Page): Comment
}

object Comment {
  @scala.inline
  def apply(
    deleteComment: () => scala.Unit,
    getAuthorEmail: () => java.lang.String,
    getAuthorName: () => java.lang.String,
    getContent: () => java.lang.String,
    getDatePublished: () => stdLib.Date,
    getLastUpdated: () => stdLib.Date,
    getParent: () => Page,
    setContent: java.lang.String => Comment,
    setParent: Page => Comment
  ): Comment = {
    val __obj = js.Dynamic.literal(deleteComment = js.Any.fromFunction0(deleteComment), getAuthorEmail = js.Any.fromFunction0(getAuthorEmail), getAuthorName = js.Any.fromFunction0(getAuthorName), getContent = js.Any.fromFunction0(getContent), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), setContent = js.Any.fromFunction1(setContent), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[Comment]
  }
}

