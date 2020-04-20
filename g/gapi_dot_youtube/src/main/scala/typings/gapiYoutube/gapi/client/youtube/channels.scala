package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonCategoryId
import typings.gapiYoutube.AnonRequestBody
import typings.gapiYoutube.GoogleApiYouTubeChannelResource
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channels extends js.Object {
  /**
    * Returns a collection of zero or more channel resources that match the request criteria.
    */
  def list(`object`: AnonCategoryId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]
  /**
    * Updates a channel's metadata.
    */
  def update(`object`: AnonRequestBody): HttpRequest[GoogleApiYouTubeChannelResource]
}

object channels {
  @scala.inline
  def apply(
    list: AnonCategoryId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]],
    update: AnonRequestBody => HttpRequest[GoogleApiYouTubeChannelResource]
  ): channels = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[channels]
  }
}

