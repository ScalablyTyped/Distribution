package typings.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var text: String
}

object Callback {
  @scala.inline
  def apply(text: String, callback: /* repeated */ js.Any => _ = null): Callback = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    __obj.asInstanceOf[Callback]
  }
}

