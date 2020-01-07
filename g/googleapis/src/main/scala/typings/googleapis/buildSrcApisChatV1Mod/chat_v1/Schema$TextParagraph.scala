package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paragraph of text. Formatted text supported.
  */
@js.native
trait Schema$TextParagraph extends js.Object {
  var text: js.UndefOr[String] = js.native
}

object Schema$TextParagraph {
  @scala.inline
  def apply(text: String = null): Schema$TextParagraph = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TextParagraph]
  }
}

