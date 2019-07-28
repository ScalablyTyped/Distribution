package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailMessage extends js.Object {
  def createDraftReply(body: String): GmailDraft = js.native
  def createDraftReply(body: String, options: GmailDraftOptions): GmailDraft = js.native
  def createDraftReplyAll(body: String): GmailDraft = js.native
  def createDraftReplyAll(body: String, options: GmailDraftOptions): GmailDraft = js.native
  def forward(recipient: String): GmailMessage = js.native
  def forward(recipient: String, options: GmailDraftOptions): GmailMessage = js.native
  def getAttachments(): js.Array[GmailAttachment] = js.native
  def getAttachments(options: GmailAttachmentOptions): js.Array[GmailAttachment] = js.native
  def getBcc(): String = js.native
  def getBody(): String = js.native
  def getCc(): String = js.native
  def getDate(): Date = js.native
  def getFrom(): String = js.native
  def getHeader(name: String): String = js.native
  def getId(): String = js.native
  def getPlainBody(): String = js.native
  def getRawContent(): String = js.native
  def getReplyTo(): String = js.native
  def getSubject(): String = js.native
  def getThread(): GmailThread = js.native
  def getTo(): String = js.native
  def isDraft(): Boolean = js.native
  def isInChats(): Boolean = js.native
  def isInInbox(): Boolean = js.native
  def isInPriorityInbox(): Boolean = js.native
  def isInTrash(): Boolean = js.native
  def isStarred(): Boolean = js.native
  def isUnread(): Boolean = js.native
  def markRead(): GmailMessage = js.native
  def markUnread(): GmailMessage = js.native
  def moveToTrash(): GmailMessage = js.native
  def refresh(): GmailMessage = js.native
  def reply(body: String): GmailMessage = js.native
  def reply(body: String, options: GmailDraftOptions): GmailMessage = js.native
  def replyAll(body: String): GmailMessage = js.native
  def replyAll(body: String, options: GmailDraftOptions): GmailMessage = js.native
  def star(): GmailMessage = js.native
  def unstar(): GmailMessage = js.native
}

