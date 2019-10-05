package typings.gapiDotYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotYoutube.Anon_ChannelId
import typings.gapiDotYoutube.Anon_Part
import typings.gapiDotYoutube.GoogleApiYouTubeActivityResource
import typings.gapiDotYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: Anon_Part): HttpRequest[GoogleApiYouTubeActivityResource]
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: Anon_ChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
}

object activities {
  @scala.inline
  def apply(
    insert: Anon_Part => HttpRequest[GoogleApiYouTubeActivityResource],
    list: Anon_ChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
  ): activities = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[activities]
  }
}

