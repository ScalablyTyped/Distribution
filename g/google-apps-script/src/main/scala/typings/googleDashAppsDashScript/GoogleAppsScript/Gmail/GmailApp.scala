package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides access to Gmail threads, messages, and labels.
  */
@js.native
trait GmailApp extends js.Object {
  def createDraft(recipient: String, subject: String, body: String): GmailDraft = js.native
  def createDraft(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): GmailDraft = js.native
  def createLabel(name: String): GmailLabel = js.native
  def deleteLabel(label: GmailLabel): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def getAliases(): js.Array[String] = js.native
  def getChatThreads(): js.Array[GmailThread] = js.native
  def getChatThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getDraft(draftId: String): GmailDraft = js.native
  def getDraftMessages(): js.Array[GmailMessage] = js.native
  def getDrafts(): js.Array[GmailDraft] = js.native
  def getInboxThreads(): js.Array[GmailThread] = js.native
  def getInboxThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getInboxUnreadCount(): Integer = js.native
  def getMessageById(id: String): GmailMessage = js.native
  def getMessagesForThread(thread: GmailThread): js.Array[GmailMessage] = js.native
  def getMessagesForThreads(threads: js.Array[GmailThread]): js.Array[js.Array[GmailMessage]] = js.native
  def getPriorityInboxThreads(): js.Array[GmailThread] = js.native
  def getPriorityInboxThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getPriorityInboxUnreadCount(): Integer = js.native
  def getSpamThreads(): js.Array[GmailThread] = js.native
  def getSpamThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getSpamUnreadCount(): Integer = js.native
  def getStarredThreads(): js.Array[GmailThread] = js.native
  def getStarredThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getStarredUnreadCount(): Integer = js.native
  def getThreadById(id: String): GmailThread = js.native
  def getTrashThreads(): js.Array[GmailThread] = js.native
  def getTrashThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def getUserLabelByName(name: String): GmailLabel = js.native
  def getUserLabels(): js.Array[GmailLabel] = js.native
  def markMessageRead(message: GmailMessage): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markMessageUnread(message: GmailMessage): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markMessagesRead(messages: js.Array[GmailMessage]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markMessagesUnread(messages: js.Array[GmailMessage]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadImportant(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadRead(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadUnimportant(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadUnread(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadsImportant(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadsRead(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadsUnimportant(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def markThreadsUnread(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveMessageToTrash(message: GmailMessage): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveMessagesToTrash(messages: js.Array[GmailMessage]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadToArchive(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadToInbox(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadToSpam(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadToTrash(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadsToArchive(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadsToInbox(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadsToSpam(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def moveThreadsToTrash(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def refreshMessage(message: GmailMessage): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def refreshMessages(messages: js.Array[GmailMessage]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def refreshThread(thread: GmailThread): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def refreshThreads(threads: js.Array[GmailThread]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def search(query: String): js.Array[GmailThread] = js.native
  def search(query: String, start: Integer, max: Integer): js.Array[GmailThread] = js.native
  def sendEmail(recipient: String, subject: String, body: String): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def sendEmail(recipient: String, subject: String, body: String, options: GmailAdvancedOptions): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def setCurrentMessageAccessToken(accessToken: String): Unit = js.native
  def starMessage(message: GmailMessage): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def starMessages(messages: js.Array[GmailMessage]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def unstarMessage(message: GmailMessage): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
  def unstarMessages(messages: js.Array[GmailMessage]): typings.googleDashAppsDashScript.GoogleAppsScript.Gmail.GmailApp = js.native
}

