package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexableText extends js.Object {
  var indexableText: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[MimeType] = js.native
}

object IndexableText {
  @scala.inline
  def apply(indexableText: String = null, thumbnail: MimeType = null): IndexableText = {
    val __obj = js.Dynamic.literal()
    if (indexableText != null) __obj.updateDynamic("indexableText")(indexableText.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexableText]
  }
}

