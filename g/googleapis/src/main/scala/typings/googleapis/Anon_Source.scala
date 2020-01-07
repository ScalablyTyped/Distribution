package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Source extends js.Object {
  var source: js.UndefOr[Anon_Attribution] = js.native
  var text: js.UndefOr[String] = js.native
}

object Anon_Source {
  @scala.inline
  def apply(source: Anon_Attribution = null, text: String = null): Anon_Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Source]
  }
}

