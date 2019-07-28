package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TextSnippet extends js.Object {
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.undefined
}

object Anon_TextSnippet {
  @scala.inline
  def apply(textSnippet: String = null): Anon_TextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet)
    __obj.asInstanceOf[Anon_TextSnippet]
  }
}

