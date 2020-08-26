package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StretchedPictureFill extends js.Object {
  /**
    * Reading the content_url:
    *
    * An URL to a picture with a default lifetime of 30 minutes.
    * This URL is tagged with the account of the requester. Anyone with the URL
    * effectively accesses the picture as the original requester. Access to the
    * picture may be lost if the presentation's sharing settings change.
    *
    * Writing the content_url:
    *
    * The picture is fetched once at insertion time and a copy is stored for
    * display inside the presentation. Pictures must be less than 50MB in size,
    * cannot exceed 25 megapixels, and must be in either in PNG, JPEG, or GIF
    * format.
    *
    * The provided URL can be at maximum 2K bytes large.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /** The original size of the picture fill. This field is read-only. */
  var size: js.UndefOr[Size] = js.native
}

object StretchedPictureFill {
  @scala.inline
  def apply(): StretchedPictureFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StretchedPictureFill]
  }
  @scala.inline
  implicit class StretchedPictureFillOps[Self <: StretchedPictureFill] (val x: Self) extends AnyVal {
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
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

