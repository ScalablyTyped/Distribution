package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailApp extends js.Object {
  def createDraft(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String): GmailDraft = js.native
  def createDraft(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String, options: js.Object): GmailDraft = js.native
  def createLabel(name: java.lang.String): GmailLabel = js.native
  def deleteLabel(label: GmailLabel): GmailApp = js.native
  def getAliases(): js.Array[java.lang.String] = js.native
  def getChatThreads(): js.Array[GmailThread] = js.native
  def getChatThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getDraft(draftId: java.lang.String): GmailDraft = js.native
  def getDraftMessages(): js.Array[GmailMessage] = js.native
  def getDrafts(): js.Array[GmailDraft] = js.native
  def getInboxThreads(): js.Array[GmailThread] = js.native
  def getInboxThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getInboxUnreadCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getMessageById(id: java.lang.String): GmailMessage = js.native
  def getMessagesForThread(thread: GmailThread): js.Array[GmailMessage] = js.native
  def getMessagesForThreads(threads: js.Array[GmailThread]): js.Array[js.Array[GmailMessage]] = js.native
  def getPriorityInboxThreads(): js.Array[GmailThread] = js.native
  def getPriorityInboxThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getPriorityInboxUnreadCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getSpamThreads(): js.Array[GmailThread] = js.native
  def getSpamThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getSpamUnreadCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getStarredThreads(): js.Array[GmailThread] = js.native
  def getStarredThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getStarredUnreadCount(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getThreadById(id: java.lang.String): GmailThread = js.native
  def getTrashThreads(): js.Array[GmailThread] = js.native
  def getTrashThreads(
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def getUserLabelByName(name: java.lang.String): GmailLabel = js.native
  def getUserLabels(): js.Array[GmailLabel] = js.native
  def markMessageRead(message: GmailMessage): GmailApp = js.native
  def markMessageUnread(message: GmailMessage): GmailApp = js.native
  def markMessagesRead(messages: js.Array[GmailMessage]): GmailApp = js.native
  def markMessagesUnread(messages: js.Array[GmailMessage]): GmailApp = js.native
  def markThreadImportant(thread: GmailThread): GmailApp = js.native
  def markThreadRead(thread: GmailThread): GmailApp = js.native
  def markThreadUnimportant(thread: GmailThread): GmailApp = js.native
  def markThreadUnread(thread: GmailThread): GmailApp = js.native
  def markThreadsImportant(threads: js.Array[GmailThread]): GmailApp = js.native
  def markThreadsRead(threads: js.Array[GmailThread]): GmailApp = js.native
  def markThreadsUnimportant(threads: js.Array[GmailThread]): GmailApp = js.native
  def markThreadsUnread(threads: js.Array[GmailThread]): GmailApp = js.native
  def moveMessageToTrash(message: GmailMessage): GmailApp = js.native
  def moveMessagesToTrash(messages: js.Array[GmailMessage]): GmailApp = js.native
  def moveThreadToArchive(thread: GmailThread): GmailApp = js.native
  def moveThreadToInbox(thread: GmailThread): GmailApp = js.native
  def moveThreadToSpam(thread: GmailThread): GmailApp = js.native
  def moveThreadToTrash(thread: GmailThread): GmailApp = js.native
  def moveThreadsToArchive(threads: js.Array[GmailThread]): GmailApp = js.native
  def moveThreadsToInbox(threads: js.Array[GmailThread]): GmailApp = js.native
  def moveThreadsToSpam(threads: js.Array[GmailThread]): GmailApp = js.native
  def moveThreadsToTrash(threads: js.Array[GmailThread]): GmailApp = js.native
  def refreshMessage(message: GmailMessage): GmailApp = js.native
  def refreshMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
  def refreshThread(thread: GmailThread): GmailApp = js.native
  def refreshThreads(threads: js.Array[GmailThread]): GmailApp = js.native
  def search(query: java.lang.String): js.Array[GmailThread] = js.native
  def search(
    query: java.lang.String,
    start: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    max: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): js.Array[GmailThread] = js.native
  def sendEmail(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String): GmailApp = js.native
  def sendEmail(recipient: java.lang.String, subject: java.lang.String, body: java.lang.String, options: js.Object): GmailApp = js.native
  def setCurrentMessageAccessToken(accessToken: java.lang.String): scala.Unit = js.native
  def starMessage(message: GmailMessage): GmailApp = js.native
  def starMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
  def unstarMessage(message: GmailMessage): GmailApp = js.native
  def unstarMessages(messages: js.Array[GmailMessage]): GmailApp = js.native
}

