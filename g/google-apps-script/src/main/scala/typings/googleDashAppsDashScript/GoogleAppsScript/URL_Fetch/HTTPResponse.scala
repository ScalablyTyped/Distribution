package typings.googleDashAppsDashScript.GoogleAppsScript.URL_Fetch

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Byte
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
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

