package typings.gapiDotYoutube.gapiNs.clientNs.youtubeNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotYoutube.Anon_VideoId
import typings.gapiDotYoutube.GoogleApiYouTubePageInfo
import typings.gapiDotYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait thumbnails extends js.Object {
  /**
    * Uploads a custom video thumbnail to YouTube and sets it for a video.
    */
  def set(`object`: Anon_VideoId): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]
}

object thumbnails {
  @scala.inline
  def apply(set: Anon_VideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): thumbnails = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[thumbnails]
  }
}

