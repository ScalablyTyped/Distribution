package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithImageRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var imageReplaceMethod: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  var replaceMethod: js.UndefOr[String] = js.undefined
}

object ReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(
    containsText: SubstringMatchCriteria = null,
    imageReplaceMethod: String = null,
    imageUrl: String = null,
    pageObjectIds: js.Array[String] = null,
    replaceMethod: String = null
  ): ReplaceAllShapesWithImageRequest = {
    val __obj = js.Dynamic.literal()
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (imageReplaceMethod != null) __obj.updateDynamic("imageReplaceMethod")(imageReplaceMethod)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (replaceMethod != null) __obj.updateDynamic("replaceMethod")(replaceMethod)
    __obj.asInstanceOf[ReplaceAllShapesWithImageRequest]
  }
}

