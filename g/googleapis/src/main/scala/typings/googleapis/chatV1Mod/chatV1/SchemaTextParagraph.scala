package typings.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A paragraph of text. Formatted text supported.
  */
@js.native
trait SchemaTextParagraph extends js.Object {
  var text: js.UndefOr[String] = js.native
}

object SchemaTextParagraph {
  @scala.inline
  def apply(text: String = null): SchemaTextParagraph = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextParagraph]
  }
}

