package typings.gapiDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotYoutube.Anon_CategoryId
import typings.gapiDotYoutube.Anon_OnBehalfOfContentOwnerPart
import typings.gapiDotYoutube.GoogleApiYouTubeChannelResource
import typings.gapiDotYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channels extends js.Object {
  /**
    * Returns a collection of zero or more channel resources that match the request criteria.
    */
  def list(`object`: Anon_CategoryId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]
  /**
    * Updates a channel's metadata.
    */
  def update(`object`: Anon_OnBehalfOfContentOwnerPart): HttpRequest[GoogleApiYouTubeChannelResource]
}

object channels {
  @scala.inline
  def apply(
    list: Anon_CategoryId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]],
    update: Anon_OnBehalfOfContentOwnerPart => HttpRequest[GoogleApiYouTubeChannelResource]
  ): channels = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[channels]
  }
}

