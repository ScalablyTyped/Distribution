package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces all shapes that match the given criteria with the provided image.
  * The images replacing the shapes are rectangular after being inserted into
  * the presentation and do not take on the forms of the shapes.
  */
@js.native
trait Schema$ReplaceAllShapesWithImageRequest extends js.Object {
  /**
    * If set, this request will replace all of the shapes that contain the
    * given text.
    */
  var containsText: js.UndefOr[Schema$SubstringMatchCriteria] = js.native
  /**
    * The image replace method.  If you specify both a `replace_method` and an
    * `image_replace_method`, the `image_replace_method` takes precedence.  If
    * you do not specify a value for `image_replace_method`, but specify a
    * value for `replace_method`, then the specified `replace_method` value is
    * used.  If you do not specify either, then CENTER_INSIDE is used.
    */
  var imageReplaceMethod: js.UndefOr[String] = js.native
  /**
    * The image URL.  The image is fetched once at insertion time and a copy is
    * stored for display inside the presentation. Images must be less than 50MB
    * in size, cannot exceed 25 megapixels, and must be in one of PNG, JPEG, or
    * GIF format.  The provided URL can be at most 2 kB in length. The URL
    * itself is saved with the image, and exposed via the Image.source_url
    * field.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given
    * pages.  Returns a 400 bad request error if given the page object ID of a
    * notes page or a notes master, or if a page with that object ID
    * doesn&#39;t exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The replace method.  &lt;b&gt;Deprecated&lt;/b&gt;: use
    * `image_replace_method` instead.  If you specify both a `replace_method`
    * and an `image_replace_method`, the `image_replace_method` takes
    * precedence.
    */
  var replaceMethod: js.UndefOr[String] = js.native
}

object Schema$ReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(
    containsText: Schema$SubstringMatchCriteria = null,
    imageReplaceMethod: String = null,
    imageUrl: String = null,
    pageObjectIds: js.Array[String] = null,
    replaceMethod: String = null
  ): Schema$ReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText.asInstanceOf[js.Any])
    if (imageReplaceMethod != null) __obj.updateDynamic("imageReplaceMethod")(imageReplaceMethod.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds.asInstanceOf[js.Any])
    if (replaceMethod != null) __obj.updateDynamic("replaceMethod")(replaceMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ReplaceAllShapesWithImageRequest]
  }
}

