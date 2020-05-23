package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubeActivityResource
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.anon.Home
import typings.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubeActivityResource]
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: Home): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
}

object activities {
  @scala.inline
  def apply(
    insert: Part => HttpRequest[GoogleApiYouTubeActivityResource],
    list: Home => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
  ): activities = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[activities]
  }
}

