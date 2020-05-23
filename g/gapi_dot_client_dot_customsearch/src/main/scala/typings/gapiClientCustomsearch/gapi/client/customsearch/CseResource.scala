package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCustomsearch.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: Alt): Request[Search]
}

object CseResource {
  @scala.inline
  def apply(list: Alt => Request[Search]): CseResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CseResource]
  }
}

