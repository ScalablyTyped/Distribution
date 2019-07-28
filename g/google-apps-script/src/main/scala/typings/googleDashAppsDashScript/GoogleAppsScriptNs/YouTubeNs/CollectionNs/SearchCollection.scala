package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs.SearchListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCollection extends js.Object {
  // Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
  def list(part: String): SearchListResponse = js.native
  // Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
  def list(part: String, optionalArgs: js.Object): SearchListResponse = js.native
}

