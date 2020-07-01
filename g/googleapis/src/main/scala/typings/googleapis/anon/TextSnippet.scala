package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextSnippet extends js.Object {
  var textSnippet: js.UndefOr[String] = js.native
}

object TextSnippet {
  @scala.inline
  def apply(textSnippet: String = null): TextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSnippet]
  }
}

