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

