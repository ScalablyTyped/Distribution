package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextSnippet extends js.Object {
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[String] = js.undefined
}

object AnonTextSnippet {
  @scala.inline
  def apply(textSnippet: String = null): AnonTextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextSnippet]
  }
}

