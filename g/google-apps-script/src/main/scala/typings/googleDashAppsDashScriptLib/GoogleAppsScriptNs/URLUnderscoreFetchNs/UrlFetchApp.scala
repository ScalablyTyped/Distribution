package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.URLUnderscoreFetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlFetchApp extends js.Object {
  def fetch(url: java.lang.String): HTTPResponse = js.native
  def fetch(url: java.lang.String, params: URLFetchRequestOptions): HTTPResponse = js.native
  def fetchAll(requests: js.Array[js.Object]): js.Array[HTTPResponse] = js.native
  def getRequest(url: java.lang.String): js.Object = js.native
  def getRequest(url: java.lang.String, params: URLFetchRequestOptions): js.Object = js.native
}

