package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.VideoId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbnailsResource extends js.Object {
  /** Uploads a custom video thumbnail to YouTube and sets it for a video. */
  def set(request: VideoId): Request[ThumbnailSetResponse] = js.native
}

object ThumbnailsResource {
  @scala.inline
  def apply(set: VideoId => Request[ThumbnailSetResponse]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[ThumbnailsResource]
  }
  @scala.inline
  implicit class ThumbnailsResourceOps[Self <: ThumbnailsResource] (val x: Self) extends AnyVal {
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
    def setSet(value: VideoId => Request[ThumbnailSetResponse]): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

