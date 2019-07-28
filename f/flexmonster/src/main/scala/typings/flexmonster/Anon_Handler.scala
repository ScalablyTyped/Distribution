package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var label: String
}

object Anon_Handler {
  @scala.inline
  def apply(label: String, handler: () => Unit = null): Anon_Handler = {
    val __obj = js.Dynamic.literal(label = label)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    __obj.asInstanceOf[Anon_Handler]
  }
}

