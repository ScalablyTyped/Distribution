package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Blob
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Byte
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailAttachment extends js.Object {
  def copyBlob(): Blob = js.native
  /** @deprecated DO NOT USE */
  def getAllBlobs(): js.Array[Blob] = js.native
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

