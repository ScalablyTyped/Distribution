package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Source extends js.Object {
  var source: js.UndefOr[Anon_Attribution] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Source {
  @scala.inline
  def apply(source: Anon_Attribution = null, text: String = null): Anon_Source = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Source]
  }
}

