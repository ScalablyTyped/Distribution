package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonChannelIdChannelType
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubeSearchResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait search extends js.Object {
  /**
    * Returns a collection of search results that match the query parameters specified in the API request. By default, a search result set identifies matching video, channel, and playlist resources, but you can also configure queries to only retrieve a specific type of resource.
    */
  def list(`object`: AnonChannelIdChannelType): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]
}

object search {
  @scala.inline
  def apply(
    list: AnonChannelIdChannelType => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeSearchResource]]
  ): search = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[search]
  }
}

