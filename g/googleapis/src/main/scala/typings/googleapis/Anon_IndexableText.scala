package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_IndexableText extends js.Object {
  var indexableText: js.UndefOr[String] = js.native
  var thumbnail: js.UndefOr[Anon_Image] = js.native
}

object Anon_IndexableText {
  @scala.inline
  def apply(indexableText: String = null, thumbnail: Anon_Image = null): Anon_IndexableText = {
    val __obj = js.Dynamic.literal()
    if (indexableText != null) __obj.updateDynamic("indexableText")(indexableText.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IndexableText]
  }
}

