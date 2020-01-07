package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Text extends js.Object {
  var text: js.UndefOr[String] = js.native
}

object Anon_Text {
  @scala.inline
  def apply(text: String = null): Anon_Text = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Text]
  }
}

