package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thumbnail extends js.Object {
  /**
    * The thumbnail's content type, i.e. "image/png".
    *
    * Always set.
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The thumbnail file itself.
    *
    * That is, the bytes here are precisely the bytes that make up the thumbnail file; they can be served as an image as-is (with the appropriate content
    * type.)
    *
    * Always set.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The height of the thumbnail, in pixels.
    *
    * Always set.
    */
  var heightPx: js.UndefOr[Double] = js.native
  /**
    * The width of the thumbnail, in pixels.
    *
    * Always set.
    */
  var widthPx: js.UndefOr[Double] = js.native
}

object Thumbnail {
  @scala.inline
  def apply(): Thumbnail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Thumbnail]
  }
  @scala.inline
  implicit class ThumbnailOps[Self <: Thumbnail] (val x: Self) extends AnyVal {
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeightPx(value: Double): Self = this.set("heightPx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeightPx: Self = this.set("heightPx", js.undefined)
    @scala.inline
    def setWidthPx(value: Double): Self = this.set("widthPx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidthPx: Self = this.set("widthPx", js.undefined)
  }
  
}

