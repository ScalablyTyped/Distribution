package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSnippet extends js.Object {
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.undefined
}

object TextSnippet {
  @scala.inline
  def apply(textSnippet: String = null): TextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSnippet]
  }
}

