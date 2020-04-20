package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonVideoId
import typings.gapiYoutube.GoogleApiYouTubePageInfo
import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait thumbnails extends js.Object {
  /**
    * Uploads a custom video thumbnail to YouTube and sets it for a video.
    */
  def set(`object`: AnonVideoId): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]
}

object thumbnails {
  @scala.inline
  def apply(set: AnonVideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): thumbnails = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[thumbnails]
  }
}

