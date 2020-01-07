package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The stretched picture fill. The page or page element is filled entirely
  * with the specified picture. The picture is stretched to fit its container.
  */
@js.native
trait Schema$StretchedPictureFill extends js.Object {
  /**
    * Reading the content_url:  An URL to a picture with a default lifetime of
    * 30 minutes. This URL is tagged with the account of the requester. Anyone
    * with the URL effectively accesses the picture as the original requester.
    * Access to the picture may be lost if the presentation&#39;s sharing
    * settings change.  Writing the content_url:  The picture is fetched once
    * at insertion time and a copy is stored for display inside the
    * presentation. Pictures must be less than 50MB in size, cannot exceed 25
    * megapixels, and must be in one of PNG, JPEG, or GIF format.  The provided
    * URL can be at most 2 kB in length.
    */
  var contentUrl: js.UndefOr[String] = js.native
  /**
    * The original size of the picture fill. This field is read-only.
    */
  var size: js.UndefOr[Schema$Size] = js.native
}

object Schema$StretchedPictureFill {
  @scala.inline
  def apply(contentUrl: String = null, size: Schema$Size = null): Schema$StretchedPictureFill = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StretchedPictureFill]
  }
}

