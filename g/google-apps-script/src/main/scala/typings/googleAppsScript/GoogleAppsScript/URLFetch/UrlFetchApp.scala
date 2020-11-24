package typings.googleAppsScript.GoogleAppsScript.URLFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fetch resources and communicate with other hosts over the Internet.
  *
  * This service allows scripts to communicate with other applications or access other resources
  * on the web by fetching URLs. A script can use the URL Fetch service to issue HTTP and HTTPS
  * requests and receive responses. The URL Fetch service uses Google's network infrastructure for
  * efficiency and scaling purposes.
  *
  * Requests made using this service originate from a set pool of IP ranges. You can look up the full list of IP addresses
  * if you need to whitelist or approve these requests.
  *
  * This service requires the https://www.googleapis.com/auth/script.external_request
  * scope. In most cases Apps Script automatically detects and includes the scopes a script needs,
  * but if you are setting your scopes
  * explicitly you must manually add this scope to use UrlFetchApp.
  * See also
  *
  * HTTPResponse
  *
  * Setting explicit scopes
  */
@js.native
trait UrlFetchApp extends js.Object {
  
  def fetch(url: String): HTTPResponse = js.native
  def fetch(url: String, params: URLFetchRequestOptions): HTTPResponse = js.native
  
  def fetchAll(requests: js.Array[URLFetchRequest | String]): js.Array[HTTPResponse] = js.native
  
  def getRequest(url: String): URLFetchRequest = js.native
  def getRequest(url: String, params: URLFetchRequestOptions): URLFetchRequest = js.native
}
