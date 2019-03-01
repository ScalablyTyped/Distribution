package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResource extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies
    * matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltChannelIdChannelType): gapiDotClientLib.gapiNs.clientNs.Request[SearchListResponse]
}

object SearchResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltChannelIdChannelType, 
      gapiDotClientLib.gapiNs.clientNs.Request[SearchListResponse]
    ]
  ): SearchResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[SearchResource]
  }
}

