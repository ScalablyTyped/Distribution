package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_TextSnippet extends js.Object {
  var textSnippet: js.UndefOr[String] = js.native
}

object Anon_TextSnippet {
  @scala.inline
  def apply(textSnippet: String = null): Anon_TextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TextSnippet]
  }
}

