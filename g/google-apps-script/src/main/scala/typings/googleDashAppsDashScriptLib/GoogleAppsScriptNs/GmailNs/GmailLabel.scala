package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailLabel extends js.Object {
  def addToThread(thread: GmailThread): GmailLabel = js.native
  def addToThreads(threads: js.Array[GmailThread]): GmailLabel = js.native
  def deleteLabel(): scala.Unit = js.native
  def getName(): java.lang.String = js.native
  def getThreads(): js.Array[GmailThread] = js.native
  def getThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getUnreadCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def removeFromThread(thread: GmailThread): GmailLabel = js.native
  def removeFromThreads(threads: js.Array[GmailThread]): GmailLabel = js.native
}

