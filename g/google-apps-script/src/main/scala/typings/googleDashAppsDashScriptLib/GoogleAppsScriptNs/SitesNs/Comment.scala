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
    deleteComment: js.Function0[scala.Unit],
    getAuthorEmail: js.Function0[java.lang.String],
    getAuthorName: js.Function0[java.lang.String],
    getContent: js.Function0[java.lang.String],
    getDatePublished: js.Function0[stdLib.Date],
    getLastUpdated: js.Function0[stdLib.Date],
    getParent: js.Function0[Page],
    setContent: js.Function1[java.lang.String, Comment],
    setParent: js.Function1[Page, Comment]
  ): Comment = {
    val __obj = js.Dynamic.literal(deleteComment = deleteComment, getAuthorEmail = getAuthorEmail, getAuthorName = getAuthorName, getContent = getContent, getDatePublished = getDatePublished, getLastUpdated = getLastUpdated, getParent = getParent, setContent = setContent, setParent = setParent)
  
    __obj.asInstanceOf[Comment]
  }
}

