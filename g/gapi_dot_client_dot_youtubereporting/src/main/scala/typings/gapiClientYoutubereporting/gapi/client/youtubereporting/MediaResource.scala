package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutubereporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaResource extends js.Object {
  /**
    * Method for media download. Download is supported
    * on the URI `/v1/media/{+name}?alt=media`.
    */
  def download(request: Key): Request[Media] = js.native
}

object MediaResource {
  @scala.inline
  def apply(download: Key => Request[Media]): MediaResource = {
    val __obj = js.Dynamic.literal(download = js.Any.fromFunction1(download))
    __obj.asInstanceOf[MediaResource]
  }
  @scala.inline
  implicit class MediaResourceOps[Self <: MediaResource] (val x: Self) extends AnyVal {
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
    def setDownload(value: Key => Request[Media]): Self = this.set("download", js.Any.fromFunction1(value))
  }
  
}

