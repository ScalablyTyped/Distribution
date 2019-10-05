package typings.googleDashAppsDashScript.GoogleAppsScript.URL_Fetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlFetchApp extends js.Object {
  def fetch(url: String): HTTPResponse = js.native
  def fetch(url: String, params: URLFetchRequestOptions): HTTPResponse = js.native
  def fetchAll(requests: js.Array[URLFetchRequest | String]): js.Array[HTTPResponse] = js.native
  def getRequest(url: String): URLFetchRequest = js.native
  def getRequest(url: String, params: URLFetchRequestOptions): URLFetchRequest = js.native
}

