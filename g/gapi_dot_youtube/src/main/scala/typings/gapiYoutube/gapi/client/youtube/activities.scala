package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonChannelId
import typings.gapiYoutube.AnonPart
import typings.gapiYoutube.GoogleApiYouTubeActivityResource
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubeActivityResource]
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: AnonChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
}

object activities {
  @scala.inline
  def apply(
    insert: AnonPart => HttpRequest[GoogleApiYouTubeActivityResource],
    list: AnonChannelId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
  ): activities = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[activities]
  }
}

