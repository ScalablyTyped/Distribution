package typings.googleAppsScript.GoogleAppsScript.Gmail

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A user-created label in a user's Gmail account.
  */
@js.native
trait GmailLabel extends js.Object {
  
  def addToThread(thread: GmailThread): GmailLabel = js.native
  
  def addToThreads(threads: js.Array[GmailThread]): GmailLabel = js.native
  
  def deleteLabel(): Unit = js.native
  
  def getName(): String = js.native
  
  def getThreads(): js.Array[GmailThread] = js.native
  def getThreads(start: Integer, max: Integer): js.Array[GmailThread] = js.native
  
  def getUnreadCount(): Integer = js.native
  
  def removeFromThread(thread: GmailThread): GmailLabel = js.native
  
  def removeFromThreads(threads: js.Array[GmailThread]): GmailLabel = js.native
}
