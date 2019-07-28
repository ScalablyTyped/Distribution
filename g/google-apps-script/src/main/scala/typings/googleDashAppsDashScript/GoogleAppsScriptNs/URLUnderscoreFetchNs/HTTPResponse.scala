package typings.googleDashAppsDashScript.GoogleAppsScriptNs.URLUnderscoreFetchNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Blob
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Byte
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPResponse extends js.Object {
  def getAllHeaders(): js.Object = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getContent(): js.Array[Byte] = js.native
  def getContentText(): String = js.native
  def getContentText(charset: String): String = js.native
  def getHeaders(): js.Object = js.native
  def getResponseCode(): Integer = js.native
}

