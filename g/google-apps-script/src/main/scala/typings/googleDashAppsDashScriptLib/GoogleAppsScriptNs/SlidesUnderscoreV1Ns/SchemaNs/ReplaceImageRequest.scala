package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceImageRequest extends js.Object {
  var imageObjectId: js.UndefOr[java.lang.String] = js.undefined
  var imageReplaceMethod: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ReplaceImageRequest {
  @scala.inline
  def apply(
    imageObjectId: java.lang.String = null,
    imageReplaceMethod: java.lang.String = null,
    url: java.lang.String = null
  ): ReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    if (imageObjectId != null) __obj.updateDynamic("imageObjectId")(imageObjectId)
    if (imageReplaceMethod != null) __obj.updateDynamic("imageReplaceMethod")(imageReplaceMethod)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ReplaceImageRequest]
  }
}

