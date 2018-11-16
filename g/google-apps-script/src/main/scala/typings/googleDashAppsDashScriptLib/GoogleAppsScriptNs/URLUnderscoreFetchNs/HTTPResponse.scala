package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.URLUnderscoreFetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPResponse extends js.Object {
  def getAllHeaders(): js.Object = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getContent(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def getContentText(): java.lang.String = js.native
  def getContentText(charset: java.lang.String): java.lang.String = js.native
  def getHeaders(): js.Object = js.native
  def getResponseCode(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
}

