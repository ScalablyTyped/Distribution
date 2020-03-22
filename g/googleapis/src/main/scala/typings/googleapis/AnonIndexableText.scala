package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexableText extends js.Object {
  var indexableText: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[AnonMimeType] = js.native
}

object AnonIndexableText {
  @scala.inline
  def apply(indexableText: String = null, thumbnail: AnonMimeType = null): AnonIndexableText = {
    val __obj = js.Dynamic.literal()
    if (indexableText != null) __obj.updateDynamic("indexableText")(indexableText.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexableText]
  }
}

