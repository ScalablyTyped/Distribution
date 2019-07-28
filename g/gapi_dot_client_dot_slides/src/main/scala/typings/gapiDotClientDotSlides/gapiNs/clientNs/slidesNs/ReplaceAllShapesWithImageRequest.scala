package typings.gapiDotClientDotSlides.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithImageRequest extends js.Object {
  /**
    * If set, this request will replace all of the shapes that contain the
    * given text.
    */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  /**
    * The image URL.
    *
    * The image is fetched once at insertion time and a copy is stored for
    * display inside the presentation. Images must be less than 50MB in size,
    * cannot exceed 25 megapixels, and must be in either in PNG, JPEG, or GIF
    * format.
    *
    * The provided URL can be at maximum 2K bytes large.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * If non-empty, limits the matches to page elements only on the given pages.
    *
    * Returns a 400 bad request error if given the page object ID of a
    * notes page or a
    * notes master, or if a
    * page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The replace method. */
  var replaceMethod: js.UndefOr[String] = js.undefined
}

object ReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(
    containsText: SubstringMatchCriteria = null,
    imageUrl: String = null,
    pageObjectIds: js.Array[String] = null,
    replaceMethod: String = null
  ): ReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (replaceMethod != null) __obj.updateDynamic("replaceMethod")(replaceMethod)
    __obj.asInstanceOf[ReplaceAllShapesWithImageRequest]
  }
}

