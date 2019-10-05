package typings.gapiDotClientDotCustomsearch.gapi.client.customsearch

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCustomsearch.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: Anon_Alt): Request[Search]
}

object CseResource {
  @scala.inline
  def apply(list: Anon_Alt => Request[Search]): CseResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CseResource]
  }
}

