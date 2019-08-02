package typings.googleDashAppsDashScript.GoogleAppsScriptNs.URLUnderscoreFetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlFetchApp extends js.Object {
  def fetch(url: String): HTTPResponse = js.native
  def fetch(url: String, params: URLFetchRequestOptions): HTTPResponse = js.native
  def fetchAll(requests: js.Array[_]): js.Array[HTTPResponse] = js.native
  def getRequest(url: String): js.Object = js.native
  def getRequest(url: String, params: URLFetchRequestOptions): js.Object = js.native
}

