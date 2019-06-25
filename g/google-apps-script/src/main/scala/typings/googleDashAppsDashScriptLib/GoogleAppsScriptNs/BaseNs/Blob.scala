package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob extends BlobSource {
  def copyBlob(): Blob = js.native
  def getAllBlobs(): js.Array[Blob] = js.native
  def getBytes(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def getContentType(): java.lang.String = js.native
  def getDataAsString(): java.lang.String = js.native
  def getDataAsString(charset: java.lang.String): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def isGoogleType(): scala.Boolean = js.native
  def setBytes(data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): Blob = js.native
  def setContentType(contentType: java.lang.String): Blob = js.native
  def setContentTypeFromExtension(): Blob = js.native
  def setDataFromString(string: java.lang.String): Blob = js.native
  def setDataFromString(string: java.lang.String, charset: java.lang.String): Blob = js.native
  def setName(name: java.lang.String): Blob = js.native
}

