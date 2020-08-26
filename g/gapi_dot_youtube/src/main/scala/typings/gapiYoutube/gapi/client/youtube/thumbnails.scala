package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePageInfo
import typings.gapiYoutube.GoogleApiYouTubeThumbnailResource
import typings.gapiYoutube.anon.VideoId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait thumbnails extends js.Object {
  /**
    * Uploads a custom video thumbnail to YouTube and sets it for a video.
    */
  def set(`object`: VideoId): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]] = js.native
}

object thumbnails {
  @scala.inline
  def apply(set: VideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): thumbnails = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[thumbnails]
  }
  @scala.inline
  implicit class thumbnailsOps[Self <: thumbnails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSet(value: VideoId => HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

