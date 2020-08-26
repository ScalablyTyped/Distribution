package typings.gapiClientPlusdomains.gapi.client.plusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Videostream extends js.Object {
  /** The height, in pixels, of the video resource. */
  var height: js.UndefOr[Double] = js.native
  /** MIME type of the video stream. */
  var `type`: js.UndefOr[String] = js.native
  /** URL of the video stream. */
  var url: js.UndefOr[String] = js.native
  /** The width, in pixels, of the video resource. */
  var width: js.UndefOr[Double] = js.native
}

object Videostream {
  @scala.inline
  def apply(): Videostream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Videostream]
  }
  @scala.inline
  implicit class VideostreamOps[Self <: Videostream] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

