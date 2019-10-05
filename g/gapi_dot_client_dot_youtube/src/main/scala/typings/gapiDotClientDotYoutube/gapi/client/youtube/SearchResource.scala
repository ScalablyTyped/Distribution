package typings.gapiDotClientDotYoutube.gapi.client.youtube

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotYoutube.Anon_AltChannelIdChannelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResource extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies
    * matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(request: Anon_AltChannelIdChannelType): Request[SearchListResponse]
}

object SearchResource {
  @scala.inline
  def apply(list: Anon_AltChannelIdChannelType => Request[SearchListResponse]): SearchResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SearchResource]
  }
}

