package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTextSnippet extends js.Object {
  var textSnippet: js.UndefOr[String] = js.native
}

object AnonTextSnippet {
  @scala.inline
  def apply(textSnippet: String = null): AnonTextSnippet = {
    val __obj = js.Dynamic.literal()
    if (textSnippet != null) __obj.updateDynamic("textSnippet")(textSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextSnippet]
  }
}

