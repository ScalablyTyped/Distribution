package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceAllShapesWithImageRequest extends js.Object {
  /**
    * If set, this request will replace all of the shapes that contain the
    * given text.
    */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
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
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * If non-empty, limits the matches to page elements only on the given pages.
    *
    * Returns a 400 bad request error if given the page object ID of a
    * notes page or a
    * notes master, or if a
    * page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  /** The replace method. */
  var replaceMethod: js.UndefOr[String] = js.native
}

object ReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(): ReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithImageRequest]
  }
  @scala.inline
  implicit class ReplaceAllShapesWithImageRequestOps[Self <: ReplaceAllShapesWithImageRequest] (val x: Self) extends AnyVal {
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
    def setContainsText(value: SubstringMatchCriteria): Self = this.set("containsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsText: Self = this.set("containsText", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setPageObjectIdsVarargs(value: String*): Self = this.set("pageObjectIds", js.Array(value :_*))
    @scala.inline
    def setPageObjectIds(value: js.Array[String]): Self = this.set("pageObjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageObjectIds: Self = this.set("pageObjectIds", js.undefined)
    @scala.inline
    def setReplaceMethod(value: String): Self = this.set("replaceMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceMethod: Self = this.set("replaceMethod", js.undefined)
  }
  
}

