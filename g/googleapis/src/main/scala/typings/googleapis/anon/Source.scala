package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  var source: js.UndefOr[Attribution] = js.native
  var text: js.UndefOr[String] = js.native
}

object Source {
  @scala.inline
  def apply(source: Attribution = null, text: String = null): Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

