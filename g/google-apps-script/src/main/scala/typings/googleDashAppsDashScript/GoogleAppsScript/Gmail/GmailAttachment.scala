package typings.googleDashAppsDashScript.GoogleAppsScript.Gmail

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Byte
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attachment from Gmail. This is a regular Blob except that it has an extra getSize() method that is faster than calling
  * getBytes().length and does not count against the Gmail read quota.
  *
  *     // Logs information about any attachments in the first 100 inbox threads.
  *     var threads = GmailApp.getInboxThreads(0, 100);
  *     var msgs = GmailApp.getMessagesForThreads(threads);
  *     for (var i = 0 ; i < msgs.length; i++) {
  *       for (var j = 0; j < msgs[i].length; j++) {
  *         var attachments = msgs[i][j].getAttachments();
  *         for (var k = 0; k < attachments.length; k++) {
  *           Logger.log('Message "%s" contains the attachment "%s" (%s bytes)',
  *                      msgs[i][j].getSubject(), attachments[k].getName(), attachments[k].getSize());
  *         }
  *       }
  *     }
  */
@js.native
trait GmailAttachment extends js.Object {
  def copyBlob(): Blob = js.native
  /** @deprecated DO NOT USE */ def getAllBlobs(): js.Array[Blob] = js.native
  def getAs(contentType: String): Blob = js.native
  def getBytes(): js.Array[Byte] = js.native
  def getContentType(): String = js.native
  def getDataAsString(): String = js.native
  def getDataAsString(charset: String): String = js.native
  def getHash(): String = js.native
  def getName(): String = js.native
  def getSize(): Integer = js.native
  def isGoogleType(): Boolean = js.native
  def setBytes(data: js.Array[Byte]): Blob = js.native
  def setContentType(contentType: String): Blob = js.native
  def setContentTypeFromExtension(): Blob = js.native
  def setDataFromString(string: String): Blob = js.native
  def setDataFromString(string: String, charset: String): Blob = js.native
  def setName(name: String): Blob = js.native
}

