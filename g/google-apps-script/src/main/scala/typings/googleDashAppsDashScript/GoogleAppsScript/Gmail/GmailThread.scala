package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailThread extends js.Object {
  def addLabel(label: GmailLabel): GmailThread = js.native
  def createDraftReply(body: String): GmailDraft = js.native
  def createDraftReply(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
  def createDraftReplyAll(body: String): GmailDraft = js.native
  def createDraftReplyAll(body: String, options: GmailAdvancedOptions): GmailDraft = js.native
  def getFirstMessageSubject(): String = js.native
  def getId(): String = js.native
  def getLabels(): js.Array[GmailLabel] = js.native
  def getLastMessageDate(): Date = js.native
  def getMessageCount(): Integer = js.native
  def getMessages(): js.Array[GmailMessage] = js.native
  def getPermalink(): String = js.native
  def hasStarredMessages(): Boolean = js.native
  def isImportant(): Boolean = js.native
  def isInChats(): Boolean = js.native
  def isInInbox(): Boolean = js.native
  def isInPriorityInbox(): Boolean = js.native
  def isInSpam(): Boolean = js.native
  def isInTrash(): Boolean = js.native
  def isUnread(): Boolean = js.native
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
  def reply(body: String): GmailThread = js.native
  def reply(body: String, options: GmailAdvancedOptions): GmailThread = js.native
  def replyAll(body: String): GmailThread = js.native
  def replyAll(body: String, options: GmailAdvancedOptions): GmailThread = js.native
}

