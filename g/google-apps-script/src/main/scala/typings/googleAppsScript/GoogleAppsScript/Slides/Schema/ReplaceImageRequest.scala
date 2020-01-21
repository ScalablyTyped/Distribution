package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceImageRequest extends js.Object {
  var imageObjectId: js.UndefOr[String] = js.undefined
  var imageReplaceMethod: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ReplaceImageRequest {
  @scala.inline
  def apply(imageObjectId: String = null, imageReplaceMethod: String = null, url: String = null): ReplaceImageRequest = {
    val __obj = js.Dynamic.literal()
    if (imageObjectId != null) __obj.updateDynamic("imageObjectId")(imageObjectId.asInstanceOf[js.Any])
    if (imageReplaceMethod != null) __obj.updateDynamic("imageReplaceMethod")(imageReplaceMethod.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceImageRequest]
  }
}

