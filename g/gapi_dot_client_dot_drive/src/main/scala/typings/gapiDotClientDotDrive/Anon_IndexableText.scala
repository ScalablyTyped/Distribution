package typings.gapiDotClientDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexableText extends js.Object {
  /** Text to be indexed for the file to improve fullText queries. This is limited to 128KB in length and may contain HTML elements. */
  var indexableText: js.UndefOr[String] = js.undefined
  /** A thumbnail for the file. This will only be used if Drive cannot generate a standard thumbnail. */
  var thumbnail: js.UndefOr[Anon_Image] = js.undefined
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

