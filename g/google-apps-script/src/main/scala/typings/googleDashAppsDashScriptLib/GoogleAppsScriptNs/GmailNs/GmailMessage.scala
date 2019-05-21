package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailMessage extends js.Object {
  def createDraftReply(body: java.lang.String): GmailDraft = js.native
  def createDraftReply(body: java.lang.String, options: GmailDraftOptions): GmailDraft = js.native
  def createDraftReplyAll(body: java.lang.String): GmailDraft = js.native
  def createDraftReplyAll(body: java.lang.String, options: GmailDraftOptions): GmailDraft = js.native
  def forward(recipient: java.lang.String): GmailMessage = js.native
  def forward(recipient: java.lang.String, options: GmailDraftOptions): GmailMessage = js.native
  def getAttachments(): js.Array[GmailAttachment] = js.native
  def getAttachments(options: GmailAttachmentOptions): js.Array[GmailAttachment] = js.native
  def getBcc(): java.lang.String = js.native
  def getBody(): java.lang.String = js.native
  def getCc(): java.lang.String = js.native
  def getDate(): stdLib.Date = js.native
  def getFrom(): java.lang.String = js.native
  def getHeader(name: java.lang.String): java.lang.String = js.native
  def getId(): java.lang.String = js.native
  def getPlainBody(): java.lang.String = js.native
  def getRawContent(): java.lang.String = js.native
  def getReplyTo(): java.lang.String = js.native
  def getSubject(): java.lang.String = js.native
  def getThread(): GmailThread = js.native
  def getTo(): java.lang.String = js.native
  def isDraft(): scala.Boolean = js.native
  def isInChats(): scala.Boolean = js.native
  def isInInbox(): scala.Boolean = js.native
  def isInPriorityInbox(): scala.Boolean = js.native
  def isInTrash(): scala.Boolean = js.native
  def isStarred(): scala.Boolean = js.native
  def isUnread(): scala.Boolean = js.native
  def markRead(): GmailMessage = js.native
  def markUnread(): GmailMessage = js.native
  def moveToTrash(): GmailMessage = js.native
  def refresh(): GmailMessage = js.native
  def reply(body: java.lang.String): GmailMessage = js.native
  def reply(body: java.lang.String, options: GmailDraftOptions): GmailMessage = js.native
  def replyAll(body: java.lang.String): GmailMessage = js.native
  def replyAll(body: java.lang.String, options: GmailDraftOptions): GmailMessage = js.native
  def star(): GmailMessage = js.native
  def unstar(): GmailMessage = js.native
}

