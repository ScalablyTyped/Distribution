package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.URLUnderscoreFetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlFetchApp extends js.Object {
  def fetch(url: java.lang.String): HTTPResponse = js.native
  def fetch(url: java.lang.String, params: URLFetchRequestOptions): HTTPResponse = js.native
  def fetchAll(requests: js.Array[_]): js.Array[HTTPResponse] = js.native
  def getRequest(url: java.lang.String): js.Any = js.native
  def getRequest(url: java.lang.String, params: URLFetchRequestOptions): js.Any = js.native
}

