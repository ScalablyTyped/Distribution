package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithImageRequest extends js.Object {
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  var imageReplaceMethod: js.UndefOr[java.lang.String] = js.undefined
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var pageObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var replaceMethod: js.UndefOr[java.lang.String] = js.undefined
}

object ReplaceAllShapesWithImageRequest {
  @scala.inline
  def apply(
    containsText: SubstringMatchCriteria = null,
    imageReplaceMethod: java.lang.String = null,
    imageUrl: java.lang.String = null,
    pageObjectIds: js.Array[java.lang.String] = null,
    replaceMethod: java.lang.String = null
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

