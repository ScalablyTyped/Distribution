package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces an existing image with a new image.  Replacing an image removes
  * some image effects from the existing image.
  */
@js.native
trait Schema$ReplaceImageRequest extends js.Object {
  /**
    * The ID of the existing image that will be replaced.
    */
  var imageObjectId: js.UndefOr[String] = js.native
  /**
    * The replacement method.
    */
  var imageReplaceMethod: js.UndefOr[String] = js.native
  /**
    * The URL of the new image.  The image is fetched once at insertion time
    * and a copy is stored for display inside the presentation. Images must be
    * less than 50MB in size, cannot exceed 25 megapixels, and must be in one
    * of PNG, JPEG, or GIF format.  The provided URL can be at most 2 kB in
    * length. The URL itself is saved with the image, and exposed via the
    * Image.source_url field.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$ReplaceImageRequest {
  @scala.inline
  def apply(imageObjectId: String = null, imageReplaceMethod: String = null, url: String = null): Schema$ReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    if (imageObjectId != null) __obj.updateDynamic("imageObjectId")(imageObjectId.asInstanceOf[js.Any])
    if (imageReplaceMethod != null) __obj.updateDynamic("imageReplaceMethod")(imageReplaceMethod.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplaceImageRequest]
  }
}

