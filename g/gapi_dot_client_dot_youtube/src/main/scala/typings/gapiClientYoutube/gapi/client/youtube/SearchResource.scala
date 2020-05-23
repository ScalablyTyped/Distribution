package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.ChannelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResource extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies
    * matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(request: ChannelType): Request[SearchListResponse]
}

object SearchResource {
  @scala.inline
  def apply(list: ChannelType => Request[SearchListResponse]): SearchResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SearchResource]
  }
}

