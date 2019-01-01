package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmailAttachment extends js.Object {
  def copyBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getAllBlobs(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob] = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBytes(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def getContentType(): java.lang.String = js.native
  def getDataAsString(): java.lang.String = js.native
  def getDataAsString(charset: java.lang.String): java.lang.String = js.native
  def getHash(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def isGoogleType(): scala.Boolean = js.native
  def setBytes(data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def setContentType(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def setContentTypeFromExtension(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def setDataFromString(string: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def setDataFromString(string: java.lang.String, charset: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def setName(name: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
}

