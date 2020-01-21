package typings.gapiClientCustomsearch.gapi.client.customsearch

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCustomsearch.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CseResource extends js.Object {
  /** Returns metadata about the search performed, metadata about the custom search engine used for the search, and the search results. */
  def list(request: AnonAlt): Request_[Search]
}

object CseResource {
  @scala.inline
  def apply(list: AnonAlt => Request_[Search]): CseResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[CseResource]
  }
}

