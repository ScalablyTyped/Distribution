package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailThread extends js.Object {
  def addLabel(label: GmailLabel): GmailThread = js.native
  def createDraftReply(body: java.lang.String): GmailDraft = js.native
  def createDraftReply(body: java.lang.String, options: GmailDraftOptions): GmailDraft = js.native
  def createDraftReplyAll(body: java.lang.String): GmailDraft = js.native
  def createDraftReplyAll(body: java.lang.String, options: GmailDraftOptions): GmailDraft = js.native
  def getFirstMessageSubject(): java.lang.String = js.native
  def getId(): java.lang.String = js.native
  def getLabels(): js.Array[GmailLabel] = js.native
  def getLastMessageDate(): stdLib.Date = js.native
  def getMessageCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMessages(): js.Array[GmailMessage] = js.native
  def getPermalink(): java.lang.String = js.native
  def hasStarredMessages(): scala.Boolean = js.native
  def isImportant(): scala.Boolean = js.native
  def isInChats(): scala.Boolean = js.native
  def isInInbox(): scala.Boolean = js.native
  def isInPriorityInbox(): scala.Boolean = js.native
  def isInSpam(): scala.Boolean = js.native
  def isInTrash(): scala.Boolean = js.native
  def isUnread(): scala.Boolean = js.native
  def markImportant(): GmailThread = js.native
  def markRead(): GmailThread = js.native
  def markUnimportant(): GmailThread = js.native
  def markUnread(): GmailThread = js.native
  def moveToArchive(): GmailThread = js.native
  def moveToInbox(): GmailThread = js.native
  def moveToSpam(): GmailThread = js.native
  def moveToTrash(): GmailThread = js.native
  def refresh(): GmailThread = js.native
  def removeLabel(label: GmailLabel): GmailThread = js.native
  def reply(body: java.lang.String): GmailThread = js.native
  def reply(body: java.lang.String, options: GmailDraftOptions): GmailThread = js.native
  def replyAll(body: java.lang.String): GmailThread = js.native
  def replyAll(body: java.lang.String, options: GmailDraftOptions): GmailThread = js.native
}

