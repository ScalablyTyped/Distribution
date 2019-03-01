package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TextSnippet extends js.Object {
  /** A text snippet containing the search query. */
  var textSnippet: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TextSnippet {
  @scala.inline
  def apply(textSnippet: java.lang.String = null): Anon_TextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet)
    __obj.asInstanceOf[Anon_TextSnippet]
  }
}

